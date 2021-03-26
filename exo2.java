import java.util.Scanner;
class exo2 {

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
        switch (mois) {
            case 1:
                System.out.println("Ce mois comporte 31 jours");
                break;
            case 2:
                if(((annee%4==0) && (annee%100!=0)) || (annee%400==0)){
                    System.out.println("Ce mois comporte 29 jours");
                }
                else
                {
                    System.out.println("Ce mois comporte 28 jours");
                }
                break;
            case 3:
                System.out.println("Ce mois comporte 31 jours");
                break;
            case 4:
                System.out.println("Ce mois comporte 30 jours");
                break;
            case 5:
                System.out.println("Ce mois comporte 31 jours");
                break;
            case 6:
                System.out.println("Ce mois comporte 30 jours");
                break;
            case 7:
                System.out.println("Ce mois comporte 31 jours");
                break;
            case 8:
                System.out.println("Ce mois comporte 31 jours");
                break;
            case 9:
                System.out.println("Ce mois comporte 30 jours");
                break;
            case 10:
                System.out.println("Ce mois comporte 31 jours");
                break;
            case 11:
                System.out.println("Ce mois comporte 30 jours");
                break;
            case 12:
                System.out.println("Ce mois comporte 31 jours");
                break;
        }
    }
}