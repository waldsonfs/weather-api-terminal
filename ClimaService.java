import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ClimaService {
     
    public String getDadosClimaticos(String cidade) throws Exception{
        String apiKey = Files.readString( 
            Paths.get("C:/chavesAPI/wheater_api/api-key.txt")).trim();

        String formataNomeCidade = URLEncoder.encode(cidade, StandardCharsets.UTF_8);
        String apiUrl = "http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + formataNomeCidade;
        HttpRequest request = HttpRequest.newBuilder()                   // Solicitacao HTTP
            .uri(URI.create(apiUrl))                                    // Define a URI da solicitacao HTTP
            .build();                                                   // Finaliza a construcao da solicitacao HTTP

        // Criar objeto enviar solicitacoes HTTP e receber respostas HTTP, para acessar o site da Wheater
        HttpClient client = HttpClient.newHttpClient();

        // enviar requisicoes HTTP e receber propostas HTTP, comunicar com o site da API Meteorologica
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body(); // retorna os dados meteorologicos obtidos do site API
    }
}
