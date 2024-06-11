public class Q1_5_CommonElements {
    public int findCommonElement(int[] a, int[] b){
        int counter=0;
        int temp= 0;
        int tempCounter = 0;
        for(int i=0; i<a.length; i++){
            temp=a[i];
            tempCounter=0;
            for(int j=0; j<b.length; j++){
                if (temp==b[j]){
                    tempCounter++;  
                }

            }

            if (tempCounter == 1) {
                temp = a[i];

                counter++;

                System.out.println(temp);

            }

        }

        return 0;
    }

    public static void main(String []args){
    
        int[] L1 = {56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 88, 72, 73, 74, 75, 76, 77, 78, 79, 80};
        int[] L2 = {81, 82, 83, 1, 84, 85, 86, 87, 88, 60, 89, 90, 1, 91, 92, 93};


        Q1_5_CommonElements hello = new Q1_5_CommonElements ();
        System.out.println(hello.findCommonElement(L1, L2));

    }
}