//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package be.ephec.java.exercice.e01;

import java.util.Scanner;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        System.out.print("Quel est votre nom de famille?");
        p1.lastName = sc.nextLine();
        System.out.print("Quel est votre Prénom?");
        p1.firstName = sc.nextLine();
        System.out.print("Quel âge avez-vous?");
        p1.age = sc.nextInt();
        p1.display();
    }
}
