import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        float celsius;

        System.out.println("enter the temperature in fahrenheit:");
        Scanner sc=new Scanner(System.in);
        float fahren=sc.nextFloat();

        celsius = ((fahren-32)*5)/9;

        System.out.println("celsius="+celsius);
    }
}
