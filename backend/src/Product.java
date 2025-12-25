
public class Product {
    private int id;
    private String name;
    private String brand;
    private double price;
    private String category_of_good;
    private int size;
    private String color;


    public Product(int id, String name, String brand, double price,
         String category_of_good, int size, String color) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.category_of_good = category_of_good;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Product{id=%d, name='%s', brand='%s' price=%.2f, category_of_good='%s' size=%d, color='%s'}", 
        id, name, brand, price, category_of_good, size, color);
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }
    public String getCategory_of_good() { return category_of_good; }
    public int getSize() { return size; }
    public String getColor() { return color; }

}
