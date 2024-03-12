public class AlternateColors {
    public String getColor(long r, long g, long b, long k) {
        long tempValue = Math.min(r, Math.min(g, b));


        if (k <= 3 * tempValue) {
            if (k % 3 == 1)
                return "RED";
            if (k % 3 == 2)
                return "GREEN";
            if (k % 3 == 0)
                return "BLUE";
        }
        k = k - 3 * tempValue;
        r = r - tempValue;
        g = g - tempValue;
        b = b - tempValue;

        if (r == 0) {
            if (k <= 2 * Math.min(g, b)) {
                if (k % 2 == 0)
                    return "BLUE";
                if (k % 2 == 1)
                    return "GREEN";
            }
            else if (g >= b)
                return "GREEN";
            else
                return "BLUE";

        }
        if (g == 0) {
            if (k <= 2 * Math.min(r, b)) {
                if (k % 2 == 0)
                    return "BLUE";
                if (k % 2 == 1)
                    return "RED";
            }
            else if (r >= b)
                return "RED";
            else
                return "BLUE";

        }
        if (b == 0) {
            if (k <= 2 * Math.min(r, g)) {
                if (k % 2 == 0)
                    return "GREEN";
                if (k % 2 == 1)
                    return "RED";
            }
            else if (r >= g)
                return "RED";
            else
                return "GREEN";

        }


        return "NO_COLOR";

    }

    public static void main(String[] args) {
        System.out.println(new AlternateColors().getColor(1000123123123123L,
                100000000000000000L,
                100023423423423423L,
                100000000000200000L));
    }
}
