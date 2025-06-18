package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert ein Haus. Der Teil mit "extends" wird später erklärt und jetzt ignoriert - oder wurde schon erklärt.
 */
public class Ball extends GraphicalObject {

    private int value;
    private int[] myColor;

    /**
     * Erzeugt ein neues Objekt der Klasse House
     */
    public Ball(double x, double y){
        setAttributes(x,y);
        this.value = (int)( Math.random()*98 + 1 );
    }

    // Überladen des Konstruktors
    public Ball(double x, double y, int value){
        setAttributes(x,y);
        this.value = value;
    }

    private void setAttributes(double x, double y){
        this.x = x;
        this.y = y;
        myColor = new int[3];
        myColor[0] = 255;
        myColor[1] = 255;
        myColor[2] = 255;
    }


    /**
     * Diese Methode zeichnet den die optische Repräsentation eines House-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor( myColor[0], myColor[1], myColor[2], 255);
        drawTool.drawFilledCircle(x,y,8);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawCircle(x,y,8);
        drawTool.drawText(x-7,y+5,""+value);
    }

    public void changeColor(int r, int g, int b){
        myColor[0] = r;
        myColor[1] = g;
        myColor[2] = b;
    }

    public int[] getMyColor() {
        return myColor;
    }

    /**
     * Wird mit jedem Frame vom Framework aufgerufen und dient zur Manipulation des Objekts im Verlauf
     * der Zeit.
     * @param dt die Sekunden, die seit dem letzten Aufruf von update vergangen sind
     */
    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }

}
