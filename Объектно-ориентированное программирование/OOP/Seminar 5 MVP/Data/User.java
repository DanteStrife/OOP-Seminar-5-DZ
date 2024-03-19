package Data;

public abstract class User {
    protected String FirstName;
    protected Integer YearBorn;
    protected String Address;

    public User(String firstName, Integer yearBorn, String address) {
        FirstName = firstName;
        YearBorn = yearBorn;
        Address = address;
    }

    public User() {
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public Integer getYearBorn() {
        return YearBorn;
    }

    public void setYearBorn(Integer yearBorn) {
        YearBorn = yearBorn;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
