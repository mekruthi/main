package mekruthi.todomanager.commons.events.ui;

import mekruthi.todomanager.commons.events.BaseEvent;
import mekruthi.todomanager.logic.commands.Command;

/**
 * Indicates an attempt to execute an incorrect command
 */
public class IncorrectCommandAttemptedEvent extends BaseEvent {

    public IncorrectCommandAttemptedEvent(Command command) {}

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
