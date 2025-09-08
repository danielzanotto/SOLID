public class Main {
    public static void main(String[] args) {
class CalculadoraImposto {
    // Método que viola OCP - precisa ser alterado para novos impostos
    double calcular(String tipo, double valor) {
        if (tipo.equals("ICMS")) {
            return valor * 0.10;  // Lógica específica
        } else if (tipo.equals("ISS")) {
            return valor * 0.05;  // Outra lógica específica
        }
        return 0;  // Comportamento default
    }
}}}
