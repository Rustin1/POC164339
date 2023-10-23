 public class wariantnr355 {


     public static void main(String[] args) {
         int[] Tab = {24, 25, 1060, 2086, 5};
         System.out.println("Te liczby w tej tablicy są podzielne przez 5:");
         for (int i = 0; i < Tab.length; i++) {
             if (Tab[i] % 5 == 0)
                 System.out.println(Tab[i]);
         }
     }
 }