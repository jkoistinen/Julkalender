import java.time.LocalDate;
import java.util.Scanner;
/**
 * Julkalender
 **/
public class Julkalender
{
    // instance variables
    private String[] Gifts;

    LocalDate today = LocalDate.now();
    private int todaysDate = today.getDayOfMonth();
    private String todaysGift;

    /**
     * Constructor for objects of class Julkalender
     */
    public Julkalender()
    {
        // initialise instance variables

        Gifts = new String[24];
        Gifts[0] = "Pjucks";
        Gifts[1] = "En katt";
        Gifts[2] = "Diskmaskin";
        Gifts[3] = "Chocklad";
        Gifts[4] = "En fisk";
        Gifts[5] = "Äpple";
        Gifts[6] = "Dator";
        Gifts[7] = "Bord";
        Gifts[8] = "Vrålapa";
        Gifts[9] = "Folköl";
        Gifts[10] = "Ingenting, luuurad!";
        Gifts[11] = "Ett bananskal";
        Gifts[12] = "Solkräm";
        Gifts[13] = "Error!";
        Gifts[14] = "TV-apparat";
        Gifts[15] = "Mumintroll";
        Gifts[16] = "Tavla";
        Gifts[17] = "Gaffel";
        Gifts[18] = "Lampa";
        Gifts[19] = "En tandpetare";
        Gifts[20] = "Blommor";
        Gifts[21] = "Gris";
        Gifts[22] = "Kaka";
        Gifts[23] = "Tomtens skägg";

        todaysGift = Gifts[todaysDate - 1];
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */

      public String openToday() {
          return todaysGift;
        }

     public String openAny(int i){
         // date (i) is not allowed to exceed todaysDate
         String out = "";
         if(i > todaysDate){
            out = "Du får vänta lite till innan du kan öppna lucka"+" "+i;
            } else {
            out = Gifts[i-1];
            }
         return out;
       }

      public String showAllOpen(){
          // show content since first of december
          String out = "";
          for(int i = 1; i <= todaysDate; i++){
            out = out + Gifts[i-1]+",";
            }
          return out;
        }
public static void main(String[] args) {

  Julkalender MinJulkalender = new Julkalender();
  System.out.println(MinJulkalender.showAllOpen());


  System.out.println("1. Visa dagens lucka 2. Öppna valfri lucka 3. Visa alla öppnade");
  Scanner keyboard = new Scanner(System. in );
  input = keyboard.next().trim();

}
}
