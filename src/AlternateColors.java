public class AlternateColors {
    public String getColor(long r, long g, long b, long k) {
        String preferColor = "R";
        String result = "";
        while (k > 0) {
            if (preferColor.equals("R")) {
                preferColor = "G";
                if (r > 0) {
                    r--;
                    k--;
                    if (k == 0)
                        result = "RED";
                }
            } else if (preferColor.equals("G")) {
                preferColor = "B";
                if (g > 0) {
                    g--;
                    k--;
                    if (k == 0) {
                        result = "GREEN";
                    }
                }
            } else {
                preferColor = "R";
                if (b > 0) {
                    b--;
                    k--;
                    if (k == 0) {
                        result = "BLUE";
                    }
                }
            }
        }
        return result;
    }
}
