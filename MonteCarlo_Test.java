package com.company;

import static org.junit.jupiter.api.Assertions.*;

class MonteCarlo_Test {

    @org.junit.jupiter.api.Test
    void MonteCarlo_Number_of_Threads_test()throws InterruptedException {
        for(int i=1; i<11;i++){
            long start =System.currentTimeMillis();
            MonteCarlo.getPi(i);
            long end = System.currentTimeMillis();
            long time =end-start;

            System.out.println("THREADS \t"+MonteCarlo.n_of_threads+"\tTIME\t"+time+"ms");
        }
    }
}