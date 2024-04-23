public class Sixth

{
    public static Integer[] maxHeapify(Integer[ ] array, Integer i)
    {
        //creating left-child and right-child for the node in question
        Integer leftChild = 2 * i + 1;
        Integer rightChild = 2 * i + 2;

        //assigning maxVal to parent node, i
        Integer maxVal = i;

        //Setting maxVal to greater of the two: node or left-child
        if( leftChild < array.length && array[leftChild] > array[maxVal] )
            maxVal = leftChild;

        //Setting maxVal to greater of the two: maxVal or right-child
        if( rightChild < array.length && array[rightChild] > array[maxVal] )
            maxVal = rightChild;

        // Check if maxVal is not equal to parent node, then set parent node to
        // maxVal, swap values and then do a maxheapify on maxVal
        // which is now the previous parent node
        if( maxVal != i )
        {
            Integer value = array[i];
            array[i] = array[maxVal];
            array[maxVal] = value;
            array = maxHeapify(array, maxVal);
        }

        return array;
    }


    public static Integer[] maxHeapCreate(Integer array[])
    {
        // Call maxHeapify to arrange array in a max heap
        Integer [] theNewArr = array;
        for( Integer i = array.length/2; i >= 0; i-- )
            theNewArr = maxHeapify(array, i);

        return theNewArr;
    }

    public static void main(String[] args)
    {
        // Create array to be maxheapified, theArray,
        // and array, newArray, to write results into, by calling maxheapCreate
        // newArray will now be a maxheap
        Integer[] theArray = {5, 3, 13, 10, 99, 19, 6, 51, 9};
        Integer[ ] newArray = maxHeapCreate(theArray);

        // Print out contents of newArray
        System.out.println("newArray:");
        for(int i = 0; i < newArray.length; ++i)
        {
            System.out.println(newArray[i]);
        }

        // Print out labelled contents of newArray
        System.out.println(" root : " + newArray[0]);
        for (int i = 0; i <= newArray.length/2 - 1; i++) {
            System.out.print(" parent node : " + newArray[i] + " left child : " +
                    newArray[(2*i)+1] + " right child :" + newArray[(2*i)+2]);
            System.out.println();
        }
    }
}
