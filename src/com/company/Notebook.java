package com.company;

public class Notebook implements Comparable<Notebook>{
    int prise;
    int RAM;
    Producers producer;

    public Notebook(){

    }
    public Notebook(int prise, int RAM, Producers producer){
        this.prise = prise;
        this.RAM = RAM;
        this.producer = producer;
    }

    @Override
    public int compareTo(Notebook n){
        int result = Integer.compare(prise, n.prise);
        if(result != 0) return result;
        result = Integer.compare(RAM, n.RAM);
        if(result != 0) return result;
        result = producer.compareTo(n.producer);
        return result;
    }



}
