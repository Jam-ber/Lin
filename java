package sample1;

import java.util.Scanner;

public class Sample1 {
    static void sample1(String name){
      System.out.println("Hi, my name is " + name); 
    }    
    public void sample2(int age) {
        System.out.println("I am " + age + " years old. ");
    }    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        Sample1 obj = new Sample1();
        sample1(name);
        obj.sample2(age);

        scanner.close();
    }
}
