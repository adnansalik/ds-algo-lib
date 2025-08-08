import java.util.ArrayList;
import java.util.Scanner;

public class B_2013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t; i++){
            int n = sc.nextInt();
            ArrayList<Long> arrayList = new ArrayList<>();
            for(int j=0;j<n;j++){
                Long input = sc.nextLong();
                arrayList.add(input);
            }
            System.out.println(get_rating(arrayList));
        }
    }

    static long get_rating(ArrayList<Long> arrayList){
        long rating = 0;
        while(arrayList.size()>2){
            int lastIndex = arrayList.size()-1;
            arrayList.set(lastIndex-1, arrayList.get(lastIndex-1) - arrayList.get(lastIndex-2));
            arrayList.remove(lastIndex-2);
        }
        if(arrayList.size()==2){
            rating = arrayList.get(1) - arrayList.get(0);
        }
        return rating;
    }
}
