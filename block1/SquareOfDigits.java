public class SquareOfDigits {
    public int getMax(String[] data) {
        int distance = 0;
        int squrt = 1;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length(); j++) {
                for (int j2 = j + 1; j2 < data[i].length(); j2++) {
                    if (data[i].charAt(j) == data[i].charAt(j2)) {
                        distance = j2 - j;
                        if (i + distance < data.length && data[i + distance].charAt(j) == data[i + distance].charAt(j2)
                                && data[i].charAt(j) == data[i + distance].charAt(j)) {
                            squrt = Math.max(squrt, (distance + 1) * (distance + 1));
                            return squrt;
                        }
                    }
                }
            }
        }
        return squrt;
    }

    public static void main(String[] args) {
        System.out.println(new SquareOfDigits().getMax(
                new String[]{"9785409507",
                        "2055103694",
                        "0861396761",
                        "3073207669",
                        "1233049493",
                        "2300248968",
                        "9769239548",
                        "7984130001",
                        "1670020095",
                        "8894239889",
                        "4053971072"}
        ));
    }
}