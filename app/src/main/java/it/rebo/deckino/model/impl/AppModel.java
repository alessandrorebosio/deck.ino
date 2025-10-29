package it.rebo.deckino.model.impl;

import it.rebo.deckino.model.api.Model;

public class AppModel implements Model {

    private boolean running;

    public AppModel() {
        this.running = false;
    }

    @Override
    public boolean isRunning() {
        return this.running;
    }

    @Override
    public void stop() {
        this.running = false;
    }

}
