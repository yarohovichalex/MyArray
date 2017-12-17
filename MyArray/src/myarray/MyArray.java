/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarray;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Алексей
 */
public class MyArray {

    /**
     * @param args the command line arguments
     */
    public static void arrayOutput(int[] array) {
            for (int i = 0; i < array.length; i++) {
                    System.out.print(" "+array[i]);
            }
            System.out.println();
    }
    //перегружен, вывод массива char
    public static void arrayOutput(char[] array) {
            for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]);
            }
            System.out.println();
    }
    public static void arrayOutput(int[][] arrD) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 5; j++) {
                        System.out.print(" "+ arrD[i][j]);
                }
                System.out.println();
            }
    }
    public static void arrayOutput(double[] array) {
            for (int i = 0; i < array.length; i++) {
                    System.out.print(" "+array[i]);
            }
            System.out.println();
    }
    //#1
    static int[] one(){
            int num;
            System.out.print("Исходный массив:");
            int[] arr = new int[10];
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                    num = 0 + random.nextInt(20 - 0);
                    arr[i] = num;
                    System.out.print(" " + arr[i]);
            }
            System.out.println();
            return arr;
}
    static int[][] oneTwo(){
        int num;           
                System.out.println("Исходный массив:");
                int [][] array = new int [7][5];
                Random random = new Random();
                for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                                num = 0 + random.nextInt(20 - 0);
                                array[i][j] = num;
                        }					
                }
        return array;
    }
    public static void myArr(String st){
    Scanner in = new Scanner(System.in);
            int num;           
                System.out.println("Исходный массив:");
                int [][] tmp = new int [1][1];
                int [][] arrD = new int [7][5];
                Random random = new Random();
                for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                                num = 0 + random.nextInt(20 - 0);
                                arrD[i][j] = num;
                        }					
                }
                arrayOutput(arrD);
                
                int i = 0;
                int[] strIntArr = new int[1];
                char[] charStr = new char[5];
                System.out.println("Какие строки обменять: ");
                String string = in.nextLine();
                charStr = string.toCharArray();
               /*charStr = str.toCharArray();
                for (int j = 0; j < strIntArr.length; j++) {
                    if(instanceOf(charStr[1]))
    }*/
                for (int fsb = 0, ssb=0; fsb < 5; fsb++, ssb++) {                            
                            tmp[0][0] = arrD[str1][fsb];
                            arrD[str1][fsb] = arrD[str2][ssb];
                            arrD[str2][ssb] = tmp[0][0];
                            //break;                            						
                }
                arrayOutput(arrD);
    }
    
    public static void main(String[] args) {
        
    }
    
}
