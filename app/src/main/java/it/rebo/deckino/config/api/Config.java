package it.rebo.deckino.config.api;

import java.util.Optional;

import it.rebo.deckino.model.api.action.Action;

/**
 * Interface for configuration management operations.
 * Provides methods to access serial communication settings.
 * 
 * @author Alessandro Rebosio
 * @since 1.0
 */
public interface Config {

    /**
     * Retrieves the serial port name from the configuration.
     *
     * @return an Optional containing the port name if configured and valid,
     *         empty otherwise
     */
    Optional<String> port();

    /**
     * Retrieves the baud rate from the configuration.
     *
     * @return an Optional containing the baud rate if configured and valid,
     *         empty otherwise
     */
    Optional<Integer> baud();

    /**
     * Retrieves an action by its identifier from the configuration.
     *
     * @param id the identifier of the action
     * @return an Optional containing the Action if found and valid, empty otherwise
     */
    Optional<Action> action(String id);

}
