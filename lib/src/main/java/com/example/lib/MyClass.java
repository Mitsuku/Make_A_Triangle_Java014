
package com.example.lib;
import java.util.Scanner;
public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three lengths in sequence");
        int x,y,z,n;
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        for(int i = 0;i<2;i++){
            if(x>y){
                n=x;
                x=y;
                y=n;
            }
            if (y>z){
                n=y;
                y=z;
                z=n;
            }
        }
        if((x+y)>z){
            System.out.print("Can make a triangle");
            System.out.print("  ");
        }
        else {
            System.out.print("Can't make a triangle");
            System.out.print("  ");
        }
    }
}