import java.util.Scanner;

/**
 * Created by Veronika on 1/31/2017.
 */
public class ParseTags {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input= console.nextLine();

        String upcase="<upcase>";
        String uppClose="</upcase>";

        while (input.contains(upcase)){
            int idexStart=input.indexOf(upcase);
            int indexEnd=input.indexOf(uppClose);

            String remainder=input.substring(idexStart+upcase.length(),indexEnd);

          input=input.replace(upcase+remainder+uppClose,remainder.toUpperCase());
        }
        System.out.println(input);
    }
}
