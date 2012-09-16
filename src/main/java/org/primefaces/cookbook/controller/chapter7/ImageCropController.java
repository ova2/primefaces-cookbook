package org.primefaces.cookbook.controller.chapter7;

import org.primefaces.model.CroppedImage;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 9/5/12
 */
@ManagedBean
@ViewScoped
public class ImageCropController implements Serializable {

    private CroppedImage croppedImage;

    private StreamedContent graphicText;

    public String crop() throws IOException {
        graphicText = new DefaultStreamedContent(new ByteArrayInputStream(croppedImage.getBytes()), "image/png");
        return null;
    }

    public CroppedImage getCroppedImage() {
        return croppedImage;
    }

    public void setCroppedImage(CroppedImage croppedImage) {
        this.croppedImage = croppedImage;
    }

    public StreamedContent getGraphicText() {
        return graphicText;
    }
}