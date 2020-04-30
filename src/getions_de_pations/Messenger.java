package getions_de_pations;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Messenger {
    
    private final StringProperty Id;
    private final StringProperty Date_ajouter;
    private final StringProperty Msg;
    
    
     public Messenger(String Id, String Date_ajouter, String Msg) {
        
    
        this.Id = new SimpleStringProperty(Id);
        this.Date_ajouter = new SimpleStringProperty(Date_ajouter);
        this.Msg = new SimpleStringProperty(Msg);
        
        }
       

    public String getId() {
        return Id.get();

    }

    public String getDate_ajouter() {
        return Date_ajouter.get();

    }

    public String getMsg() {
        return Msg.get();
    }


    public void setId(String value) {
        Id.set(value);
    }

    public void setDate_ajouter(String value) {
        Date_ajouter.set(value);
    }

    public void setMsg(String value) {
        Msg.set(value);
    }


    public StringProperty IdPreperty() {
        return Id;
    }

    public StringProperty Date_ajouterPreperty() {
        return Date_ajouter;
    }

    public StringProperty MsgPreperty() {
        return Msg;
    }

}
