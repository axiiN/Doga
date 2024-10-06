/*
* File: RombuszSzamitas.java
* Author: Tukolicza Péter
* Copyright: 2024, Tukolicza Péter
* Group: Szoft II/1/N
* Date: 2024-10-07
* Github: https://github.com/axiin/
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class RombuszSzamitas{
    public static void main(String[] args){

        System.out.println("Rombusz terület számítása");
        System.out.println("Tukolicza Péter, Szoft II-1-N, 2024-10-07");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Az 'e' átló hossza: ");
        double atlo1 = scanner.nextDouble();
        System.out.println("Az 'f' átló hossza: ");
        double atlo2 = scanner.nextDouble();

        double area = 0.5 * atlo1 * atlo2;

        System.out.printf("A rombusz területe: " + area);

        scanner.close();
    }

}