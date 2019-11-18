public class SayHello {
       public static void main(String[]  args) {
           int sum;
              System.out.println("Below is the function of sayhello");
               sayhello(sum());
              SayHello helloworld = new SayHello() ;
               helloworld.sayhello(helloworld.sum());

       }
       public static void sayhello(int sum){
              System.out.println("say hello!"+sum);
       }
       public static int sum(){
              int i,sum=0;
           for (i=0; i<=100; i++){
                     sum=sum+i;
              }
              return sum;
      }

 }
