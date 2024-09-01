package codeAlong3;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;

public class Alien {

    private Ellipse head;
    private Circle leftEye;
    private Circle rightEye;

    public Alien(Pane pane) {
       this.makeAlien(pane);
    }

    private void makeAlien(Pane pane) {
        this.head = new Ellipse(Constants.ALIEN_X, Constants.ALIEN_Y,
                Constants.ALIEN_RAD_X, Constants.ALIEN_RAD_Y);
        this.head.setFill(Color.GREEN);
        pane.getChildren().add(this.head);
        this.leftEye = new Circle(Constants.ALIEN_X - Constants.EYE_X_OFFSET,
                Constants.EYE_Y, Constants.EYE_RAD);
        this.rightEye = new Circle(Constants.ALIEN_X + Constants.EYE_X_OFFSET,
                Constants.EYE_Y, Constants.EYE_RAD);
        pane.getChildren().addAll(this.leftEye, this.rightEye);
    }

    public void moveLeft() {
        this.head.setCenterX(this.head.getCenterX() - Constants.MOVE_OFFSET);
        this.leftEye.setCenterX(this.leftEye.getCenterX() - Constants.MOVE_OFFSET);
        this.rightEye.setCenterX(this.rightEye.getCenterX() - Constants.MOVE_OFFSET);
    }

    public void moveRight() {
        this.head.setCenterX(this.head.getCenterX() + Constants.MOVE_OFFSET);
        this.leftEye.setCenterX(this.leftEye.getCenterX() + Constants.MOVE_OFFSET);
        this.rightEye.setCenterX(this.rightEye.getCenterX() + Constants.MOVE_OFFSET);
    }
}
