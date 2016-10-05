package mekruthi.todomanager.model;


import java.util.List;

import mekruthi.todomanager.model.person.ReadOnlyPerson;
import mekruthi.todomanager.model.person.UniquePersonList;
import mekruthi.todomanager.model.tag.Tag;
import mekruthi.todomanager.model.tag.UniqueTagList;

/**
 * Unmodifiable view of an address book
 */
public interface ReadOnlyAddressBook {

    UniqueTagList getUniqueTagList();

    UniquePersonList getUniquePersonList();

    /**
     * Returns an unmodifiable view of persons list
     */
    List<ReadOnlyPerson> getPersonList();

    /**
     * Returns an unmodifiable view of tags list
     */
    List<Tag> getTagList();

}
