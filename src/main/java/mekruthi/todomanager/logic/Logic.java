package mekruthi.todomanager.logic;

import javafx.collections.ObservableList;
import mekruthi.todomanager.logic.commands.CommandResult;
import mekruthi.todomanager.model.person.ReadOnlyPerson;

/**
 * API of the Logic component
 */
public interface Logic {
    /**
     * Executes the command and returns the result.
     * @param commandText The command as entered by the user.
     * @return the result of the command execution.
     */
    CommandResult execute(String commandText);

    /** Returns the filtered list of persons */
    ObservableList<ReadOnlyPerson> getFilteredPersonList();

}
