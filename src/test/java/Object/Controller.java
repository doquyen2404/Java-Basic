package Object;

public class Controller {
    public static void main(String[] args) {
        Customers customer1 = new Customers();
        customer1.setCustomerID(1);
        customer1.setCustomerName("Alfreds Futterkiste");
        customer1.setContactName("Maria Anders");
        customer1.setAddress("Obere Str. 57");
        customer1.setCity("Berlin");
        customer1.setPostalCode("12209");
        customer1.setCountry("Germany");

        System.out.println("Customer 1: ");

      //  System.out.println(customer1);
        customer1.print();

        Categories category1 = new Categories();
        category1.setCategoryID(1);
        category1.setCategoryName("Beverages");
        category1.setDescription("Soft drinks, coffees, teas, beers, and ales");

        System.out.println("Categories 1: ");

       // System.out.println(category1);
        category1.print();

        Employees emp10 = new Employees();
        emp10.setEmployeeID(10);
        emp10.setLastName("West");
        emp10.setFirstName("Adam");
        emp10.setBirthDate("9/19/1928");
        emp10.setPhoto("EmpID10.pic");
        emp10.setNotes("An old chum");

        System.out.println("Employees 1: ");

        //System.out.println(emp10);
        emp10.print();

        OrderDetails orderDetail1 = new OrderDetails();
        orderDetail1.setOrderDetailID(1);
        orderDetail1.setOrderID(10248);
        orderDetail1.setProductID(11);
        orderDetail1.setQuantity(12);

        System.out.println("OrderDetails 1: ");

      //  System.out.println(orderDetail1);
        orderDetail1.print();

        Orders order1 = new Orders();
        order1.setOrderID(10248);
        order1.setCustomerID(90);
        order1.setEmployeeID(5);
        order1.setOrderDate("7/4/1996 ");
        order1.setShipperID(3);

        System.out.println("Orders 1: ");

      //  System.out.println(order1);
        order1.print();

        Products product1 = new Products();
        product1.setProductID(1);
        product1.setProductName("Chais");
        product1.setSupplierID(1);
        product1.setCategoryID(1);
        product1.setUnit("10 boxes x 20 bags");
        product1.setPrice(18);

        System.out.println("Products 1: ");

       // System.out.println(product1);
        product1.print();

        Shippers shipper1 = new Shippers();
        shipper1.setShipperID(1);
        shipper1.setShipperName("Speedy Express ");
        shipper1.setPhone("(503) 555-9831");

        System.out.println("Shippers 1: ");

      //  System.out.println(shipper1);
        shipper1.print();

        Suppliers supplier1 = new Suppliers();
        supplier1.setSupplierID(1);
        supplier1.setSupplierName("Exotic Liquid");
        supplier1.setContactName("Charlotte Cooper");
        supplier1.setAddress("49 Gilbert St.");
        supplier1.setCity("Londona");
        supplier1.setPostalCode("EC1 4SD");
        supplier1.setCountry("UK");
        supplier1.setPhone("(171) 555-2222");

        System.out.println("Suppliers 1: ");

      //  System.out.println(supplier1);
        supplier1.print();
    }
}
