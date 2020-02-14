package com.gkb.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/**
 * @author Nathanael liman ( 1872014 )
 */
public class GukertuController {
    public int win=0;
    public int lose=0;
    public int draw=0;


    public Text pointWin;
    public Text pointDraw;
    public Text pointLose;


    @FXML
    private Button gunting;
    @FXML
    private Button kertas;
    @FXML
    private Button batu;
    @FXML
    private ImageView img1;
    @FXML
    private ImageView img2;

    @FXML
    private void exitAction(ActionEvent actionEvent) {
        Platform.exit();
    }

    @FXML
    private void scissorsAction(ActionEvent actionEvent) {
        img1.setImage(new Image("gunting.jpg"));
        int boot = (int)(Math.random() * 4);
        if (boot==1){
            draw+=1;
            pointDraw.setText(String.valueOf(draw));
            img2.setImage(new Image("gunting.jpg"));

        }else if (boot==2){
            win+=1;
            pointWin.setText(String.valueOf(win));
            img2.setImage(new Image("kertas.png"));
        }else if (boot==3){
            lose+=1;
            pointLose.setText(String.valueOf(lose));
            img2.setImage(new Image("batu.png"));
        }
    }

    @FXML
    private void paperAction(ActionEvent actionEvent) {
        img1.setImage(new Image("kertas.png"));
        int kom = (int)(Math.random() * 4);
        if (kom==1){
            lose+=1;
            pointLose.setText(String.valueOf(lose));
            img2.setImage(new Image("gunting.jpg"));


        }else if (kom==2){
            draw+=1;
            pointDraw.setText(String.valueOf(draw));
            img2.setImage(new Image("kertas.png"));

        }else if (kom==3){
            win+=1;
            pointWin.setText(String.valueOf(win));
            img2.setImage(new Image("batu.png"));

        }
    }

    @FXML
    private void rockAction(ActionEvent actionEvent) {
        img1.setImage(new Image("batu.png"));
        int komp = (int)(Math.random() * 4);
        if (komp==1){
            win+=1;
            pointWin.setText(String.valueOf(win));
            img2.setImage(new Image("gunting.jpg"));

        }else if (komp==2){
            lose+=1;
            pointLose.setText(String.valueOf(lose));
            img2.setImage(new Image("kertas.png"));

        }else if (komp==3){
            draw+=1;
            pointDraw.setText(String.valueOf(draw));
            img2.setImage(new Image("batu.png"));
        }
    }
}
