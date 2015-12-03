import java.util.Scanner;
public class Thekid {
public static void main(String[] args) {

  Julkalender MinJulkalender = new Julkalender();

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
