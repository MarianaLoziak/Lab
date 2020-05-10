package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

    long start = System.currentTimeMillis();
    double pi=MonteCarlo.getPi(4);
    long end = System.currentTimeMillis();
    long time=end-start;

        System.out.println("PI is "+pi);
        System.out.println("THREADS "+ MonteCarlo.n_of_threads);
        System.out.println("ITERATIONS "+ MonteCarlo.n_of_iteration_total);
        System.out.println("TIME "+time+"ms");



    }
}
