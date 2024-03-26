/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_quallimetrie;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author inclu
 */
public class MonTri {

    public static int[] TriNumberDec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Donner la taille du tableau : ");
        int num = scanner.nextInt();
        int[] tabNumber = new int[num];

        for (int i = 0; i < tabNumber.length; i++) {
            System.out.print("");
            tabNumber[i] = scanner.nextInt();

            }
            
            
        return tabNumber;
    }

    public static int[] selectionSort() {
int[] monTableau = TriNumberDec();
        for (int i = 0; i < monTableau.length - 1; i++) {
            for (int j = 0; j < monTableau.length - i - 1; j++) {
                if (monTableau[j] < monTableau[j + 1]) {
                    int temp = monTableau[j];
                    monTableau[j] = monTableau[j + 1];
                    monTableau[j + 1] = temp;

                }
            }
        }
        return monTableau;
    }
    public static void Affichage (){
        int [] a = selectionSort();
       System.out.print(" Ordre croissant: ");
            for (int monTableau : a ) {
                System.out.print(monTableau + " ");
    }
}
   
}
