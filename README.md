# Java_Array_ArrayList
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVeListFarklari {
public static void main(String[] args) {

        //1-Declaration ve olusturma;
        int myArray1 [];     int [] myArray;    //public static void main(String[] args)
        int sayilarArray []= new int[3];     sayilarArray[0]=9;

        String harflerArray[] = {"a","b","c"};
        String[] isimlerArray = {"Serdar", "Nalan", "Yasemin", "Zeynep"};


        List<Integer> listSayilar = new ArrayList<>();
        ArrayList<Integer> listSayilar1 = new ArrayList<Integer>();

        List<String> isimlerList = new ArrayList<>(Arrays.asList("SERDAR", "Nalan", "Yasemin", "Zeynep"));
        List<String> ulkelerList = new ArrayList<>(List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya"));


        //2- Arrayi veya Arraylisti Print yazdirmak istersek
        System.out.println(isimlerArray); // Array i degil memorydeki referansini yazdirir
        System.out.println(ulkelerList);  // Ancak Arraylist dogrudan yazdirir
        System.out.println(Arrays.toString(isimlerArray)); // Non-primitive data turlerini dogrudan yazdiramayiz
                                                            // Array classindan yardim aliriz     YADA FOR DONFUSU İLE TEK TEK



        //2-Eleman almak istersek
        System.out.println(isimlerArray[1]);        //isimlerArray.get(1);
        System.out.println(ulkelerList.get(1));


        //3-length ve size (BOYUT yazdirma)
        System.out.println(isimlerArray.length);
        System.out.println(ulkelerList.size());


        //4-Add ile eleman ekleme : Add ile sadece List e eleman ekleyebilirim ancak Array e ekleyemem (sabit length)
        //isimlerArray.add("Elif")
        isimlerList.add("elif");
        System.out.println(isimlerList.get(4));


        //5- set methodu ile elemani set etme (belli bir elemani degistirmek istersek)
        isimlerArray[0]="Elif";
        System.out.println(isimlerArray[0]);
        ulkelerList.set(0,"Avusturalya");
        System.out.println(ulkelerList.get(0));


        // 6- Remove methodu(Kaldirmak istersek) (Arrayde eleman kaldiramyiz sabit ne buyur ne kuculur)
        ulkelerList.remove("Almanya");
        System.out.println(ulkelerList.get(1));  // artik konsolda Fransa yazacaktir





// array de multidimensional varken arraylist de yok
// array object data type i ve primitive data type i icerirken, arraylist object data type i destekler(primitivelerin wrapper classi obje icindedir)




    }
}
