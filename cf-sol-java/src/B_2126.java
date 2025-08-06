import java.util.Scanner;
public class B_2126 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            System.out.println(getMaxHikes(a,k));
        }
    }

    static int getMaxHikes(int[] a , int k){
        int max_hikes = 0;
        int temp_k = k;
        for(int i=0;i<a.length;i++){
            if(a[i] == 0){
                temp_k = temp_k - 1;
                if(temp_k == 0){
                    max_hikes++;
                    temp_k = k;
                    if(i != a.length-1){
                        i++;
                    }
                }
            }
            if(a[i] == 1){

                temp_k = k;
            }
        }
        return max_hikes;
    }
}

// 37 MINS