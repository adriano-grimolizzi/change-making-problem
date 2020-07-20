package org.example;

public class App {
    public static void main(String[] args) {
        int n = 32;
        System.out.println(n + ":");
        calculate(n).print();
    }

    public static Change calculate(int n) {

        int divideBy10 = n / 10;

        while(divideBy10 >= 0) {
            Change change = checkWithThisManyTen(divideBy10, n);
            if (change == null) {
                divideBy10--;
            } else return change;
        }
        return null;
    }

    private static Change checkWithThisManyTen(int numberOfTen, int n) {
        Change change = new Change();
        change.ten = numberOfTen;
        int rest = n - numberOfTen * 10;

        int divideBy5 = rest / 5;
        change.five = divideBy5;
        if (rest % 5 == 0) {
            return change;
        } else {
            while(divideBy5 >= 0) {
                Change aux = checkWithThisManyTenAndFive(numberOfTen, divideBy5, n);
                if (aux == null) {
                    divideBy5--;
                } else return aux;
            }
        }
        return null;
    }

    private static Change checkWithThisManyTenAndFive(int numberOfTen, int numberOfFive, int n) {
        int rest = n - numberOfFive * 5 - numberOfTen * 10;
        int numberOfTwo = rest / 2;
        if (rest % 2 == 0) {
            Change change = new Change();
            change.ten = numberOfTen;
            change.five = numberOfFive;
            change.two = numberOfTwo;
            return change;
        } else return null;
    }
}
