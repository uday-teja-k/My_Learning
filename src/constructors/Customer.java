package constructors;

class Product{

    private String itemNo;
    private String name;
    private double price;
    private short qty;

    public String getItemNo(){return itemNo;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public short getQty(){return qty;}

    //we cannot have set item number
    // we also cannot have set name

    public void setPrice(double p){price =p;}
    public void setQty(short q){qty=q;}

    public Product(String t){
        itemNo =t;
    }
    public Product(String t, String n ){
        itemNo = t;
        name = n;
    }
    public Product(String t, String n ,double pri,short qt){
        itemNo = t;
        name = n;
        price = pri;
        qty = qt;
        // we can also set the remaining values as
        //setPrice(pri);
        //setQty(qt);
        //we can also look in the cyinder class
    }
}

class Customer {

    private String custId;
    private String name;
    private String address;
    private String phNo;

    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhNo(){return phNo;}

    //we cannot have set method for cust id and name
    // we can have set methods for address and phone number

    public void setAddress(String a){address=a;}
    public void setPhNo(String p){phNo=p;}

    public  Customer(String c,String n){
        custId=c;
        name=n;
        setAddress("flat 408, malaysian township block a1, hitech city, hyderabad");
        setPhNo("+91-8978578438");
    }
    public Customer(String c, String n, String a, String p){
        custId=c;
        name=n;
        address=a;
        phNo=p;
    }
}
class Driver{

    //class peru.java lo peru emani create chesamo daniki mathrame
    //public class ani pettali vere vatiki only class ante saripotadi
    //kavali ante ee main method ni customer class lo pettu kovachu

    public static void main(String [] args){
        Customer customer = new Customer("ASD342DFR","Uday");

        System.out.println(customer.getCustId());
        System.out.println(customer.getName());
        System.out.println(customer.getAddress());
        System.out.println(customer.getPhNo());

        Customer customer1 = new Customer("DFBDBJCS234324","Matthew","flat 303, lanco hills, block 1a, manikonda hyderabad","+91-8106320537");

        System.out.println(customer1.getCustId());
        System.out.println(customer1.getName());
        System.out.println(customer1.getAddress());
        System.out.println(customer1.getPhNo());


        Product product  = new Product("ASD21334#RTA");

        System.out.println(product.getItemNo());

        Product product1 = new Product("BSF3243DFFWEDD","Water bottle");

        System.out.println(product1.getItemNo());
        System.out.println(product1.getName());

        Product product2 = new Product("DREWE234#RERET","Printer",22.22,(short)400);

        System.out.println(product2.getItemNo());
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.getQty());
        //it must take item number there is no non parameterized constructor
    }
}
