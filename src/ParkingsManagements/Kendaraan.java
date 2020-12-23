package ParkingsManagements;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Kendaraan {

    //constructornya
  
    private String platno, name;
    private int jumlahRoda;
    private double harga;
    private String Plat [];
    
    public String getPlatno(String platno){
      this.platno = platno;
      return platno;
    }
    
    public int jmlRoda(){
        return jumlahRoda;
    }
    
    public String getTime(){
      Date HariSekarang = new Date();
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'pada' hh:mm:ss a zzz");
      return  ft.format(HariSekarang);
    }
    
    public double getHarga(){
        return harga;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public String getPemilik(String nama){
        this.name = nama;
        return nama;
    }
}
    

