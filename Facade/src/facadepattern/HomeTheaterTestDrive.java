package facadepattern;

/**
 *
 * @author HebaHamdan
 */
public class HomeTheaterTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Amplifier amp=new Amplifier("amplifier");
        DvdPlayer dvdPlayer=new DvdPlayer("dvd", amp);
        Projector projector=new Projector("projector", dvdPlayer);
        Screen screen=new Screen("screen");
        TheaterLights light=new TheaterLights("light");
        PopcornPopper popcorn=new PopcornPopper("popcorn");
      HomeTheaterFacade h=new HomeTheaterFacade(projector, screen, amp, light, popcorn);
//      h.watchMovie("Anne with an E");
//      h.endMovie();
      h.listenToCd("Fairouz");
      h.endCd();
      h.listenToRadio(8);
      h.endRadio();
    }
    
}
