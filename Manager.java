package praktikuminher;
public class Manager extends Employee{
    private double tunjanganmanager;
    public void BonusTunjangan(){
        super.BonusTunjangan();
    }
    public void TunjanganIstri(){
        super.TunjanganIstri();
    }
    public void TunjanganAnak(){
        super.TunjanganAnak();
    }
    public void TunjanganManager(){
        tunjanganmanager = (bonus+tunjangan+salary)*0.1;
        System.out.println("Anda mendapat tunjangan jabatan sebesar Rp "+Math.ceil(tunjanganmanager));
    }
    public void GajitotalM(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Gaji bersih anda Rp "+salary);
        System.out.println("Gaji total anda Rp "+(Math.ceil(salary+tunjanganmanager+bonus+tunjangan+tunjanganistri+tunjanganak)));
        System.out.println("-------------------------------------------------------------");
    }
}
