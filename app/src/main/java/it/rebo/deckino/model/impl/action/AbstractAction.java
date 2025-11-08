package it.rebo.deckino.model.impl.action;

import java.io.IOException;
import java.util.Objects;

import it.rebo.deckino.model.api.action.Action;

/**
 * Base implementation for peripherals that require a concrete execution step.
 * 
 * @author Alessandro Rebosio
 * @since 1.0
 */
public abstract class AbstractAction implements Action {

    private final String value;

    /**
     * Constructs a new AbstractAction with the specified value.
     *
     * @param value the value parameter for the action
     * @throws NullPointerException     if the valueParam is null
     * @throws IllegalArgumentException if the valueParam is blank or empty
     */
    public AbstractAction(final String value) {
        this.value = Objects.requireNonNull(value, "Value cannot be null");

        if (value.isBlank()) {
            throw new IllegalArgumentException("Value cannot be blank or empty");
        }
    }

    /**
     * Executes the action, handling any IO exceptions that may occur.
     * 
     * @throws IllegalStateException if the execution fails due to an IO error
     */
    @Override
    public void doAction() {
        try {
            perform(this.value);
        } catch (final IOException e) {
            throw new IllegalStateException("Launch failed", e);
        }
    }

    /**
     * Performs the specific action implementation.
     *
     * @param valueParam the value parameter for the action
     * @throws IOException if an I/O error occurs during execution
     */
    protected abstract void perform(String valueParam) throws IOException;

}
