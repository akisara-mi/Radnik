public class RadnikPoDanu extends Radnik {


    public RadnikPoDanu(String ime, String prezime, int jmbg, String ziroRacun) {
        super(ime, prezime, jmbg, ziroRacun);
    }


    @Override
    public void islatiPlate() {
        int brojDana = 5;
        int brojSati = 8;
        double satnica = 350.50;
        super.plata = Double.valueOf(brojSati) * satnica * Double.valueOf(brojDana);
        System.out.println("Ime radnika je: " + super.ime + "," + "prezime radnika je: " + super.prezime + ", " + "dok je plata radnika po danu: " + " " + plata + " " + "ziro-racun radnika je:" + " " + super.ziroRacun);


    }
}

