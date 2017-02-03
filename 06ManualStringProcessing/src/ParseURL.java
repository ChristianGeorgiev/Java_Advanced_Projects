import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Veronika on 1/31/2017.
 */
public class ParseURL {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String[] input=reader.readLine().split("://");

        if (input.length > 2 || input.length<2){
            System.out.println("Invalid URL");
        }else{

            String protocol=input[0];
            String server=input[1].substring(0,input[1].indexOf("/"));
            String resource=input[1].substring(input[1].indexOf("/")+1);

            System.out.println("Protocol = "+protocol);
            System.out.println("Server = "+server);
            System.out.println("Resources = "+resource);
        }

    }
}
