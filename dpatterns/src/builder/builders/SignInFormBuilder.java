package builder.builders;

import builder.models.SignInForm;

public class SignInFormBuilder implements FormBuilder {
    private SignInForm signInForm;

    public SignInFormBuilder(){
        this.signInForm = new SignInForm();
    }

    @Override
    public SignInFormBuilder setName(String name) {
        signInForm.setName(name);
        return this;
    }

    @Override
    public SignInFormBuilder setEmail(String email) {
        signInForm.setEmail(email);
        return this;
    }

    public SignInFormBuilder setPassword(String password){
        signInForm.setPassword(password);
        return this;
    }

    @Override
    public SignInForm build() {
        return this.signInForm;
    }
}
