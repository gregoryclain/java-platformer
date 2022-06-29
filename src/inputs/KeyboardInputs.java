package inputs;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
    private GamePanel gamePanel;
    public KeyboardInputs(GamePanel gamePanel){
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_Z:
                System.out.println("it's Z");
                gamePanel.changeYDelta(-5);
                break;
            case KeyEvent.VK_Q:
                System.out.println("it's Q");
                gamePanel.changeXDelta(-5);
                break;
            case KeyEvent.VK_S:
                System.out.println("it's S");
                gamePanel.changeYDelta(5);
                break;
            case KeyEvent.VK_D:
                System.out.println("it's D");
                gamePanel.changeXDelta(5);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
