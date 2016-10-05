package mekruthi.todomanager.commons.events.ui;

import mekruthi.todomanager.commons.events.BaseEvent;
import mekruthi.todomanager.model.person.ReadOnlyPerson;

/**
 * Represents a selection change in the Person List Panel
 */
public class PersonPanelSelectionChangedEvent extends BaseEvent {


    private final ReadOnlyPerson newSelection;

    public PersonPanelSelectionChangedEvent(ReadOnlyPerson newSelection){
        this.newSelection = newSelection;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public ReadOnlyPerson getNewSelection() {
        return newSelection;
    }
}
