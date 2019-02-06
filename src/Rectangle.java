public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(int width, int length){
        int area=(width*length);
        return area;
    }

    public int getDiagonal(int width, int length){
        int c2=(width^2+length^2);
        int diagonal=(c2^(1/2));
        return diagonal;
    }

    public boolean isSquare(int width, int length){
        if(getLength()==getWidth()){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return
            "This Rectangles is "+
                    this.getWidth()+" inches wide, "+
                    this.getLength()+" inches long, has a diagonal of "+
                    this.getDiagonal(getWidth(),getLength())+" and it is a square: "+
                    this.isSquare(getWidth(),getLength());
    }
}

