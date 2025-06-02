import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class HttpClientService {

    // Clave de API personalizada para exchangerate-api.com
    private static final String API_KEY = "1795807ed0f1ea349bc15c03"; // Mi API kEY
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";
          //https://v6.exchangerate-api.com/v6/1795807ed0f1ea349bc15c03/pair/COP/USD


    // Metodo que realiza la solicitud HTTP y devuelve la tasa de cambio
    public static CurrencyResponse getConversionRate(String from, String to) {
        try {
            String requestUrl = BASE_URL + from + "/" + to;

            // Crear el cliente HTTP
            HttpClient client = HttpClient.newHttpClient();

            // Crear la solicitud GET a la API
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(requestUrl))
                    .GET()
                    .build();

            // Enviar la solicitud y obtener la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Parsear el cuerpo JSON
            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();

            // Verificar si el resultado fue exitoso
            if (!json.get("result").getAsString().equals("success")) {
                return null; // Error en la respuesta de la API
            }

            // Obtener los datos relevantes del JSON
            String baseCurrency = json.get("base_code").getAsString();
            String targetCurrency = json.get("target_code").getAsString();
            double rate = json.get("conversion_rate").getAsDouble();

            // Retorna una respuesta con los datos parseados
            return new CurrencyResponse(true, baseCurrency, targetCurrency, rate);
        } catch (Exception e) {
            System.out.println("Error al realizar la solicitud: " + e.getMessage());
            return null;
        }
    }
}