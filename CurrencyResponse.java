
// Clase que representa la respuesta de la API
public class CurrencyResponse {
    private boolean success;
    private String baseCurrency;
    private String targetCurrency;
    private double conversionRate;

    // Constructor que inicializa los atributos
    public CurrencyResponse(boolean success, String baseCurrency, String targetCurrency, double conversionRate) {
        this.success = success;
        this.baseCurrency = baseCurrency;
        this.targetCurrency = targetCurrency;
        this.conversionRate = conversionRate;
    }


    // Métodos getter
    public boolean isSuccessful() {
        return success;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public double getConversionRate() {
        return conversionRate;
    }
}
