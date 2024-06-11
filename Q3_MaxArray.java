public class Q3_MaxArray {
    public static void main(String[] args) {
        int[] array1 = {-1, 3, 5, 6, 99, 12, 2};
        int[] array2 = {6, 7, 8};

        System.out.println(max(array1, array1.length)); 
        System.out.println(max(array2, array2.length)); 
    }

    public static int max(int[] array, int length) {
        
        if (length == 1) {
            return array[0];
        }

        
        int highestInRest = max(array, length - 1);

        
        return Math.max(array[length - 1], highestInRest);
    }
}
