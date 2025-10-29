package it.rebo.deckino.view.impl;

import java.awt.event.WindowEvent;
import java.io.Serial;

import javax.swing.JFrame;

import it.rebo.deckino.view.api.View;

/**
 * Simple Swing-based view used by the application.
 *
 * <p>
 * This class extends {@link JFrame} and implements {@link View}.
 * It provides a small window titled "DECKINO" and a method to close it.
 * </p>
 */
public class AppView extends JFrame implements View {

    public static final String TITLE = "DECKINO";

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Create and show the application window.
     */
    public AppView() {
        super(TITLE);

        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.setVisible(true);
        super.pack();
    }

    /**
     * Close the view by posting a window closed event.
     */
    @Override
    public void close() {
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSED));
    }

}
