package com.example.practice;

public class CompoundAssignment {
    public static void main(String[] args) {
        /*
            COMPOUND ASSIGNMENT
            in this section, we will work with our compound assignment operators
            (+=, -=, *=, /=, %=)

            declare an integer variable with the value of 1
            then, using compound assignment and the System.out.println() operation to check your results,
            complete the following steps in order:
            1. add 3 to your variable
            2. multiply your variable by 4
            3. subtract 8 from your variable
            4. divide your variable by 2
            5. modulus your variable by 3

            the final result should be a variable that holds the original value of 1
         */
        int myNumber = 1;
        myNumber += 3;
        myNumber *= 4;
        myNumber -= 8;
        myNumber /= 2;
        myNumber %= 3;
        System.out.println(myNumber);











    }
}
