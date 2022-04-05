package snake;


import javax.swing.JFrame;


public class GameFrame extends JFrame{
    GamePanel game;
    GameFrame(){
        
        
        //moze i krace this.add(new GamePanel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        
        game=new GamePanel();
        
        
        this.add(game);
        
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null); //na sredini ce se pojaviti;
    }

}
