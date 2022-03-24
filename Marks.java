package com.syntax.groupProjectII;

 //We have to calculate the average of marks obtained in three subjects by
//student A and by student B. Create class 'Marks' with an abstract method
// 'getPercentage' that will be returning the average percentage of marks.
//Provide implementation of abstract method in classes 'A' and 'B'. The
// constructor of student A takes the marks in three subjects as its parameters
// and the marks in four subjects as its parameters for student B. Test you code.

    abstract class Marks {
        abstract double getPercentage();
    }


    class A extends Marks {
        private float subj1, subj2, subj3;

        public A(float s1, float s2, float s3) {
            subj1 = s1;
            subj2 = s2;
            subj3 = s3;
        }

        double getPercentage() {

            return (subj1 + subj2 + subj3)/300.0 * 100;
        }
    }

    class B extends Marks{
        private float subj1, subj2, subj3, subj4;

        public B(float s1, float s2, float s3, float s4) {
            subj1 = s1;
            subj2 = s2;
            subj3 = s3;
            subj4 = s4;
        }

        double getPercentage() {

            return (subj1 + subj2 + subj3 +subj4)/400.0 * 100;
        }
    }


    class tester{

        public static void main(String[] args){

            A a = new A(58, 96, 82);
            B b = new B(70, 89, 75, 64);

            double p1 = a.getPercentage();
            double p2 = b.getPercentage();

            System.out.println("Percentage of student A : " + p1);
            System.out.println("Percentage of student B : " + p2);
        }
    }





