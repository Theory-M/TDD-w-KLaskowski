package designpatterns.exercises.my_excercise.password_validator_with_decorator;

public abstract class Password implements WithDigit, WithSpecial, WithCapital{
    String password;

    public Password(String password) {
        this.password = password;
    }

    public Password() {

    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
