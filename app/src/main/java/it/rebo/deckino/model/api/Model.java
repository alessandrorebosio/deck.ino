package it.rebo.deckino.model.api;

/**
 * Simple model interface representing the application state.
 */
public interface Model {

    /**
     * Return true when the application is currently running.
     *
     * @return true if running, false otherwise
     */
    boolean isRunning();

    /**
     * Request the model to stop running.
     */
    void stop();

}
