package B_Patterns;

import java.util.Scanner;

//abki baar pichle question ka ulta krna h
/*

                        *
                    *
                *
            *
        *
        
        aise
 */
public class Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();

        for (int i = 1; i <= n; i++) {      //row k lie
            for (int j = 1; j <= n; j++) {      //column k lie
                if (i + j == n + 1) {           // jab i + j == n + 1 hoga tbhi print
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}