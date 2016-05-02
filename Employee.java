package praktikuminher;
public class Employee {
protected String nama, ID;
protected int tahunmasuk,anak;
protected double bonus, tunjangan, tunjanganistri, tunjanganak, gajitotal;
protected final long salary = 2500000;
public void setNama(String nama){
    this.nama = nama;
}
public void setID(String ID){
    this.ID=ID;
}
public void setTahunMasuk(int tahunmasuk){
    this.tahunmasuk = tahunmasuk;
}
public int getTahunMasuk(){
    return tahunmasuk;
}
public void setAnak(int anak){
    this.anak = anak;
}

public void BonusTunjangan(){
    int lamakerja = 2016-tahunmasuk;
    if(lamakerja<=5){
        bonus = 0;
        tunjangan = 0;
        System.out.println("-------------------------------------------------------------");
        System.out.println("Anda mendapat tunjangan \t\t\t Rp "+tunjangan);
        System.out.println("Anda mendapat bonus sebesar \t\t\t Rp "+ bonus);
    } else if (lamakerja>=6&&lamakerja<=10){
        bonus = (lamakerja*0.01)*salary;
        tunjangan = 0;
        System.out.println("-------------------------------------------------------------");
        System.out.println("Anda mendapat tunjangan \t\t\t Rp "+Math.ceil(tunjangan));
        System.out.println("Anda mendapat bonus sebesar \t\t\t Rp "+ Math.ceil(bonus));
    } else if (lamakerja>10) {
        bonus = (lamakerja*0.1)*salary;
        tunjangan = (lamakerja*0.1)*salary;
        System.out.println("-------------------------------------------------------------");
        System.out.println("Anda mendapat tunjangan \t\t\t Rp "+Math.ceil(tunjangan));
        System.out.println("Anda mendapat bonus sebesar \t\t\t Rp "+ Math.ceil(bonus));
    }
}
public void TunjanganIstri(){
    tunjanganistri = (salary+bonus+tunjangan)*0.1;
    System.out.println("Anda mendapat tunjangan istri sebesar\t\t Rp "+ Math.ceil(tunjanganistri));
}
public void TunjanganAnak(){
    if(anak==0){
        tunjanganak = anak*salary*0.15;
        System.out.println("Anda mendapat tunjangan anak sebesar\t\t Rp "+  tunjanganak);
    } else if (anak>=1&&anak<=3){
        tunjanganak = (salary+bonus+tunjangan)*0.15*anak;
        System.out.println("Anda mendapat tunjangan anak sebesar\t\t Rp "+ tunjanganak);
    } else if (anak>3) {
        tunjanganak = (salary+bonus+tunjangan)*0.15*3;
        System.out.println("Anda mendapat tunjangan anak sebesar\t\t Rp "+tunjanganak);
    }
}
public void GajiTotal(){
    gajitotal = bonus+tunjangan+tunjanganistri+salary+tunjanganak;
    System.out.println("Gaji bersih anda \t\t\t\t Rp " + salary);
    System.out.println("-------------------------------------------------------------");
    System.out.println("Gaji total anda \t\t\t\t Rp "+ Math.ceil(gajitotal));
    System.out.println("-------------------------------------------------------------");
}
}
