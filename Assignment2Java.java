/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainning;

import java.util.Scanner;

/**
 *
 * @author Ivan Christian
 */
public class Assignment2 {
    public static void main(String[] args) {
        String[][] tempatDuduk = new String[2][3];
        Scanner s = new Scanner(System.in);
        System.out.println("output : ");
        for (int i = 0; i < tempatDuduk.length; i++) {
            for (int j = 0; j < tempatDuduk[i].length; j++) {
                System.out.print("Siapa yang akan duduk di kelas ("+i+","+j+") : ");
                tempatDuduk[i][j]=s.nextLine();
                tempatDuduk[i][j]="|"+tempatDuduk[i][j];
                tempatDuduk[i][j]=tempatDuduk[i][j]+"               ";
                tempatDuduk[i][j]=tempatDuduk[i][j].substring(0,15);
            }
        }
        System.out.println("======================================================================");
        for (int i = 0; i < tempatDuduk.length; i++) {
//            System.out.print("|");
            for (int j = 0; j < tempatDuduk[i].length; j++) {
                System.out.print(tempatDuduk[i][j]+"\t\t");
            }
            System.out.println("");
            
        }
        System.out.println("======================================================================");
    }
}