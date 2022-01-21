package Object;

public class Categories {
    int CategoryID;
    String CategoryName;
    String Description;

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return getCategoryID() + getCategoryName() + getDescription();
    }

    public void print() {
        System.out.println("CategoryID: " + this.getCategoryID());
        System.out.println("CategoryName: " + this.getCategoryName());
        System.out.println("Description: " + this.getDescription());
    }
}
