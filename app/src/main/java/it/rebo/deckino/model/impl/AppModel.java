package it.rebo.deckino.model.impl;

import it.rebo.deckino.model.api.Model;

/**
 * Default implementation of {@link Model} storing a simple running flag.
 */
public class AppModel implements Model {

    private boolean running;

    /**
     * Create a new model. The model is initially not running.
     */
    public AppModel() {
        this.running = false;
    }

    /**
     * Check if the model is running.
     *
     * @return true if running, false otherwise
     */
    @Override
    public boolean isRunning() {
        return this.running;
    }

    /**
     * Stop the model by setting the running flag to false.
     */
    @Override
    public void stop() {
        this.running = false;
    }

}
