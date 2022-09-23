/**
 * @Author Anders Lerang 
 */
public class Kunde {

    private String fornavn;
    private String etternavn;
    private KundeAdresse adresse;
    private int telefonnummer;

    public Kunde(String fornavn,String etternavn,KundeAdresse adresse,int telefonnummer){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
    }


    public String toString() {
        return
                "Fornavn: " + fornavn + '\n' +"Etternavn " + etternavn +  '\n' +
                "Adresse: " + adresse + '\n' +
                "Telefonnummer: " + telefonnummer ;
    }
}
