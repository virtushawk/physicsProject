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
}
