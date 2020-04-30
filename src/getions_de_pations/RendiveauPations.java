package getions_de_pations;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class RendiveauPations {

    private final StringProperty Id;
    private final StringProperty Nome;
    private final StringProperty Prenom;
    private final StringProperty Date_rend;

    public RendiveauPations(String Id, String Nome, String Prenom, String Date_rend) {
        
    
        this.Id = new SimpleStringProperty(Id);
        this.Nome = new SimpleStringProperty(Nome);
        this.Prenom = new SimpleStringProperty(Prenom);
        this.Date_rend = new SimpleStringProperty(Date_rend);
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

    public String getDate_rend() {
        return Date_rend.get();
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

    public void setDate_rend(String value) {
        Date_rend.set(value);
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

    public StringProperty Date_rendPreperty() {
        return Date_rend;
    }

}
