package astro.pl;

import java.util.Arrays;

public class App {
    static double aver1, aver2, mediana;

    public static void main(String[] args) {
        mediana = mediana(new double[]{1.0, 4.0, 16.0, 2.0, 23.0, 3.0, 27.0, 87.0, 4.0, 9.0, 77.0, 8.0});
        System.out.println("Mediana to :" + mediana);
    }

    static double mediana(double[] tab) {
        int amountOfElements = tab.length;
        Arrays.sort(tab);
        if (amountOfElements % 2 == 0) {
            aver1 = (tab[tab.length / 2]);//mediana jest parzysta
            aver2 = (tab[(tab.length / 2) - 1]);
            mediana = (aver1 + aver2) / 2;
        } else {
            mediana = (tab[tab.length / 2]);//mediana jest nie parzysta
        }
        return mediana;
    }
}

