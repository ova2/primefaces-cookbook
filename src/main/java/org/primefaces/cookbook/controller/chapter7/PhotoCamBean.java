package org.primefaces.cookbook.controller.chapter7;

import org.primefaces.event.CaptureEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.ByteArrayInputStream;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 9/10/12
 */
@Named
@SessionScoped
public class PhotoCamBean implements Serializable {

    private StreamedContent capturedImage;

    public StreamedContent getCapturedImage() {
        return capturedImage;
    }

    public void setCapturedImage(StreamedContent capturedImage) {
        this.capturedImage = capturedImage;
    }

    public void onCapture(CaptureEvent captureEvent) {
        byte[] data = captureEvent.getData();
        capturedImage = new DefaultStreamedContent(new ByteArrayInputStream(data));
    }
}