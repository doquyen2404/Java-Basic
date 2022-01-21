package Object;

public class Shippers {
    int ShipperID;
    String ShipperName;
    String Phone;

    public int getShipperID() {
        return ShipperID;
    }

    public void setShipperID(int shipperID) {
        ShipperID = shipperID;
    }

    public String getShipperName() {
        return ShipperName;
    }

    public void setShipperName(String shipperName) {
        ShipperName = shipperName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return getShipperID() + getShipperName() + getPhone();
    }

    public void print() {
        System.out.println("ShipperID: " + this.getShipperID());
        System.out.println("ShipperName: " + this.getShipperName());
        System.out.println("Phone: " + this.getPhone());
    }
}
