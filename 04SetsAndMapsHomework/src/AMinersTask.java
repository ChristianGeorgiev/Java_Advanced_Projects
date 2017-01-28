import java.util.HashMap;
import java.util.Scanner;

public class AMinersTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        HashMap<String,Long> resourceMap = new HashMap<>();
        while (true){
            String resource = console.nextLine();
            if ("stop".equals(resource)){
                break;
            }
            long resourseQuant = Long.parseLong(console.nextLine());

            if (!resourceMap.containsKey(resource)){
                resourceMap.put(resource, resourseQuant);
            }else {
                resourceMap.put(resource, resourceMap.get(resource) + resourseQuant);
            }
        }

        for (String resource : resourceMap.keySet()) {
            System.out.println(resource + " -> " + resourceMap.get(resource));
        }
    }
}
