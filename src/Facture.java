import java.util.Scanner;

public class Facture {
    public static void main(String[] args) {
        final float TPS=0.05f;
        final float TVQ=0.1f;

        String cathegorie, produit,facture_prduit,  facture="Facture :\n", choix, total = "Grand total ";
        // prix avant taxes
        float prix_atx;
        // prix tout taxes comprises
        float prix_ttc;
        // prix total
        float prix_total=0.0f;
        Scanner clavier=new Scanner(System.in);
        Scanner clavierChoix=new Scanner(System.in);

        do {
            System.out.println("Entrez le nom de la cathegorie : Fruit(F), Legume(L), Epicerie taxable (ETX), Epicerie non taxable (E) ?");

            do {

                cathegorie=clavier.nextLine();
            }while(!cathegorie.equalsIgnoreCase("F") && !cathegorie.equalsIgnoreCase("L") &&
                    !cathegorie.equalsIgnoreCase("ETX") &&  !cathegorie.equalsIgnoreCase("E") );
            System.out.println("Entrez le nom de produit :");
            produit=clavier.nextLine();
            System.out.println("Entrez le prix de produit");
            prix_atx=clavier.nextFloat();
            switch ( cathegorie)
            {
                case "F":
                case "f":
                    facture_prduit="Fruit : "+produit+" "+prix_atx+"$";
                    System.out.println(facture_prduit);
                    prix_total+=prix_atx;
                    facture+=facture_prduit+"\n";
                    if(!total.equals("Grand total "))
                        total = total+ "+" + (prix_atx);
                    else
                        total = total+ (prix_atx);
                    break;
                case "L":
                case "l":
                    facture_prduit= "Legume : "+produit+" "+prix_atx+"$";
                    System.out.println(facture_prduit);
                    prix_total+=prix_atx;
                    facture+=facture_prduit+"\n";
                    if(!total.equals("Grand total "))
                        total = total + "+" + (prix_atx);
                    else
                        total = total+ (prix_atx);
                    break;
                case "E":
                case "e":
                    facture_prduit="Epicerie non taxable : "+produit+" "+prix_atx+"$";
                    System.out.println(facture_prduit);
                    facture+=facture_prduit+"\n";
                    prix_total+=prix_atx;
                    if(!total.equals("Grand total "))
                        total = total+"+" + (prix_atx );
                    else
                        total = total+ (prix_atx);
                    break;
                case "ETX":
                case "etx" :
                    prix_ttc=prix_atx+prix_atx*TPS+prix_atx*TVQ;
                    prix_total+=prix_ttc;
                    facture_prduit="Epicerie taxable : "+produit+" "+prix_atx+"+("+prix_atx+"*"+TPS+ ")+("+prix_atx+"*"+TVQ+")="+prix_ttc+"$";
                    System.out.println(facture_prduit);
                    facture+=facture_prduit+"\n";
                    if(!total.equals("Grand total "))
                        total = total +"+"+ (prix_ttc  );
                    else
                        total = total + prix_ttc;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + cathegorie);
            }
            System.out.println("Est ce que vous avez un autre prduit ? (oui/non): ");
            do{
                choix=clavierChoix.nextLine();
            }while(!choix.equalsIgnoreCase("oui")&&!choix.equalsIgnoreCase("non"));
        }while(choix.equalsIgnoreCase("oui"));
        if(total.contains("+"))
            total= total +"="+prix_total+"$\n";
        else
            total= total +"$\n";
        System.out.println(facture);
        System.out.println( total);
    }

    }
