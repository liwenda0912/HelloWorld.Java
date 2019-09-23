public class SayHello {
       public static void main(String[]  args) {
              System.out.println("Below is the function of sayhello");
               sayhello(sum());
               HelloWold hellowold = new Hellowold() ;
               hellowold.sayhello(hellowold.sum());

       }
       public static void sayhello(int sum){
              System.out.println("say hello!"+sum);
       }
       public static int sum(){
              int i;
              for (i=0;i<=100;i++){
                     sum=sum+i; 
              }
              return sum;
      }

 }
