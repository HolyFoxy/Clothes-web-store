
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {
    // Данные подключения
    private static final String URL = "jdbc:postgresql://localhost:5432/your_database";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    public static void selectProduct() {
        List<Product> productList = new ArrayList<>();

        String sql = "SELECT id, name, price FROM products";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                // Извлекаем данные из текущей строки ResultSet
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String brand = rs.getString("brand");
                double price = rs.getDouble("price");
                String category_of_good = rs.getString("category_of_good");
                int size = rs.getInt("size");
                String color = rs.getString("color");

                // Создаем объект и добавляем в список
                productList.add(new Product(id, name, brand, price, category_of_good, size, color));
            }

        } catch (SQLException e) {
            System.err.println("Ошибка при работе с БД: " + e.getMessage());
        }

        // Вывод результата
        productList.forEach(System.out::println);
        
        // Если нужен именно массив:
        // Product[] productArray = productList.toArray(new Product[0]);
    }
    public static void insertProduct(Product product) {
    String sql = "INSERT INTO products (id, name, brand, price, category_of_good, size, color) VALUES (?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        // Установка значений вместо знаков вопроса
        pstmt.setInt(1, product.getId());
        pstmt.setString(2, product.getName());
        pstmt.setString(3, product.getBrand());
        pstmt.setDouble(4, product.getPrice());
        pstmt.setString(5, product.getCategory_of_good());
        pstmt.setInt(6, product.getSize());
        pstmt.setString(7, product.getColor());

        int affectedRows = pstmt.executeUpdate();
        if (affectedRows > 0) {
            System.out.println("Объект успешно сохранен в БД!");
        }
    } catch (SQLException e) {
        System.err.println("Ошибка при вставке: " + e.getMessage());
    }
    }

    // public static void main(String[] args) {
    //     // 1. Создаем новый объект для вставки
    //     Product newProduct = new Product(101, "pen", "kinichiwa", 10.00,
    //      "pens",1,"black");
        
    //     // 2. Выполняем вставку
    //     insertProduct(newProduct);

    //     // 3. Извлекаем список всех продуктов, чтобы проверить результат
    //     List<Product> productList = getAllProducts();
    //     productList.forEach(System.out::println);
    // }

    // Вынесли логику SELECT в отдельный метод для чистоты кода
    public static List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT id, name, brand, price, category_of_good, size, color FROM products";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Product(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("brand"),
                    rs.getDouble("price"),
                    rs.getString("category_of_good"),
                    rs.getInt("size"),
                    rs.getString("color")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }


}
