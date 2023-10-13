package com.puralsight;

public class RollDice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1, roll2;
        int twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;
        int sum = 0;

        for (int i = 1; i <= 100; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;
            System.out.printf("Roll %d:  %d - %d  sum: %d\n", i, roll1, roll2, sum);

            switch (sum){
                case 2:
                    twoCounter++;
                    break;

                case 4:
                    fourCounter++;
                    break;
                case 6:
                    sixCounter++;
                    break;
                case 7:
                    sevenCounter++;
                    break;
            }
        }
        System.out.println("\nCounters: ");
        System.out.println("sum of 2: " +twoCounter);
        System.out.println("sum of 4: " +fourCounter);
        System.out.println("sum of 6: " +sixCounter);
        System.out.println("sum of 7: " +sevenCounter);
    }
}
