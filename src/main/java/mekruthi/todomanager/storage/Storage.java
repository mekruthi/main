package mekruthi.todomanager.storage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

import mekruthi.todomanager.commons.events.model.AddressBookChangedEvent;
import mekruthi.todomanager.commons.events.storage.DataSavingExceptionEvent;
import mekruthi.todomanager.commons.exceptions.DataConversionException;
import mekruthi.todomanager.model.ReadOnlyAddressBook;
import mekruthi.todomanager.model.UserPrefs;

/**
 * API of the Storage component
 */
public interface Storage extends AddressBookStorage, UserPrefsStorage {

    @Override
    Optional<UserPrefs> readUserPrefs() throws DataConversionException, IOException;

    @Override
    void saveUserPrefs(UserPrefs userPrefs) throws IOException;

    @Override
    String getAddressBookFilePath();

    @Override
    Optional<ReadOnlyAddressBook> readAddressBook() throws DataConversionException, IOException;

    @Override
    void saveAddressBook(ReadOnlyAddressBook addressBook) throws IOException;

    /**
     * Saves the current version of the Address Book to the hard disk.
     *   Creates the data file if it is missing.
     * Raises {@link DataSavingExceptionEvent} if there was an error during saving.
     */
    void handleAddressBookChangedEvent(AddressBookChangedEvent abce);
}
