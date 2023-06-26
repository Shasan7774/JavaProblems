package Assignments;

public class ExtractPrice {
    /* A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.
    If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?
    [Extract the digits from the paragraph and calculate the price]
    */
    public static void main(String[] args) {
        String str = "A core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk";

        str = str.replaceAll("[^\\d]", " ");
        System.out.println(str);

        str = str.trim();
        System.out.println(str);

        str = str.replaceAll(" + ", " ");
        System.out.println(str);

        String[] arr = (str.split(" "));
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        int laptopPrice = Integer.parseInt(arr[0]);
        int mousePrice = Integer.parseInt(arr[1]);
        int totalPrice = laptopPrice + mousePrice;
        System.out.println("Price without discount is: "+totalPrice);

        double discountPercentage = 15;
        double disCountAmount = totalPrice * (discountPercentage/100);
        double totalAfterDiscount = totalPrice - disCountAmount;

        System.out.println("Total price of the laptop and mouse is after giving 15% vat : " + totalAfterDiscount);
    }

}
