package inheritance;

class Account1 {

    private int accNo;
    private float balance;
    private String name;
    private String address;
    private String phNo;
    private String dob;


    public float getBalance(){
        return balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhNo() {
        return phNo;
    }

    public String getDob() {
        return dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public Account1(){
        setBalance(0.00f);
    }

    public Account1(int accno, String name, String dob){

        this.name = name;
        this.accNo=accno;
        this.dob=dob;




    }



}
class SavingsAccount extends Account1{
    private int agf=12;

    public int getAgf() {
        return agf;
    }

    public int deposit(){
        return 100;
    }
}
public class Account{
    public static void main(String[] args){

        Account1 acc1 = new Account1(123456789,"Hemsworth","09-08-2345");
        System.out.println("acc no: "+acc1.getAccNo()+"\n"+"date of birth: "+acc1.getDob()+"\n"+"phone: "+acc1.getPhNo()+"\n"+"balance: "+acc1.getBalance());
//        acc1.setPhNo("+91-098765434");
//        System.out.println(acc1.getAccNo()+"\n"+acc1.getDob()+"\n"+acc1.getPhNo());

        SavingsAccount account = new SavingsAccount();


        System.out.println(account.getAgf());
        System.out.println(account.getBalance());
        System.out.println(account.deposit());
    }
}
