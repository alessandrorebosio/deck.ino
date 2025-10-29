package it.rebo.deckino.view.api;

/**
 * Minimal view interface used by the application to represent a UI.
 */
@FunctionalInterface
public interface View {

    /**
     * Close the view and release UI resources.
     */
    void close();

}
