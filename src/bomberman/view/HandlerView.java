package bomberman.view;

import bomberman.model.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HandlerView extends JPanel{ //Stamperà matrice su un jpanel, sarà singleton

    private CharacterView cv= new CharacterView();

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int i=Game.getInstance().getCharacter().getI();
        int j=Game.getInstance().getCharacter().getJ();
        g.drawImage(cv.currentImage,i,j,cv.dim,cv.dim,null);
    }


}
