package drawingshapes;
public class Drawingtool {

    public static void main(String[] args) {
       Shape n=(Shape) new Circle();
       n=new FillColor(n, FillColor.Color.RED);
       n=new BorderStyle(n, BorderStyle.borderStyle.DASHED);
       n=new BorderColor(n, BorderColor.Color.BLACK);
       n=new BorderThickness(n,2.0); 
       n.draw();
    }
    
}
