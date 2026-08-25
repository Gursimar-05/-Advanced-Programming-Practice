import java.util.scanner;
class supermarket{
    float total,diff,prod,quot=0,rem;
    void operations(float x,float y){
        total=x+y;
        if(x<y){
            diff=y-x;
        }else{
            diff=x-y;
        }
        prod=x*y;
        if(y!=0){
        quot=x/y;
        rem=x%y;
        }
    }
    void display(){
        System.out.println("-----arthimic operations-----");
        System.out.println("total  price :"+total);
        System.out.println("difference between the two price :"+diff);
        System.out.println("product of two prices :"+prod);
        if(y==0){
             System.out.println(" division not possible!!");
        }else{
         System.out.println(" qoutient :"+quot);
          System.out.println("remainder :"+rem);
        }
    }
    public class main{
        public static void main(String[]args){
            int p1,p2;
             System.out.println("enter two prices:");
             Scanner Sc = new Scanner(System.in);
            supermarket s=new supermarket();
            s.p1=Sc.nextInt();
            s.p2=Sc.nextInt();
            s.operations(p1,p2);
            s.display();
        }
    }

}