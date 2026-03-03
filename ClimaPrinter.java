import org.json.JSONObject;

public class ClimaPrinter {
    public static void imprimirDadosClimaticos(String dados){
        
        JSONObject dadosJson = new JSONObject(dados);
        JSONObject informacoesMeteorologicas = dadosJson.getJSONObject("current");

        // Extrair os dados da localização
        String cidade = dadosJson.getJSONObject("location").getString("name");
        String pais = dadosJson.getJSONObject("location").getString("country");
        
        // Extrai os dados adicionais
        String condicaoTempo = informacoesMeteorologicas.getJSONObject("condition").getString("text");
        int umidade = informacoesMeteorologicas.getInt("humidity");
        float velocidadeVento = informacoesMeteorologicas.getFloat("wind_kph");
        float pressaoAtmosferica = informacoesMeteorologicas.getFloat("pressure_mb");
        float sensacaoTermica = informacoesMeteorologicas.getFloat("feelslike_c");
        float temperaturaAtual = informacoesMeteorologicas.getFloat("temp_c");

        // Extrai a data e hora da string retornada pela API
        String dataHoraString = informacoesMeteorologicas.getString("last_updated");

        // Imprime as informações atuais
        System.out.println("Informações Meteorológicas para " + cidade + ", " + pais);
        System.out.println("Data e Hora: " + dataHoraString);
        System.out.println("Temperatura Atual: " + temperaturaAtual + "°C");
        System.out.println("Sensação Térmica: " + sensacaoTermica + "°C");
        System.out.println("Condição do Tempo: " + condicaoTempo);
        System.out.println("Umidade: " + umidade + "%");
        System.out.println("Velocidade do Vento: " + velocidadeVento + " km/h");
        System.out.println("Pressão Atmosférica: " + pressaoAtmosferica + " mb");

    }

}
