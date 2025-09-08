////____________________________________________________
// Strategy Pattern - Solução para o problema anterior
interface FormatoRelatorio {
    void gerar();  // Contrato comum para todos os formatos
}

// Implementações concretas (fechadas para modificação, abertas para extensão)
class PDF implements FormatoRelatorio {
    @Override
    public void gerar() {
        System.out.println("Salvando relatório PDF");
    }
}

class HTML implements FormatoRelatorio {
    @Override
    public void gerar() {
        System.out.println("Salvando relatório HTML");
    }
}

// Simulação de repositório (pode ser vazio por enquanto)
class RelatorioRepository {
    // Simulando acesso a dados
}

// SRP aplicado - Classe com única responsabilidade
class RelatorioService {
    private RelatorioRepository repository;  // Injeção de dependência

    // Construtor
    public RelatorioService(RelatorioRepository repository) {
        this.repository = repository;
    }

    // Método que delega a geração para a estratégia
    void gerar(FormatoRelatorio formato) {
        formato.gerar();  // Polimorfismo em ação
    }
}

// Classe principal para testar a funcionalidade
public class Main {
    public static void main(String[] args) {
        RelatorioRepository repository = new RelatorioRepository();
        RelatorioService service = new RelatorioService(repository);

        // Teste com PDF
        FormatoRelatorio formatoPdf = new PDF();
        service.gerar(formatoPdf);

        // Teste com HTML
        FormatoRelatorio formatoHtml = new HTML();
        service.gerar(formatoHtml);
    }
}
