package space.mairi.springcourse;

public class HipHopMusic implements Music{
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Heart Attack";
    }
}
