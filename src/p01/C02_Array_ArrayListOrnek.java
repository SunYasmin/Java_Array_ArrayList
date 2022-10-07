package p01;

import java.util.Arrays;

public class C02_Array_ArrayListOrnek {

    /*

Integer olarak artan değerler şeklinde verilen dizinin elemanlarının karesini alıp yine artan
değerlerde ekrana yazdıran metod oluşturunuz

Örnek :

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]

*/
    public static void main(String[] args) {

        // Solution class

        int[] num = {-4,-1,0,3,10};
        sortedArray(num);   // method u cagirabilmek icin static yaparim
        // System.out.println(Arrays.toString(sortedArray(num)));   sorted i boyle yazdirabilirim
        // map akisin seklini duzenini degistiriyor kare alma
        num = sortedArray(num);
        int[] num2 = Arrays.stream(num).map(x->x*x).sorted().toArray();
        System.out.println(Arrays.toString(num2));

        // tek bir dondureceksem reduce



    }
    // lambda Java 8 ve inetrface body li method static default ekleyerek tanimlarim body li method
    // abstract obje var ama uretilemiyor interface de cons yok
    private static int[] sortedArray(int[] num) {
        // int i=0;  // trick bilgi cok arama giriyosa bu satir yardımcı olur
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] * num[i];
        }

        Arrays.sort(num);

        return num;

    }
/*
    public static void main(String[] args) {

        int[] num = {-4,-1,0,3,10};
        // System.out.println(Arrays.toString(sortedArray(num)));
        int[] num2 = Arrays.stream(num).map(x->x*x).sorted().toArray();
        System.out.println(Arrays.toString(num2));

    }

        /*public static int[] sortedArray(int[] num){

            int i =0;
            for( ; i< num.length; i++) {
                num[i] = num[i] * num[i] ;
            }
            Arrays.sort(num);

            return num;
        }*/




}
