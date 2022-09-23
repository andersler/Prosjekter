/**
 * @Author Anders Lerang 
 */
public class FirmaAdresse extends Adresse{

    private Bilutleieselskap bilutleie;

    public FirmaAdresse(String gateadresse, int postnummer,String poststed,Bilutleieselskap bilutleieselskap){
        super(gateadresse, postnummer, poststed);
        this.bilutleie = bilutleieselskap;
    }
}
