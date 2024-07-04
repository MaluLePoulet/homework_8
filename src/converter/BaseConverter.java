package converter;


public class BaseConverter {


    public double convert(double temperature, DegreesTypes fromDegreeType, DegreesTypes toDegreeType) {
        if (fromDegreeType == toDegreeType) {
            return temperature;
        }
        double temperatureInCelsius = convertToCelsius(temperature, fromDegreeType);
        return convertFromCelsius(temperatureInCelsius, toDegreeType);
    }

    private double convertToCelsius(double temperature, DegreesTypes fromDegreeType) {
        switch (fromDegreeType) {
            case KELVIN:
                return temperature - 273.15;
            case FAHRENHEIT:
                return (temperature - 32) / 1.8;
            case CELSIUS:
            default:
                return temperature;
        }
    }

    private double convertFromCelsius(double temperature, DegreesTypes toDegreeType) {
        switch (toDegreeType) {
            case KELVIN:
                return temperature + 273.15;
            case FAHRENHEIT:
                return temperature * 1.8 + 32;
            case CELSIUS:
            default:
                return temperature;
        }
    }
}
