import java.util.*;

public class MooingCows {
    public int dissatisfaction(String[] farmland) {

        ArrayList<Location> locations = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();

        //extract positions
        for (int i = 0; i < farmland.length; i++) {
            char[] column = farmland[i].toCharArray();
            for (int j = 0; j < column.length; j++) {
                if (column[j] == 'C') {
                    locations.add(new Location(i, j));
                }
            }
        }

        //calculate total Dissatisfaction
        int total = 0;
        for (Location mooCowLocation : locations) {
            for (Location location : locations) {
                total += calculateDissatisfaction(mooCowLocation, location);
            }
            results.add(total);
            total = 0;
        }

        //return the minimum choice
        return results.stream().sorted(Comparator.comparing(Integer::shortValue)).toList().getFirst();
    }

    private int calculateDissatisfaction(Location mooCowLocation, Location location) {
        return (int) (Math.pow(Math.abs(mooCowLocation.x - location.x), 2)
                + Math.pow(Math.abs(mooCowLocation.y - location.y), 2));
    }

    static class Location {
        int x;
        int y;


        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
