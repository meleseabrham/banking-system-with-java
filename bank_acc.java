 
import java.util.ArrayList; 
import java.util.InputMismatchException; 
import java.util.Scanner; 
 
public class bank_acc { 
 
    public static void main(String[] args) { 
        bank b = new bank(); 
        b.ShowMenu(); 
    } 
} 
 
class bank { 
 
    private double ac_no; 
    private String name; 
    private double balance; 
    private double previousTransaction; 
 
    public void Detailes(String num, double n) { 
        num = name; 
        n = ac_no; 
    } 
 
    public void deposite(double amount) { 
        if (amount != 0) { 
                balance = balance + amount; 
                previousTransaction = amount; 
 
             
        } 
    } 
 
    public void withdraw(double amount) { 
        if (amount < balance) { 
                balance = balance - amount; 
                previousTransaction = -amount; 
                System.out.println(" You Can Withdraw :"); 
             
        } else { 
            System.out.println(" Your Balance is insufficient :"); 
        } 
    } 
 
    public void Transfer(String name, double amount, double 
accno) { 
        if (this.balance < amount) { 
            System.out.println("Transfer Fails"); 
        } else { 
            this.balance -= amount; 
            this.name = name; 
            System.out.println("Account of " + this.name + " 
Becomes = :" + this.balance); 
        } 
    } 
 
    public void getpreviousTransaction() { 
        if (previousTransaction > 0) { 
            System.out.println("YOUR  DEPOSITE IS = : " + 
previousTransaction); 
        } else if (previousTransaction < 0) { 
            System.out.println("YOUR WITHDRAWED AMOUNT  = : 
" + Math.abs(previousTransaction)); 
        } else { 
            System.out.println("No Transaction Occure"); 
        } 
    } 
 
    public void ShowMenu() { 
 
        char choice; 
        try { 
            ArrayList<bank> ss = new ArrayList<bank>(); 
 
            Scanner in = new Scanner(System.in); 
 
            System.out.println("WELL COME TO CREATE BANK 
ACCOUNT : "); 
            
System.out.println("===================================
 ====================================================
 ====================================================
 ============"); 
            System.out.println("enter number of customer"); 
            int n = in.nextInt(); 
 
            for (int i = 1; i <= n; i++) { 
                System.out.println("Enter Your Name : "); 
                
System.out.println("===================================
 ====================================================
 ====================================================
 =================="); 
                String nume = in.next(); 
                System.out.println("Enter Your Account Number : "); 
                int n1 = in.nextInt(); 
                
System.out.println("===================================
 ====================================================
 ====================================================
 =================="); 
                System.out.println("DETAILES OF CUSTOMER :"); 
                
System.out.println("===================================
 ====================================================
 ====================================================
 =================="); 
                System.out.println("name of customer :" + nume); 
                
System.out.println("===================================
 ====================================================
 ====================================================
 =================="); 
                System.out.println("account numberof customer :" + 
n1); 
            } 
        } catch (Exception e) { 
            System.out.println(" some wrong  " + e); 
        } 
        System.out.println("\n"); 
        System.out.println("choice R : for Register "); 
        System.out.println("choice D : for Deposite "); 
        System.out.println("choice W : for Withdraw "); 
        System.out.println("choice C : for Check Balance "); 
        System.out.println("choice P : for PreviousTransaction "); 
        System.out.println("choice T : for Transfer "); 
         
        do { 
            Scanner in = new Scanner(System.in); 
 
            
System.out.println("===================================
 ====================================================
 ====================================================
 ===================="); 
            System.out.println("SLECT YOUR CHOICE : "); 
            
System.out.println("===================================
 ====================================================
 ====================================================
 ========================"); 
            System.out.println("\n"); 
            char op = in.next().charAt(0); 
            switch (op) { 
                case 'R': 
                    try { 
                        
System.out.println("===================================
 ====================================================
 ====================================================
 ========="); 
                        System.out.println("Enter Your Name : "); 
                        
System.out.println("===================================
====================================================
 ====================================================
 ========"); 
                        String namee = in.next(); 
                        System.out.println("Enter Your Account Number 
: "); 
                        double n2 = in.nextDouble(); 
 
                    } catch (Exception x) { 
                        System.out.println(" some wrong  " + x); 
                    } 
                    System.out.println("\n"); 
 
                    break; 
                case 'D': 
                    try { 
                        
System.out.println("===================================
 ====================================================
 ====================================================
 ======="); 
                        System.out.println("Enter Amount Of Deposit :  
"); 
                        
System.out.println("===================================
 ====================================================
 ====================================================
 ====="); 
                        double amount = in.nextDouble(); 
                        deposite(amount); 
 
                    } catch (Exception k) { 
                        System.out.println(" sometting wrong  " + k); 
                    } 
                    System.out.println("\n"); 
 
                    break; 
                case 'W': 
                    try { 
                        
System.out.println("===================================
 ====================================================
 ====================================================
 ========"); 
                        System.out.println("Enter Amount Of Withdraw : 
"); 
                        
System.out.println("===================================
 ====================================================
 ====================================================
 =========="); 
                        double amount2 = in.nextDouble(); 
                        withdraw(amount2); 
                    } catch (Exception o) { 
                        System.out.println(" some wrong  " + o); 
                    } 
                    System.out.println("\n"); 
 
                    break; 
                case 'C': 
                    try { 
                        
System.out.println("===================================
 ====================================================
 ====================================================
 ====="); 
                        System.out.println(" Your Balance is = " + 
balance); 
                        
System.out.println("===================================
 ====================================================
 ==================================="); 
                        System.out.println("\n"); 
 
                    } catch (Exception h) { 
                        System.out.println(" some wrong  " + h); 
                    } 
                    System.out.println("\n"); 
 
                    break; 
                case 'P': 
                    try { 
                        
System.out.println("===================================
 ====================================================
 ====================================================
 ======"); 
                        getpreviousTransaction(); 
                        
System.out.println("===================================
 ====================================================
 ====================================================
 ========"); 
                        System.out.println("\n"); 
 
                    } catch (Exception u) { 
                        System.out.println(" some wrong  " + u); 
                    } 
                    System.out.println("\n"); 
 
                    break; 
                case 'T': 
                    try { 
                        
System.out.println("===================================
 ====================================================
 ====================================================
 ====="); 
                        System.out.println("Enter Name Of You 
Taransfer : "); 
                        String num = in.next(); 
                        
System.out.println("===================================
 ====================================================
 ====================================================
 ========"); 
                        System.out.println("Enter Amount Of You 
Transfer "); 
                        double amount3 = in.nextDouble(); 
                        
System.out.println("===================================
 ====================================================
 ====================================================
 ==========="); 
                        System.out.println("Enter Transfer to other 
Account Number  "); 
                        double accno = in.nextDouble(); 
                        Transfer(num, amount3, accno); 
 
                    } catch (Exception p) { 
                        System.out.println(" some wrong  " + p); 
                    } 
                    System.out.println("\n"); 
 
                    break; 
                default: 
                    System.out.println("invalid choice ! please try again "); 
            } 
            System.out.println("Do you want to continiue Y/N "); 
            choice = in.next().charAt(0); 
        } while (choice == 'y' || choice == 'Y'); 
        System.out.println("Thankyou for using our services "); 
    } 
} 