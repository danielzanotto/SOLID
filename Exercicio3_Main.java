public class Main {
    public static void main(String[] args) {
        // Obtendo a instância única da conexão com o banco de dados
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        // Verificando se ambas as variáveis apontam para a mesma instância
        if (connection1 == connection2) {
            System.out.println("As duas conexões são a mesma instância (Singleton confirmado).");
        } else {
            System.out.println("As conexões são diferentes (Singleton falhou).");
        }
    }
}
//--