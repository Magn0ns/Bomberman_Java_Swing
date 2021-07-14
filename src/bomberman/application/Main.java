package bomberman.application;

import bomberman.view.HandlerView;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame f = new Jframe("BOMBERMAN");
        f.setsize(816,816);

        HandlerView h = new HandlerView();
        h.setFocusable(true);
        h.add(p);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
