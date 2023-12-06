import javax.swing.*;
import java.awt.*;

public class Game {
    JFrame fr;
    JPanel carPanel;
    CarHandler hnd;
    JLabel backgroud;
    int speed;
    int width;
    int height;

    public Game(){
        speed = 20;
        width = 400;
        height = 800;
        hnd = new CarHandler(this);
        initCar();
    }
    private void initCar(){
        fr = new JFrame("Car Game");
        fr.setLayout(null);
        backgroud = new JLabel("", new ImageIcon("ruas.gif"), JLabel.CENTER);
        backgroud.setBounds(0, 0, width, height);
        fr.add(backgroud);
        carPanel = new JPanel(null);
        carPanel.setSize(120, 250);
        JLabel car = new JLabel(new ImageIcon("carro.png"));
        car.setSize(120, 370);
        car.setLocation(4, -60);
        carPanel.add(car);
        carPanel.setLocation(260, 490);

        carPanel.setOpaque(false);
        backgroud.add(carPanel);
        fr.setSize(width, height);
        fr.setVisible(true);
        fr.setResizable(false);
        fr.setLocationRelativeTo(null);
        fr.addKeyListener(hnd);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//How to use KeyListener in Java - Create -a-2D- Car-Racing-Game -Java - GUI - Java Swing - Part 2 2:20
