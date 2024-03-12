import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class ChangingString {
    public int distance(String a, String b, int k) {

        ArrayList<Integer> distanceList = new ArrayList<>();

        //Record the distance of each character of the two strings into distanceList
        for (int i = 0; i < a.length(); i++) {
            distanceList.add(Math.abs(a.charAt(i) - b.charAt(i)));
        }

        //deal with distanceList
        for (int i = 0; i < k; i++) {
            Optional<Integer> max = distanceList.stream().max(Comparator.comparingInt(Integer::shortValue));
            if (max.isPresent()) {
                distanceList.remove(max.get()); //Change the character with the longest distance from the character in string A
                if (max.get() == 0) {
                    distanceList.add(-1); //Use -1 to occupy a place for an already identical letter
                }
            }
        }

        //Replacing all -1 with 1，which means replacing the letter that is an already identical letter with the letter that is closest (1).
        Collections.replaceAll(distanceList, -1, 1);
        //Returns the total count of all distances in the list
        return (int) distanceList.stream().mapToInt(d -> d).summaryStatistics().getSum();
    }
}
