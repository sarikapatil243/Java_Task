public class Q2_ConvenientStore {
    public static void main(String[] args) {
        int[] notes = {1, 2, 3, 4}; 
        int price = 980; // Ex.price of the item

        String result = canPurchase(notes, price);
        System.out.println(result);
    }

    public static String canPurchase(int[] notes, int price) {
       
        int[] denominations = {10, 50, 100, 200};

       
        int totalMoney = 0;
        for (int i = 0; i < notes.length; i++) {
            totalMoney += notes[i] * denominations[i];
        }

        if (totalMoney >= price) {
            return "I can purchase";
        } else {
            return "I need more money";
        }
    }
}
