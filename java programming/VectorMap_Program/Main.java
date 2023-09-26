import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Vector;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arrayNumber;
        int val;
        Vector<Integer> vector = new Vector<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0));
        int number[]=new int[10];
        Scanner input =new Scanner(System.in); //user input
        System.out.print("Enter the Elements:");
        int a =input.nextInt();
        int [] array =new int[10];
        for(int num=0;num<10;num++){
            System.out.printf("Element of of Array :",num);
            val=input.nextInt();
            array[val%10]=val;
            vector.add(val%10,val);
            vector.set(val%10,val);
        }
        System.out.println("Display an Array Elements");
        System.out.println("vector");
        Vector newVector = new Vector<>();
        for (int number1 = 0; number1 < vector.size(); number1++) {
            if (vector.elementAt(number1) != 0)
                newVector.add(vector.elementAt(number1));
        }
        System.out.println(newVector);

        for(int e:array){
            System.out.println(e);


            int number1=0;
            for(int counter=0;counter<10;counter++){
                if(number[number1]!=0)
                    number1++;
            }

            double loadfactor=(double) number1/ 10.0;
            System.out.println("Laod Fator="+loadfactor);

            int newNumbers[]=new int[number1];
            for (int num=0,newNum=0;num<10;num++){
                if(array[num]!=0){
                    newNumbers[newNum]=array[num];
                    newNum++;
                }
            }
            Arrays.sort(newNumbers);
            for(int output1:newNumbers){
                System.out.println(output1);
            }
        }
    }
        }


