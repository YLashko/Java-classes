public class Converter
{
    static double CelsiusToFahrenheit(double celsius){
        return celsius * 1.8 + 32;
    }
    
    static double CelsiusToKelvin(double celsius){
        return celsius + 273.15;
    }
    
    static double KelvinToCelsius(double kelvin){
        return kelvin - 273.15;
    }
    
    static double KelvinToFahrenheit(double kelvin){
        return kelvin * 1.8 - 240.85;
    }
    
    static double FahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }
    
    static double FahrenheitToKelvin(double fahrenheit){
        return (fahrenheit - 32) / 1.8 + 273.15;
    }
}
