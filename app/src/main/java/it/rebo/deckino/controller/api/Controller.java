package it.rebo.deckino.controller.api;

/**
 * Represents a generic controller that can report whether it is currently
 * running.
 *
 * @see #isRunning()
 */
@FunctionalInterface
public interface Controller {

    /**
     * Returns whether this controller is currently running.
     *
     * @return true if the controller is running (initialized and able to process
     *         requests); false if it is stopped, not yet started, or has been shut
     *         down.
     */
    boolean isRunning();

}
