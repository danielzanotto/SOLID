// Singleton Pattern - Garantir uma única instância da conexão com o banco de dados
public class DatabaseConnection {
    // Instância única (inicializada uma única vez)
    private static DatabaseConnection instance;

    // Construtor privado evita que outras classes criem novas instâncias
    private DatabaseConnection() {
        System.out.println("Conexão com o banco de dados criada.");
    }

    // Método público de acesso à instância
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection(); // Cria uma vez
        }
        return instance; // Sempre retorna a mesma
    }
}
