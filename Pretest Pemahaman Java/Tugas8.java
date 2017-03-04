public class Tugas8{
    
    String nama,alamat;
    int umur;
    
    public void CetakBiodata(){
        System.out.println("----------------------------");
        System.out.println("Nama   : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Umur   : "+umur);
        System.out.println("----------------------------");
    }
    
    public static void main(String []args){
        
        Tugas8 data = new Tugas8();
        data.nama = "Rizki Amrullah";
        data.alamat = "Jepara";
        data.umur = 20;
        
        data.CetakBiodata();
    }
}