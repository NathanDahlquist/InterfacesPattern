import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        BigRectangleFilter filter = new BigRectangleFilter();
        ArrayList<Object> rect = new ArrayList<>();
        int rectangleCounter = 0;

        rect.add(new Rectangle(10,20));
        rect.add(new Rectangle(5,2));
        rect.add(new Rectangle(20,1));
        rect.add(new Rectangle(3,15));
        rect.add(new Rectangle(1,2));
        rect.add(new Rectangle(7,5));
        rect.add(new Rectangle(2,2));
        rect.add(new Rectangle(10,10));
        rect.add(new Rectangle(9,7));
        rect.add(new Rectangle(14,4));

        for(Object r : rect){
            rectangleCounter = rectangleCounter + 1;
            if(filter.accept(r)){
                System.out.println("Rectangle:" + rectangleCounter + " is big enough");
            }
        }
    }
}
