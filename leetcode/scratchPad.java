import java.util.*;

public class scratchPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(gcd(n1,n2));
    }

    static int gcd(int n1,int n2){

        ArrayList <Integer> aL1 = new ArrayList<>();
        ArrayList<Integer> aL2 =  new ArrayList<>();
        for (int i = 1; i <= n1; i++) {
            if(n1%i == 0){
                aL1.add(i);
            }
        }
        for (int i = 1; i <= n2; i++) {
            if(n2%i == 0){
                aL2.add(i);
            }
        }
        ArrayList<Integer> aL3 = new ArrayList<>();
        for(int element : aL1){
            Collections.sort(aL2);
            int searchIndex = Collections.binarySearch(aL2,element);
            if(searchIndex > -1){
                aL3.add(aL2.get(searchIndex));
            }
        }
        aL3.sort((o1,o2) -> {
            return o2-o1;
        });

        return aL3.getFirst();
    }
}