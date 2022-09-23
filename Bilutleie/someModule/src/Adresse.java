/**
 * @Author Anders Lerang 
 */
public class Adresse {
    private String gateadresse;
    private int postnummer;
    private String poststed;

    public Adresse(){
    }
    public Adresse(String gateadresse, int postnummer,String poststed){
        this.gateadresse=gateadresse;
        this.postnummer = postnummer;
        this.poststed = poststed;
    }

    @Override
    public String toString() {
        return
                     gateadresse  +
                " ," + postnummer +
                " ," + poststed;
    }
}
