import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CarHandler implements KeyListener {
    Game g;
    public CarHandler(Game ref){
        this.g = ref;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 37){
            System.out.println("Esquerda");
            int x = g.carPanel.getX();
            int y = g.carPanel.getY();
            System.out.println(x + "," + y);
            if(x-g.speed>=0){
                g.carPanel.setLocation(x-g.speed, y);
            }

        }
        else if(code == 39){
            System.out.println("Direita");
            int x = g.carPanel.getX();
            int y = g.carPanel.getY();
            System.out.println(x + "," + y);
            int width = g.fr.getWidth();
            int carWidth = g.carPanel.getWidth();
            if(x+g.speed + carWidth<=width){
                g.carPanel.setLocation(x+g.speed, y);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
