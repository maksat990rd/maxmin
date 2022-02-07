package com.company;

public class Main {

    public static void main(String[] args) {
        int[] massiv = new int[]{543, 654, 543, 234, 765, 345, 654, 87};
        max(massiv);
        min(massiv);
    }
    static void max(int[] massiv) {
        int counter = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] >= counter) {
                counter = massiv[i];
            }
        }
        System.out.println(counter);
    }

    static void min(int[] massiv) {
        int counter = massiv[0];
        for (int j = 0; j < massiv.length; j++) {
            if (massiv[j] <= counter) {
                counter = massiv[j];
            }
        }
        System.out.println(counter);
    }
}

