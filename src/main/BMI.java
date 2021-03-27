package main;

public class BMI {

    private double height;
    private double weight;
    private Gender gender;

    public BMI(double height, double weight, Gender gender){
        this.setHeight(height);
        this.setWeight(weight);
        this.setGender(gender);

    }
    public BMI(){
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Double calculateBMI(){
        return (this.weight / (this.height * this.height));
    }

    public String getBMIClassification(){

        Double bmi = this.calculateBMI();

        if(Gender.FEMALE.equals(this.gender)){       //1
            if(bmi < 19.1)                           //2
                return "Under weight";               //3
            else if(bmi < 25.8)                      //4
                return "Normal weight";              //5
            else if(bmi < 27.3)                      //6
                return "Marginally overweight";      //7
            else if(bmi < 32.3)                      //8
                return "Overweight";                 //9
            else
                return "Obese";                      //10
        }else {
            if(bmi < 20.7)                           //11
                return "Under weight";               //12
            else if(bmi < 26.4)                      //13
                return "Normal weight";              //14
            else if(bmi < 27.8)                      //15
                return "Marginally overweight";      //16
            else if(bmi < 31.1)                      //17
                return "Overweight";                 //18
            else
                return "Obese";                      //19
        }                                            //20
    }

}
