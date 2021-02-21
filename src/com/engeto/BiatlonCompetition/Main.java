package com.engeto.BiatlonCompetition;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] competitors = {"Gabina","Marketa"};
        int penalty;

        for(int j = 0; j<competitors.length;j++){
            System.out.println("Soutežící" + competitors[j]);
            penalty = 0;
            for (int i = 0; i < 5; i++) {
                double shoot;

                System.out.println("Střelba :" + (i + 1) + ".");
                shoot = Math.random();
                if (Math.random() < 0.7) {
                    penalty++;
                }
                System.out.println("Střelba :" + (i + 1) + ". Vysledek:" + shoot);


            }
            System.out.println("Trestných kol: " + penalty);
        }
    }
}
