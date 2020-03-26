package mypackage;

public class RockSinger extends Singer{

    public RockSinger(String name, String song) {
        super(name, song);
    }
    
    @Override
    public void sing() {
        System.out.printf("RockSinger %s is singing %s\n", this.getName(), this.getSong());
    }
    
    
}
