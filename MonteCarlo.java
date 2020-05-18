package com.company;

public class MonteCarlo {

    public static int n_of_iteration_total = 10000000;
    public static int n_of_threads;


    public static double getPi(int n_of_thread) throws InterruptedException {
        n_of_threads=n_of_thread;
        int n_points_in_circle=0;
        int n_of_iteration = n_of_iteration_total/n_of_threads;
        MonteCarloThread[] threads = new MonteCarloThread[n_of_threads];

        for(int i=0;i<n_of_threads;i++){
            threads[i] = new MonteCarloThread(n_of_iteration);
            threads[i].start();
        }

        for(int i=0;i<n_of_threads;i++){
            threads[i].join();
            n_points_in_circle+=threads[i].n_of_points_in_circle;

        }

        return((double)n_points_in_circle/n_of_iteration_total)*4;
    }


}
