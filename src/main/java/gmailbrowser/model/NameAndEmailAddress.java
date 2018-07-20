package gmailbrowser.model;

import com.fasterxml.jackson.annotation.JsonGetter;

public class NameAndEmailAddress {
    private String name;
    private String email;

    public NameAndEmailAddress(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @JsonGetter("name")
    public String getName() {
        return name;
    }

    @JsonGetter("email")
    public String getEmail() {
        return email;
    }
}
