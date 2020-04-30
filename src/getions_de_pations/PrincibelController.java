/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getions_de_pations;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author madridista
 */
public class PrincibelController implements Initializable {

    @FXML
    private Label label;
    public static Label labelprin;

    @FXML
    private JFXButton Accueil;
    @FXML
    private JFXButton Patient;
    @FXML
    private JFXButton SuivreP;
    public static JFXButton suivrep;

    @FXML
    private JFXButton Message;
    @FXML
    private JFXButton Comptabilite;
    public static JFXButton comptabilite;

    @FXML
    private JFXButton Historique;
    public static JFXButton historique;
    @FXML
    private AnchorPane Anchoraccueil;
    @FXML
    private AnchorPane AnchorPations;
    @FXML
    private AnchorPane Anchorsuivre;
    private AnchorPane Anchormessage;
    @FXML
    private AnchorPane Anchorcomptabilite;
    @FXML
    private AnchorPane Anchorhistorique;
    @FXML
    private HBox hboxpanehome;
    @FXML
    private ToggleGroup sexe;
    @FXML
    private JFXTextArea addrespation;
    @FXML
    private AnchorPane AnchormessageDoc;
    @FXML
    private AnchorPane AnchormessageAdmin;
    @FXML
    private AnchorPane paneldeCompte;
    @FXML
    private JFXTextArea addrespation1;
    @FXML
    private AnchorPane AnchorPaneAjoutPations;
    @FXML
    private JFXButton BtnTAblePations;
    @FXML
    private AnchorPane PanelSupPations;
    @FXML
    private AnchorPane AnchorPaneTablePations;
    @FXML
    private JFXButton btnNeveau;
    @FXML
    private JFXButton BtnsupP;
    @FXML
    private AnchorPane PaneSAvePations;
    @FXML
    private AnchorPane PaneModPations;
    @FXML
    private AnchorPane AnchorPaneAjouteNVsuire;
    @FXML
    private AnchorPane PaneSvSuivre;
    @FXML
    private AnchorPane PanelModsuivre;
    @FXML
    private AnchorPane PanelSupSuivre;
    @FXML
    private AnchorPane PanelNVRendiveau;
    @FXML
    private AnchorPane AnchorPaneTableSwuivre;
    @FXML
    private JFXButton BtnNVswuivre;
    @FXML
    private JFXButton BtnSupSwuivre;
    @FXML
    private JFXButton BtnTableSuivre;
    @FXML
    private JFXTextField JtextNomeP;
    @FXML
    private JFXTextField jtexPrenomP;
    @FXML
    private JFXDatePicker JtextDateP;
    @FXML
    private JFXTextField jetxtTelephonP;
    @FXML
    private Label LabelLadate;
    @FXML
    private Label labelerrorformat;
    @FXML
    private Label LabelIdPations;
    @FXML
    private JFXRadioButton HomeP;
    @FXML
    private JFXRadioButton femmeP;

    ///////////////////////////////////////
    /*
    Declaratin ta3 livarable liana rani ndiclarihom
     */
    private String sex;
    private String Actess;
    private int nbrP = 0;
    int nbrincorectPN;
    int nbrincorectPP;
    int nbrincorectPT;
    int nbrincorectPNS;
    int nbrincorectPPS;
    int nbrincorectPTS;
    int nbrnot;
//////////////////////////////////////
    @FXML
    private Label LabelNbrP;
    @FXML
    private Label LabelNbrP1;
    @FXML
    private JFXTextField JtxtFNsuivre;
    @FXML
    private JFXTextField JtextFPsuivre;
    @FXML
    private JFXTextField JtxtFtesuivre;
    @FXML
    private Label LabelIdsuivreP;
    @FXML
    private JFXDatePicker JfxDateNicence;
    @FXML
    private JFXComboBox<String> comboxActes;
    @FXML
    private JFXDatePicker JfxDateNVRendi;
    ObservableList<String> ListeActes = FXCollections.observableArrayList("Soin", "Prothèses", "Parodontologie", "ODF");
    @FXML
    private JFXCheckBox checboxAddrendiveau;
    @FXML
    private ImageView ImageNotifi;
    public static ImageView imageNot;
    @FXML
    private Label labelNbrNot;
    public static Label lblnbrnot;

    @FXML
    private Label LabelIdmsgDoc;

    @FXML
    private JFXTextArea Textariamsgad;

    @FXML
    private Label LabelIDMDGADD;

    @FXML
    private JFXTextArea textAiriaMsgADoc;

    /* TABLE DE PATIONS */
    @FXML
    private TableView<Pations> TablePations;
    @FXML
    private TableColumn<Pations, String> CIDP;
    @FXML
    private TableColumn<Pations, String> CNomeP;
    @FXML
    private TableColumn<Pations, String> CPrenomP;
    @FXML
    private TableColumn<Pations, String> CDateNaisanceP;
    @FXML
    private TableColumn<Pations, String> CDateAjoP;
    @FXML
    private TableColumn<Pations, String> CSexeP;
    @FXML
    private TableColumn<Pations, String> CTelephonP;
    @FXML
    private TableColumn<Pations, String> CAdresseP;
    private ObservableList<Pations> data1;

    /* TABLE DE SUIVRE DE PATIONS */
    @FXML
    private TableView<SuivrePations> TableSuivre;
    @FXML
    private TableColumn<SuivrePations, String> CIdSp;
    @FXML
    private TableColumn<SuivrePations, String> CNomeSP;
    @FXML
    private TableColumn<SuivrePations, String> CPrenomSP;
    @FXML
    private TableColumn<SuivrePations, String> CDateSP;
    @FXML
    private TableColumn<SuivrePations, String> CDAteAjoouterSP;
    @FXML
    private TableColumn<SuivrePations, String> CtelSP;
    @FXML
    private TableColumn<SuivrePations, String> CActesSP;
    @FXML
    private TableColumn<SuivrePations, String> CAdressSP;
    private ObservableList<SuivrePations> data2;

    /* TABLE DE RENDIVEAU */
    @FXML
    private TableView<RendiveauPations> TableRendiveau;
    @FXML
    private TableColumn<RendiveauPations, String> CIdRP;
    @FXML
    private TableColumn<RendiveauPations, String> CNomeRP;
    @FXML
    private TableColumn<RendiveauPations, String> CPrenomRP;
    @FXML
    private TableColumn<RendiveauPations, String> CDateREndiceauRP;
    private ObservableList<RendiveauPations> data3;
    @FXML
    private TableView<Historique> TableHistorique;
    @FXML
    private TableColumn<Historique, String> CIdHistorique;
    @FXML
    private TableColumn<Historique, String> CDateHistorique;
    @FXML
    private TableColumn<Historique, String> CActionsHistorique;

    private ObservableList<Historique> data4;

    @FXML
    private TableView<Messenger> TableMSgDoc;
    @FXML
    private TableColumn<Messenger, String> CIMD;
    @FXML
    private TableColumn<Messenger, String> CDateMD;
    @FXML
    private TableColumn<Messenger, String> CMD;
    private ObservableList<Messenger> data5;

    @FXML
    private TableView<Messenger> TAbleMsgAd;
    @FXML
    private TableColumn<Messenger, String> CIdM;
    @FXML
    private TableColumn<Messenger, String> CMSg;
    @FXML
    private TableColumn<Messenger, String> CMSGG;
    private ObservableList<Messenger> data6;

    @FXML
    private TableView<Home> TableAttendre;
    @FXML
    private TableColumn<Home, String> CIdTA;
    @FXML
    private TableColumn<Home, String> CNomTA;
    @FXML
    private TableColumn<Home, String> CPrenomTA;
    @FXML
    private TableColumn<Home, String> CTleTA;
    private ObservableList<Home> data7;

