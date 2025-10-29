package it.rebo.deckino;

import it.rebo.deckino.core.impl.AppEngine;
import it.rebo.deckino.view.impl.AppView;

/**
 * Entry point of the app, it creates a controller and launches the GUI
 * so that the game can start.
 * 
 * @since 1.0
 */
public final class App {

    private App() {
    }

    /**
     * Starts the application.
     * 
     * @param args unused
     */
    public static void main(final String[] args) {
        new AppEngine(new AppView()).run();
    }
}
