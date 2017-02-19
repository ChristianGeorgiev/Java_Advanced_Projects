import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class RoyalNonStop {
    private static double lukankaPrice;
    private static double rakijaPrice;

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] sizes = console.readLine().split("\\s+");
        String[] prices = console.readLine().split("\\s+");

        lukankaPrice = Double.valueOf(prices[0]);
        rakijaPrice = Double.valueOf(prices[1]);

        String clientsLine = console.readLine().trim();
        int totalCustomers = 0;
        BigDecimal totalSum = new BigDecimal(0);
        while (!"Royal Close".equals(clientsLine.trim())){
            int customerStartRow = Integer.valueOf(clientsLine.split("\\s+")[0]);
            int customerStartCol = Integer.valueOf(clientsLine.split("\\s+")[1]);
            totalSum = totalSum.add(new BigDecimal(walkToThePayDesk(customerStartRow, customerStartCol)));
            totalCustomers ++;
            clientsLine = console.readLine().trim();
        }

        System.out.printf("%.6f%n", totalSum);
        System.out.println(totalCustomers);
    }

    private static double walkToThePayDesk(int customerRow, int customerCol) {
        double totalSum = 0;
        if (customerRow < customerCol){
            while (customerRow > 0){
                if (customerRow % 2 == 0){
                    totalSum += ((customerRow+1) * (customerCol+1)) * lukankaPrice;
                    customerRow--;
                }else if (customerRow % 2 != 0){
                    totalSum += ((customerRow+1) * (customerCol+1)) * rakijaPrice;
                    customerRow--;
                }else{
                    break;
                }
            }
            while (customerCol > 0){
                if (customerRow % 2 == 0){
                    totalSum += ((customerRow+1) * (customerCol+1)) * lukankaPrice;
                    customerCol--;
                }else if (customerRow % 2 != 0){
                    totalSum += ((customerRow+1) * (customerCol+1)) * rakijaPrice;
                    customerCol--;
                }else {
                    break;
                }
            }

        }else if (customerRow >= customerCol){
            while (customerCol > 0){
                if (customerRow % 2 == 0){
                    totalSum += ((customerRow+1) * (customerCol+1)) * lukankaPrice;
                    customerCol--;
                }else if (customerRow % 2 != 0){
                    totalSum += ((customerRow+1) * (customerCol+1)) * rakijaPrice;
                    customerCol--;
                }else {
                    break;
                }
            }
            while (customerRow > 0){
                if (customerRow % 2 == 0){
                    totalSum += ((customerRow+1) * (customerCol+1)) * lukankaPrice;
                    customerRow--;
                }else if (customerRow % 2 != 0){
                    totalSum += ((customerRow+1) * (customerCol+1)) * rakijaPrice;
                    customerRow--;
                }else{
                    break;
                }
            }
        }
        return totalSum;
    }
}
