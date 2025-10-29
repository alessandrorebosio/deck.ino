package it.rebo.deckino.core.impl;

import java.util.Objects;

import it.rebo.deckino.controller.api.Controller;
import it.rebo.deckino.controller.impl.AppController;
import it.rebo.deckino.core.api.Engine;
import it.rebo.deckino.view.api.View;

/**
 * Basic engine implementation that polls the controller and keeps the
 * application running while the model indicates it should run.
 */
public class AppEngine implements Engine {

    private final Controller controller = new AppController();
    private final View view;

    /**
     * Create an engine using the provided view.
     *
     * @param view the view to close when stopping the engine
     */
    public AppEngine(final View view) {
        this.view = Objects.requireNonNull(view);
    }

    /**
     * Run the main loop until the controller reports the model is not running.
     */
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
        this.stop();
    }

    /**
     * Stop the engine and close the associated view if present.
     */
    @Override
    public void stop() {
        this.view.close();
    }

}
