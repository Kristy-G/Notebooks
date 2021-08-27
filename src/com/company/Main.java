package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Notebook> ArrayListNotebooks = new ArrayList<Notebook>();
        int num = 20;
        for(int i = 0; i < num; i++){
            int rPrise = (int) (Math.random()*100000)+20000;
            int rRAM = (int) ((Math.random()*2)+1)*4;
            Producers rProd = randomNotebook();
            ArrayListNotebooks.add(new Notebook(rPrise,rRAM, rProd));
        }

        for (Notebook nb : ArrayListNotebooks){
            System.out.println(nb.prise + "; " + nb.RAM + "; " + nb.producer);
        }
        System.out.println("----------------------");

        for(int i = 0; i < num-1; i++){
            for(int j = i+1; j < num; j++){
                Notebook N;
                if (ArrayListNotebooks.get(i).compareTo(ArrayListNotebooks.get(j)) == 1) {
                    N = ArrayListNotebooks.get(i);
                    ArrayListNotebooks.set(i, ArrayListNotebooks.get(j));
                    ArrayListNotebooks.set(j, N);

                }
            }
        }

        for (Notebook nb : ArrayListNotebooks){
            System.out.println(nb.prise + "; " + nb.RAM + "; " + nb.producer);
        }

    }

    static Producers randomNotebook(){
        int pick = new Random().nextInt(Producers.values().length);
        return Producers.values()[pick];
    }
}
