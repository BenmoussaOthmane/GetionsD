package getions_de_pations;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Historique {
    
    private final StringProperty Id;
    private final StringProperty Date_ajouter;
    private final StringProperty Actions;
    
    
     public Historique(String Id, String Date_ajouter, String Actions) {
        
    
        this.Id = new SimpleStringProperty(Id);
        this.Date_ajouter = new SimpleStringProperty(Date_ajouter);
        this.Actions = new SimpleStringProperty(Actions);
        
        }
       

    public String getId() {
        return Id.get();

    }

    public String getDate_ajouter() {
        return Date_ajouter.get();

    }

    public String getActions() {
        return Actions.get();
    }


    public void setId(String value) {
        Id.set(value);
    }

    public void setDate_ajouter(String value) {
        Date_ajouter.set(value);
    }

    public void setActions(String value) {
        Actions.set(value);
    }


    public StringProperty IdPreperty() {
        return Id;
    }

    public StringProperty Date_ajouterPreperty() {
        return Date_ajouter;
    }

    public StringProperty ActionsPreperty() {
        return Actions;
    }

}
