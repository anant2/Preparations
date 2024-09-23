package jp_morgan;

/*
    * You are given a time traveller who can travel between years. You are given an array of years. The time traveller can move to the next year, stay in the same year or move to the previous year. You need to calculate the total time taken by the time traveller to move between the years.
    * If the time traveller moves to the next year, the time taken is 1 unit.
    * If the time traveller stays in the same year, the time taken is 0 unit.
    * If the time traveller moves to the previous year, the time taken is 2 units.
    * You need to calculate the total time taken by the time traveller to move between the years.
 */

public class TimeTraveller {

    public static int calcuateTime(int [] years) {
        int totalTime = 0;
        for(int i = 0; i < years.length - 1; i++) {
            int A = years[i];
            int B = years[i+1];

            if(A == B) {
                totalTime += 0;
            } else if(A < B) {
                totalTime += 1;
            } else {
                totalTime += 2;
            }
        }
        return totalTime;
    }

    public static void main(String[] args) {
        int [] years = {2018, 2019, 2020, 2021, 2022};
        System.out.println(calcuateTime(years)); // Expected: 4

        // Test case 1: All years are same
        int[] years1 = {2018, 2018, 2018, 2018, 2018};
        System.out.println(calcuateTime(years1)); // Expected: 0

        // Test case 2: All years are in increasing order
        int[] years2 = {2018, 2019, 2020, 2021, 2022};
        System.out.println(calcuateTime(years2)); // Expected: 4

        // Test case 3: All years are in decreasing order
        int[] years3 = {2022, 2021, 2020, 2019, 2018};
        System.out.println(calcuateTime(years3)); // Expected: 8

    }
}
