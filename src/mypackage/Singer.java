package mypackage;

public abstract class Singer {
    private final String name;
    private String song;
    
    public Singer(String name, String song){
        this.name = name;
        this.song = song;
    }

    public String getName() {
        return name;
    }
    
    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
    
    public abstract void sing();
    
}
