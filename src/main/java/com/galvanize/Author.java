package com.galvanize;

public class Author {
    private String authorFirstName;
    private String authorLastName;

    public Author() {
    }

    public Author(String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public String getFirstName() {
        return authorFirstName;
    }

    public void setFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getLastName() {
        return authorLastName;
    }

    public void setLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getFormattedName() {
        return String.format("%s, %s", getLastName(), getFirstName());
    }
}
