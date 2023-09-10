package casestudies.pen;

import casestudies.pen.pens.GelPen;
import casestudies.pen.pens.Pen;
import casestudies.pen.writestrategies.SmoothWriteStrategy;

public class Client {
    public static void main(String[] args) {
        Pen reynoldsTrimax = new GelPen(new SmoothWriteStrategy());
    }
}
