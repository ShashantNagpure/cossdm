public class LargestFourDigitNumber {
    public static void main(String[] args) {
        int largestNumber = 9999; 


        while (largestNumber > 0) {
            if (largestNumber % 10 == 0 && largestNumber % 13 == 0) {
                System.out.println("The largest 4-digit number divisible by 10 and 13 is: " + largestNumber);
                break;
            }
            largestNumber--;
        }
    }
}
