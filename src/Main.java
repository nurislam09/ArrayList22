import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayeven = new ArrayList<>();
        ArrayList<Integer> arrayodd = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 50 ; i++) {
            int a = random.nextInt(1,100);
            arrayList.add(a);
            if (a%2==0){
                arrayeven.add(a);
            }else {
                arrayodd.add(a);
            }
        }
        System.out.println(" Random 50 numbers:"+ arrayList);
        System.out.println("Even numbers:" +arrayeven );
        System.out.println("Odd numbers:"+arrayodd);
    }
}
