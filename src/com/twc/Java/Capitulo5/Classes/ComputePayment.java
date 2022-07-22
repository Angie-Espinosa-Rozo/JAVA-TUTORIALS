package com.twc.Java.Capitulo5.Classes;

public class ComputePayment {
    public static double ComputePayment(double loanAmt, double rate, double futureValue, int numPeriods) {
        double interest = rate / 100.0;
        double partial = Math.pow((1 + interest), -numPeriods);
        double denominator = (1 - partial) / interest;
        double answer = (-loanAmt / denominator) - ((futureValue * partial) / denominator);
        return answer;
    }
    public static void main(String[] args) {
        double Answer = ComputePayment.ComputePayment(1, 2, 3, 4);
        System.out.println(Answer);
    }
}
