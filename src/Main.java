public class Main {
    public static void main(String[] args) {
        int[] razmer = {1, 2};
        int[] razmer2 = {32, 53};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < razmer.length; i++) {
            sum1 += razmer[i];
        }
        for (int r = 0; r < razmer2.length; r++) {
            sum2 += razmer2[r];
        }
        System.out.println(sum2 + sum1);
    }
}
