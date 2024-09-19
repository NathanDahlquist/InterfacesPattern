import java.awt.*;

public class BigRectangleFilter implements Filter {
    @Override
    public boolean accept(Object x){
        Rectangle r = (Rectangle) x;
        int perimeter = (r.height * 2) + (r.width * 2);
        if(perimeter > 10){
            return true;
        }
        else{
            return false;
        }
    }
}
