package com.company;

public class MonteCarloThread extends Thread {
    int n_of_points_in_circle;
    private int n_of_iteration;

    public MonteCarloThread(int n_of_iteration){
        this.n_of_iteration = n_of_iteration;
    }

    public void run(){
        for(int i=0; i<n_of_iteration; i++){
            double x = Math.random();
            double y = Math.random();
            if (Math.sqrt(Math.pow(x,2)+Math.pow(y,2))<=1)
                n_of_points_in_circle++;
        }
    }
}
