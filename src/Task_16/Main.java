package Task_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student.setBasicScholarship(scan.nextInt());
        int size = scan.nextInt();
        Learner[] learner = new Learner[size];
        for (int i = 0; i < learner.length; i++){
            switch (scan.nextInt()){
                case (1):
                    learner[i] = new Schoolboy(scan.next(), scan.nextInt(),scan.nextInt(),scan.next(),scan.next());
                    break;
                case (2):
                    learner[i] = new Student(scan.next(), scan.nextInt(),scan.nextInt(),scan.next(),scan.next());
                    break;
                default:
                    break;
            }
        }
        double sum = 0;
        for (int i = 0; i < learner.length; i++){
            sum += learner[i].averageGrade();
            System.out.println(learner[i]+" каникулы: " + learner[i].free());
        }
        System.out.printf("%.1f\n",sum / learner.length);

        int allScholarship = 0;
        boolean flag = false;
        for (int i = 0; i < learner.length; i++){
            if (learner[i] instanceof Student ){
                flag = true;
                allScholarship += ((Student) learner[i]).calculateScholarship();
                    System.out.println(learner[i]);
                }
            }
        if(flag !=true){
            System.out.println("NO");
        }
        else {
            System.out.println(allScholarship);
        }
    }
}


