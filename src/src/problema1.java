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

}