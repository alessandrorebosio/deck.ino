package it.rebo.deckino.core.api;

/**
 * Simple engine interface that controls the application's lifecycle.
 *
 * <p>
 * Implementations should start processing in {@link #run()} and
 * stop when {@link #stop()} is called.
 * </p>
 */
public interface Engine {

    /**
     * Start or continue the engine's main loop or processing.
     */
    void run();

    /**
     * Request the engine to stop and release any held resources.
     */
    void stop();

}
