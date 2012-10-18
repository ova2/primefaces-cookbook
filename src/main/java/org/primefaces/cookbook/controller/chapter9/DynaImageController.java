package org.primefaces.cookbook.controller.chapter9;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 10/18/12
 */
@ManagedBean
@SessionScoped
public class DynaImageController implements Serializable {

    public StreamedContent getGraphicText() throws IOException {
        InputStream stream = this.getClass().getResourceAsStream("/chapter9/primefaces.jpg");
        return new DefaultStreamedContent(stream);
    }
}
