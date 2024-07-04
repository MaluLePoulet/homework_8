package converter;

public class Main {

    public static void main(String[] args) {

        BaseConverter converter = new BaseConverter();

        double celsius = 100.0;
        double kelvin = converter.convert(celsius, DegreesTypes.CELSIUS, DegreesTypes.KELVIN);
        double fahrenheit = converter.convert(celsius, DegreesTypes.CELSIUS, DegreesTypes.FAHRENHEIT);

        System.out.println(celsius + " degrees Celsius = " + kelvin + " degrees Kelvin");
        System.out.println(celsius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit");

        double kelvinToCelsius = converter.convert(kelvin, DegreesTypes.KELVIN, DegreesTypes.CELSIUS);
        System.out.println(kelvin + " degrees Kelvin = " + kelvinToCelsius + " degrees Celsius");

        double fahrenheitToCelsius = converter.convert(fahrenheit, DegreesTypes.FAHRENHEIT, DegreesTypes.CELSIUS);
        System.out.println(fahrenheit + " degrees Fahrenheit = " + fahrenheitToCelsius + " degrees Celsius");
    }
}
