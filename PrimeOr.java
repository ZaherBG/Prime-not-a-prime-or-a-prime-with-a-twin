import java.util.Scanner;
public class PrimeOr {

   public static boolean prime(int a){
       boolean t=true;
        int d=2;
             do{
                if (a%d==0){
                    t=false; 
                break;}
          d++;
                }while(d<=(a/2));
       return t;
   }
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x,y,z;
        boolean t,q,r;
        do{
         System.out.print("Enter a positive integer (-1 to end): ");
        x= s.nextInt();
        
         while(x!=-1) {
            if (x==-1)
            break;
        else if (x<-1) {
            System.out.println("Invalid number");
            break; }
           else {
           t= prime(x);
             if(t)
                System.out.println(x+" is a prime");
                else{
                   System.out.println(x+" is not a prime");
                break;     
                        }
               
                 y=x+2; z=x-2;
                 q= prime(y);
                if (q){
             System.out.println(x+" and "+y+" are twin primes");
             break;
                }
                
                r=prime(z);
                  if(r){
             System.out.println(z+" and "+x+" are twin primes");
             break;
          }
                    if(q==false&&r==false){
            System.out.println(x+" does not have a twin prime");
           break;}
    }
}
    }while(x!=-1);
}
}
