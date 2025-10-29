package it.rebo.deckino.core.impl;

import it.rebo.deckino.controller.api.Controller;
import it.rebo.deckino.controller.impl.AppController;
import it.rebo.deckino.core.api.Engine;
import it.rebo.deckino.view.api.View;

public class AppEngine implements Engine {

    private final Controller controller = new AppController();
    private final View view;

    public AppEngine(final View view) {
        this.view = view;
    }

    @Override
    public void run() {
        while (this.controller.isRunning()) {
            try {
                Thread.sleep(100);
            } catch (final InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    @Override
    public void stop() {
        if (this.view != null) {
            this.view.close();
        }
    }

}
