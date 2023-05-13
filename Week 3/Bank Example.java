
class Customer {
    private String name;

    public Customer(String n) {
        name = n;
    }
    
    public String getName(){
        return name;
    }
}


class BankAccount {
    protected String accNo;
    protected int balance;
    protected Customer customer;
    
    protected static int nextAccNo = 0;
    
    public BankAccount( Customer c) {
        accNo = Integer.toString(++nextAccNo);
        customer = c;
        balance = 0;
    }
    
    public void deposit(int x) {
        balance = balance + x;
    }

    
    //public void withdraw(int a) 
    
    public String toString(){
        String result = "\nHolder of account number " + accNo + " is " + customer.getName() 
          +  ", balance = " + Integer.toString(balance) + "\n";
        return result;
    }
    
}


class BankExample {
    public static void main(String[] arg) {
        System.out.println("\nBank Program to test class model");
        
        Customer john = new Customer("John Smith");
        BankAccount b = new BankAccount(john);

        
        System.out.println(b);
        
        b.deposit(150);
        System.out.println(b);  
        
        
    }
}