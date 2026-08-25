import java.util.Scanner;
class playground{
    void area(int x,int y){
        int area=x*y;
    }
    void diplay(){
         System.out.println("area:"+area);
    }
}
    public class ques3{
        public static void main(String[]args){
            int len,bred;
             System.out.println("enter length and breadth of playground : ");
             playground p=new playground();
             Scanner Sc=new Scanner(System.in);
             p.len=Sc.nextInt();
             p.bred=Sc.nextInt();
             p.area(l,b);
             p.display();
        }
    }
