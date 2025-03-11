public class Account {
    String accountNumber;
    int balance;

    public String toString(){
        return "￥" + this.balance + "(口座番号：" + this.accountNumber + ")";
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
            //↓なぜここでAccount型の変数を指定できない？
        if(o instanceof Account x){
            String an1 = this.accountNumber.trim();
            String an2 = x.accountNumber.trim();
            if(an1.equals(an2)){
                return true;
            }
        }
        }else{
            return false;
        }
    }
}
