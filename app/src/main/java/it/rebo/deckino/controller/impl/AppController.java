package it.rebo.deckino.controller.impl;

import java.util.Objects;

import it.rebo.deckino.controller.api.Controller;
import it.rebo.deckino.model.api.Model;
import it.rebo.deckino.model.impl.AppModel;

/**
 * Application controller that delegates state queries to an underlying Model.
 *
 * <p>
 * This class implements {@code Controller} and acts as a thin wrapper around a
 * {@code Model} instance. It provides a default constructor that creates a new
 * {@code AppModel} and an alternate constructor that accepts an injected
 * {@code Model}
 * (useful for testing or swapping implementations).
 * </p>
 *
 * <p>
 * Currently the controller exposes {@link #isRunning()} which forwards to
 * {@link Model#isRunning()}.
 * </p>
 *
 * @see Controller
 * @see Model
 */
public class AppController implements Controller {

    private final Model model;

    /**
     * Create a controller.
     */
    public AppController() {
        this(new AppModel());
    }

    /**
     * Create a controller using the provided model.
     *
     * @param model the model to delegate to
     */
    public AppController(final Model model) {
        this.model = Objects.requireNonNull(model);
    }

    /**
     * Check whether the underlying model reports the application is running.
     *
     * @return true if the model is running, false otherwise
     */
    @Override
    public boolean isRunning() {
        return this.model.isRunning();
    }

}
