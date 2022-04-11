import java.util.Scanner;

public class scannerString {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrer une valeur ");
        char a = clavier.next().charAt(0);
        System.out.println("La chaine est :" + a);
    }
}
