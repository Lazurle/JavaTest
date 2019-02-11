import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        // N(本の種類は、1≦N≦15)
        // H(本棚の段数、1≦H≦2,000)
        int N = 0;// 本の種類。
        int H = 0;// 本棚の高さ。

        Scanner sc = new Scanner(System.in);
        System.out.println("例：3 2");
        String N_H = sc.nextLine();
        System.out.println("例：4 3 4");
        String BookNUM = sc.nextLine();

        String NH[] = N_H.split(" ", -1);//本の種類Nと、段数Hを分割。
        for(int i = 0;i <= NH.length -1; i++){
            N = Integer.parseInt(NH[i]);
            H = Integer.parseInt(NH[i+1]);
        }

        int K_NUM[] = new int[N];//本の巻数
        String Kansu[] = BookNUM.split(" ", -1);//本の巻数を分割。
        for(int i = 0;i <= Kansu.length -1; i++){
            K_NUM[i] = Integer.parseInt(Kansu[i]);
        }



    }

    //追加関数：
}
