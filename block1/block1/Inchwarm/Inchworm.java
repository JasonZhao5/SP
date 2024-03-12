package block1.Inchwarm;

public class Inchworm {
    public int lunchtime(int branch, int rest, int leaf) {
        int times = 0;
        for (int i = 0; i <= branch; i+=leaf) {
            if (branch >= leaf && i % rest == 0) {
                times++;
            }
        }

        return times;
    }
}
