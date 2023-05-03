package SolidPrinciples;

import java.util.List;

public class Area_Calculator {
    public int sum(List<Object> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Object shape = shapes.get(i);
            if (shape instanceof Square) {
                sum += Math.pow(((Square) shape).getLength(), 2);
            }
            if (shape instanceof Circles) {
                sum += Math.PI * Math.pow(((Circles) shape).getRadius(), 2);

            }
        }
        return sum;

    }


}





