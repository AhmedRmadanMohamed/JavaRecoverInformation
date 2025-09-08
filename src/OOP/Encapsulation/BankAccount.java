package OOP.Encapsulation;

public class BankAccount {

 private  String Name;
 private  int Balance;
 private  int AccountNumber;


 public void settName(String Name) {

     this.Name = Name;

 }
 public  String GetName() {

     if (this.Name.equals("Ahmed")) {

         return Name;
     }else  return null;
 }




}
