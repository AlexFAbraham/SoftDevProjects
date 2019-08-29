//@author AlexAbraham
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class CaveExplorer {
    public static void main(String[] args) {
        //images
        ImageIcon you1 = new ImageIcon("You1.png");
        ImageIcon Gate = new ImageIcon("17-CDoor.gif");
        ImageIcon Jump = new ImageIcon("Jump.gif");
        ImageIcon Fog = new ImageIcon("Fog.gif");
        ImageIcon Skeleton = new ImageIcon("Skeleton.png");
        ImageIcon Instructions = new ImageIcon("Instructions.png");
        ImageIcon SkullDefeated = new ImageIcon("SkullDefeated.png");
        //---------
        //Stats
        int Health1 = 100;
        int SkeletonHealth = 40;
        int ZombieHealth = 60;
        int OldGuyHealth = 80;
        int BossHealth = 200;
        //-----------
        Scanner input = new Scanner(System.in);
        JFrame parent = new JFrame();
        Random ran = new Random();


        String response;
        response = JOptionPane.showInputDialog("What is your name?");

        String name = response;

        JOptionPane.showMessageDialog(null, "Welcome " + name + ", to Cave Explorer!");


        JOptionPane.showMessageDialog(null, "Your going to be fighting skeletons, zombies, and alot more....including him ≖‿≖");

        response = JOptionPane.showInputDialog("Are you ready to enter (~￣³￣)~ the Cave(yes/no)?");

        if (response.equals("no")) {
            JOptionPane.showMessageDialog(null, "Okay! I totally understand, I did mention all those scary stuff...\n                       (ノ-_-)ノ~┻━┻ well see ya!");
        } else {

            JOptionPane.showMessageDialog(null, "Alright I'm Fired up ୧☉□☉୨!!!\n      GAMEEEE ONNNNNN!");
            JOptionPane.showMessageDialog(null, " ", "Cave Explorer", JOptionPane.INFORMATION_MESSAGE, Instructions);
            JOptionPane.showMessageDialog(null, "Dang Bro! You didn't have to jump?!?!?!", "Cave Explorer", JOptionPane.INFORMATION_MESSAGE, Jump);
            JOptionPane.showMessageDialog(null, "You feel a fog surrounding you", "Cave Explorer", JOptionPane.INFORMATION_MESSAGE, Fog);
            JOptionPane.showMessageDialog(null, "Wait what is that!", "Cave Explorer", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Oh no! An enemy already?!?!", "Cave Explorer", JOptionPane.INFORMATION_MESSAGE, Skeleton);
            JOptionPane.showMessageDialog(null, "Look your gonna have to beat him with the power of random numbers!", "Cave Explorer", JOptionPane.INFORMATION_MESSAGE, Skeleton);
            JOptionPane.showMessageDialog(null, name + "'s Health:" + Health1 + "\n Skeleton's Health: " + SkeletonHealth, "Cave Explorer", JOptionPane.INFORMATION_MESSAGE);

            while (SkeletonHealth>0) {
                for (int iCount = 0; iCount < 1; iCount++) {
                    int randomNumberA = ran.nextInt(30);
                    JOptionPane.showMessageDialog(null, "Attack dealt : " + randomNumberA, "Cave Explorer", JOptionPane.INFORMATION_MESSAGE);
                    SkeletonHealth = SkeletonHealth - randomNumberA;
                    JOptionPane.showMessageDialog(null, name + "'s Health:" + Health1 + "\n Skeleton's Health: " + SkeletonHealth, "Cave Explorer", JOptionPane.INFORMATION_MESSAGE);
                }
                for (int BCount = 0; BCount < 1; BCount++) {
                    int randomNumberB = ran.nextInt(10);
                    JOptionPane.showMessageDialog(null, "Attack dealt : " + randomNumberB, "Cave Explorer", JOptionPane.INFORMATION_MESSAGE);
                    Health1 = Health1 - randomNumberB;
                    JOptionPane.showMessageDialog(null, name + "'s Health:" + Health1 + "\n Skeleton's Health: " + SkeletonHealth, "Cave Explorer", JOptionPane.INFORMATION_MESSAGE);

                }
            }
            JOptionPane.showMessageDialog(null, "Congrats! You defeated the Skeleton!", "Cave Explorer", JOptionPane.INFORMATION_MESSAGE, SkullDefeated);





        }
    }
}
