public abstract class Radnik {

    protected String ime;
    protected String prezime;
    protected int jmbg;
    protected double plata;

    protected String ziroRacun;

    public Radnik(String ime, String prezime, int jmbg, String ziroRacun) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.ziroRacun = ziroRacun;
    }

    public abstract void islatiPlate();

}
