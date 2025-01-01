package Observer;

public class TVDisplay implements Observer {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    public void display() {
        System.out.println("TV Display: Weather updated - " + weather);
    }
}
