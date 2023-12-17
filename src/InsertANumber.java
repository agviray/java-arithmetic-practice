import java.util.Arrays;

// - Write a program that uses a function that inserts a new number at a certain position
//   of an existing array of numbers.
// - You can change the integer elements of the array as well as the value of numberToBeInserted and position.
// - Hit run to test it out.
public class InsertANumber {
    public static void main(String[] args) {
        // - Original array. (Can only take in integers)
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};
        // - Number to insert. (Can only be an integer)
        int numberToBeInserted = 99;
        // - Position to insert the number to inserted. (Can only be an integer)
        int position = 10;

        System.out.println("The original array is:\n" + Arrays.toString(array));

        // - Call method to insert the new number.
        array = returnArrayWithInsertedElement(array, numberToBeInserted, position);

        System.out.println("\n");
        System.out.println("The new array with the number " + numberToBeInserted + " inserted at position " + position + " is:\n" + Arrays.toString(array));
    }

    // - Function to add a single number at a certain position of an array of numbers.
    public static int[] returnArrayWithInsertedElement(int origNumsArr[], int numToInsert, int positionToInsert) {
        int newNumsArr[] = new int[origNumsArr.length + 1]; // - Plus 1 because we're adding in a single element.

        for (int i = 0; i < origNumsArr.length + 1; i++) {
            if (i < positionToInsert - 1) // - Subtract 1 to account for the position that the inserted element with take.
                newNumsArr[i] = origNumsArr[i];
            else if (i == positionToInsert - 1)
                newNumsArr[i] = numToInsert;
            else
                newNumsArr[i] = origNumsArr[i - 1];
        }

        return newNumsArr;
    }
}
