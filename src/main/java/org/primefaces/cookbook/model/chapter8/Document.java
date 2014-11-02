package org.primefaces.cookbook.model.chapter8;

import java.io.Serializable;
import java.util.Date;

/**
 * Document
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class Document implements Serializable {

    private String title;
    private int size;
    private String creator;
    private Date creationDate;
    private String extension;

    public Document(String title, int size, String creator, Date creationDate, String extension) {
        this.title = title;
        this.size = size;
        this.creator = creator;
        this.creationDate = creationDate;
        this.extension = extension;
    }

    public String getTitle() {
        return title;
    }

    public int getSize() {
        return size;
    }

    public String getCreator() {
        return creator;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getExtension() {
        return extension;
    }
}
