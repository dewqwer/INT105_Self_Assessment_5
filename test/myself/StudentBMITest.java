/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myself;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wind
 */
public class StudentBMITest {

    private Student std[];

    public StudentBMITest() {

        std = new Student[]{new Student("Flyweight", 45, 1.70),
             new Student("Lightweight", 70, 1.70),
             new Student("Middleweight", 80, 0),
             new Student("Heavyweight", -130, 1.90)};
    }

    @Test
    public void bmiOfAllStudent() {
        String expect[] = {"under weight", "normal weight", "none", "none"};
        String actual[] = StudentBMI.bmiStudents(std);
        assertArrayEquals(expect, actual);
    }

}
