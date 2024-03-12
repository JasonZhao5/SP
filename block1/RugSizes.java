public class RugSizes {
    public int rugCount(int area) {
        int count = 0;
        for (int i = 1; i <= area; i++) {
            for (int j = i; j <= area; j++) {
                if (i * j == area && (i == j || ((i % 2) != 0 || j % 2 != 0))) {
                    System.out.println(i + "*" + j);
                    count++;
                }
            }
        }
        return count;
    }
}
