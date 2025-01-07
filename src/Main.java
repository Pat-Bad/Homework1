import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");


                int x = 2;
                int y = 5;
                int Result = x * y;
                System.out.println(Result);

                String primaParte = "Il numero è";
                int numeroIntero = 62;

                String concatenazioneElementi = primaParte + " " + numeroIntero;
                System.out.println(concatenazioneElementi);

                //esercizio array//
//importo array util per vedere gli elementi dell'array stampati in console//

        String[] myArray = new String [] {"uno","due","tre","quattro","cinque"};
        System.out.println(Arrays.toString(myArray));

        // creo un nuovo array di un elemento più grande (in java gli array hanno lunghezza fissa)//
        String[] newArray = new String [myArray.length + 1];
        //ciclo for per copiarci dentro gli elementi prima della posizione in cui voglio inserire la nuova stringa (indice 3)//
        //inizializzo i a 0 scrivendo int perché è necessario in java. i<3 perché è in quel punto che vogliuo aggiungere il nuovo elemento//

        for (int i=0; i<3; i++){
            //copiami nel nuovo array ogni elemento di myarray prima di quell'indice//
            newArray[i] = myArray[i];
        }
newArray[3] = "elemento da aggiungere";

        //ciclo for per copiare gli elementi dopo quello specifico indice//
        //i=3 perché deve partire da quell'indice (prima ho l'ho fatto terminare prima)//
        for (int i=3; i<myArray.length;i++){
            newArray[i+1] = myArray[i]; //[i+1] per non saltare l'elemento aggiunto//

        }
        System.out.println(Arrays.toString(newArray));

System.out.println("stringa"+" di prova");
Scanner scanner = new Scanner(System.in);
String stringa = scanner.nextLine();
String stringa2 = scanner.nextLine();
String stringa3 = scanner.nextLine();
String joinedStrings = stringa + " " + stringa2 + " " + stringa3;
String reversedStrings = stringa3 + " " + stringa2 + " " + stringa;
System.out.println(joinedStrings);
System.out.println(reversedStrings);

//calcolo del perimetro di un rettangolo in decimali. 2b+2h. double//

        double b = 5.4;
        double h = 6.3;
        double perimetroRettangolo = 2 * (b+h);
        System.out.println(perimetroRettangolo);

        int n1 = 4;
        int dividedBy = 0;
        if (n1 %2 == 0) {
           dividedBy = 0;
        } else {dividedBy=1;}
        System.out.println(dividedBy);


//formula di Erone - radice quadrata area = √p(p-a)(p-b)(p-c)//
        double c = 10.3;
        double d = 5.1;
       double perimetroTriangolo = (c*d)/2;
       System.out.println(perimetroTriangolo);






    }
}