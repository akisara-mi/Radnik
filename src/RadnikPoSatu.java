public class RadnikPoSatu extends Radnik {

    public RadnikPoSatu(String ime, String prezime, int jmbg, String ziroRacun) {
        super(ime, prezime, jmbg, ziroRacun);
    }

    @Override
    public void islatiPlate() {
        int brojSati = 8;
        double satnica = 350.50;
        super.plata = Double.valueOf(brojSati) * satnica;
        System.out.println("Ime radnika je: " + super.ime + "," + "prezime radnika je: " + super.prezime + ", " + "dok je plata radnika po satu: " + " " + plata + " " + "ziro-racun radnika je:" + " " + super.ziroRacun);

    }
}

