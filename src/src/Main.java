public class Main {
    public static void main(String[] args) {
        int[] noten = {29, 37, 38, 41, 84, 67};

        // test 1
        int[] unter40 = problema1.getNotenUnter40(noten);
        System.out.print("nicht ausreichend: ");
        for (int i = 0; i < unter40.length; i++) {
            System.out.print(unter40[i]);
            if (i < unter40.length - 1) System.out.print(", ");
        }
        System.out.println();

        // test 2
        double avg = problema1.getAverage(noten);
        System.out.println("average: " + avg);

        // test 3
        int[] rounded = problema1.getRoundedUp(noten);
        System.out.print("rounded up: ");
        for (int i = 0; i < rounded.length; i++) {
            System.out.print(rounded[i]);
            if (i < rounded.length - 1) System.out.print(", ");
        }
        System.out.println();

        // test 4
        int max = problema1.getMaxRoundedUp(noten);
        System.out.println("max round up: " + max);
    }
}
