package classes;

public class Employee {
    private static int _id = 0;
    private int id;
    private String firstname;
    private String lastname;
    private String jobTitle;

    // Constructor
    public Employee() {
        this(_id++, "Developer");
    }


    public Employee(int id, String jobTitle) {
        this.id = id;
        this.jobTitle = jobTitle;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        String name = String.format("%s %s", this.getFirstname(), this.getLastname());
        return String.format("Employee(%d, %s)", this.getId(), name);
    }
}
