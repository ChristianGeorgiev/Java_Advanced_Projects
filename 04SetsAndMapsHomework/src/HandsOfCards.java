import java.util.*;


public class HandsOfCards {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<String>> players = new LinkedHashMap<>();
        while (true){
            String[] input = console.nextLine().split(":\\s+");
            if ("JOKER".equals(input[0])){
                break;
            }

            String name = input[0];
            String[] cardsStr = input[input.length-1].split(", ");
            ArrayList<String> cards = new ArrayList<>();
            for (int i = 0; i < cardsStr.length; i++) {
                if (!cards.contains(cardsStr[i])){
                    cards.add(cardsStr[i]);
                }
            }

            if (!(players.containsKey(name))){
                players.put(input[0], cards);
            }else{
                for (int i = 0; i < cards.size(); i++) {
                    if (!(players.get(name).contains(cards.get(i)))){
                        players.get(name).add(cards.get(i));
                    }
                }
            }
        }


        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for (String player : players.keySet()) {
            int totalSum = 0;
            for (int i = 0; i < players.get(player).size(); i++) {
                //Has number and letter
                if (containsDigit(players.get(player).get(i))){
                    String[] card =players.get(player).get(i).split("");
                    int power = 0;
                    int multiplier = 0;
                    if (players.get(player).get(i).length()==3){
                        power = Integer.parseInt(players.get(player).get(i).substring(0, 2));
                    }else if (players.get(player).get(i).length()==2){
                        power = Integer.parseInt(players.get(player).get(i).substring(0, 1));
                    }

                    if (card[card.length-1].equals("S")){multiplier = 4;}
                    if (card[card.length-1].equals("H")){multiplier = 3;}
                    if (card[card.length-1].equals("D")){multiplier = 2;}
                    if (card[card.length-1].equals("C")){multiplier = 1;}

                    totalSum+=power*multiplier;
                }
                //Has only letters
                else {
                    String[] card = players.get(player).get(i).split("");
                    int power = 0;
                    int multiplier = 0;
                    if (card[0].equals("J")){power = 11;}
                    if (card[0].equals("Q")){power = 12;}
                    if (card[0].equals("K")){power = 13;}
                    if (card[0].equals("A")){power = 14;}

                    if (card[1].equals("S")){multiplier = 4;}
                    if (card[1].equals("H")){multiplier = 3;}
                    if (card[1].equals("D")){multiplier = 2;}
                    if (card[1].equals("C")){multiplier = 1;}

                    totalSum += power*multiplier;
                    }

                }
                result.put(player, totalSum);
            }


        for (String player : result.keySet()) {
            System.out.println(player + ": " + result.get(player));
        }

    }

    public static boolean containsDigit(String s) {
        boolean containsDigit = false;

        if (s != null && !s.isEmpty()) {
            for (char c : s.toCharArray()) {
                if (containsDigit = Character.isDigit(c)) {
                    break;
                }
            }
        }
        return containsDigit;
    }
}
