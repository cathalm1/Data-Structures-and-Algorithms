package Algorithms.MonteCarloSimulations;
import java.util.Random;

public class MonteCarlo {
    public static void main (String args[]){
        Random generator=new Random();

        double higgins = 0.98;
        double duffy = 0.001;
        double casey = 0.1;
        double freeman = 0.02;
        double riada = 0.03;
        double gallagher = 0.05;

        String results[]=new String[6];
        double simRuns=30000;
        double threeDragonsLast=0;

        for(int i=0; i<=simRuns; i++) {
            double michael=higgins;
            double peter=casey;
            double sean=gallagher;
            double liadh=riada;
            double joan=freeman;
            double gavin=duffy;

            for (int j = 0; j < 6; j++) {
                double allProb=michael+peter+sean+liadh+joan+gavin;
                double ranNum = generator.nextDouble() * allProb;

                if (ranNum <= michael) {
                    results[j] = ("Michael D. Higgins");
                    michael = 0.0;
                } else if (ranNum>michael && ranNum<=michael+peter) {
                    results[j] = ("Peter Casey");
                    peter = 0.0;
                } else if (ranNum>michael+peter && ranNum<=michael+peter+sean) {
                    results[j] = ("Sean Gallagher");
                    sean = 0.0;
                } else if (ranNum>michael+peter+sean && ranNum<=michael+peter+sean+liadh) {
                    results[j] = ("Liadh Ni Riada");
                    liadh = 0.0;
                } else if (ranNum>michael+peter+sean+liadh && ranNum<=michael+peter+sean+liadh+joan) {
                    results[j] = ("Joan Freeman");
                    joan = 0.0;
                } else if (ranNum>michael+peter+sean+liadh+joan && ranNum<=michael+peter+sean+liadh+joan+gavin){
                    results[j] = ("Gavin Duffy");
                    gavin = 0.0;
                }
            }

            int count=0;
            for(int c=5; c>2; c--){

                if((results[c].charAt(0)=='S')||(results[c].charAt(0)=='G')||(results[c].charAt(0)=='P')){
                    count++;
                }
                if(count==3){
                    threeDragonsLast++;
                }
            }

        }

        System.out.println("The chance of all three dragons finishing last place is "+((threeDragonsLast/simRuns)*100.0)+"%");
    }
}