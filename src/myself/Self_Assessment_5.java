package myself;

import java.util.Arrays;

public class Self_Assessment_5 {

    public static void main(String args[]) {

    }

    public static int[] findMinMax(int[] scoreOverLength) {
        int min = scoreOverLength[0];
        int max = scoreOverLength[0];

        for (int i = 0; i < scoreOverLength.length; i++) {
            if (scoreOverLength[i] >= 0
                    || scoreOverLength[i] <= 100) {

                if (min > scoreOverLength[i]) {
                    min = scoreOverLength[i];
                }
                if (scoreOverLength[i] > max) {
                    max = scoreOverLength[i];
                }

            } else {
                return null;
            }

        }
        int[] result = {min, max};
        return result;

    }
}
