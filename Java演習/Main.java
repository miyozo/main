import java.util.*;
import java.time.*;
import java.time.format.*;

public class Main{
    public static void main(String[] args){
        LocalDateTime l1 = LocalDateTime.now();
        System.out.println(l1);
        LocalDateTime l2 = LocalDateTime.of(2024,1,1,9,5,0,0);
        System.out.println(l2);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate ldate = LocalDate.parse("2023/09/22",fmt);
        System.out.println(ldate);

        LocalDate ldatep = ldate.plusDays(1000);
        String str = ldatep.format(fmt);
        System.out.println("1000日後は"+str);

        LocalDate now = LocalDate.now();
        if(now.isAfter(ldatep)){
            System.out.println("本日は、その日より未来です。");
        }else{
            System.out.println("本日は、その日より過去です。");
        }
    }
}