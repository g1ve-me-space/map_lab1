public class problema1 {

    // gets noten under 40
    public static int[] getNotenUnter40(int[] noten) {
        int count = 0;
        for (int note : noten) {
            if (note < 40) {
                count++;
            }
        }

        // new array w corresponding size
        int[] result = new int[count];
        int index = 0;
        for (int note : noten) {
            if (note < 40) {
                result[index++] = note;
            }
        }
        return result;
    }

    public static double getAverage(int[] noten) {
        if (noten.length == 0) return 0;
        double sum = 0;
        for (int note : noten) {
            sum += note;
        }

        return Math.round((sum / noten.length) * 100.0) / 100.0;
    }

    public static int[] getRoundedUp(int[] noten) {
        int[] abgerundet = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            int note = noten[i];
            if (note >= 38) {
                int nextMultipleOf5 = ((note / 5) + 1) * 5;
                if (nextMultipleOf5 - note < 3) {
                    note = nextMultipleOf5;
                }
            }
            abgerundet[i] = note;
        }
        return abgerundet;
    }

    public static int getMaxRoundedUp(int[] noten) {
        int[] abgerundet = getRoundedUp(noten);
        int max = abgerundet[0];
        for (int note : abgerundet) {
            if (note > max) {
                max = note;
            }
        }
        return max;
    }

}