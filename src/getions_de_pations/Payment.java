package getions_de_pations;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Payment {
private final StringProperty Id;
    private final StringProperty Nome;
    private final StringProperty Prenome;
    private final StringProperty N_Versment;
    private final StringProperty Versment;
    private final StringProperty Total;

    public Payment(String Id, String Nome, String Prenome,String N_Versment,String Versment,String Total) {
        
    
        this.Id = new SimpleStringProperty(Id);
        this.Nome = new SimpleStringProperty(Nome);
        this.Prenome = new SimpleStringProperty(Prenome);
        this.N_Versment = new SimpleStringProperty(N_Versment);
        this.Versment = new SimpleStringProperty(Versment);
        this.Total = new SimpleStringProperty(Total);
        }
       

    public String getId() {
        return Id.get();

    }

    public String getNome() {
        return Nome.get();

    }

    public String getPrenome() {
        return Prenome.get();
    }

    public String getN_Versment() {
        return N_Versment.get();
    }

    public String getVersment() {
        return Versment.get();
    }

    public String getTotal() {
        return Total.get();
    }
    
 
    
    public void setId(String value) {
        Id.set(value);
    }

    public void setNome(String value) {
        Nome.set(value);
    }

    public void setPrenome(String value) {
        Prenome.set(value);
    }

    public void setN_Versment(String value) {
        N_Versment.set(value);
    }
    public void setVersment(String value) {
        Versment.set(value);
    }

    public void setTotal(String value) {
        Total.set(value);
    }


    public StringProperty IdPreperty() {
        return Id;
    }

    public StringProperty NomePreperty() {
        return Nome;
    }

    public StringProperty PrenomePreperty() {
        return Prenome;
    }

    public StringProperty N_VersmentPreperty() {
        return N_Versment;
    }
    public StringProperty VersmentPreperty() {
        return Versment;
    }

    public StringProperty TotalPreperty() {
        return Total;
    }
    
}