    @FXML
    private TableView<Home> TableLifateau;
    @FXML
    private TableColumn<Home, String> CIdTF;
    @FXML
    private TableColumn<Home, String> CNTF;
    @FXML
    private TableColumn<Home, String> CPTF;
    @FXML
    private TableColumn<Home, String> CTTF;
    private ObservableList<Home> data8;
    @FXML
    private Label LabelNomeP;
    @FXML
    private Label LabelPrenomP;
    @FXML
    private Label LbelDateNP;
    @FXML
    private Label LabelTelephonsP;
    @FXML
    private Label LAbelSexP;
    @FXML
    private Label LabelAdresseP;
    @FXML
    private Label LabelNomeP1;
    @FXML
    private Label LabelPrenomP1;
    @FXML
    private Label LbelDateNP1;
    @FXML
    private Label LabelTelephonsP1;
    @FXML
    private Label LabelAdresseP1;
    @FXML
    private Label LabelAdresseP11;
    @FXML
    private Label labelIDPAT;
    @FXML
    private Label LNPAT;
    @FXML
    private Label NTLLABEL;
    @FXML
    private Label LBKTLL;
    @FXML
    private Text TExtAficherMsAS;
    @FXML
    private Text TEXTAIRYAMSGDOC;

    @FXML
    private Label labbelNBRATT;
    @FXML
    private Label LBELLIFAT;
    @FXML
    private ImageView imgtlfn;
    @FXML
    private ImageView imgtlfn1;
    @FXML
    private ImageView imgtlfn11;
    @FXML
    private ImageView imgtlfn2;
    @FXML
    private ImageView imgtlfn21;
    @FXML
    private ImageView imgtlfn211;
    @FXML
    private ImageView imgtlfn111;
    @FXML
    private ImageView imgtlfn212;
    @FXML
    private AnchorPane PanelModGETIONER;
    @FXML
    private JFXButton BtnModcompt;
    private Label Idcompt;
    @FXML
    private JFXTextField JtxComN;
    @FXML
    private JFXTextField JtxComP;
    @FXML
    private JFXDatePicker JtxComD;
    @FXML
    private JFXTextField JtxComT;
    @FXML
    private JFXTextField JtxComA;
    @FXML
    private JFXPasswordField jtextFMOT;
    @FXML
    private Label labelcomptmod;
    @FXML
    private Label labelmodism;
    @FXML
    private Label labelmodtele;
    @FXML
    private Label labelmoddate;
    private Label labelmodadres;
    @FXML
    private Label Idcomptmmmm;
    @FXML
    private Label LabelAddresss;
    @FXML
    private TextField CHerchGlobel;
    @FXML
    private AnchorPane PanelAjouterV;
    @FXML
    private JFXTextField Totale;
    @FXML
    private JFXTextField Versment;
    @FXML
    private JFXTextField NbrVersment;
    
    
    
    @FXML
    private TableView<Payment> TablePayment;
    @FXML
    private TableColumn<Payment, String> CNPayment;
    @FXML
    private TableColumn<Payment, String> CnomePayment;
    @FXML
    private TableColumn<Payment, String> CPrenomPayment;
    @FXML
    private TableColumn<Payment, String> CNVersment;
    @FXML
    private TableColumn<Payment, String> CVersment;
    @FXML
    private TableColumn<Payment, String> Ctotele;
    
    private ObservableList<Payment> data9;
    @FXML
    private JFXTextField JtextNomeP1;
    @FXML
    private Label labellikhrajTOtal;
    @FXML
    private Label labelTotale;
    @FXML
    private Label LabelTotale;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        ////// ANIMATION DE HOME  ///////////////////
        /*TranslateTransition t = new TranslateTransition();
        t.setDuration(Duration.seconds(2));
        t.setAutoReverse(true);
        t.setCycleCount(1);
        t.setToY(265);
        //t.setNode(andlogin);
        t.setNode(hboxpanehome);

        t.play();*/
////////////////////////////////////////////////////////////////////////////////////////////////////////
        labelprin = label;
        suivrep = SuivreP;
        comptabilite = Comptabilite;
        historique = Historique;
        imageNot = ImageNotifi;
        lblnbrnot = labelNbrNot;

        comboxActes.setItems(ListeActes);

