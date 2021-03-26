import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class exo_3_Classe {

    public static void main(String[] args) {
        String pattern = "dd/MM/yyyy";
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez Entrez une date sous format dd/MM/yyyy  : ");
        String D  = sc.nextLine();
        
        if (!isValidDate(D,pattern))
            System.out.println("La date : "+D+" N'est pas valide .");
        else
            System.out.println("La date : "+D+" est  valide ."); 
    }
   
    public static boolean isValidDate(String date, String pattern) {
        try {
            Date simple = new SimpleDateFormat(pattern).parse(date);
            Format format = new SimpleDateFormat(pattern);
             
            if (!date.equals(format.format(simple)))
                return false;

            return true;
        } catch(ParseException e) {
            return false;
        }
    }

    
}