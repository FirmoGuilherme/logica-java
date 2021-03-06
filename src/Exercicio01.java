import java.util.Locale;
import java.util.Scanner;
//https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
public class Exercicio01 {

    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);

        String product1 = "Computer";
        String product2 = "Oficce Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.println(); // QUEBRA DE LINHA
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println(); // QUEBRA DE LINHA
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US); // MUDANÇA DE IDIOMA PARA USAR O . E NÃO ,
        System.out.printf("US decimal point: %.3f%n", measure);



        scanner.close();

    }




}
