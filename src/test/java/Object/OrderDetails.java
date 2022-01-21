package Object;

public class OrderDetails {
    int OrderDetailID;
    int OrderID;
    int ProductID;
    int Quantity;

    public int getOrderDetailID() {
        return OrderDetailID;
    }

    public void setOrderDetailID(int orderDetailID) {
        OrderDetailID = orderDetailID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    // @Override
    //public String toString() {
    //   return getOrderDetailID() + getProductID() + getQuantity();
    public void print() {
        System.out.println("OrderDetailID: " + this.getOrderDetailID());
        System.out.println("OrderID: " + this.getOrderID());
        System.out.println("ProductID: " + this.getProductID());
        System.out.println("Quantity: " + this.getQuantity());
    }
}