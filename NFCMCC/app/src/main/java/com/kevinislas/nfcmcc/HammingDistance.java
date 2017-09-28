package com.kevinislas.nfcmcc;

/**
 * Created by Joe on 28/09/2017.
 */

public class HammingDistance {

    public static int getHammingDistance(String tag1, String tag2){
        char[] t1 = tag1.toCharArray();
        char[] t2 = tag2.toCharArray();

        // Asegurarnos que el algoritmo funciona si un tag tiene menor longitud que el otro
        int shorter = Math.min(t1.length, t2.length);
        int longer = Math.max(t1.length, t2.length);

        int result = 0;

        for (int i=0; i<shorter; i++) {
            if(t1[i] != t2[i]){
                //Convertir a ascii y calcular diferencia
                result += Math.abs((int)t1[i] - (int)t2[i]);
            }
        }

        result += longer - shorter;
        System.out.println(result);
        return result;
    }
}
