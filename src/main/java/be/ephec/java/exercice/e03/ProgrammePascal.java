package be.ephec.java.exercice.e03;

import java.util.Scanner;

public class ProgrammePascal {
    public static void main(String[] args) {
        System.out.println("Ce programme calcul le triangle de Pascal à la ligne spécifique");
        System.out.print("Jusqu'à quelle ligne voulez-vous le calculer? ");
        Scanner in = new Scanner(System.in);
        int nbLines = in.nextInt();
        int[][] triangle = Pascal.triangle(nbLines);

        if (triangle == null){
            System.out.println("Ce Triangle est null");
        }

        for (int[] line : triangle){
            for (int val : line){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
