package designpatterns.exercises.decorator;

public class RequiredSpecialCharacterValidator implements Validable{
    // musi cos dekorowac, czyli inny walidator
    Validable validator;

    // w konstruktorze przyjmuje jako argument Validable
    public RequiredSpecialCharacterValidator(Validable validator) {
        this.validator = validator;
    }

    public boolean isValid(String password) {
        return validator.isValid(password) && !password.matches(".*[!@#$%^]*");
    }
}
