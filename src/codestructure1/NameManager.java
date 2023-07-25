package codestructure1;

public class NameManager {
    private final String fullName = "John Doe";

    public String getFirstName() {
        return fullName.split(" ")[0];
    }

    public String getLastName() {
        return fullName.split(" ")[1];
    }
}
