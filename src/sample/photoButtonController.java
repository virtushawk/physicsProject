package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import java.text.DecimalFormat;

public class photoButtonController  {

    public Button hollaButton;
    public Button photoButton;
    public TextField UTextField;
    public TextField aTextField;
    public TextField ITextField;
    public TextField BTextField;
    public Button RResultButton;
    public TextField RResultTextField;
    public TextField IproTextField;
    public TextField aproTextField;
    public TextField bproTextField;
    public TextField RproTextField;
    public Button proResultButton;
    public TextField proResultTextField;
    public TextField sigmaPodTextField;
    public TextField RpodTextField;
    public TextField podResultTextField;
    public Button podResultButton;
    public TextField AnTextField;
    public TextField RnTextField;
    public TextField nResultTextField;
    public TextField LPhotoTextField;
    public TextField hvResultField;
    public TextField UPhotoField;
    public TextField IPhotoTextField;
    public TextField EDSResultField;

    @FXML
    AnchorPane photoView;
   @FXML
   ScrollPane hollaView;


    public void clickOnPhotoButton(MouseEvent mouseEvent) {

        hollaButton.getStyleClass().removeAll("buttonPressed");
        hollaButton.getStyleClass().add("buttonPhoto");
        photoButton.getStyleClass().removeAll("buttonPhoto");
        photoButton.getStyleClass().add("buttonPressed");
       photoView.toFront();

    }

    public void clickOnHollaButton(MouseEvent mouseEvent) {

        photoButton.getStyleClass().removeAll("buttonPressed");
        photoButton.getStyleClass().add("buttonPhoto");
        hollaButton.getStyleClass().removeAll("buttonPhoto");
        hollaButton.getStyleClass().add("buttonPressed");
        hollaView.toFront();

    }


    public void clickOnRResultButon(MouseEvent mouseEvent) {
        double U = Double.parseDouble(UTextField.getText());
        double a = Double.parseDouble(aTextField.getText());
        double I = Double.parseDouble(ITextField.getText());
        double B = Double.parseDouble(BTextField.getText());

        if(I==0)
        {
            RResultTextField.setText("error : I cannot be zero");
        }
        else if (B==0)
        {
            RResultTextField.setText("error: B cannot be zero");
        }
        else {
            Double R = U * a / (I * B);
            DecimalFormat df = new DecimalFormat("0.00##");
            RResultTextField.setText(df.format(R));
        }

    }

    public void clickOnproResultButon(MouseEvent mouseEvent) {
        double l = Double.parseDouble(IproTextField.getText());
        double a = Double.parseDouble(aproTextField.getText());
        double b = Double.parseDouble(bproTextField.getText());
        double R = Double.parseDouble(RproTextField.getText());
        if(a==0)
        {
            proResultTextField.setText("error : a cannot be zero");
        }
        else if (b==0)
        {
            proResultTextField.setText("error: b cannot be zero");
        }
        else if(R == 0)
        {
            proResultTextField.setText("error: R cannot be zero");
        }
        else {
            Double sigma = l / (a * b * R);
            DecimalFormat df = new DecimalFormat("0.00##");
            proResultTextField.setText(df.format(sigma));
        }


    }

    public void clickOnPodResultButon(MouseEvent mouseEvent) {

        double sigma = Double.parseDouble(sigmaPodTextField.getText());
        double R = Double.parseDouble(RpodTextField.getText());

        Double mu = sigma * R;
        DecimalFormat df = new DecimalFormat("0.00##");
        podResultTextField.setText(df.format(mu));

    }

    public void clickOnNResultButon(MouseEvent mouseEvent) {

        double A = Double.parseDouble(AnTextField.getText());
        double R = Double.parseDouble(RnTextField.getText());
        if(R == 0)
        {
            nResultTextField.setText("error : Rxn cannot be zero");
        }
        else{
            double e = -1.602;
            double n = - A/(e*R);
            DecimalFormat df = new DecimalFormat("0.00##");
            nResultTextField.setText(df.format(n));

        }

    }

    public void clickOnhvResultButon(MouseEvent mouseEvent) {
        double L = Double.parseDouble(LPhotoTextField.getText());
        if(L==0){
            hvResultField.setText("error : L cannot be 0");
        }
        else{
            double hv = 1.24/L;
            DecimalFormat df = new DecimalFormat("0.00##");
            hvResultField.setText(df.format(hv));
        }

    }

    public void clickOnEDSResultButon(MouseEvent mouseEvent) {

        double U = Double.parseDouble(UPhotoField.getText());
        double I = Double.parseDouble(IPhotoTextField.getText());
        if(I==0)
        {
            EDSResultField.setText("error: I cannot be 0");
        }
        else {
            double UEDS = U/I;
            DecimalFormat df = new DecimalFormat("0.00##");
            EDSResultField.setText(df.format(UEDS));
        }
    }
}
