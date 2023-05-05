import java.util.*;
public class A1113350_0421_2 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        String date;
        boolean isDate;
        do{
            isDate=true;
            System.out.println("請輸入日期(YYYY/MM/DD)或(MM/DD/YYYY)：");
            date=sc.next();
            if(date.matches("[0-9][0-9][0-9][0-9]/[0-9][0-9]/[0-9][0-9]")){
                isDate=true;
                System.out.println("您輸入的日期是："+date);
            }
            else if(date.matches("[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]")){
                isDate=true;
                System.out.println("您輸入的日期是："+date);
            }else{
                System.out.println("輸入錯誤");
            }
            while(isDate=true);
        }
    }    
}
