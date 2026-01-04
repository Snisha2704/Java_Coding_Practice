public class SumofTenthandUnitdigit {
    public static void main(String[] args) {
        int number = 123;
        int unitDigit = number % 10;
        int tensDigit = (number / 10) % 10;

        
        System.out.println("Sum of unit and tens digit: " + (unitDigit + tensDigit));
    }
}