        /* DECLARATIONS DES FONCTIONS */
        TablePations();
        TableSuivrePations();
        TableRendiveauPations();
        TableHistorique();
        TableAdmin();
        TableDocter();
        TableHomLifateau();
        TableHomAtendre();
        TablePayment();
        afichernbr();
        achernbrAtt();
        Date();
    }

    public void Date() {
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault());
        LabelLadate.setText("" + df.format(date) + "");
    }

    @FXML
    private void Accueil(MouseEvent event) {
        TableHomLifateau();
        TableHomAtendre();
        Anchoraccueil.setVisible(true);
        AnchorPations.setVisible(false);
        Anchorsuivre.setVisible(false);
        AnchormessageDoc.setVisible(false);
        AnchormessageAdmin.setVisible(false);
        Anchorcomptabilite.setVisible(false);
        Anchorhistorique.setVisible(false);
        PanelModGETIONER.setVisible(false);
    }

    @FXML
    private void Patient(MouseEvent event) {
        Anchoraccueil.setVisible(false);
        AnchorPations.setVisible(true);
        Anchorsuivre.setVisible(false);
        AnchormessageDoc.setVisible(false);
        AnchormessageAdmin.setVisible(false);
        Anchorcomptabilite.setVisible(false);
        Anchorhistorique.setVisible(false);
        PanelModGETIONER.setVisible(false);
    }

    @FXML
    private void SuivreP(MouseEvent event) {
        Anchoraccueil.setVisible(false);
        AnchorPations.setVisible(false);
        Anchorsuivre.setVisible(true);
        AnchormessageDoc.setVisible(false);
        AnchormessageAdmin.setVisible(false);
        Anchorcomptabilite.setVisible(false);
        Anchorhistorique.setVisible(false);
        PanelModGETIONER.setVisible(false);
    }

    @FXML
    private void Message(MouseEvent event) {
        Anchoraccueil.setVisible(false);
        AnchorPations.setVisible(false);
        Anchorsuivre.setVisible(false);
        Anchorcomptabilite.setVisible(false);
        Anchorhistorique.setVisible(false);
        PanelModGETIONER.setVisible(false);

        if (labelprin.getText().equals("Docter")) {
            //TableAdmin();

            AnchormessageDoc.setVisible(true);
            AnchormessageAdmin.setVisible(false);
        } else {
            if (labelprin.getText().equals("Assistant")) {

                //TableDocter();
                AnchormessageAdmin.setVisible(true);
                AnchormessageDoc.setVisible(false);
            }
        }

    }

    @FXML
    private void Comptabilite(MouseEvent event) {
        Anchoraccueil.setVisible(false);
        AnchorPations.setVisible(false);
        Anchorsuivre.setVisible(false);
        AnchormessageDoc.setVisible(false);
        AnchormessageAdmin.setVisible(false);
        Anchorcomptabilite.setVisible(true);
        Anchorhistorique.setVisible(false);
        PanelModGETIONER.setVisible(false);
    }

    @FXML
    private void Historique(MouseEvent event) {
        Anchoraccueil.setVisible(false);
        AnchorPations.setVisible(false);
        Anchorsuivre.setVisible(false);
        AnchormessageDoc.setVisible(false);
        AnchormessageAdmin.setVisible(false);
        Anchorcomptabilite.setVisible(false);
        Anchorhistorique.setVisible(true);
        PanelModGETIONER.setVisible(false);

        TableHistorique();

    }

    @FXML
    private void BtnAjoutPation(MouseEvent event) {
        PaneSAvePations.setVisible(true);
    }

    @FXML
    private void BtnModifierPation(MouseEvent event) {
        PaneModPations.setVisible(true);
    }

    @FXML
    private void BtnActuialiserPation(MouseEvent event) {
        /*
        
         */
        JtextNomeP.setText("");
        jtexPrenomP.setText("");
        JtextDateP.getEditor().setText("");
        jetxtTelephonP.setText("");
        addrespation.setText("");

        LabelIdPations.setText("");
        LabelNomeP.setText("");
        LabelPrenomP.setText("");
        LbelDateNP.setText("");
        LabelTelephonsP.setText("");
        LAbelSexP.setText("");
        LabelAdresseP.setText("");
        HomeP.setSelected(false);
        femmeP.setSelected(false);
        imgtlfn.setVisible(false);
        imgtlfn1.setVisible(false);
        imgtlfn11.setVisible(false);
    }

    @FXML
    private void BtnTAblePations(MouseEvent event) {
        TablePations();

        AnchorPaneAjoutPations.setVisible(false);
        BtnTAblePations.setVisible(false);
        AnchorPaneTablePations.setVisible(true);
        btnNeveau.setVisible(true);
        BtnsupP.setVisible(true);
    }

    @FXML
    private void AnullerSupPations(MouseEvent event) {
        PanelSupPations.setVisible(false);
    }

    @FXML
    private void btnNeveau(MouseEvent event) {
        AnchorPaneAjoutPations.setVisible(true);
        BtnTAblePations.setVisible(true);
        AnchorPaneTablePations.setVisible(false);
        btnNeveau.setVisible(false);
        BtnsupP.setVisible(false);
    }

    @FXML
    private void BtnsupP(MouseEvent event) {
        PanelSupPations.setVisible(true);
    }

    @FXML
    private void BtnAnullsvPation(MouseEvent event) {
        PaneSAvePations.setVisible(false);
    }

    @FXML
    private void BtnAnullimodPations(MouseEvent event) {
        PaneModPations.setVisible(false);
    }

    @FXML
    private void BtnSaveSuivre(MouseEvent event) {
        PaneSvSuivre.setVisible(true);
    }

    @FXML
    private void BtnModsuivr(MouseEvent event) {
        PanelModsuivre.setVisible(true);
    }

    @FXML
    private void BtnActuialiserSuivre(MouseEvent event) {

        JtxtFNsuivre.setText("");
        JtextFPsuivre.setText("");
        JfxDateNicence.getEditor().setText("");
        JtxtFtesuivre.setText("");
        addrespation1.setText("");
        comboxActes.setValue("");

        LabelIdsuivreP.setText("");
        LabelNomeP1.setText("");
        LabelPrenomP1.setText("");
        LbelDateNP1.setText("");
        LabelTelephonsP1.setText("");
        LabelAdresseP11.setText("");
        LabelAdresseP1.setText("");

        checboxAddrendiveau.setSelected(false);
        JfxDateNVRendi.getEditor().setText("");

    }

    @FXML
    private void BtnTableSuivre(MouseEvent event) {

        TableSuivrePations();
        AnchorPaneAjouteNVsuire.setVisible(false);
        BtnTableSuivre.setVisible(false);
        AnchorPaneTableSwuivre.setVisible(true);
        BtnNVswuivre.setVisible(true);
        BtnSupSwuivre.setVisible(true);
    }

    @FXML
    private void BtnAnullisvsuivre(MouseEvent event) {
        PaneSvSuivre.setVisible(false);
    }

    @FXML
    private void BtnAnulliModSuivre(MouseEvent event) {
        PanelModsuivre.setVisible(false);
    }

    @FXML
    private void BtnAnulliSupsuivre(MouseEvent event) {
        PanelSupSuivre.setVisible(false);
    }

    @FXML
    private void Anullerrendiveau(MouseEvent event) {
        PanelNVRendiveau.setVisible(false);
        checboxAddrendiveau.setSelected(false);
    }

    @FXML
    private void BtnNVswuivre(MouseEvent event) {
        AnchorPaneAjouteNVsuire.setVisible(true);
        BtnTableSuivre.setVisible(true);
        AnchorPaneTableSwuivre.setVisible(false);
        BtnNVswuivre.setVisible(false);
        BtnSupSwuivre.setVisible(false);

    }

    @FXML
    private void BtnSupSwuivre(MouseEvent event) {
        PanelSupSuivre.setVisible(true);
    }

    @FXML
    private void checboxAddrendiveau(MouseEvent event) {
        PanelNVRendiveau.setVisible(true);
    }

    @FXML
    private void BtnAjoutRend(MouseEvent event) {
        String A1 = "Ajouter un neveau rendiveau ";
        if (nbrincorectPN == 0 && nbrincorectPP == 0 && nbrincorectPT == 0) {
            try {
                Connection cnx = null;
                ResultSet resultat = null;
                cnx = connexion.connexionDB();

                String SQL2 = "INSERT into Attendre(Nome,Prenom,Tlephone) values (?,?,?)";
                PreparedStatement pst = cnx.prepareStatement(SQL2);

                pst.setString(1, JtextNomeP.getText());
                pst.setString(2, jtexPrenomP.getText());
                pst.setString(3, jetxtTelephonP.getText());
                pst.execute();
                pst.close();

            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                Connection cnx = null;
                ResultSet resultat = null;
                cnx = connexion.connexionDB();

                String SQL2 = "INSERT into historique(Date_ajouter,Actions) values (?,?)";
                PreparedStatement pst = cnx.prepareStatement(SQL2);

                pst.setString(1, LabelLadate.getText());
                pst.setString(2, A1);

                pst.execute();
                pst.close();

            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            nbrnot++;
            lblnbrnot.setText("+" + nbrnot);

            TableHistorique();

            TableHomAtendre();
            achernbrAtt();

        } else {

        }

    }

    @FXML
    private void JtextNomePa(KeyEvent event) {
        String P = "[a-zA-Z é è à ç ]{1,50}$";
        Pattern patt = Pattern.compile(P);
        Matcher mat = patt.matcher(JtextNomeP.getText());
        if (!mat.matches()) {

            nbrincorectPN = 1;
            imgtlfn.setVisible(true);

        } else {

            nbrincorectPN = 0;
            imgtlfn.setVisible(false);

        }

    }

    @FXML
    private void JtextPrenomPa(KeyEvent event) {

        String P1 = "[a-zA-Z é è à ç ]{1,50}$";
        Pattern patt1 = Pattern.compile(P1);
        Matcher mat1 = patt1.matcher(jtexPrenomP.getText());
        if (!mat1.matches()) {

            nbrincorectPP = 1;
            imgtlfn1.setVisible(true);

        } else {

            nbrincorectPP = 0;
            imgtlfn1.setVisible(false);

        }
    }

    @FXML
    private void JtextTelephonPa(KeyEvent event) {

        String P2 = "0[4-7][0-9]{0,9}$";
        Pattern patt2 = Pattern.compile(P2);
        Matcher mat2 = patt2.matcher(jetxtTelephonP.getText());
        if (!mat2.matches()) {

            nbrincorectPT = 1;
            imgtlfn11.setVisible(true);
        } else {

            nbrincorectPT = 0;
            imgtlfn11.setVisible(false);
        }
    }

    @FXML
    private void BtnOKsavePations(MouseEvent event) {
        String A1 = "Ajouter un nevail pations";
        if (nbrincorectPN == 0 && nbrincorectPP == 0 && nbrincorectPT == 0) {
            if (HomeP.isSelected() || femmeP.isSelected()) {
                try {
                    Connection cnx = null;
                    ResultSet resultat = null;
                    cnx = connexion.connexionDB();

                    String SQL2 = "INSERT into Passions(Nome,Prenom,Date_nai,Date_ajouter,Tlephone,Sexe,Adresse) values (?,?,?,?,?,?,?)";
                    PreparedStatement pst = cnx.prepareStatement(SQL2);

                    pst.setString(1, JtextNomeP.getText());
                    pst.setString(2, jtexPrenomP.getText());
                    pst.setString(3, JtextDateP.getEditor().getText());
                    pst.setString(4, LabelLadate.getText());
                    pst.setString(5, jetxtTelephonP.getText());

                    pst.setString(6, sex);

                    pst.setString(7, addrespation.getText());

                    pst.execute();
                    pst.close();

                } catch (SQLException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
                TablePations();
                try {
                    Connection cnx = null;
                    ResultSet resultat = null;
                    cnx = connexion.connexionDB();

                    String SQL2 = "INSERT into historique(Date_ajouter,Actions) values (?,?)";
                    PreparedStatement pst = cnx.prepareStatement(SQL2);

                    pst.setString(1, LabelLadate.getText());
                    pst.setString(2, A1);

                    pst.execute();
                    pst.close();

                } catch (SQLException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
                nbrnot++;
                lblnbrnot.setText("+" + nbrnot);

                TablePations();

                TableHistorique();

                afichernbr();
                imgtlfn111.setVisible(false);
            } else {
                imgtlfn111.setVisible(true);
            }
        } else {

        }

        PaneSAvePations.setVisible(false);
    }

    @FXML
    private void BtnOkModP(MouseEvent event) {
        String A1 = "Modifier pations";
        if (nbrincorectPN == 0 && nbrincorectPP == 0 && nbrincorectPT == 0) {
            if (HomeP.isSelected() || femmeP.isSelected()) {
                try {
                    Connection cnx = null;
                    ResultSet resultat = null;
                    cnx = connexion.connexionDB();

                    String SQL2 = "UPDATE Passions SET Nome = ?,Prenom =?,Date_nai = ?,Date_ajouter = ?,Tlephone = ?,Sexe =? ,Adresse =? WHERE Id=? ";
                    PreparedStatement pst = cnx.prepareStatement(SQL2);

                    pst.setString(8, LabelIdPations.getText());
                    pst.setString(1, JtextNomeP.getText());
                    pst.setString(2, jtexPrenomP.getText());
                    pst.setString(3, JtextDateP.getEditor().getText());
                    pst.setString(4, LabelLadate.getText());
                    pst.setString(5, jetxtTelephonP.getText());

                    pst.setString(6, sex);

                    pst.setString(7, addrespation.getText());

                    pst.execute();
                    pst.close();

                } catch (SQLException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    Connection cnx = null;
                    ResultSet resultat = null;
                    cnx = connexion.connexionDB();

                    String SQL2 = "INSERT into historique(Date_ajouter,Actions) values (?,?)";
                    PreparedStatement pst = cnx.prepareStatement(SQL2);

                    pst.setString(1, LabelLadate.getText());
                    pst.setString(2, A1);

                    pst.execute();
                    pst.close();

                } catch (SQLException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
                nbrnot++;
                lblnbrnot.setText("+" + nbrnot);

                TablePations();

                TableHistorique();
                imgtlfn111.setVisible(false);
            } else {
                imgtlfn111.setVisible(true);
            }
        } else {

        }
        PaneModPations.setVisible(false);

    }

    @FXML
    private void HomeP(ActionEvent event) {
        sex = HomeP.getText();
    }

    @FXML
    private void femmeP(ActionEvent event) {
        sex = femmeP.getText();
    }

    @FXML
    private void BtnOkSupP(MouseEvent event) {
        String A1 = "Suprimer un pations";
        try {
            Connection cnx = null;
            ResultSet resultat = null;
            cnx = connexion.connexionDB();
            /*PreparedStatement prepare = null;*/

            String SQL2 = "DELETE FROM Passions WHERE  Id=?";

            PreparedStatement pst = cnx.prepareStatement(SQL2);

            pst.setString(1, LabelIdPations.getText());

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        PanelSupPations.setVisible(false);
        try {
            Connection cnx = null;
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            String SQL2 = "INSERT into historique(Date_ajouter,Actions) values (?,?)";
            PreparedStatement pst = cnx.prepareStatement(SQL2);

            pst.setString(1, LabelLadate.getText());
            pst.setString(2, A1);

            pst.execute();
            pst.close();

        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        nbrnot++;
        lblnbrnot.setText("+" + nbrnot);

        TablePations();

        TableHistorique();

        afichernbr();

    }

    /*
        ***************** PAGE HOME ****************
    
     */
    @FXML
    private void BtnOkKmalnhar(MouseEvent event) {
        try {
            Connection cnx = null;
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            String SQL2 = "DELETE FROM Lifateau";

            PreparedStatement pst = cnx.prepareStatement(SQL2);

            //pst.setString(1, idcredi.getText());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

        TableHomLifateau();
        Afichernbfat();

    }

    /* *************** TRATMENT DE PATIONS  ***************    */
    @FXML
    private void JtxtFNsuivre(KeyEvent event) {
        String P = "[a-zA-Z é è à ç ]{1,50}$";
        Pattern patt = Pattern.compile(P);
        Matcher mat = patt.matcher(JtxtFNsuivre.getText());
        if (!mat.matches()) {

            nbrincorectPNS = 1;
            imgtlfn2.setVisible(true);
        } else {

            nbrincorectPNS = 0;
            imgtlfn2.setVisible(false);
        }
    }

    @FXML
    private void JtextFPsuivre(KeyEvent event) {
        String P = "[a-zA-Z é è à ç ]{1,50}$";
        Pattern patt = Pattern.compile(P);
        Matcher mat = patt.matcher(JtextFPsuivre.getText());
        if (!mat.matches()) {

            nbrincorectPPS = 1;
            imgtlfn21.setVisible(true);
        } else {

            nbrincorectPPS = 0;
            imgtlfn21.setVisible(false);
        }
    }

    @FXML
    private void JtxtFtesuivre(KeyEvent event) {
        String P2 = "0[4-7][0-9]{0,9}$";
        Pattern patt2 = Pattern.compile(P2);
        Matcher mat2 = patt2.matcher(JtxtFtesuivre.getText());
        if (!mat2.matches()) {

            nbrincorectPTS = 1;
            imgtlfn211.setVisible(true);

        } else {

            nbrincorectPTS = 0;
            imgtlfn211.setVisible(false);

        }
    }

    @FXML
    private void BtnOksvsuivre(MouseEvent event) {
        if (nbrincorectPNS == 0 && nbrincorectPPS == 0 && nbrincorectPTS == 0) {

            try {
                Connection cnx = null;
                ResultSet resultat = null;
                cnx = connexion.connexionDB();

                String SQL2 = "INSERT into SuivrePations(Nome,Prenom,Date_nai,Date_ajouter,Tlephone,Actes,Adresse) values (?,?,?,?,?,?,?)";
                PreparedStatement pst = cnx.prepareStatement(SQL2);

                pst.setString(1, JtxtFNsuivre.getText());
                pst.setString(2, JtextFPsuivre.getText());
                pst.setString(3, JfxDateNicence.getEditor().getText());
                pst.setString(4, LabelLadate.getText());
                pst.setString(5, JtxtFtesuivre.getText());

                pst.setString(6, Actess);
                pst.setString(7, addrespation1.getText());

                pst.execute();
                pst.close();

            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            TableSuivrePations();

        } else {

        }
        PaneSvSuivre.setVisible(false);
        PanelAjouterV.setVisible(true);
    }

    @FXML
    private void BtnOKModsuivre(MouseEvent event) {
        if (nbrincorectPNS == 0 && nbrincorectPPS == 0 && nbrincorectPTS == 0) {

            try {
                Connection cnx = null;
                ResultSet resultat = null;
                cnx = connexion.connexionDB();

                String SQL2 = "UPDATE SuivrePations SET Nome = ?,Prenom =?,Date_nai = ?,Date_ajouter = ?,Tlephone = ?,Actes =? , Adresse =?  WHERE Id=? ";
                PreparedStatement pst = cnx.prepareStatement(SQL2);

                pst.setString(8, LabelIdsuivreP.getText());
                pst.setString(1, JtxtFNsuivre.getText());
                pst.setString(2, JtextFPsuivre.getText());
                pst.setString(3, JfxDateNicence.getEditor().getText());
                pst.setString(4, LabelLadate.getText());
                pst.setString(5, JtxtFtesuivre.getText());

                pst.setString(6, Actess);
                pst.setString(7, addrespation1.getText());

                pst.execute();
                pst.close();

            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            TableSuivrePations();

            PanelModsuivre.setVisible(false);
        }
    }

    @FXML
    private void BtnOksaveRendi(MouseEvent event) throws ParseException {

        SimpleDateFormat jtextDAte = new SimpleDateFormat("dd/MM/yyyy");
        //Date pri = jtextDAte.parse(JfxDateNVRendi.getEditor().getText());
        Date dd = new Date();
        //DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault());

        JfxDateNVRendi.setPromptText("dd/MM/yyyy");
        //JfxDateNVRendi.setValue(LocalDate.parse(defaultDate.toString(), DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        Date pri = jtextDAte.parse(JfxDateNVRendi.getEditor().getText());
        if (nbrincorectPNS == 0 && nbrincorectPPS == 0 && nbrincorectPTS == 0) {
            if (!dd.equals(pri)) {
                try {
                    Connection cnx = null;
                    ResultSet resultat = null;
                    cnx = connexion.connexionDB();

                    String SQL2 = "INSERT into Renouveau(Nome,Prenom,Date_rend) values (?,?,?)";
                    PreparedStatement pst = cnx.prepareStatement(SQL2);

                    pst.setString(1, JtxtFNsuivre.getText());
                    pst.setString(2, JtextFPsuivre.getText());
                    pst.setString(3, JfxDateNVRendi.getEditor().getText());

                    pst.execute();
                    pst.close();

                } catch (SQLException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.print(pri);
                System.out.print(dd);

                TableRendiveauPations();
            } else {
                System.out.println("dfhdk");
            }

        } else {
            PanelNVRendiveau.setVisible(false);
        }
        JfxDateNVRendi.getEditor().setText("");
        checboxAddrendiveau.setSelected(false);
        PanelNVRendiveau.setVisible(false);
        //PanelAjouterV.setVisible();
    }

    @FXML
    private void BtnOkSupsuivre(MouseEvent event) {

        if (TableSuivre.isVisible()) {

            try {
                Connection cnx = null;
                ResultSet resultat = null;
                cnx = connexion.connexionDB();

                String SQL2 = "DELETE FROM SuivrePations WHERE  Id=?";

                PreparedStatement pst = cnx.prepareStatement(SQL2);

                pst.setString(1, LabelIdsuivreP.getText());
                pst.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }

            TableSuivrePations();
            //PaneSAvePations.setVisible(false);
        } else {
            if (TableRendiveau.isVisible()) {
                try {
                    Connection cnx = null;
                    ResultSet resultat = null;
                    cnx = connexion.connexionDB();

                    String SQL2 = "DELETE FROM Renouveau WHERE  Id=?";

                    PreparedStatement pst = cnx.prepareStatement(SQL2);

                    pst.setString(1, LabelIdsuivreP.getText());
                    pst.executeUpdate();

                } catch (SQLException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }

                TableRendiveauPations();

            }
        }
        PanelSupSuivre.setVisible(false);

    }

    @FXML
    private void comboboxaficher(ActionEvent event) {
        Actess = comboxActes.getSelectionModel().getSelectedItem();
    }
    int nbrMsgAd = 0;

    @FXML
    private void BtnEnvMsgAadmin(MouseEvent event) {

        try {
            Connection cnx = null;
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            String SQL2 = "INSERT into MessageAdmin(Date_ajouter,Msg) values (?,?)";
            PreparedStatement pst = cnx.prepareStatement(SQL2);

            pst.setString(1, LabelLadate.getText());
            pst.setString(2, Textariamsgad.getText());

            pst.execute();
            pst.close();

        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Textariamsgad.setText("");

        //TableDocter();
    }

    @FXML
    private void BtnSupMsg(MouseEvent event) {
        try {
            Connection cnx = null;
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            String SQL2 = "DELETE FROM MessageAdmin WHERE  Id=?";

            PreparedStatement pst = cnx.prepareStatement(SQL2);

            pst.setString(1, LabelIdmsgDoc.getText());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        //TableAdmin();
    }
    int nbrd = 0;

    @FXML
    private void BtnEnvMgADoc(MouseEvent event) {

        try {
            Connection cnx = null;
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            String SQL2 = "INSERT into MsgDOc(Date_ajouter,Msg) values (?,?)";
            PreparedStatement pst = cnx.prepareStatement(SQL2);

            pst.setString(1, LabelLadate.getText());
            pst.setString(2, textAiriaMsgADoc.getText());

            pst.execute();
            pst.close();

        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        textAiriaMsgADoc.setText("");

        //TableDocter();
    }

    @FXML
    private void BtnSupMsgAdoc(MouseEvent event) {
        try {
            Connection cnx = null;
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            String SQL2 = "DELETE FROM MsgDOc WHERE  Id=?";

            PreparedStatement pst = cnx.prepareStatement(SQL2);

            pst.setString(1, LabelIDMDGADD.getText());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

        //TableDocter();
    }

    ////////////////////////////// AFICHAGE DES TABLES /////////////////////////////

    /*   TABLE DE pATIONS    */
    public void TablePations() {
        try {
            Connection cnx = null;
            data1 = FXCollections.observableArrayList();
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            ResultSet rs = null;
            String SQL2 = "SELECT *  FROM Passions";
            PreparedStatement pst = cnx.prepareStatement(SQL2);
            rs = pst.executeQuery();
            while (rs.next()) {
                data1.add(new Pations(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        CIDP.setCellValueFactory(new PropertyValueFactory<>("Id"));
        CNomeP.setCellValueFactory(new PropertyValueFactory<>("Nome"));
        CPrenomP.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
        CDateNaisanceP.setCellValueFactory(new PropertyValueFactory<>("Date_nai"));
        CDateAjoP.setCellValueFactory(new PropertyValueFactory<>("Date_ajouter"));
        CSexeP.setCellValueFactory(new PropertyValueFactory<>("Sexe"));
        CTelephonP.setCellValueFactory(new PropertyValueFactory<>("Tlephone"));
        CAdresseP.setCellValueFactory(new PropertyValueFactory<>("Adresse"));

        TablePations.setItems(null);
        TablePations.setItems(data1);

    }

    /*   TABLE DE SUIVRE DE PATIONS    */
    public void TableSuivrePations() {
        try {
            Connection cnx = null;
            data2 = FXCollections.observableArrayList();
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            ResultSet rs = null;
            String SQL2 = "SELECT *  FROM SuivrePations";
            PreparedStatement pst = cnx.prepareStatement(SQL2);
            rs = pst.executeQuery();
            while (rs.next()) {
                data2.add(new SuivrePations(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        CIdSp.setCellValueFactory(new PropertyValueFactory<>("Id"));
        CNomeSP.setCellValueFactory(new PropertyValueFactory<>("Nome"));
        CPrenomSP.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
        CDateSP.setCellValueFactory(new PropertyValueFactory<>("Date_nai"));
        CDAteAjoouterSP.setCellValueFactory(new PropertyValueFactory<>("Date_ajouter"));
        CtelSP.setCellValueFactory(new PropertyValueFactory<>("Tlephone"));
        CActesSP.setCellValueFactory(new PropertyValueFactory<>("Actes"));
        CAdressSP.setCellValueFactory(new PropertyValueFactory<>("Adresse"));

        TableSuivre.setItems(null);
        TableSuivre.setItems(data2);

    }

    /*   TABLE DE RENDIVEAU DE PATIONS    */
    public void TableRendiveauPations() {
        try {
            Connection cnx = null;
            data3 = FXCollections.observableArrayList();
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            ResultSet rs = null;
            String SQL2 = "SELECT *  FROM Renouveau";
            PreparedStatement pst = cnx.prepareStatement(SQL2);
            rs = pst.executeQuery();
            while (rs.next()) {
                data3.add(new RendiveauPations(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        CIdRP.setCellValueFactory(new PropertyValueFactory<>("Id"));
        CNomeRP.setCellValueFactory(new PropertyValueFactory<>("Nome"));
        CPrenomRP.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
        CDateREndiceauRP.setCellValueFactory(new PropertyValueFactory<>("Date_rend"));

        TableRendiveau.setItems(null);
        TableRendiveau.setItems(data3);

    }

    /*   TABLE DE  HISTORIQUE    */
    public void TableHistorique() {
        try {
            Connection cnx = null;
            data4 = FXCollections.observableArrayList();
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            ResultSet rs = null;
            String SQL2 = "SELECT *  FROM historique";
            PreparedStatement pst = cnx.prepareStatement(SQL2);
            rs = pst.executeQuery();
            while (rs.next()) {
                data4.add(new Historique(rs.getString(1), rs.getString(2), rs.getString(3)));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        CIdHistorique.setCellValueFactory(new PropertyValueFactory<>("Id"));
        CDateHistorique.setCellValueFactory(new PropertyValueFactory<>("Date_ajouter"));
        CActionsHistorique.setCellValueFactory(new PropertyValueFactory<>("Actions"));

        TableHistorique.setItems(null);
        TableHistorique.setItems(data4);

    }

    /*   TABLE DE  MESSAGE DE DOCTER    */
    public void TableDocter() {
        try {
            Connection cnx = null;
            data6 = FXCollections.observableArrayList();
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            ResultSet rs = null;
            String SQL2 = "SELECT *  FROM MsgDOc";
            PreparedStatement pst = cnx.prepareStatement(SQL2);
            rs = pst.executeQuery();
            while (rs.next()) {
                data6.add(new Messenger(rs.getString(1), rs.getString(2), rs.getString(3)));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        CIdM.setCellValueFactory(new PropertyValueFactory<>("Id"));
        CMSg.setCellValueFactory(new PropertyValueFactory<>("Date_ajouter"));
        CMSGG.setCellValueFactory(new PropertyValueFactory<>("Msg"));

        TAbleMsgAd.setItems(null);
        TAbleMsgAd.setItems(data6);

    }

    /*   TABLE DE  HISTORIQUE    */
    public void TableAdmin() {
        try {
            Connection cnx = null;
            data5 = FXCollections.observableArrayList();
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            ResultSet rs = null;
            String SQL2 = "SELECT *  FROM MessageAdmin";
            PreparedStatement pst = cnx.prepareStatement(SQL2);
            rs = pst.executeQuery();
            while (rs.next()) {
                data5.add(new Messenger(rs.getString(1), rs.getString(2), rs.getString(3)));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        CIMD.setCellValueFactory(new PropertyValueFactory<>("Id"));
        CDateMD.setCellValueFactory(new PropertyValueFactory<>("Date_ajouter"));
        CMD.setCellValueFactory(new PropertyValueFactory<>("Msg"));

        TableMSgDoc.setItems(null);
        TableMSgDoc.setItems(data5);

    }

    /*   TABLE DE EN ATTENDRE    */
    public void TableHomAtendre() {
        try {
            Connection cnx = null;
            data7 = FXCollections.observableArrayList();
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            ResultSet rs = null;
            String SQL2 = "SELECT *  FROM Attendre";
            PreparedStatement pst = cnx.prepareStatement(SQL2);
            rs = pst.executeQuery();
            while (rs.next()) {
                data7.add(new Home(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        CIdTA.setCellValueFactory(new PropertyValueFactory<>("Id"));
        CNomTA.setCellValueFactory(new PropertyValueFactory<>("Nome"));
        CPrenomTA.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
        CTleTA.setCellValueFactory(new PropertyValueFactory<>("Tlephone"));

        TableAttendre.setItems(null);
        TableAttendre.setItems(data7);

    }

    /*   TABLE DE EN ATTENDRE    */
    public void TableHomLifateau() {
        try {
            Connection cnx = null;
            data8 = FXCollections.observableArrayList();
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            ResultSet rs = null;
            String SQL2 = "SELECT *  FROM Lifateau";
            PreparedStatement pst = cnx.prepareStatement(SQL2);
            rs = pst.executeQuery();
            while (rs.next()) {
                data8.add(new Home(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        CIdTF.setCellValueFactory(new PropertyValueFactory<>("Id"));
        CNTF.setCellValueFactory(new PropertyValueFactory<>("Nome"));
        CPTF.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
        CTTF.setCellValueFactory(new PropertyValueFactory<>("Tlephone"));

        TableLifateau.setItems(null);
        TableLifateau.setItems(data8);

    }
    
    
    /*  TABLE DE PAYMENT */ 
    
    public void TablePayment() {
        try {
            Connection cnx = null;
            data9 = FXCollections.observableArrayList();
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            ResultSet rs = null;
            String SQL2 = "SELECT *  FROM payment";
            PreparedStatement pst = cnx.prepareStatement(SQL2);
            rs = pst.executeQuery();
            while (rs.next()) {
                data9.add(new Payment(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        CNPayment.setCellValueFactory(new PropertyValueFactory<>("Id"));
        CnomePayment.setCellValueFactory(new PropertyValueFactory<>("Nome"));
        CPrenomPayment.setCellValueFactory(new PropertyValueFactory<>("Prenome"));
        CNVersment.setCellValueFactory(new PropertyValueFactory<>("N_Versment"));
        CVersment.setCellValueFactory(new PropertyValueFactory<>("Versment"));
        Ctotele.setCellValueFactory(new PropertyValueFactory<>("Total"));
        

        TablePayment.setItems(null);
        TablePayment.setItems(data9);

    }
    
    

    ///////////////////  LES ACTIONS DES TABLES ///////////////////
    /* TABLE DE PABATION */
    @FXML
    private void Tablep(MouseEvent event) {

        try {

            Pations table = (Pations) TablePations.getSelectionModel().getSelectedItem();
            Connection cnx = null;
            data1 = FXCollections.observableArrayList();
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            ResultSet rs = null;
            String SQL2 = "SELECT *  FROM Passions where Id=?";
            PreparedStatement pst = cnx.prepareStatement(SQL2);
            pst.setString(1, table.getId());
            rs = pst.executeQuery();
            while (rs.next()) {
                LabelIdPations.setText(rs.getString("Id"));
                LabelNomeP.setText(rs.getString("Nome"));
                LabelPrenomP.setText(rs.getString("Prenom"));
                LbelDateNP.setText(rs.getString("Date_nai"));
                //LabelTelephonsP.setText(rs.getString("Date_ajouter"));
                LabelTelephonsP.setText(rs.getString("Tlephone"));
                LAbelSexP.setText(rs.getString("Sexe"));
                LabelAdresseP.setText(rs.getString("Adresse"));

                JtextNomeP.setText(rs.getString("Nome"));
                jtexPrenomP.setText(rs.getString("Prenom"));
                JtextDateP.getEditor().setText(rs.getString("Date_nai"));
                //LabelTelephonsP.setText(rs.getString("Date_ajouter"));
                jetxtTelephonP.setText(rs.getString("Tlephone"));
                //LAbelSexP.setText(rs.getString("Sexe"));
                addrespation.setText(rs.getString("Adresse"));

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    /*   ACTIONS DE TABLE DE SUIVRE DE PATIONS    */
    @FXML
    private void ActonTSP(MouseEvent event) {
        try {

            SuivrePations table = (SuivrePations) TableSuivre.getSelectionModel().getSelectedItem();
            Connection cnx = null;
            data2 = FXCollections.observableArrayList();
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            ResultSet rs = null;
            String SQL2 = "SELECT *  FROM SuivrePations where Id=?";
            PreparedStatement pst = cnx.prepareStatement(SQL2);
            pst.setString(1, table.getId());
            rs = pst.executeQuery();
            while (rs.next()) {
                LabelIdsuivreP.setText(rs.getString("Id"));
                LabelNomeP1.setText(rs.getString("Nome"));
                LabelPrenomP1.setText(rs.getString("Prenom"));
                LbelDateNP1.setText(rs.getString("Date_nai"));
                //LabelTelephonsP.setText(rs.getString("Date_ajouter"));
                LabelTelephonsP1.setText(rs.getString("Tlephone"));
                LabelAdresseP11.setText(rs.getString("Actes"));
                LabelAdresseP1.setText(rs.getString("Adresse"));

                JtxtFNsuivre.setText(rs.getString("Nome"));
                JtextFPsuivre.setText(rs.getString("Prenom"));
                JfxDateNicence.getEditor().setText(rs.getString("Date_nai"));
                //LabelTelephonsP.setText(rs.getString("Date_ajouter"));
                JtxtFtesuivre.setText(rs.getString("Tlephone"));
                comboxActes.setValue(rs.getString("Actes"));
                addrespation1.setText(rs.getString("Adresse"));

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    /*  ACTION DE TABLE DE ATTENDRE */
    @FXML
    private void ActionsTAT(MouseEvent event) {

        try {

            Home table = (Home) TableAttendre.getSelectionModel().getSelectedItem();
            Connection cnx = null;
            data7 = FXCollections.observableArrayList();
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            ResultSet rs = null;
            String SQL2 = "SELECT *  FROM Attendre where Id=?";
            PreparedStatement pst = cnx.prepareStatement(SQL2);
            pst.setString(1, table.getId());
            rs = pst.executeQuery();
            while (rs.next()) {
                labelIDPAT.setText(rs.getString("Id"));
                LNPAT.setText(rs.getString("Nome"));
                NTLLABEL.setText(rs.getString("Prenom"));
                LBKTLL.setText(rs.getString("Tlephone"));

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @FXML
    private void TableMSGASS(MouseEvent event) {

        try {

            Messenger table = (Messenger) TableMSgDoc.getSelectionModel().getSelectedItem();
            Connection cnx = null;
            data5 = FXCollections.observableArrayList();
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            ResultSet rs = null;
            String SQL2 = "SELECT *  FROM MessageAdmin where Id=?";
            PreparedStatement pst = cnx.prepareStatement(SQL2);
            pst.setString(1, table.getId());
            rs = pst.executeQuery();
            while (rs.next()) {
                TExtAficherMsAS.setText(rs.getString("Msg"));

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @FXML
    private void TblMSGDOOK(MouseEvent event) {
        try {

            Messenger table = (Messenger) TAbleMsgAd.getSelectionModel().getSelectedItem();
            Connection cnx = null;
            data6 = FXCollections.observableArrayList();
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            ResultSet rs = null;
            String SQL2 = "SELECT *  FROM MsgDOc where Id=?";
            PreparedStatement pst = cnx.prepareStatement(SQL2);
            pst.setString(1, table.getId());
            rs = pst.executeQuery();
            while (rs.next()) {
                TEXTAIRYAMSGDOC.setText(rs.getString("Msg"));

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    @FXML
    private void BTnSUPATT(MouseEvent event) {

        try {
            Connection cnx = null;
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            String SQL2 = "DELETE FROM Attendre WHERE  Id=?";

            PreparedStatement pst = cnx.prepareStatement(SQL2);

            pst.setString(1, labelIDPAT.getText());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

        TableHomAtendre();
        achernbrAtt();
    }

    @FXML
    private void BtnOkFate(MouseEvent event) {
        //int dat = data7.size();

        try {
            Connection cnx = null;
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            String SQL2 = "INSERT into Lifateau(Nome,Prenom,Tlephone) values (?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(SQL2);

            pst.setString(1, LNPAT.getText());
            pst.setString(2, NTLLABEL.getText());
            pst.setString(3, LBKTLL.getText());
            pst.execute();
            pst.close();

        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        TableHomLifateau();
        Afichernbfat();
        try {
            Connection cnx = null;
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            String SQL2 = "DELETE FROM Attendre WHERE  Id=?";

            PreparedStatement pst = cnx.prepareStatement(SQL2);

            pst.setString(1, labelIDPAT.getText());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

        TableHomAtendre();

        achernbrAtt();
        Afichernbfat();

        LNPAT.setText("");
        NTLLABEL.setText("");
        LBKTLL.setText("");

    }

    public void afichernbr() {
        int nbrPAs = data1.size();
        LabelNbrP.setText("" + nbrPAs);

    }

    public void achernbrAtt() {
        int nbrATT = data7.size();
        labbelNBRATT.setText("" + nbrATT);

    }

    public void Afichernbfat() {
        int nbrLIFAT = data8.size();
        LBELLIFAT.setText("" + nbrLIFAT);
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    private void menuBARE(MouseEvent event) {
        if (!paneldeCompte.isVisible()) {
            paneldeCompte.setVisible(true);
        } else {
            paneldeCompte.setVisible(false);
        }

    }

    @FXML
    private void BTNPARA(MouseEvent event) {

        Anchoraccueil.setVisible(false);
        AnchorPations.setVisible(false);
        Anchorsuivre.setVisible(false);
        Anchorcomptabilite.setVisible(false);
        Anchorhistorique.setVisible(false);
        PanelModGETIONER.setVisible(false);

        PanelModGETIONER.setVisible(true);

        paneldeCompte.setVisible(false);

    }

    @FXML
    private void BTNEXIT(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void BtnModcompt(MouseEvent event) {

        if (labelprin.getText().equals("Docter")) {

            try {
                Connection cnx = null;
                ResultSet resultat = null;
                cnx = connexion.connexionDB();

                String SQL2 = "UPDATE Doctor SET Name = ?,Prenome =?,Date = ?,NTlfn = ?,Adresse = ?  WHERE ID=? ";
                PreparedStatement pst = cnx.prepareStatement(SQL2);

                pst.setString(6, Idcompt.getText());
                pst.setString(1, JtxComN.getText());
                pst.setString(2, JtxComP.getText());
                pst.setString(3, JtxComD.getEditor().getText());
                pst.setString(4, JtxComT.getText());
                pst.setString(5, JtxComA.getText());

                pst.execute();
                pst.close();

            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {
                Connection cnx = null;
                ResultSet resultat = null;
                cnx = connexion.connexionDB();

                String SQL2 = "UPDATE admin SET Name = ?,Prenome =?,Date = ?,NTlfn = ?,Adresse = ?  WHERE ID=? ";
                PreparedStatement pst = cnx.prepareStatement(SQL2);

                pst.setString(6, Idcompt.getText());
                pst.setString(1, JtxComN.getText());
                pst.setString(2, JtxComP.getText());
                pst.setString(3, JtxComD.getEditor().getText());
                pst.setString(4, JtxComT.getText());
                pst.setString(5, JtxComA.getText());

                pst.execute();
                pst.close();

            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    @FXML
    private void JtxComN(KeyEvent event) {

        if (labelprin.getText().equals("Docter")) {
            System.out.println("docter");
            try {
                Connection cnx = null;
                ResultSet resultat = null;
                cnx = connexion.connexionDB();
                /*PreparedStatement prepare = null;*/

                String SQL2 = "SELECT * FROM Doctor WHERE ID LIKE ?";
                PreparedStatement pst = cnx.prepareStatement(SQL2);
                pst.setString(1, "%" + Idcomptmmmm.getText() + "%");
                resultat = pst.executeQuery();
                if (resultat.next()) {
                    String add1 = resultat.getString("Name");
                    labelcomptmod.setText(add1);
                    String add2 = resultat.getString("Prenome");
                    labelmodism.setText(add2);
                    String add3 = resultat.getString("NTlfn");
                    labelmodtele.setText(add3);
                    String add4 = resultat.getString("Date");
                    labelmoddate.setText(add4);
                    String add5 = resultat.getString("Adresse");
                    LabelAddresss.setText(add5);
                    /*String add6 = resultat.getString("quantiter");
                jTextField1_quntiter.setText(add6);
                String add7 = resultat.getString("n_bon");
                jTextField1_bon.setText(add7);
                String add8 = resultat.getString("date_sorter");
                jTextField1_date1.setText(add8);
                String add9 = resultat.getString("date_entrer");
                jTextField1_date2.setText(add9);*/

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);

            }

        } else {
            System.out.println("assistence");

        }
    }

    @FXML
    private void CHerchGlobel(KeyEvent event) {
        if (Anchoraccueil.isVisible()) {
            try {
                Connection cnx = null;
                data7 = FXCollections.observableArrayList();
                ResultSet resultat = null;
                cnx = connexion.connexionDB();

                ResultSet rs = null;
                String SQL2 = "SELECT *  FROM Attendre  WHERE Id LIKE ? OR Nome LIKE ? OR Prenom LIKE ?";
                PreparedStatement pst = cnx.prepareStatement(SQL2);
                pst.setString(1, "%" + CHerchGlobel.getText() + "%");
                pst.setString(2, "%" + CHerchGlobel.getText() + "%");
                pst.setString(3, "%" + CHerchGlobel.getText() + "%");
                rs = pst.executeQuery();
                while (rs.next()) {
                    data7.add(new Home(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

            CIdTA.setCellValueFactory(new PropertyValueFactory<>("Id"));
            CNomTA.setCellValueFactory(new PropertyValueFactory<>("Nome"));
            CPrenomTA.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
            CTleTA.setCellValueFactory(new PropertyValueFactory<>("Tlephone"));

            TableAttendre.setItems(null);
            TableAttendre.setItems(data7);

            try {
                Connection cnx = null;
                data8 = FXCollections.observableArrayList();
                ResultSet resultat = null;
                cnx = connexion.connexionDB();

                ResultSet rs = null;
                String SQL2 = "SELECT *  FROM Lifateau  WHERE Id LIKE ? OR Nome LIKE ? OR Prenom LIKE ?";
                PreparedStatement pst = cnx.prepareStatement(SQL2);
                pst.setString(1, "%" + CHerchGlobel.getText() + "%");
                pst.setString(2, "%" + CHerchGlobel.getText() + "%");
                pst.setString(3, "%" + CHerchGlobel.getText() + "%");
                rs = pst.executeQuery();
                while (rs.next()) {
                    data8.add(new Home(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

            CIdTF.setCellValueFactory(new PropertyValueFactory<>("Id"));
            CNTF.setCellValueFactory(new PropertyValueFactory<>("Nome"));
            CPTF.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
            CTTF.setCellValueFactory(new PropertyValueFactory<>("Tlephone"));

            TableLifateau.setItems(null);
            TableLifateau.setItems(data8);

        } else {
            if (AnchorPations.isVisible()) {
                try {
                    Connection cnx = null;
                    data1 = FXCollections.observableArrayList();
                    ResultSet resultat = null;
                    cnx = connexion.connexionDB();

                    ResultSet rs = null;
                    String SQL2 = "SELECT *  FROM Passions  WHERE Id LIKE ? OR Nome LIKE ? OR Prenom LIKE ?";
                    PreparedStatement pst = cnx.prepareStatement(SQL2);
                    pst.setString(1, "%" + CHerchGlobel.getText() + "%");
                    pst.setString(2, "%" + CHerchGlobel.getText() + "%");
                    pst.setString(3, "%" + CHerchGlobel.getText() + "%");
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        data1.add(new Pations(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }

                CIDP.setCellValueFactory(new PropertyValueFactory<>("Id"));
                CNomeP.setCellValueFactory(new PropertyValueFactory<>("Nome"));
                CPrenomP.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
                CDateNaisanceP.setCellValueFactory(new PropertyValueFactory<>("Date_nai"));
                CDateAjoP.setCellValueFactory(new PropertyValueFactory<>("Date_ajouter"));
                CSexeP.setCellValueFactory(new PropertyValueFactory<>("Sexe"));
                CTelephonP.setCellValueFactory(new PropertyValueFactory<>("Tlephone"));
                CAdresseP.setCellValueFactory(new PropertyValueFactory<>("Adresse"));

                TablePations.setItems(null);
                TablePations.setItems(data1);
            } else {
                if (Anchorsuivre.isVisible()) {
                    try {
                        Connection cnx = null;
                        data2 = FXCollections.observableArrayList();
                        ResultSet resultat = null;
                        cnx = connexion.connexionDB();

                        ResultSet rs = null;
                        String SQL2 = "SELECT *  FROM SuivrePations  WHERE Id LIKE ? OR Nome LIKE ? OR Prenom LIKE ?";
                        PreparedStatement pst = cnx.prepareStatement(SQL2);
                        pst.setString(1, "%" + CHerchGlobel.getText() + "%");
                        pst.setString(2, "%" + CHerchGlobel.getText() + "%");
                        pst.setString(3, "%" + CHerchGlobel.getText() + "%");
                        rs = pst.executeQuery();
                        while (rs.next()) {
                            data2.add(new SuivrePations(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
                        }

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
                    }

                    CIdSp.setCellValueFactory(new PropertyValueFactory<>("Id"));
                    CNomeSP.setCellValueFactory(new PropertyValueFactory<>("Nome"));
                    CPrenomSP.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
                    CDateSP.setCellValueFactory(new PropertyValueFactory<>("Date_nai"));
                    CDAteAjoouterSP.setCellValueFactory(new PropertyValueFactory<>("Date_ajouter"));
                    CtelSP.setCellValueFactory(new PropertyValueFactory<>("Tlephone"));
                    CActesSP.setCellValueFactory(new PropertyValueFactory<>("Actes"));
                    CAdressSP.setCellValueFactory(new PropertyValueFactory<>("Adresse"));

                    TableSuivre.setItems(null);
                    TableSuivre.setItems(data2);

                    
                    
                    try {
                        Connection cnx = null;
                        data3 = FXCollections.observableArrayList();
                        ResultSet resultat = null;
                        cnx = connexion.connexionDB();

                        ResultSet rs = null;
                        String SQL2 = "SELECT *  FROM Renouveau  WHERE Id LIKE ? OR Nome LIKE ? OR Prenom LIKE ?";
                        PreparedStatement pst = cnx.prepareStatement(SQL2);
                        pst.setString(1, "%" + CHerchGlobel.getText() + "%");
                        pst.setString(2, "%" + CHerchGlobel.getText() + "%");
                        pst.setString(3, "%" + CHerchGlobel.getText() + "%");
                        rs = pst.executeQuery();
                        while (rs.next()) {
                            data3.add(new RendiveauPations(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
                        }

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
                    }

                    CIdRP.setCellValueFactory(new PropertyValueFactory<>("Id"));
                    CNomeRP.setCellValueFactory(new PropertyValueFactory<>("Nome"));
                    CPrenomRP.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
                    CDateREndiceauRP.setCellValueFactory(new PropertyValueFactory<>("Date_rend"));

                    TableRendiveau.setItems(null);
                    TableRendiveau.setItems(data3);
                }
            }
        }

    }

    @FXML
    private void ActioneTableFate(MouseEvent event) {
    }

    @FXML
    private void btnAjouterVersment(MouseEvent event) {
        
        try {
            Connection cnx = null;
            ResultSet resultat = null;
            cnx = connexion.connexionDB();

            String SQL2 = "INSERT into payment(Nome,Prenome,N_Versment,Versment,Total) values (?,?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(SQL2);

            pst.setString(1, JtxtFNsuivre.getText());
            pst.setString(2, JtextFPsuivre.getText());
            pst.setString(3, NbrVersment.getText());
            pst.setString(4, Versment.getText());
            pst.setString(5, Totale.getText());
            pst.execute();
            pst.close();

        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        PanelAjouterV.setVisible(false);
        
        String Ver = Versment.getText();
        String T = labelTotale.getText();
        String Too = LabelTotale.getText();
        
        
        int T1 = Integer.parseInt(Ver);
        int intire = Integer.parseInt(T);
        int some = Integer.parseInt(Too);
        
        
        int somT = T1 + some ; 
        int someINTi = T1 +intire;
        
        
        LabelTotale.setText("" +somT );
        labelTotale.setText("" +someINTi );
        
        
        
    }

    @FXML
    private void anulerversement(MouseEvent event) {
        PanelAjouterV.setVisible(false);
    }

    @FXML
    private void btnCDefitonce(MouseEvent event) {
        
        String TO = labelTotale.getText();
        String Likh = labellikhrajTOtal.getText();
        String TexLikh = JtextNomeP1.getText();
        
        
        int T1 = Integer.parseInt(TO);
        int Li = Integer.parseInt(Likh);
        int TEXTLIKH = Integer.parseInt(TexLikh);
        
        int def = T1 - TEXTLIKH ;
        
        labelTotale.setText(""+ def);
        
        int somelikhraje = Li + TEXTLIKH ; 
        
        labellikhrajTOtal.setText("" +somelikhraje );
        
        JtextNomeP1.setText("");
    }


}
