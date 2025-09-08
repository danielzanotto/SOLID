// Aplicação do Strategy Pattern para cálculo de impostos

// 1. Interface comum para estratégias de imposto
interface ImpostoStrategy {
    double calcular(double valor);  // Contrato comum
}

// 2. Implementações concretas
class ICMS implements ImpostoStrategy {
    @Override
    public double calcular(double valor) {
        System.out.println("Calculando imposto ICMS");
        return valor * 0.18;  // Exemplo: 18%
    }
}

class ISS implements ImpostoStrategy {
    @Override
    public double calcular(double valor) {
        System.out.println("Calculando imposto ISS");
        return valor * 0.05;  // Exemplo: 5%
    }
}

// 3. Classe que utiliza a estratégia
class CalculadoraImposto {
    double calcular(ImpostoStrategy imposto, double valor) {
        return imposto.calcular(valor);
    }
}

// 4. Classe principal
public class Main {
    public static void main(String[] args) {
        CalculadoraImposto calculadora = new CalculadoraImposto();

        double valorProduto = 1000.0;

        ImpostoStrategy icms = new ICMS();
        ImpostoStrategy iss = new ISS();

        double valorICMS = calculadora.calcular(icms, valorProduto);
        double valorISS = calculadora.calcular(iss, valorProduto);

        System.out.println("Valor ICMS: R$ " + valorICMS);
        System.out.println("Valor ISS: R$ " + valorISS);
    }
}