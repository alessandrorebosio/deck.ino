package it.rebo.deckino.controller.impl;

import it.rebo.deckino.controller.api.Controller;
import it.rebo.deckino.model.api.Model;
import it.rebo.deckino.model.impl.AppModel;

public class AppController implements Controller {

    private final Model model;

    public AppController() {
        this(new AppModel());
    }

    public AppController(final Model model) {
        this.model = model;
    }

    @Override
    public boolean isRunning() {
        return this.model.isRunning();
    }

}
