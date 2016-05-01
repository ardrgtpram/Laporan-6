package praktikuminher;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    Employee employee = new Employee();
    PegawaiTetap pt = new PegawaiTetap();
    Manager m = new Manager();
    PegawaiTakTetap ptt = new PegawaiTakTetap();
        System.out.println("--------------------Program Check Gaji--------------------");
        System.out.print("Masukkan nama anda: ");
        employee.setNama(in.nextLine());
        System.out.print("Masukkan ID anda: ");
        employee.setID(in.nextLine());
        System.out.println("Pilih Jabatan: ");
        System.out.println("1. Pegawai Tetap");
        System.out.println("2. Pegawai Tidak Tetap");
        System.out.println("3. Manager");
        System.out.print("Pilihan anda: ");
        int x = in.nextInt();
        switch(x){
            case 1:        
                System.out.print("Tahun Masuk: ");
                pt.setTahunMasuk(in.nextInt());
                System.out.println("Apakah anda memiliki istri? ");
                System.out.println("Y/N?");
                System.out.print("-->> ");
                String y = in.next();
                if (y.equalsIgnoreCase("Y")){
                System.out.println("Berapa jumlah anak anda? ");
                System.out.print("-->> ");
                pt.setAnak(in.nextInt());
                pt.BonusTunjangan();
                pt.TunjanganAnak();
                pt.TunjanganIstri();
                } else {
                    pt.BonusTunjangan();
                    System.out.println("Maaf anda tidak mendapat tunjangan istri maupun anak");
                }
                pt.GajiTotal();
                break;
            case 2:
                System.out.println("Jam kerja anda dalam sehari: ");
                ptt.setJamkerja(in.nextInt());
                ptt.Lemburan();
                ptt.Gajitotalptt();
                break;
            case 3:
                System.out.print("Tahun Masuk: ");
                m.setTahunMasuk(in.nextInt());
                System.out.println("Apakah anda memiliki istri? ");
                System.out.println("Y/N?");
                System.out.print("-->> ");
                String c = in.next();
                if (c.equalsIgnoreCase("Y")){
                System.out.println("Berapa jumlah anak anda? ");
                System.out.print("-->> ");
                m.setAnak(in.nextInt());
                m.BonusTunjangan();
                m.TunjanganManager();
                m.TunjanganAnak();
                m.TunjanganIstri();
                } else {
                    System.out.println("Maaf anda tidak mendapat tunjangan istri maupun anak");
                }
                m.BonusTunjangan();
                m.TunjanganManager();
                m.GajitotalM();
                break;
        }     
    }
}
