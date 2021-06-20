/*
    Create a program called BinaryReader in which a 4 x 4
    array of booleans is created. Have the computer loop
    through the array, printing a 0 if the current element is
    set to false and a 1 if it set to true.

    Example Array:
    {
        {true, false, false, true},
        {false, true, true, true},
        {true, true, false, true},
        {true, false, false, false}
    }

    Example Output:
    1001
    0111
    1101
    1000
*/

public class BinaryReader
{
    public static void main(String[] args)
    {
        //Create a 2D array of booleans
        boolean[][] arr =
        {
            {true, false, false, true},
            {false, true, true, true},
            {true, true, false, true},
            {true, false, false, false}
        };

        //Loop through the array using nested loops
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                //Check if current element is set to true
                if(arr[i][j] == true)
                {
                    //Print out a 1 if set to true
                    System.out.print(1);
                }
                //Otherwise, current element is set to false
                else
                {
                    //Print out a 0 if set to false
                    System.out.print(0);
                }
            }

            //Move over to the next line
            System.out.println();
        }
    }
}