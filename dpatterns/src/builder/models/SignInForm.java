package builder.models;

public class SignInForm extends Form {
    private String password;

    public String getPassword() {
        return this.password != null ? this.password : "undefined";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void render() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "\n\nName: " + this.getName() + "\nAddress: " + this.getEmail()
                + "\nPassword: " + this.getPassword();
    }
}
