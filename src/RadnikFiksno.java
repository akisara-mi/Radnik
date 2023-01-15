public class RadnikFiksno extends Radnik {

    public RadnikFiksno(String ime, String prezime, int jmbg, String ziroRacun) {
        super(ime, prezime, jmbg, ziroRacun);
    }

    @Override
    public void islatiPlate() {
        super.plata = 80000;
        System.out.println("Ime radnika je: " + super.ime + "," + "prezime radnika je: " + super.prezime + ", " + "dok je mesecna plata radnika: " + " " + plata + " " + "ziro-racun radnika je:" + " " + super.ziroRacun);
    }
}
