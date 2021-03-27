package test;

import main.BMI;
import main.Gender;

import org.junit.*;

public class BMITest {

    @Test
    public void testBMI(){

        BMI person = new BMI(2, 84, Gender.FEMALE);
        double bmi = person.calculateBMI();
        Assert.assertEquals(21, bmi, 2);

    }

    @Test
    public void testBMIFemaleFirstCase(){
        BMI person = new BMI(1, 19, Gender.FEMALE);
        String classification = person.getBMIClassification();
        Assert.assertEquals("Under weight", classification);
    }

    @Test
    public void testBMIFemaleSecondCase(){
        BMI person = new BMI(1, 19.1, Gender.FEMALE);
        String classification = person.getBMIClassification();
        Assert.assertEquals("Normal weight", classification);
    }

    @Test
    public void testBMIFemaleThirdCase(){
        BMI person = new BMI(1, 25.8, Gender.FEMALE);
        String classification = person.getBMIClassification();
        Assert.assertEquals("Marginally overweight", classification);
    }

    @Test
    public void testBMIFemaleFourthCase(){
        BMI person = new BMI(1, 27.3, Gender.FEMALE);
        String classification = person.getBMIClassification();
        Assert.assertEquals("Overweight", classification);
    }

    @Test
    public void testBMIFemaleFifthCase(){
        BMI person = new BMI(1, 32.3, Gender.FEMALE);
        String classification = person.getBMIClassification();
        Assert.assertEquals("Obese", classification);
    }

    @Test
    public void testBMIMaleFirstCase(){
        BMI person = new BMI(1, 20.6, Gender.MALE);
        String classification = person.getBMIClassification();
        Assert.assertEquals("Under weight", classification);
    }

    @Test
    public void testBMIMaleSecondCase(){
        BMI person = new BMI(1, 20.7, Gender.MALE);
        String classification = person.getBMIClassification();
        Assert.assertEquals("Normal weight", classification);
    }

    @Test
    public void testBMIMaleThirdCase(){
        BMI person = new BMI(1, 26.4, Gender.MALE);
        String classification = person.getBMIClassification();
        Assert.assertEquals("Marginally overweight", classification);
    }

    @Test
    public void testBMIMaleFourthCase(){
        BMI person = new BMI(1, 27.8, Gender.MALE);
        String classification = person.getBMIClassification();
        Assert.assertEquals("Overweight", classification);
    }

    @Test
    public void testBMIMaleFifthCase(){
        BMI person = new BMI(1, 31.1, Gender.MALE);
        String classification = person.getBMIClassification();
        Assert.assertEquals("Obese", classification);
    }


}
