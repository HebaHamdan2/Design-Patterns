package facadepattern;

public class HomeTheaterFacade {
	Projector projector;
        Screen screen;
        Amplifier amp;
        TheaterLights light;
        PopcornPopper popcorn;
        String m;
        Tuner tuner;
        DvdPlayer dvdP;
        CdPlayer CD;
    public HomeTheaterFacade(Projector projector, Screen screen, Amplifier amp, TheaterLights light, PopcornPopper popcorn) {
        this.projector = projector;
        this.screen = screen;
        this.amp = amp;
        this.light = light;
        this.popcorn = popcorn;
     
    } 
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
                popcorn.on();
                popcorn.pop();
                light.dim(10);
                screen.down();
                projector.on();
                projector.wideScreenMode();
                amp.on();
                amp.setSurroundSound();
                amp.setVolume(5);
                DvdPlayer dvdPlayer=new DvdPlayer("DVD", amp);
                amp.setDvd(dvdPlayer);
                amp.dvd.play(movie);
                m=movie;
	}
 
 
	public void endMovie() {
		System.out.println("Shutting movie theater down...");
                popcorn.off();
                light.off();
                screen.up();
                projector.off();
                amp.off();
                DvdPlayer dvd=new DvdPlayer("dvd", amp);
                dvd.eject();
                dvd.movie=m;
                dvd.stop();
                dvd.off();
	}

	public void listenToCd(String cdTitle) {
		System.out.println("Get ready for an audiopile experence...");
                light.on();
                CD=new CdPlayer("CD", amp);
                amp.setVolume(5);
                amp.setCd(CD);
                amp.setStereoSound();
                CD.on();
                CD.play(cdTitle);
	}

	public void endCd() {
		System.out.println("Shutting down CD...");
                amp.off();
                CD.eject();
                CD.off();
	}

	public void listenToRadio(double frequency) {
		System.out.println("Tuning in the airwaves...");
                tuner=new Tuner("Tuner", amp);
                tuner.on();
                tuner.setFrequency(frequency);
                amp.on();
                amp.setVolume(5);
	        dvdP=new DvdPlayer("dvd", amp);
                amp.setDvd(dvdP);
                amp.setTuner(tuner);
	}

	public void endRadio() {
		System.out.println("Shutting down the tuner...");
                tuner.off();
                amp.off();
	}
}