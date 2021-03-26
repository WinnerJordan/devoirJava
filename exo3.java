import java.util.Scanner;
class exo3 {
   

    public static void main(String[] args) {
        Scanner exo = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("    ********** MENU **********  ");
        System.out.print("veuille saisir une annee : ");
        int annee = exo.nextInt();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" Pour choisir un mois, saisir le numero attribue ");
        System.out.println("Janvier      -----     1");
        System.out.println("Fevrier      -----     2");
        System.out.println("Mars         -----     3");
        System.out.println("Avril        -----     4");
        System.out.println("Mai          -----     5");
        System.out.println("Juin         -----     6");
        System.out.println("Juillet      -----     7");
        System.out.println("Aout         -----     8");
        System.out.println("Septembre    -----     9");
        System.out.println("Octobre      -----     10");
        System.out.println("Novembre     -----     11");
        System.out.println("Decembre     -----     12");
        System.out.print("veuille saisir un mois : ");
        int mois = exo.nextInt();
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("veuille saisir un le jour : ");
        int jour = exo.nextInt();
        int lastOfFebuary = 0;

        switch (mois) {
            case 1: //Janvier
                if (1<=jour && jour <= 31 ){
                    System.out.println("Date valide");
                }
                else{
                    System.out.println("Date invalide");
                }
                break;
            case 2: //Fevrier
                if(((annee%4==0) && (annee%100!=0)) || (annee%400==0)){
                    if (1<=jour && jour <= 29 ){
                        System.out.println("Date valide");
                    }
                    else{
                        System.out.println("Date invalide");
                    }
                }
                else
                {
                    if (1<=jour && jour <= 28 ){
                        System.out.println("Date valide");
                    }
                    else{
                        System.out.println("Date invalide");
                    }
                }
                break;
            case 3: //Mars
                if (1<=jour && jour <= 31 ){
                    System.out.println("Date valide");
                }
                else{
                    System.out.println("Date invalide");
                }
                break;
            case 4: //Avril
                if (1<=jour && jour <= 30 ){
                    System.out.println("Date valide");
                }
                else{
                    System.out.println("Date invalide");
                }
                break;
            case 5: //Mai
                if (1<=jour && jour <= 31 ){
                    System.out.println("Date valide");
                }
                else{
                    System.out.println("Date invalide");
                }
                break;
            case 6: // Juin
                if (1<=jour && jour <= 30 ){
                    System.out.println("Date valide");
                }
                else{
                    System.out.println("Date invalide");
                }
                break;
            case 7: //Juillet
                if (1<=jour && jour <= 31 ){
                    System.out.println("Date valide");
                }
                else{
                    System.out.println("Date invalide");
                }
                break;
            case 8: //Août
                if (1<=jour && jour <= 31 ){
                    System.out.println("Date valide");
                }
                else{
                    System.out.println("Date invalide");
                }
                break;
            case 9: //Septembre
                if (1<=jour && jour <= 30 ){
                    System.out.println("Date valide");
                }
                else{
                    System.out.println("Date invalide");
                }
                break;
            case 10: //Octobre
                if (1<=jour && jour <= 31 ){
                    System.out.println("Date valide");
                }
                else{
                    System.out.println("Date invalide");
                }
                break;
            case 11: //Novembre
                if (1<=jour && jour <= 30 ){
                    System.out.println("Date valide");
                }
                else{
                    System.out.println("Date invalide");
                }
                break;
            case 12: //Décembre
                if (1<=jour && jour <= 31 ){
                    System.out.println("Date valide");
                }
                else{
                    System.out.println("Date invalide");
                }
                break;
        }      
    }
}