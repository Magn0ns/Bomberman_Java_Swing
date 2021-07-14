package bomberman.view;

import bomberman.application.Settings;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class CharacterView{

    private ArrayList<Image> images;
    Image currentImage;
    int dim;
    private boolean move;
    private int index;

    CharacterView() //Avrà visibilità di package
    {
        images=new ArrayList<Image>();
        dim=48;
        index=0;

            try {
                for(int i=0;i<12;i++) {
                    Image img = ImageIO.read(getClass().getResourceAsStream("/bomberman/application/hero/" + i + ".png"));
                    images.add(img);//Aggiungo immagine all'arraylsit
                }
                currentImage=images.get(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public void move()
    {
        move=true;
    }

    public void stop()
    {
        move=false;
    }

    public void update()
    {
        if(move)
        {

        }
        else
        {
            index=0;
        }
        currentImage=images.get(index);
    }

}
