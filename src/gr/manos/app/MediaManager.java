package gr.manos.app;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MediaManager {

    private ArrayList<Media> medias= new ArrayList<>();

    public void addProduct(Media media){
        medias.add(media);
    }


    public void saveMedia(String filename) {

          try {

              PrintWriter printWriter = new PrintWriter(new File(filename));
              for (Media m: medias) {

              }


} catch (Exception e) {

          }


        //public void  displayMedia(){






    }




}
