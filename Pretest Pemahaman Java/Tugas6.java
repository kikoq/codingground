import java.util.Scanner;

public class Tugas6{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        int nilai = scanner.nextInt();
        String hasil = CekNilai(nilai);
        System.out.println("Nilai anda = " + nilai + " , jadi anda " + hasil);
     }
     
     public static String CekNilai(int a) {
      int nilai = a;
      
      String hasil;
      if (nilai < 60 ){
        hasil = "tidak lulus";
      }else{
        hasil = "lulus ";  
      }
      
      return hasil; 
     }
}