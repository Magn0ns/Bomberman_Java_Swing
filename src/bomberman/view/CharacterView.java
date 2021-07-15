package bomberman.view;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class CharacterView{

    private ArrayList<Image> front_images; //Un'arrayList per ogni posizione,Ogni posizione ha 3 img
    private ArrayList<Image> back_images;
    private ArrayList<Image> right_images;
    private ArrayList<Image> left_images;
    Image currentImage;
    int dim;
    private boolean right;
    private boolean left;
    private boolean up;
    private boolean down;

    private int index;

    CharacterView() //Avrà visibilità di package
    {
        front_images=new ArrayList<Image>();
        back_images=new ArrayList<Image>();
        right_images=new ArrayList<Image>();
        left_images=new ArrayList<Image>();
        dim=48;
        index=0;

            try {
                for(int i=0;i<3;i++) {
                    Image front_img = ImageIO.read(getClass().getResourceAsStream("/bomberman/application/hero/f" + i + ".png"));
                    front_images.add(front_img);//Aggiungo immagine all'arraylsit
                    Image back_img = ImageIO.read(getClass().getResourceAsStream("/bomberman/application/hero/b" + i + ".png"));
                    back_images.add(back_img);
                    Image right_img = ImageIO.read(getClass().getResourceAsStream("/bomberman/application/hero/r" + i + ".png"));
                    right_images.add(right_img);
                    Image left_img = ImageIO.read(getClass().getResourceAsStream("/bomberman/application/hero/l" + i + ".png"));
                    left_images.add(left_img);
                }
                currentImage=front_images.get(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }



}
