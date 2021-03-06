package main.client.view.ExpressiveComponents.EyeComponents;

/**
 * Class for left eye, inherits from Eye
 *
 * @author Ejaz Saifudeen
 * @version 1.1
 */
public class LeftEye extends Eye {

    private static final int X = 190;
    private static final int Y = 172;

    /**
     * Constructor that calls super constructor with relevant
     * X, Y
     */
    public LeftEye() {
        super(X, Y);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void reset(int x, int y) {
        setFrame(x + X, y + Y, WIDTH, HEIGHT);
        super.reset(x, y);
    }
}
