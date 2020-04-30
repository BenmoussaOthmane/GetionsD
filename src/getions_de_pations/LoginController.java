/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getions_de_pations;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXTextField;


import static getions_de_pations.PrincibelController.comptabilite;
import static getions_de_pations.PrincibelController.historique;
import static getions_de_pations.PrincibelController.imageNot;
import static getions_de_pations.PrincibelController.labelprin;
import static getions_de_pations.PrincibelController.lblnbrnot;


import static getions_de_pations.PrincibelController.suivrep;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javax.swing.JOptionPane;

/**
 *
 * @author madridista
 */
public class LoginController implements Initializable {

    @FXML
    private Label obliermot;
    @FXML
    private VBox vboxconfirm;
    @FXML
    private AnchorPane AnchorpaneLogin;
    @FXML
    private Pane panelSpiner;
    @FXML
    private Pane paneltransitions;
    @FXML
    private VBox vboxlogin;
    @FXML
    private Label labelsecande;
    @FXML
    private Label labelsecande1;
    @FXML
    private Label labelsecande11;

    @FXML
    private JFXButton Login;
    @FXML
    private Label labelError;
    @FXML
    private ImageView retlogin;
    @FXML
    private JFXTextField jtextuser;
    @FXML
    private JFXPasswordField jtextmote;
    @FXML
    private JFXCheckBox checboxdocter;
    @FXML
    private JFXProgressBar progressepare;
    @FXML
    private JFXButton EXIT;
    @FXML
    private JFXTextField confimernom;
    @FXML
    private JFXTextField confirmerprenom;
    @FXML
    private JFXDatePicker confirmerdate;
    @FXML
    private JFXTextField confirmerntlfn;
    @FXML
    private JFXTextField confirmeraddresse;
    @FXML
    private JFXButton btnconfirmeruser;
    @FXML
    private Label labelcom;
    @FXML
    private AnchorPane paneLoginU;
    @FXML
    private Pane andlogin;
    @FXML
    private ImageView imgtlfn;
    @FXML
    private ImageView imgpre;
    @FXML
    private ImageView imgnome;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        /*    Template     */
 /*
        // POUR MODIFIER LE COLOR DE PANE DE ERROR
        
        
         paneError.setBackground(Background.EMPTY);
         String style = "-fx-background-color: rgb(169, 6, 6);";
         paneError.setStyle(style);*/
 
         ///////////// DATE /////////////////
         /*Date date = new Date();
         DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault());
         labelDate.setText(""+df.format(date)+"");*/
 
         
         
         ////////////// DATE AND TEMPS //////////////////////////////
         /*Date date = new Date();
         DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
         labelDate.setText(""+df.format(date)+"");*/
 
        TranslateTransition t = new TranslateTransition();
        t.setDuration(Duration.seconds(2));
        t.setAutoReverse(true);
        t.setCycleCount(1);
        t.setToX(-450);
        //t.setNode(andlogin);
        t.setNode(paneLoginU);

        t.play();

        TranslateTransition t1 = new TranslateTransition();
        t1.setDuration(Duration.seconds(2));
        t1.setAutoReverse(true);
        t1.setCycleCount(1);
        t1.setToX(-450);
        t1.setNode(andlogin);
        //t1.setNode(paneLoginU);

