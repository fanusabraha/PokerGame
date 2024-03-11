import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class PokerGameApplication {

        // instatiate new hashset
        public static void main(String[] args) throws IOException {
            Set<String> pokergame= new HashSet<>();
            String space ="";
            String [] cardname= new String[45];
            BufferedReader reader = null;

            try {
                reader = new BufferedReader(new FileReader("PokerHands.csv"));
                while ((space=reader.readLine())!= null) {
                    cardname=space.split(",");
                    pokergame.add(cardname[1]);
                }
            }
            finally{
                reader.close();
            }
            System.out.println(pokergame);
            System.out.println("-----------------");

            // remove ACE HIGH and QUEEN HIGH
            System.out.println("removing ACE HIGH");
            pokergame.remove("ACE HIGH");
            System.out.println(pokergame);
            System.out.println("-----------------");

            System.out.println("removing QUEEN HIGH");
            pokergame.remove("QUEEN HIGH");
            System.out.println(pokergame);
            System.out.println("-----------------");
            // Update PAIR to DEUCES
            System.out.println("removing PAIR");
            pokergame.remove("PAIR");
            System.out.println(pokergame);
            System.out.println("-----------------");
            System.out.println("ADDING DEUCES");
            pokergame.add("DEUCES");
            System.out.println(pokergame);

        }


}
