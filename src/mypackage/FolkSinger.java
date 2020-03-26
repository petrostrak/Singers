package mypackage;

public class FolkSinger extends Singer{
    
    public FolkSinger(String name, String song){
        super(name, song);
    }
    
    @Override
    public void sing() {
        System.out.printf("FolkSinger %s is singing %s\n", this.getName(), this.getSong());
    }
    
}
