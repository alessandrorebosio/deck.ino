package it.rebo.deckino.view.impl;

import java.awt.event.WindowEvent;
import java.io.Serial;

import javax.swing.JFrame;

import it.rebo.deckino.view.api.View;

public class AppView extends JFrame implements View {

    public static final String TITLE = "DECKINO";

    @Serial
    private static final long serialVersionUID = 1L;

    public AppView() {
        super(TITLE);

        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.setVisible(true);
        super.pack();
    }

    @Override
    public void close() {
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSED));
    }

}
