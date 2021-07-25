
import java.util.ArrayList;

public class Test {

    public static long sum_or_product_of_divisibles(ArrayList<Integer> divisors ,String op ,long limit){
        long sum_or_product=1;
        ArrayList<Integer> divisibles=new ArrayList<>();
        
        if (op.equals("+")) {
            for (int i=0; i <=limit; i++) {
                for (int divisor : divisors) {
                    if (i%divisor== 0 && !divisibles.contains(i) ) {
                        divisibles.add(i);
                    }
                }
            }
            for (Integer d : divisibles) {
                sum_or_product+=d;
            }
            
            sum_or_product-=1; //toplamı 0 dan başlatmayıp 1 den başlattığımız için 1 çıkardık
            
        }//end of "+" 
        
        else if (op.equals("*")) {
            for (int i=1; i <=limit; i++) {
                for (int divisor : divisors) {
                    if (i%divisor== 0 && !divisibles.contains(i) ) {
                        divisibles.add(i);
                    }
                }
            }
            for (Integer d : divisibles) {
                sum_or_product*=d;
            } 
        }//end of "*"
    return sum_or_product; 
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(2);
        arr.add(3);
        String op="+";      
        System.out.println(sum_or_product_of_divisibles(arr, op, 6));
        
        
    }
    
}
