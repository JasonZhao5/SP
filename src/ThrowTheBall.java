
public class ThrowTheBall {
    public int timesThrown(int N, int M, int L) {
        if (M == 1)
            return 0;
        int[] players = new int[N];
        int position = 0;
        players[position]++;
        for (int count = 1; ; count++) {
            if ((players[position]) % 2 == 0) {
                position = (position + L) % N;
            } else {
                position = ((position - L) % N) < 0 ? ((position - L) % N) + N : ((position - L) % N);
            }
            players[position]++;
            for (int i = 0; i < N; i++) {
                if (players[i] == M) {
                    return count;
                }
            }
        }
    }


}
