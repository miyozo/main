public class main {
    public static void main(String[] args){
        Thief th1 = new Thief("あさか",70,5);
        System.out.println(th1.name);
        System.out.println(th1.hp);
        System.out.println(th1.mp);

        Thief th2 = new Thief("あさか");
        System.out.println(th2.name);
        System.out.println(th2.hp);
    }
}
