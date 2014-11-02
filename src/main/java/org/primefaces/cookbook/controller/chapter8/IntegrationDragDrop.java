package org.primefaces.cookbook.controller.chapter8;

import org.primefaces.cookbook.model.chapter8.Document;
import org.primefaces.event.DragDropEvent;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

/**
 * IntegrationDragDrop
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@ViewScoped
public class IntegrationDragDrop implements Serializable {

    private List<Document> availableDocs = new ArrayList<Document>();
    private List<Document> deletedDocs = new ArrayList<Document>();

    @PostConstruct
    public void initialize() {
        availableDocs.add(new Document("Perl script", 120, "Sara Schmidt", getCreationDate(), "perl"));
        availableDocs.add(new Document("Alex's master thesis", 850, "Alex Konradi", getCreationDate(), "dvi"));
        availableDocs.add(new Document("jQuery presentation", 687, "Jasper Morgan", getCreationDate(), "ppt"));
        availableDocs.add(new Document("Russian songs", 1020, "Urmel Night", getCreationDate(), "mid"));
        availableDocs.add(new Document("German songs", 2268, "Nicole Konradi", getCreationDate(), "mp3"));
        availableDocs.add(new Document("Cool flash multimedia", 2268, "John Wiese", getCreationDate(), "swf"));
        availableDocs.add(new Document("Windows custom sound", 84, "Sebastian Schwarz", getCreationDate(), "wav"));
        availableDocs.add(new Document("Currency exchange table", 1400, "Nadja Swift", getCreationDate(), "xls"));
        availableDocs.add(new Document("Search masks configuration", 33, "Andrew Andreev", getCreationDate(), "xml"));
    }

    public List<Document> getAvailableDocs() {
        return availableDocs;
    }

    public List<Document> getDeletedDocs() {
        return deletedDocs;
    }

    public void onDocumentDrop(DragDropEvent ddEvent) {
        Document doc = (Document) ddEvent.getData();
        deletedDocs.add(doc);
        availableDocs.remove(doc);
    }

    private Date getCreationDate() {
        Random random = new Random();
        int day = random.nextInt(30);
        int month = random.nextInt(Calendar.DECEMBER + 1);
        int year = 2014;
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);

        return calendar.getTime();
    }
}
