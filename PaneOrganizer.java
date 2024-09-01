package codeAlong3;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class PaneOrganizer {

    private BorderPane rootPane;
    private Alien alien;

    public PaneOrganizer() {
        this.rootPane = new BorderPane();
        this.setUpButtonPane();
        this.makeAlien();
    }

    public Pane getRoot() {
        return this.rootPane;
    }

    private void setUpButtonPane() {
        HBox buttonPane = new HBox();
        buttonPane.setStyle(Constants.BUTTON_PANE_BACKGROUND);
        buttonPane.setAlignment(Pos.CENTER);
        buttonPane.setSpacing(20);

        this.rootPane.setBottom(buttonPane);
        this.setUpButtons(buttonPane);
    }

    private void setUpButtons(HBox buttonPane) {
        Button leftButton = new Button("left");
        Button rightButton = new Button("right");
        buttonPane.getChildren().addAll(leftButton, rightButton);

        leftButton.setOnAction((ActionEvent e) -> this.alien.moveLeft());
        rightButton.setOnAction((ActionEvent e) -> this.alien.moveRight());

        buttonPane.setFocusTraversable(false);
        leftButton.setFocusTraversable(false);
        rightButton.setFocusTraversable(false);
    }

    private void makeAlien() {
        Pane alienPane = new Pane();
        this.rootPane.setCenter(alienPane);
        this.alien = new Alien(alienPane);
    }
}
