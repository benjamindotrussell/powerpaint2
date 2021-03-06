/*
 * TCSS 305 - Assignment 5: PowerPaint 
 */
package listenter;

import gui.PaintPanel;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

/**
 * class that listens for someone to select the line button and then implements the 
 * action associated with drawing a line.
 * @author Ben Russell
 * @version 11/8/2015
 */
public class Line extends AbstractAction {
    /** A generated serialization ID. */
    private static final long serialVersionUID = 5959325849437523778L;
    /** The JPanel to associate with this Action. */
    private final PaintPanel myPanel;
    /**
     * Construct this Action.
     * 
     * @param thePanel a JPanel to associate with this Action.
     * @param theIcon the icon that will be attached to the line button.
     */
    public Line(final PaintPanel thePanel, final ImageIcon theIcon) {
        super("Line", theIcon);
        myPanel = thePanel;
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_L);
        putValue(Action.SELECTED_KEY, true);
    }
    @Override
    public void actionPerformed(final ActionEvent thePaint) {
        PaintPanel.setToolChecker(2);
        myPanel.repaint();
    }
}

