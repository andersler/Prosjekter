/**
 * @Author Anders Lerang
 */
public class Bil {

    private String modell;
    private String farge;
    private String merke;
    private String registreringsnummer;
    private char utleiegruppe;
    private boolean ledig;
    private int pris;

    /**
     * @Author Adrian Birkedal, Anders Lerang og Birk Johannesen
     */
    public Bil(String modell, String farge, String merke, String registreringsnummer, char utleiegruppe, boolean ledig,int pris){
        this.modell = modell;
        this.farge = farge;
        this.merke = merke;
        this.registreringsnummer = registreringsnummer;
        this.utleiegruppe = utleiegruppe;
        this.ledig = ledig;
        this.pris = pris;
    }

    public boolean isLedig() {
        return ledig;
    }

    public void setLedig(boolean ledig) {
        this.ledig = ledig;
    }

    public char getUtleiegruppe() {
        return utleiegruppe;
    }

    public void setUtleiegruppe(char utleiegruppe) {
        this.utleiegruppe = utleiegruppe;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public void setRegistreringsnummer(String registreringsnummer) {
        this.registreringsnummer = registreringsnummer;
    }

    public String toString(){
        return '\n'
                +"Modell: "+modell + '\n' + "Farge: " + farge + '\n'
                + "Merke: "+merke + '\n' + "Registreringsnummer: "+registreringsnummer +
                '\n' + "Utleiegruppe: "+utleiegruppe + '\n'+ "Ledig: "+ledig
                +'\n'+ "Dagspris:" + pris;
    }
}
