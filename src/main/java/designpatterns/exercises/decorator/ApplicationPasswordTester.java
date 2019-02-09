package designpatterns.exercises.decorator;

public class ApplicationPasswordTester {
    public static void main(String[] args) {
        Validable customValidator = new RequiredCapitalLetterValidator(new BasicPasswordValidator());
//        Validable customValidator2 = new RequiredDigitValidator()(customValidator);
        // mozna tez zapisywac:
//        Validable customValidator3 = new
//        boolean isPasswordValid = customValidator.isValid("TestPassword");

//        System.out.println("isPasswordValid = " + isPasswordValid);

        //TODO implement other decorators
    }
}
