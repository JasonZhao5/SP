import org.junit.Test;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestMain {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


    }

    @Test
    public void inchWormTest() {
        InchWorm inchWorm = new InchWorm();
        System.out.println(inchWorm.lunchtime(15, 16, 5));
    }

    @Test
    public void mooingCowsTest() {
        MooingCows mooingCows = new MooingCows();
        String[] strings = new String[]
                {"CCC....",
                        "C......",
                        "....C.C",
                        ".C.CC..",
                        "C......"};

        System.out.println(mooingCows.dissatisfaction(strings));
    }

    @Test
    public void alternateColorsTest() {
        AlternateColors colors = new AlternateColors();
        System.out.println(colors.getColor(
                653,
                32,
                1230,
                556
        ));
    }

    @Test
    public void changingStringTest() {
        ChangingString changingString = new ChangingString();
        System.out.println(changingString.distance(
                "fdfdfdfdfdsfabasd",
                "jhlakfjdklsakdjfk",
                8

        ));
    }

    @Test
    public void rugSizeTest() {
        System.out.println(new RugSizes().rugCount(48));
    }

    @Test
    public void ThrowTheBallTest() {
        System.out.println(new ThrowTheBall().timesThrown(
                15, 4, 9
        ));
    }

    @Test
    public void PartySeatsTest() {
        System.out.println(Arrays.toString(new PartySeats().seating(new String[]
                {"BOB boy", "SUZIE girl", "DAVE boy", "JO girl",
                        "AL boy", "BOB boy", "CARLA girl", "DEBBIE girl"}
        )));
    }

    @Test
    public void SquareOfDigitsTest() {
        System.out.println(new SquareOfDigits().getMax(new String[]{"9785409507",
                "2055103694",
                "0861396761",
                "3073207669",
                "1233049493",
                "2300248968",
                "9769239548",
                "7984130001",
                "1670020095",
                "8894239889",
                "4053971072"}));
    }
}