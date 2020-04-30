package getions_de_pations;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Home {
    
    
    private final StringProperty Id;
    private final StringProperty Nome;
    private final StringProperty Prenom;
    private final StringProperty Tlephone;

    public Home(String Id, String Nome, String Prenom, String Tlephone) {
        
    
        this.Id = new SimpleStringProperty(Id);
        this.Nome = new SimpleStringProperty(Nome);
        this.Prenom = new SimpleStringProperty(Prenom);
        this.Tlephone = new SimpleStringProperty(Tlephone);
        }
       

    public String getId() {
        return Id.get();

    }

    public String getNome() {
        return Nome.get();

    }

    public String getPrenom() {
        return Prenom.get();
    }

    public String getTlephone() {
        return Tlephone.get();
    }

    public void setId(String value) {
        Id.set(value);
    }

    public void setNome(String value) {
        Nome.set(value);
    }

    public void setPrenom(String value) {
        Prenom.set(value);
    }

    public void setTlephone(String value) {
        Tlephone.set(value);
    }

    public StringProperty IdPreperty() {
        return Id;
    }

    public StringProperty NomePreperty() {
        return Nome;
    }

    public StringProperty PrenomPreperty() {
        return Prenom;
    }

    public StringProperty TlephonePreperty() {
        return Tlephone;
    }
}
