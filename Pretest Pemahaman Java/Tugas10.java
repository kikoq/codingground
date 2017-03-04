public class Tugas10{
    
    private String nama;
    private int umur;
    protected String alamat;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public static void main(String []args){
        
        Tugas10 data = new Tugas10();
        data.setNama("Rizki Amrullah");
        data.setAlamat("Jepara");
        data.setUmur(20);
        
        System.out.println(data.getNama());
        System.out.println(data.getAlamat());
        System.out.println(data.getUmur());
    }
    
}