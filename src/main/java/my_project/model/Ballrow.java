package my_project.model;

import KAGO_framework.control.ViewController;

public class Ballrow {

    // Anzahl der Kugeln
    private int numberOfBalls;
    private Ball[] myBalls;
    private ViewController myViewController;

    public Ballrow(int numberOfBalls, ViewController viewController) {
        myViewController = viewController;
        this.numberOfBalls = numberOfBalls;
        myBalls = new Ball[numberOfBalls];
        generateBalls();
    }

    private void generateBalls(){
        for(int i = 0; i < numberOfBalls; i++){
            myBalls[i] = new Ball(10+i*18,200);
            myViewController.draw(myBalls[i]);
        }
    }

    private void deMark(){
        for(int i = 0; i < numberOfBalls; i++){
            myBalls[i].changeColor(255,255,255);
        }
    }

    private void search(int number){
        deMark(); // entfernt alle Markierungen

    }
}
