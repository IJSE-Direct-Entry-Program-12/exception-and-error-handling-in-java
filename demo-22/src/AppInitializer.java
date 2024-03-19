public class AppInitializer {

    public static void main(String[] args) {
        try {
            System.out.println(generateNewCustomerId("C005"));
            System.out.println(generateNewCustomerId("C010"));
            System.out.println(generateNewCustomerId("C125"));
            System.out.println(generateNewCustomerId("124"));
        } catch (InvalidCustomerIdException e) {
            System.out.println("Invalid Customer ID Found!");
        }
    }
    static String generateNewCustomerId(String currentId)throws InvalidCustomerIdException{
        //InvalidCustomerIdException exp = new InvalidCustomerIdException();
        //if (!currentId.startsWith("C")) throw exp;
        if (!currentId.startsWith("C")) throw new InvalidCustomerIdException();
        String numberPart = currentId.substring(1);
        int newNumber = Integer.parseInt(numberPart) + 1;
        return "C%03d".formatted(newNumber);
    }
}
class InvalidCustomerIdException extends Exception{}
