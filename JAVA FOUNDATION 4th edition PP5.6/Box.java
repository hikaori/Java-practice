/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbook;

/**
 *
 * @author hiratakaori
 */

//textbook5_6

public class Box{
    private int height,width,depth; 
    private boolean full;
        
    // Constructor
    public Box(int h, int w, int d) {
        this.height = h;
        this.width = w;
        this.depth = d;
        full = false;
    }
    
    public int getHeight(){
        return this.height; // ①return this.height では駄目？　dog は、thisが付いてない。
    }
    public int getDepth(){
        return this.depth;
    }
    public int getWidth(){
        return this.width;
    }
    /**public boolean getFull(){ // 何故fullはいらないの？ture/falseしかないから？
        return this.full;
    }*/
    
    public void setHeight(int newHeight){
        this.height = newHeight;  
    }
    public void setDepth(int newDepth){ //setDepth(50)
        this.depth = newDepth;
    }
    public void setWidth(int newWidth){
        this.width = newWidth;
    }
    public void setFull(boolean fullUpdate){
        this.full = fullUpdate;
    }
    
    public String toString(){
        String description = "Box size: " + this.height + " H x " + this.width + " W x " + this.depth + " D";
        description += "\nThis box is " + ((this.full) ? "full." : "not full."); //『this.』は付けても付けなくても同じ意味になる。
        // 『+=』　＝　連結
        return description;
    }
}

    
    

 