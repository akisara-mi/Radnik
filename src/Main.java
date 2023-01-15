public class Main {
    public static void main(String[] args) {

        Radnik radnikPoDanu = new RadnikPoDanu("Marko", "Markovic", 525458, "123-456");
        Radnik radnikPoSatu = new RadnikPoSatu("Pera", "Peric", 020555, "1256-228");
        Radnik radnikFiksno = new RadnikFiksno("Milos", "Milosevic", 170385, "5899-6354");
        radnikPoSatu.islatiPlate();
        radnikPoDanu.islatiPlate();
        radnikFiksno.islatiPlate();
    }

}
