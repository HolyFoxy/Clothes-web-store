
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class SimpleAdminServer {

    public static void main(String[] args) throws IOException {
        // Создаем сервер на порту 3000
        HttpServer server = HttpServer.create(new InetSocketAddress(3000), 0);
        
        // Регистрируем обработчик для конкретного пути
        server.createContext("/api/admin/users", new UsersHandler());
        
        // Устанавливаем стандартный исполнитель (null использует дефолтный)
        server.setExecutor(null); 
        
        System.out.println("Сервер запущен на http://localhost:3000/api/admin/users");
        server.start();
    }

    // Обработчик запросов
    static class UsersHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String method = exchange.getRequestMethod(); // Получаем метод (GET, POST и т.д.)
            String response = "";
            int statusCode = 200;

            // Обработка GET запроса
            if ("GET".equalsIgnoreCase(method)) {
                // В реальном приложении здесь был бы JSON из базы данных
                response = "[{\"id\": 1, \"name\": \"Admin_1\"}, {\"id\": 2, \"name\": \"Admin_2\"}]";
                exchange.getResponseHeaders().set("Content-Type", "application/json");
            } 
            // Обработка POST запроса
            else if ("POST".equalsIgnoreCase(method)) {
                // Чтение тела запроса (от фронтенда)
                byte[] bodyBytes = exchange.getRequestBody().readAllBytes();
                String requestBody = new String(bodyBytes, StandardCharsets.UTF_8);
                
                System.out.println("Получены данные от фронтенда: " + requestBody);
                
                response = "Пользователь успешно создан (имитация)";
                statusCode = 201;
            } else {
                response = "Метод не поддерживается";
                statusCode = 405;
            }

            // Отправка ответа клиенту
            byte[] responseBytes = response.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(statusCode, responseBytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(responseBytes);
            }
        }
    }
}
