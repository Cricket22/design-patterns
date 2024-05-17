package builder.builders;

import builder.models.Form;

public interface FormBuilder {
    FormBuilder setName(String name);
    FormBuilder setEmail(String email);
    Form build();
}
