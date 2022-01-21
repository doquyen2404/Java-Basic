package Object;

public class Employees {
    int EmployeeID;
    String LastName;
    String FirstName;
    String BirthDate;
    String Photo;
    String Notes;

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    @Override
    public String toString() {
        return getEmployeeID() + getLastName() + getFirstName();
    }

    public void print() {
        System.out.println("EmployeeID: " + this.getEmployeeID());
        System.out.println("LastName: " + this.getLastName());
        System.out.println("FirstName: " + this.getFirstName());
        System.out.println("BirthDate: " + this.getBirthDate());
        System.out.println("Photo: " + this.getPhoto());
        System.out.println("Notes: " + this.getNotes());
    }
}
