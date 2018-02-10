package myself;

import java.util.Arrays;
import java.text.DecimalFormat;

public class StudentBMI {

    public static void main(String args[]) {
        Student[] std = new Student[]{new Student("Flyweight", 45, 1.70),
            new Student("Lightweight", 70, 1.70),
            new Student("Middleweight", 80, 0),
            new Student("Heavyweight", -130, 1.90)};
        System.out.println(Arrays.toString(bmiStudents(std)));
    }

    public static String[] bmiStudents(Student[] std) {
        String[] category = new String[std.length];

        for (int i = 0; i < std.length; i++) {
            category[i] = bmiCategory(std[i]);
        }
        return category;
    }

    public static String bmiCategory(Student std) {
        double bmiStudent = std.getBMI();
        if (bmiStudent < 0) {
            return "none";
        }
        if (bmiStudent < 18.5) {
            return "under weight";
        } else if (18.5 <= bmiStudent
                || bmiStudent < 25) {
            return "normal weight";
        } else if (25.0 <= bmiStudent
                || bmiStudent < 30) {
            return "over weight";
        } else {
            return "obesity";
        }
    }

}