        t1.play();

    }
    int nbrincorect = 0;

    @FXML
    private void obliermot(MouseEvent event) {
        vboxconfirm.setVisible(true);
        vboxlogin.setVisible(false);
        retlogin.setVisible(true);

        // HADI TA3 ANIMATION
        /* panelSpiner.setVisible(true);
        vboxlogin.setVisible(false);
        
        
        RotateTransition FirstTransition = new RotateTransition(Duration.seconds(5), paneltransitions);
            
            RotateTransition[] retattransitions = {FirstTransition};

            for (RotateTransition retattransition : retattransitions) {
                retattransition.setAutoReverse(false);
                retattransition.setCycleCount(1);
                retattransition.setFromAngle(-5);
                retattransition.setToAngle(350);
                
            }
            FirstTransition.play();
            FirstTransition.setOnFinished(e ->{
                
                panelSpiner.setVisible(false);
                vboxlogin.setVisible(true);
            });*/
    }

    int Nbrfaut = 0;
      
    private void TestLogin() throws IOException{
        int i = 0;
        if (checboxdocter.isSelected()) {
            try {
                Connection cnx = null;
                ResultSet resultat = null;
                PreparedStatement prepare = null;
                PreparedStatement prepare2 = null;
                cnx = connexion.connexionDB();
                String username = jtextuser.getText().toString();
                String motDePass = jtextmote.getText().toString();

                String SQL1 = "SELECT * from  Doctor";
                prepare = cnx.prepareStatement(SQL1);
                resultat = prepare.executeQuery();

                while (resultat.next()) {
                    String user = resultat.getString("User");
                    String psoudo = resultat.getString("Motpass");

                    if (username.equals(user) && motDePass.equals(psoudo)) {
                        i = 1;

                    } else {
                        Nbrfaut++;
                    }

                }
                if (i == 1) {

                    StackPane pane = FXMLLoader.load(getClass().getResource("Princibel.fxml"));

                    Stage stage = new Stage();
                    stage.setScene(new Scene(pane, 1240, 750));
                    stage.initStyle(StageStyle.TRANSPARENT);
                    stage.show();
                    PrincibelController.labelprin.setText("Docter");
                    imageNot.setVisible(true);
                    lblnbrnot.setVisible(true);
                    
                    //PrincibelController.btncompte.setDisable(false);
                } else {
                    labelError.setVisible(true);
                    labelError.setText("Les donnes incorectes ");
                    progressepare.setVisible(false);
                    if (Nbrfaut == 3) {
                        labelError.setVisible(false);
                        progressepare.setVisible(false);
                        panelSpiner.setVisible(true);
                        vboxlogin.setVisible(false);

                        RotateTransition FirstTransition = new RotateTransition(Duration.seconds(5), paneltransitions);

                        RotateTransition[] retattransitions = {FirstTransition};

                        for (RotateTransition retattransition : retattransitions) {
                            retattransition.setAutoReverse(false);
                            retattransition.setCycleCount(1);
                            retattransition.setFromAngle(-5);
                            retattransition.setToAngle(350);

                        }
                        FirstTransition.play();
                        FirstTransition.setOnFinished(e -> {

                            panelSpiner.setVisible(false);
                            vboxlogin.setVisible(true);
                            Nbrfaut = 0;
                        });
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            try {
                Connection cnx = null;
                ResultSet resultat = null;
                PreparedStatement prepare = null;
                PreparedStatement prepare2 = null;
                cnx = connexion.connexionDB();
                String username = jtextuser.getText().toString();
                String motDePass = jtextmote.getText().toString();

                String SQL1 = "SELECT * from  admin";
                prepare = cnx.prepareStatement(SQL1);
                resultat = prepare.executeQuery();

                while (resultat.next()) {
                    String user = resultat.getString("User");
                    String psoudo = resultat.getString("Motpass");

                    if (username.equals(user) && motDePass.equals(psoudo)) {
                        i = 1;

                    } else {
                        Nbrfaut++;
                    }

                }
                if (i == 1) {

                    StackPane pane = FXMLLoader.load(getClass().getResource("Princibel.fxml"));

                    Stage stage = new Stage();
                    stage.setScene(new Scene(pane, 1240, 750));
                    stage.initStyle(StageStyle.TRANSPARENT);
                    stage.show();
                    PrincibelController.labelprin.setText("Assistant");
                    PrincibelController.suivrep.setDisable(true);
                    PrincibelController.comptabilite.setDisable(true);
                    PrincibelController.historique.setDisable(true);

                    
                    
                    
                } else {
                    labelError.setVisible(true);
                    labelError.setText(" Les donnes incorectes ");
                    progressepare.setVisible(false);
                    if (Nbrfaut == 3) {
                        labelError.setVisible(false);
                        progressepare.setVisible(false);
                        panelSpiner.setVisible(true);
                        vboxlogin.setVisible(false);

                        RotateTransition FirstTransition = new RotateTransition(Duration.seconds(5), paneltransitions);

                        RotateTransition[] retattransitions = {FirstTransition};

                        for (RotateTransition retattransition : retattransitions) {
                            retattransition.setAutoReverse(false);
                            retattransition.setCycleCount(1);
                            retattransition.setFromAngle(-5);
                            retattransition.setToAngle(350);

                        }
                        FirstTransition.play();
                        FirstTransition.setOnFinished(e -> {

                            panelSpiner.setVisible(false);
                            vboxlogin.setVisible(true);
                            Nbrfaut = 0;
                        });
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @FXML
    private void Login(MouseEvent event) throws IOException {
        progressepare.setVisible(true);
        
        
        
        
        
        TestLogin();
        
    }

    @FXML
    private void retlogin(MouseEvent event) {
        vboxconfirm.setVisible(false);
        vboxlogin.setVisible(true);
        retlogin.setVisible(false);
    }

    @FXML
    private void EXIT(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void btnconfirmeruser(MouseEvent event) {
        int i = 0;
        if (checboxdocter.isSelected()) {
            try {
                Connection cnx = null;
                ResultSet resultat = null;
                PreparedStatement prepare = null;
                PreparedStatement prepare2 = null;
                cnx = connexion.connexionDB();
                String nome = confimernom.getText().toString();
                String prenom = confirmerprenom.getText().toString();
                String date = confirmerdate.getEditor().getText().toString();
                String ntlfn = confirmerntlfn.getText().toString();
                String addresse = confirmeraddresse.getText().toString();

                String SQL1 = "SELECT * from  Doctor";
                prepare = cnx.prepareStatement(SQL1);

                resultat = prepare.executeQuery();

                while (resultat.next()) {

                    String n = resultat.getString("Name");
                    String p = resultat.getString("Prenome");
                    String d = resultat.getString("Date");
                    String nt = resultat.getString("NTlfn");
                    String a = resultat.getString("Adresse");

                    if (n.equals(nome) && p.equals(prenom) && d.equals(date) && nt.equals(ntlfn) && a.equals(addresse)) {
                        i = 1;

                    }

                }
                if (i == 1) {

                    labelError.setVisible(true);

                } else {

                    labelError.setVisible(true);
                    labelError.setText("Les informmations incorect ");
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (i == 1) {
                try {
                    Connection cnx = null;
                    ResultSet resultat = null;
                    cnx = connexion.connexionDB();
                    /*PreparedStatement prepare = null;*/

                    String SQL2 = "SELECT * FROM Doctor WHERE ID=?";
                    PreparedStatement pst = cnx.prepareStatement(SQL2);
                    pst.setString(1, labelcom.getText());
                    resultat = pst.executeQuery();
                    if (resultat.next()) {
                        String add1 = resultat.getString("User");
                        //labelError.setText(add1);
                        String add2 = resultat.getString("Motpass");

                        labelError.setText("User: " + add1 + "  Mot de passe: " + add2);

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);

                }
            }
        } else {
            try {
                Connection cnx = null;
                ResultSet resultat = null;
                PreparedStatement prepare = null;

                cnx = connexion.connexionDB();
                String nome = confimernom.getText().toString();
                String prenom = confirmerprenom.getText().toString();
                String date = confirmerdate.getEditor().getText().toString();
                String ntlfn = confirmerntlfn.getText().toString();
                String addresse = confirmeraddresse.getText().toString();

                String SQL1 = "SELECT * from  admin";
                prepare = cnx.prepareStatement(SQL1);

                resultat = prepare.executeQuery();

                while (resultat.next()) {

                    String n = resultat.getString("Name");
                    String p = resultat.getString("Prenome");
                    String d = resultat.getString("Date");
                    String nt = resultat.getString("NTlfn");
                    String a = resultat.getString("Adresse");

                    if (nbrincorect == 0) {
                        if (n.equals(nome) && p.equals(prenom) && d.equals(date) && nt.equals(ntlfn) && a.equals(addresse)) {
                            i = 1;

                        }
                    }

                }
                if (i == 1) {

                    labelError.setVisible(true);
                } else {

                    labelError.setVisible(true);
                    labelError.setText("Les informmations incorect ");
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (i == 1) {
                try {
                    Connection cnx = null;
                    ResultSet resultat = null;
                    cnx = connexion.connexionDB();
                    /*PreparedStatement prepare = null;*/

                    String SQL2 = "SELECT * FROM admin WHERE ID=?";
                    PreparedStatement pst = cnx.prepareStatement(SQL2);
                    pst.setString(1, labelcom.getText());
                    resultat = pst.executeQuery();
                    if (resultat.next()) {
                        String add1 = resultat.getString("User");
                        //labelError.setText(add1);
                        String add2 = resultat.getString("Motpass");

                        labelError.setText("User: " + add1 + "  Mot de passe: " + add2);

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);

                }
            }

        }

    }

    @FXML
    private void confimernom(KeyEvent event) {
        String P = "[a-z A-Z é è à ç ]{0,50}$";
        Pattern patt = Pattern.compile(P);
        Matcher mat = patt.matcher(confimernom.getText());
        if (!mat.matches()) {
            imgnome.setVisible(true);
            nbrincorect = 1;

        } else {
            imgnome.setVisible(false);
            nbrincorect = 0;
        }
    }

    @FXML
    private void confirmerprenom(KeyEvent event) {
        String P = "[a-zA-Z é è à ç ]{0,50}$";
        Pattern patt = Pattern.compile(P);
        Matcher mat = patt.matcher(confirmerprenom.getText());
        if (!mat.matches()) {
            imgpre.setVisible(true);
            nbrincorect = 1;

        } else {
            imgpre.setVisible(false);
            nbrincorect = 0;

        }
    }

    @FXML
    private void confirmerntlfn(KeyEvent event) {
        String P = "0[4-7][0-9]{0,8}$";
        Pattern patt = Pattern.compile(P);
        Matcher mat = patt.matcher(confirmerntlfn.getText());
        if (!mat.matches()) {
            imgtlfn.setVisible(true);
            nbrincorect = 1;
        } else {
            imgtlfn.setVisible(false);
            nbrincorect = 0;

        }
    }

}
