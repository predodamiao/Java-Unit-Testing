# Java Unit Testing

## About

This is a Java Console application that performs the BMI (body mass index) calculation from the data entered by the user.
The objective of this project is to apply the concepts of unit tests acquired in the discipline of programming IV of my graduation.

## How to calculate BMI

BMI = $\frac{WEIGHT}{HEIGHT^2)}$

## Classification

These are the classifications used to calculate the BMI


| Gender | BMI               | Classification        |
|--------|-------------------|-----------------------|
| FEMALE | BMI < 19.1        | Under weight          |
| FEMALE | 19.1 < BMI < 25.8 | Normal weight         |
| FEMALE | 25.8 < BMI < 27.3 | Marginally overweight |
| FEMALE | 27.3 < BMI < 32.3 | Overweight            |
| FEMALE | 32.3 <= BMI       | Obese                 |
| MALE   | BMI < 20.7        | Under weight          |
| MALE   | 20.7 < BMI < 26.4 | Normal weight         |
| MALE   | 26.4 < BMI < 27.8 | Marginally overweight |
| MALE   | 27.8 < BMI < 31.1 | Overweight            |
| MALE   | 31.1 <= BMI       | Obese                 |

NOTE: These classifications were given by the teacher and have no commitment to the truth 

## Ciclomatic Complexity Graph
[Code](https://raw.githubusercontent.com/predodamiao/Java-Unit-Testing/main/assets/code.png)

[Graph](https://raw.githubusercontent.com/predodamiao/Java-Unit-Testing/main/assets/graph.png)

## Test Cases

Based on the classifications given, below are all test cases, with their respective inputs and also expected outputs
 
|    | Gender | Weight | Height | BMI  | Result                |
|----|--------|--------|--------|------|-----------------------|
| 1  | FEMALE | 19.0   | 1      | 19.0 | Under weight          |
| 2  | FEMALE | 19.1   | 1      | 19.1 | Normal weight         |
| 3  | FEMALE | 25.8   | 1      | 25.8 | Marginally overweight |
| 4  | FEMALE | 27.3   | 1      | 27.3 | Overweight            |
| 5  | FEMALE | 32.3   | 1      | 32.3 | Obese                 |
| 6  | MALE   | 20.6   | 1      | 20.6 | Under weight          |
| 7  | MALE   | 20.7   | 1      | 20.7 | Normal weight         |
| 8  | MALE   | 26.4   | 1      | 26.4 | Marginally overweight |
| 9  | MALE   | 27.8   | 1      | 27.8 | Overweight            |
| 10 | MALE   | 31.1   | 1      | 31.1 | Obese                 |

NOTE: It was decided to use height 1 in all entries to facilitate the calculation, ensuring that the results converged to the critical points

## How to run


### Requirements

* Java
* JUnit (included on project)

#### Clone this repo

~~~
git clone https://github.com/predodamiao/Java-Unit-Testing.git
~~~

| Now you have to go to the root of project to execute the next commands

#### Compile

~~~
mkdir out
cd out
javac -d . ../src/main/*.java
javac -d . -cp 'main/*;../lib/junit-4.12.jar;'  ../src/test/*.java
~~~



#### Run aplication

~~~
java main.Main
~~~

#### Run tests

~~~
java -cp '..\lib\junit-4.12.jar;..\lib\hamcrest-core-1.3.jar;.' org.junit.runner.JUnitCore test.BMITest
~~~
