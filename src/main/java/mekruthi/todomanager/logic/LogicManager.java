package mekruthi.todomanager.logic;

import javafx.collections.ObservableList;
import mekruthi.todomanager.commons.core.ComponentManager;
import mekruthi.todomanager.commons.core.LogsCenter;
import mekruthi.todomanager.logic.commands.Command;
import mekruthi.todomanager.logic.commands.CommandResult;
import mekruthi.todomanager.logic.parser.Parser;
import mekruthi.todomanager.model.Model;
import mekruthi.todomanager.model.person.ReadOnlyPerson;
import mekruthi.todomanager.storage.Storage;

import java.util.logging.Logger;

/**
 * The main LogicManager of the app.
 */
public class LogicManager extends ComponentManager implements Logic {
    private final Logger logger = LogsCenter.getLogger(LogicManager.class);

    private final Model model;
    private final Parser parser;

    public LogicManager(Model model, Storage storage) {
        this.model = model;
        this.parser = new Parser();
    }

    @Override
    public CommandResult execute(String commandText) {
        logger.info("----------------[USER COMMAND][" + commandText + "]");
        Command command = parser.parseCommand(commandText);
        command.setData(model);
        return command.execute();
    }

    @Override
    public ObservableList<ReadOnlyPerson> getFilteredPersonList() {
        return model.getFilteredPersonList();
    }
}
