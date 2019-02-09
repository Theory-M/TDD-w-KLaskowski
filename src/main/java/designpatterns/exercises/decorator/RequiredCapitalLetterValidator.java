package designpatterns.exercises.decorator;

public class RequiredCapitalLetterValidator implements Validable {
    Validable validator;

    // zaczynamy od isValid i dodajemy swoj warunek po "&&"
    public boolean isValid(String password){
        return validator.isValid(password) && !password.toLowerCase().equals(password);
    }

    // validator jest brany z konstruktora
    public RequiredCapitalLetterValidator(Validable validator) {
        this.validator = validator;
    }
}
