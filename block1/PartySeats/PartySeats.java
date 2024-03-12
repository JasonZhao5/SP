import java.util.ArrayList;
import java.util.Arrays;

public class PartySeats {
    public String[] seating(String[] attendees) {
        if (attendees.length < 3) {
            return new String[]{};
        }
        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls = new ArrayList<>();
        Arrays.sort(attendees);

        for (String attendee : attendees) {
            String[] split = attendee.split(" ");
            if (split[1].equals("boy")) {
                boys.add(split[0]);
            } else {
                girls.add(split[0]);
            }
        }

        if (boys.size() != girls.size()) {
            return new String[]{};
        }

        ArrayList<String> returnValues = new ArrayList<>();
        returnValues.add("HOST");

        for (int i = 1; i <= attendees.length; i++) {
            if (i == attendees.length / 2 + 1) {
                returnValues.add("HOSTESS");
            }
            if (i < attendees.length / 2 + 1) {
                if (0 == i % 2) {
                    returnValues.add(boys.get(0));
                    boys.remove(0);
                } else {
                    returnValues.add(girls.get(0));
                    girls.remove(0);
                }
            } else {
                if (0 == i % 2) {
                    returnValues.add(girls.get(0));
                    girls.remove(0);
                } else {
                    returnValues.add(boys.get(0));
                    boys.remove(0);
                }
            }
        }

        return returnValues.toArray(new String[0]);

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new PartySeats().seating(new String[]{"BOB boy", "SUZIE girl", "DAVE boy", "JO girl",
                "AL boy", "BOB boy", "CARLA girl", "DEBBIE girl"})));
    }
}
