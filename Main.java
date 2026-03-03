import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("    SISTEMA DE CONSULTA DE CLIMA ");
        System.out.println("    Dados meteorológicos em tempo real");
        System.out.println("====================================");
        System.out.print("Digite o nome da cidade: ");
        String cidade = scanner.nextLine();

        try {
            ClimaService service = new ClimaService();
            String dadosClimaticos = service.getDadosClimaticos(cidade); // retorna um json

            // Codigo 1006 = localizacao nao encontrada
            if(dadosClimaticos.contains("\"code\":1006")) {
                System.out.println("Localização não encontrada. Por favor tente novamente !");
            } else {
                ClimaPrinter.imprimirDadosClimaticos(dadosClimaticos);
            }
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        scanner.close();
    }
}
