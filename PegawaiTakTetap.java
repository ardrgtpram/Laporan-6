package praktikuminher;
public class PegawaiTakTetap extends Employee{
    private int jamkerja, lemburan;
    public void setJamkerja(int jamkerja){
        this.jamkerja = jamkerja;
    }
    public void Lemburan(){
    if(jamkerja>=10){
        lemburan = jamkerja*10000;
        System.out.println("Anda mendapat uang lembur sebesar Rp "+lemburan);
    } else {
        System.out.println("Maaf anda tidak mendapat uang lembur");
    }
}
    public void Gajitotalptt(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Gaji bersih anda Rp "+salary);
        System.out.println("Gaji total anda Rp "+(salary+lemburan));
        System.out.println("-------------------------------------------------------------");
    }
}
