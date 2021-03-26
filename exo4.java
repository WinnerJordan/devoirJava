import java.util.Scanner;

class exo4 {
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

        if(((annee%4==0) && (annee%100!=0)) || (annee%400==0)){
            lastOfFebuary += 29;
        }
        else
        {
           lastOfFebuary += 28;
        }

        String[] noms = {" ","Janvier","Fevrier", "Mars", "Avril","Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};
        if ((mois == 1) || (mois == 3) || (mois == 5) || (mois == 7) || (mois == 8) || (mois == 10) || (mois == 12)){
            if (jour==1){
                System.out.println("La date du jour suivant est : 02 " + " " + noms[mois]+ " " + annee);
                if (mois == 3){
                    System.out.println("la date du jour precedent est : "+ lastOfFebuary + " " + noms[mois-1]+" " + annee);
                }
                else if (mois == 1){
                    System.out.println("la date du jour precedent est : 31 " + noms[12]+" " + (annee-1));
                }
                else if (mois == 8){
                    System.out.println("La date du jour precedent est : 31 " + noms[mois-1] +" " + (annee));
                }
                else{
                    System.out.println("la date du jour precedent est : 30 " + noms[mois-1]+ " "+annee);
                }
            }
            else if (jour > 1 && jour <=30){
                System.out.println("La date du jour suivant est : " + (jour+1) +" " + noms[mois]+" " + annee);
                System.out.println("la date du jour precedent est : " + (jour-1) +" " + noms[mois] + " "  + annee);
            }
            else if (jour == 31){
                if (mois==12){
                    System.out.println("La date du jour suivant est : 01 " + noms[1] + " " + (annee+1));
                }
                else{
                    System.out.println("La date du jour suivant est : 01 " + noms[mois+1]+ " " + annee);
                }
                System.out.println("la date du jour precedent est : " + (jour-1) + " " + noms[mois] + " "+ annee);
            }
            else{
                System.out.println("Date invalide !!!");
            }
        }
        else if ((mois == 4) || (mois == 6) || (mois == 9) || (mois == 10)){
            if (jour==1){
                System.out.println("La date du jour suivant est : 02 " + noms[mois] + " " + annee);
                System.out.println("la date du jour precedent est : 31 " + noms[mois-1]+ " " + annee);
            }
            else if (jour > 1 && jour <=29){
                System.out.println("La date du jour suivant est : " + (jour+1)+" " + noms[mois]+" " + annee);
                System.out.println("la date du jour precedent est : " + (jour-1) +" "+ noms[mois]+ " " + annee);
            }
            else if (jour == 30){
                System.out.println("La date du jour suivant est : 01 " + noms[mois+1]+" " + annee);
                System.out.println("la date du jour precedent est : " + (jour-1)+ " " + noms[mois] + " "+ annee);
            }
            else{
                System.out.println("Date invalide !!!");
            }
        }
        else if(mois == 2){
            if (jour == 1){
                System.out.println("la date du jour suivant est : 02 "+ noms[mois] +" "+ annee);
                System.out.println("la date du jour precedent est : 31 "+ noms[mois-1]+" " + annee);
            }
            else if (jour > 1 && jour < lastOfFebuary){
                System.out.println("la date du jour suivant est : " + (jour+1) + " " + noms[mois] +" " + annee);
                System.out.println("la date du jour precedent est : "+ (jour-1)+ " " + noms[mois] + " " + annee);
            }
            else if (jour == lastOfFebuary){
                System.out.println("la date du jour suivant est : 01 " + noms[mois+1]+" " + annee);
                System.out.println("la date du jour precedent est : " + (jour-1)+ " " + noms[mois]+" " + annee);
            }
            else{
                System.out.println("Date invalide !!!");
            }
        }
    }
}