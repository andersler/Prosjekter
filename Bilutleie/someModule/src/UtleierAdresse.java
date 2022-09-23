/**
 * @Author Anders Lerang 
 */
public class UtleierAdresse extends Adresse{

    private int utleinummer;

    public UtleierAdresse(String gateadresse, int postnummer,String poststed,int utleienummer){
        super(gateadresse, postnummer, poststed);
        this.utleinummer = utleienummer;
    }
    @Override
    public String toString(){
        return super.toString() + " " + utleinummer;
    }
}
