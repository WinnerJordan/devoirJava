import java.util.Scanner;
class exo1 {
    /*methode d'execution*/

    public static void main(String[] args) {
        Scanner exo = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("veuille saisir une annee : ");
        int annee = exo.nextInt();
        if(((annee%4==0) && (annee%100!=0)) || (annee%400==0)){
            System.out.println("l'annee " + annee + " est bisextille");
        }
        else
        {
            System.out.println("l'annee " + annee + " n'est pas bisextille");
        }

    }
}