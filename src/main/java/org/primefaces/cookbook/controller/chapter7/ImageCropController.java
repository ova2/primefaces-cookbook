package org.primefaces.cookbook.controller.chapter7;

import org.primefaces.model.CroppedImage;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 9/5/12
 */
@ManagedBean
@SessionScoped
public class ImageCropController implements Serializable {

    private CroppedImage croppedImageSimple;
    private CroppedImage croppedImageCoordinates;
    private CroppedImage croppedImageAspectRatio;
    private CroppedImage croppedImageMinMaxSize;

    private StreamedContent graphicText;

    public String cropSimple() throws IOException {
        graphicText = new DefaultStreamedContent(new ByteArrayInputStream(croppedImageSimple.getBytes()));
        return null;
    }

    public String cropCoordinates() throws IOException {
        graphicText = new DefaultStreamedContent(new ByteArrayInputStream(croppedImageCoordinates.getBytes()));
        return null;
    }

    public String cropAspectRatio() throws IOException {
        graphicText = new DefaultStreamedContent(new ByteArrayInputStream(croppedImageAspectRatio.getBytes()));
        return null;
    }

    public String cropMinMaxSize() throws IOException {
        graphicText = new DefaultStreamedContent(new ByteArrayInputStream(croppedImageMinMaxSize.getBytes()));
        return null;
    }

    public StreamedContent getGraphicText() {
        return graphicText;
    }

    public CroppedImage getCroppedImageSimple() {
        return croppedImageSimple;
    }

    public void setCroppedImageSimple(CroppedImage croppedImageSimple) {
        this.croppedImageSimple = croppedImageSimple;
    }

    public CroppedImage getCroppedImageCoordinates() {
        return croppedImageCoordinates;
    }

    public void setCroppedImageCoordinates(CroppedImage croppedImageCoordinates) {
        this.croppedImageCoordinates = croppedImageCoordinates;
    }

    public CroppedImage getCroppedImageAspectRatio() {
        return croppedImageAspectRatio;
    }

    public void setCroppedImageAspectRatio(CroppedImage croppedImageAspectRatio) {
        this.croppedImageAspectRatio = croppedImageAspectRatio;
    }

    public CroppedImage getCroppedImageMinMaxSize() {
        return croppedImageMinMaxSize;
    }

    public void setCroppedImageMinMaxSize(CroppedImage croppedImageMinMaxSize) {
        this.croppedImageMinMaxSize = croppedImageMinMaxSize;
    }
}