package designpatterns.exercises.builder;

public class UserBuilder {

    String firstName;    //required
    String lastName;    //required
    int age;    //optional
    String phone;    //optional
    String address;

    public UserBuilder(){
        // konstruktor bezargumentowy
    }

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public User build(){
        User user = new User(firstName,lastName);

        user.firstName = this.firstName;
        user.lastName = this.lastName;
        user.age = this.age;
        user.phone = this.phone;
        user.address = this.address;

        return user;
    }

    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder()
                .setFirstName("Jacek")
                .setLastName("kowalski");

        User user = userBuilder.build();
    }
}
