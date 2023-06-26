package Assignments;

public class ExtractOTP19 {
    public static void main(String[] args) {
    /* Extract the OTP from the SMS. "Your one time password is 246148.
    Don't share this code with anyone \r\nBvwt3f8js2S"
    */
        String str = "Extract the OTP from the SMS. Your one time password is 246148. Don't share this code with anyone";

        str = str.replaceAll("[^\\d]", " ");
        System.out.println(str);

        str = str.trim();
        System.out.println(str);
    /*
        str = str.replaceAll(" + ", " ");
        System.out.println(str);

        String[] arr = (str.split(" "));
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        int shitPrice = Integer.parseInt(arr[0]);


        System.out.println("Your OTP is : " + shitPrice);
*/
    }


}
