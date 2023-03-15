package org.lessons.java.interfacce;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------");
        Cane fido = new Cane();
        fido.dormi();
        fido.mangia();
        fido.verso();
        System.out.println("---------------");
        Passerotto pettorosso = new Passerotto();
        pettorosso.dormi();
        pettorosso.mangia();
        pettorosso.verso();
        pettorosso.vola();
        System.out.println("---------------");
        Aquila furia = new Aquila();
        furia.dormi();
        furia.mangia();
        furia.verso();
        furia.vola();
        System.out.println("---------------");
        Delfino curioso = new Delfino();
        curioso.dormi();
        curioso.mangia();
        curioso.verso();
        curioso.nuota();
    }
}