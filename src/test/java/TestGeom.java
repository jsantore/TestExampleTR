import org.junit.Test;

import java.awt.*;

public class TestGeom {
    @Test
    public void testDist(){
        Point p1 = new Point(0,3);
        Point p2 = new Point(4, 0);
        assert BasicGeom.calcDistance(p1,p2) == 5;
        assert true;
    }

    @Test
    public void testZeroDist(){
        Point p1 = new Point(23,546);
        Point p2 = new Point(23, 546);
        assert BasicGeom.calcDistance(p1,p2) ==0;
    }
}
