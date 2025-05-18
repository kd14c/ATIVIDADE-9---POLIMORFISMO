class Conversor {

    public double converter(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double converterKmParaMilhas(double km) {
        return km * 0.621371;
    }

    public String converter(String texto) {
        return texto.toUpperCase();
    }
}

public class Main {
    public static void main(String[] args) {
        Conversor conv = new Conversor();
        System.out.println("Celsius para Fahrenheit: " + conv.converter(25));
        System.out.println("Km para milhas: " + conv.converterKmParaMilhas(10));
        System.out.println("String para maiúscula: " + conv.converter("celsius"));
    }
}