public class JavaExercisesBasic {

    public static void main(String[] args) {

        //Exercise 1 - output "Hello world" to console
        System.out.println("Exercise 1 - output hello world:");
        System.out.println("Hello World!");

        //Exercise 2 - Variable declaration and print
        String exercise2 = "Exercise 2 - declare hello world in variable and output:";
        String helloWorld = "Hello World!";
        System.out.println(exercise2);
        System.out.println(helloWorld);

        //Exercise 3 - Take a string as a parameter and print it out to the console
        String exercise3 = "Exercise 3 - Take a string as a parameter and print to console";
        System.out.println(exercise3);
        printYourString("Hello friend!");

        //Exercise 4 - Print out returned Hello World string from method
        String exercise4 = "Exercise 4 - Print out hello world when it is returned from method";
        System.out.println(exercise4);
        System.out.println(returnHelloWorld());

        //Exercise 5 - Take two integers and print out the sum of those integers
        String exercise5 = "Exercise 5 - Pass two integers and output the sum of those. Integers: 3 and 4.";
        System.out.println(exercise5);
        System.out.println(sumOfTwoInts(3,4));

        /*Exercise 6 - Take two integers and a boolean and print out either the SUM or multiplication of those ints
        dependant on the boolean*/
        String exercise6 = "Exercise 6 - Pass two ints and bool and either sum or multiply the two ints";
        System.out.println(exercise6);
        //Case 1 - sum
        System.out.println("Case 1 - bool = true, sum of 3 and 4");
        System.out.println(sumOrMultOfTwoInts(3,4,true));
        //Case 2 - multiply
        System.out.println("Case 2 - bool = false, multiply of 3 and 4");
        System.out.println(sumOrMultOfTwoInts(3,4,false));

        /*Exercise 7 - Take two integers and evaluate whether either are 0. If they are 0 print the other int. If they are not
        print sum of two ints
         */
        String exercise7 = "Exercise 7 - Pass two ints and evaluate if one of them is 0. If not, sum two ints.";
        System.out.println(exercise7);
        //Case 1 - No Zero
        System.out.println("Case 1 - 3 and 4");
        System.out.println(checkForZeroOrSum(3,4));
        //Case 2 - number is zero
        System.out.println("Case 2 - 0 and 4");
        System.out.println(checkForZeroOrSum(0,4));


        /*Exercise 8 - For loop that outputs result of Exercise 7 10 times using the current iteration
        as one of the parameters
         */
        String exercise8 = "Exercise 8 - Output result of Exercise 7 ten times using a for loop";
        System.out.println(exercise8);
        System.out.println("Parameters: current iteration and 0");
        for (int i = 0; i < 10; i++){
            System.out.println(checkForZeroOrSum(i,0));
        }


        //Array used for exercises 9 and 10
        int[] arrayOfIntegers = {1,2,3,4,5,6,7,8,9,0};

        /*Exercise 9 - Create a populated array of 10 values and pass values from that array through Exercise 7*/
        //Passing values from array through Exercise 7 method
        String exercise9 = "Exercise 9 - Pass through 2 values from array into Exercise 7. Values - 4 and 0";
        System.out.println(exercise9);
        System.out.println(checkForZeroOrSum(arrayOfIntegers[3],arrayOfIntegers[9]));


        /*Exercise 10 - Pass values of array through Exercise 7 using a loop*/
        System.out.println("Exercise 10 - array of values passed through a for loop");
        System.out.println("Values: current iteration and current iteration");
        for (int i: arrayOfIntegers){
            System.out.println(checkForZeroOrSum(i,i));
        }

        /* Exercise 11 - Pass values from for loop into array then pass that array through
        another loop and multiply each value by 10
         */
        System.out.println("Exercise 11 - Pass values into array from loop then multiply each by 10");
        int[] arrayOfIntegers2 = new int[10];
        System.out.println("First array:");
        for (int i = 0; i < 10; i++){
            arrayOfIntegers2[i] = i + 1;
            System.out.println(arrayOfIntegers2[i]);
        }
        System.out.println("New array:");
        for (int i = 0; i < arrayOfIntegers2.length ; i++){
            System.out.println(arrayOfIntegers2[i] * 10);
        }
    }


    /*EXTERNAL
    METHODS
     */


    //Method for Exercise 3
    private static void printYourString(String yourString){
        System.out.println(yourString);
    }

    //Method for Exercise 4
    private static String returnHelloWorld(){
        String helloWorldStringAgain = "Hello World ... returned!";
        return helloWorldStringAgain;
    }

    //Method for Exercise 5
    private static int sumOfTwoInts(int firstInt, int secondInt){
        int finalSum = firstInt + secondInt;
        return finalSum;
    }

    //Method for Exercise 6
    private static int sumOrMultOfTwoInts(int firstInt, int secondInt, boolean sumOrMult){
        //True for sum - False for multiplication
        //
        int finalInt;
        if (sumOrMult){
            finalInt = firstInt + secondInt;
        } else {
            finalInt = firstInt * secondInt;
        }
        return finalInt;
    }


    //Method for Exercise 7
    private static int checkForZeroOrSum(int firstInt, int secondInt){
        int finalInt;
        if (firstInt == 0){
            return secondInt;
        } else if (secondInt == 0){
            return firstInt;
        } else {
            finalInt = firstInt + secondInt;
            return finalInt;
        }
    }


}
