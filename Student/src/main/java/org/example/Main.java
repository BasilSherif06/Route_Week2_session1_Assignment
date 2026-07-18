package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String [] studentNames = new String[5];
        float [] marksSub1 = new float[5];
        float [] marksSub2 = new float[5];
        float [] marksSub3 = new float[5];

        System.out.println("Please Enter students names: ");
        for(int i =0; i<5; i++){
            studentNames[i]= sc.nextLine();
        }

        System.out.println("Please Enter students grades in subject 1 : ");
        boolean notOk1 = false;
         do {
            for (int i = 0; i < 5; i++) {
                marksSub1[i] = sc.nextFloat();
            }
            for (int i = 0; i < 5; i++) {
                if(marksSub1[i]<0 || marksSub1[i]>100){
                    notOk1 = true;
                    System.out.println("Enter them again correctly please");
                    break;
                }
                else{
                    notOk1 = false;
                }
            }
        } while (notOk1);

        System.out.println("Please Enter students grades in subject 2 : ");
        boolean notOk2 = false;
        do {
            for (int i = 0; i < 5; i++) {
                marksSub2[i] = sc.nextFloat();
            }
            for (int i = 0; i < 5; i++) {
                if(marksSub2[i]<0 || marksSub2[i]>100){
                    notOk2 = true;
                    System.out.println("Enter them again correctly please");
                    break;
                }
                else{
                    notOk2 = false;
                }
            }
        } while (notOk2);

        System.out.println("Please Enter students grades in subject 3 : ");
        boolean notOk3 = false;
        do {
            for (int i = 0; i < 5; i++) {
                marksSub3[i] = sc.nextFloat();
            }
            for (int i = 0; i < 5; i++) {
                if(marksSub3[i]<0 || marksSub3[i]>100){
                    notOk3 = true;
                    System.out.println("Enter them again correctly please");
                    break;
                }
                else{
                    notOk3 = false;
                }
            }
        } while (notOk3);

        byte opr = 0;
        while (true) {
            if (opr == 5) break;
            System.out.println("========= Main Menu =========\n" +
                    "1. Show All Students names.\n" +
                    "2. Show all Students grades in each subject.\n" +
                    "3. Search Student by name.\n" +
                    "4. Count Passed Students\n" +
                    "5. Exit\n" +
                    "=======================");
            opr = sc.nextByte();

            switch (opr){
                case 1:
                    for(int i =0; i<5; i++){
                        System.out.println(studentNames[i]);
                    }
                    break;


                case 2:
                    for (int i = 0; i < 5; i++) {
                        System.out.println(studentNames[i] + ": "
                                + marksSub1[i] + " , "
                                + marksSub2[i] + " , "
                                + marksSub3[i]);
                    }
                    break;


                case 3:
                    System.out.println("Enter student name: ");
                    sc.nextLine(); // consume the newline left by nextByte()
                    String studentName = sc.nextLine();

                    int studentIndex = -1;

                    for (int i = 0; i < 5; i++) {
                        if (studentNames[i].equals(studentName)) {
                            studentIndex = i;
                            break;
                        }
                    }

                    if (studentIndex == -1) {
                        System.out.println("Student doesn't exist");
                    } else {
                        System.out.println("The student's grades are "
                                + marksSub1[studentIndex] + " , "
                                + marksSub2[studentIndex] + " , "
                                + marksSub3[studentIndex]);
                    }
                    break;

                case 4:
                    int count = 0;
                    for(int i=0; i<5; i++){
                        if(marksSub1[i] > 50 && marksSub2[i] > 50 && marksSub3[i] > 50){
                            count ++;
                        }
                    }
                    System.out.println("Number of passed students in the 3 subjects is: "+ count);
                    break;

                case 5:
                    System.out.println("Thank you");
                    break;
            }
        }
    }
}
