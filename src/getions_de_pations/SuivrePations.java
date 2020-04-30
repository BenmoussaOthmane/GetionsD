package getions_de_pations;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SuivrePations {

    private final StringProperty Id;
    private final StringProperty Nome;
    private final StringProperty Prenom;
    private final StringProperty Date_nai;
    private final StringProperty Date_ajouter;
    private final StringProperty Tlephone;
    private final StringProperty Actes;
    private final StringProperty Adresse;

    public SuivrePations(String Id, String Nome, String Prenom, String Date_nai, String Date_ajouter, String Tlephone, String Actes, String Adresse) {
        this.Id = new SimpleStringProperty(Id);
        this.Nome = new SimpleStringProperty(Nome);
        this.Prenom = new SimpleStringProperty(Prenom);
        this.Date_nai = new SimpleStringProperty(Date_nai);
        this.Date_ajouter = new SimpleStringProperty(Date_ajouter);
        this.Tlephone = new SimpleStringProperty(Tlephone);
        this.Actes = new SimpleStringProperty(Actes);
        this.Adresse = new SimpleStringProperty(Adresse);
        //this.Actes = new SimpleStringProperty(Actes);
        /*this.Actions = new SimpleStringProperty(Actions);
        this.Date_rend = new SimpleStringProperty(Date_rend);
        this.Msg = new SimpleStringProperty(Msg);*/
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

    public String getDate_nai() {
        return Date_nai.get();
    }

    public String getDate_ajouter() {
        return Date_ajouter.get();
    }

    public String getTlephone() {
        return Tlephone.get();
    }

    public String getActes() {
        return Actes.get();
    }

    public String getAdresse() {
        return Adresse.get();
    }

    /*public String getActes() {
        return Actes.get();
    }

    /*public String getActions() {
        return Actions.get();
    }

    public String getDate_rend() {
        return Date_rend.get();
    }

    public String getMsg() {
        return Msg.get();
    }*/
    ///////////////////////////////////////////////////////////
    public void setId(String value) {
        Id.set(value);
    }

    public void setNome(String value) {
        Nome.set(value);
    }

    public void setPrenom(String value) {
        Prenom.set(value);
    }

    public void setDate_nai(String value) {
        Date_nai.set(value);
    }

    public void setDate_ajouter(String value) {
        Date_ajouter.set(value);
    }

    public void setTlephone(String value) {
        Tlephone.set(value);
    }

    public void setActes(String value) {
        Actes.set(value);
    }

    public void setAdresse(String value) {
        Adresse.set(value);
    }

    /*public void setActes(String value) {
        Actes.set(value);
    }

    /*public void setActions(String value) {
        Actions.set(value);
    }

    public void setDate_rend(String value) {
        Date_rend.set(value);
    }

    public void setMsg(String value) {
        Msg.set(value);
    }*/
    ////////////////////////////////////////////////////////
    public StringProperty IdPreperty() {
        return Id;
    }

    public StringProperty NomePreperty() {
        return Nome;
    }

    public StringProperty PrenomPreperty() {
        return Prenom;
    }

    public StringProperty Date_naiPreperty() {
        return Date_nai;
    }

    public StringProperty Date_ajouterPreperty() {
        return Date_ajouter;
    }

    public StringProperty TlephonePreperty() {
        return Tlephone;
    }

    public StringProperty ActesPreperty() {
        return Actes;
    }

    public StringProperty AdressePreperty() {
        return Adresse;
    }
}
