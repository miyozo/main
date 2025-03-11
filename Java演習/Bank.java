public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.accountNumber = "4649";
        a1.balance = 1592;
        System.out.println(a1.toString());

        Account a2 = new Account();
        a2.accountNumber = " 4649";
        a2.balance = 2340;
        System.out.println(a2.toString());

        if(a1.equals(a2)){
            System.out.println("口座番号は同じです。");
        }else{
            System.out.println("口座番号は違います。");
        }
    }
}
