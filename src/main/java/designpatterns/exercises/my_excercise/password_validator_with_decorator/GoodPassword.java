package designpatterns.exercises.my_excercise.password_validator_with_decorator;

public class GoodPassword extends Password implements WithCapital, WithDigit, WithSpecial{
    Password password;

    public GoodPassword(String password) {
        super(password);
    }

    public GoodPassword() {
        super();
    }

    @Override
    public boolean isWithCapital(Password password) {
        if (password.getPassword().contains("W")){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isWithDigit(Password password) {
        if (password.getPassword().contains("1")){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isWithSpecial(Password password) {
        if (password.getPassword().contains("@")){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "GoodPassword{" +
                "password=" + password +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
//        Password myPassword = new GoodPassword(new WithCapital(new WithDigit(new WithSpecial("w"))));
//        WithSpecial withSpecial = new WithSpecial(myPassword);

//        WithSpecial PassWithSpecial = new Password();


//        System.out.println(myPassword);
    }
}
