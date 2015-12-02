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
        Gifts[0] = "Ett par sletna Pjucks";
        Gifts[1] = "En katt";
        Gifts[2] = "En Diskmaskin";
        Gifts[3] = "Lite Chocklad";
        Gifts[4] = "En fisk";
        Gifts[5] = "En påse med Äpplen";
        Gifts[6] = "En riktigt nice Dator";
        Gifts[7] = "Ett skrangligt Bord";
        Gifts[8] = "En Vrålapa";
        Gifts[9] = "Ett 6-pack Folköl";
        Gifts[10] = "En trasig glödlampa";
        Gifts[11] = "Ett bananskal";
        Gifts[12] = "En klick solkräm";
        Gifts[13] = "En kopp kaffe";
        Gifts[14] = "En TV-apparat";
        Gifts[15] = "Ett Mumintroll";
        Gifts[16] = "En Tavla";
        Gifts[17] = "En Gaffel";
        Gifts[18] = "En Lampa";
        Gifts[19] = "En tandpetare";
        Gifts[20] = "Lite Blommor";
        Gifts[21] = "En halv gris";
        Gifts[22] = "En bit kaka";
        Gifts[23] = "Ett stycke tomteskägg";

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
            out = "ERRORE! ERRORE! Vi har en fuskare här!";
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
  //System.out.println(MinJulkalender.showAllOpen());

  Scanner keyboard = new Scanner(System. in );
  System.out.println("1. Visa dagens lucka 2. Öppna valfri lucka 3. Visa alla öppnade");
  String input = keyboard.next().trim();

  switch (input) {
            case "1":  input = "1";
                    System.out.println("I dagens lucka hittar du:"+MinJulkalender.openToday());
                     break;
            case "2":  input = "2";
                    System.out.println("Vilket datum (En siffra mellan 1 och 24) ?");
                    int num = keyboard.nextInt();
                    System.out.println("Där hittar du:"+MinJulkalender.openAny(num));
                     break;
            case "3":  input = "3";
                    System.out.println("Det här har du fått hittills av din Julkalender:"+MinJulkalender.showAllOpen());
                     break;
            default: input = "Jag förstår bara 1,2,3 inget annat!";
                    System.out.println(input);
                     break;
        }


}
}
