import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner clavier =new Scanner(System.in);
        System.out.println("ENTRER UNE VALEUR:");
        int a=clavier.nextInt();
        int leDouble=a*2;
        System.out.println("Le double de la valeur de (a) est "+leDouble);
    }
}
