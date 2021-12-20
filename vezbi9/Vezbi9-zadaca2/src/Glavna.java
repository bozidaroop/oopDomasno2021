public class Glavna {
    public static void main(String args[]) {
        Vraboten[] vraboteni = new Vraboten[2];
        vraboteni[0] = new Vraboten();
        vraboteni[1] = new Vraboten();

        vraboteni[0].setIme("Stefan");
        vraboteni[0].setPrezime("Stefanovski");
        vraboteni[0].setPlata("10000");

        vraboteni[1].setIme("Aleksandar");
        vraboteni[1].setPrezime("Ristevski");
        vraboteni[1].setPlata("15000");

        XML xml = new XML();

        xml.createXMLFile("vraboteni.xml", vraboteni);
    }
}
