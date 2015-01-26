package org.primefaces.cookbook.controller.chapter7;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 10/18/12
 */
@Named
@SessionScoped
public class DynaImageBean implements Serializable {

    public StreamedContent getGraphicText() throws IOException {
        InputStream stream = this.getClass().getResourceAsStream("/chapter7/primefaces.jpg");
        return new DefaultStreamedContent(stream);
    }
}
