package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int br){
        int sumaCifara = 0;
        while (br != 0) {
            int cifra = br % 10;
            sumaCifara = sumaCifara + cifra;
            br = br / 10;
        }
        return sumaCifara;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = in.nextInt();
        System.out.println("Brojevi djeljivi sa sumom svojih cifara su: ");
        for(int i = 1; i <= n; i++) {
            if(i % sumaCifara(i) == 0)
                System.out.println(i + " ");
        }
    }
}
