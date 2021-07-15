package bomberman.application;

import bomberman.controller.MovementController;
import bomberman.view.HandlerView;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame f = new Jframe("BOMBERMAN");
        f.setsize(816,816);

        HandlerView h = new HandlerView();
        MovementController controller = new MovementController(h);
        h.addKeyListener(controller);
        h.setFocusable(true);
        f.add(h);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Gameloop gameloop = new GameLoop(controller);
        Thread t = new Thread(gameloop);
        t.start();


    }

}
