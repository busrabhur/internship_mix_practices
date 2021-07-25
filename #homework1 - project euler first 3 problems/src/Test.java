
import javafx.scene.input.KeyCode;


public class Test{  
    /*Problem 1:  
        1000'in altındaki 3 veya 5'in tüm katlarının toplamını bulun
    */
    
    
    public static int solveP1(){
        int sum=0;
        for (int i = 0; i < 1000; i++) {
            if (i%3==0 || i%5==0) {
                sum+=i;
            }
        }
        return sum;
    }
    
    
    /*
    Problem 2:           1, 2, 3, 5, 8, 13, 21,
    Fibonacci dizisindeki değerleri dört milyonu
    geçmeyen terimleri göz önünde bulundurarak çift değerli terimlerin toplamını bulunuz.
    */
    public static int solveP2(){
        int sum=0;
        int a=1;
        int b=2;
        int param=0;
        while (a<4000000) {            
            if (a%2==0) {
                sum+=a;
            }
            param=a+b;
            a=b;
            b=param;
        }
        return sum;
    }
    
    /*
    Problem3:What is the largest prime factor of the number 600851475143
    */
    public static boolean primeCheck(int x){
        /*bir sayının asal olup olmadığını kontrol etmek için kendinden küçük tüm sayılara 
        bakmak yerine kareköküne kadar olanlara bakmamız yetiyor ->Eratosthenes kuralı*/
        boolean isPrime=true;
        for (int i =2; i <(int)Math.sqrt(x)+1; i++) {
            if (x%i==0) {
                isPrime=false;
            }
        }
        return isPrime;
    }
    
    public static int solveP3(){
        long num=600851475143L;
        int largestPrime=1;
        //->Eratosthenes kuralı:kareköküne kadar olanlara bakmamız yetiyor
        for (int i = 2; i < (int)Math.sqrt(num); i++) {
            if (num%i==0 && primeCheck(i)) {
                largestPrime=i;
            }
        }
        return largestPrime;
    }
    
    public static void main(String[] args) {
        System.out.println(solveP1());
        System.out.println(solveP2());
        System.out.println(solveP3());
    }
}
