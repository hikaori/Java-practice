package JAVA_FOUNDATION_4th_edition_PP5.PP5_6;

/**
 * Created by kaorihirata on 2017-04-28.
 */
public class Box {
    private int hight,width,depth;
    private boolean full;

    public Box(int hight,int width, int depth){
        this.hight=hight;
        this.width=width;
        this.depth=depth;
    }

    public int getDepth() {
        return depth;
    }

    public int getHight() {
        return hight;
    }

    public int getWidth() {
        return width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString(){
       String discription = "H = "+hight+"W = "+width+"D"+depth+ ((full)?"full":"not full");
       return discription;
    }
}
