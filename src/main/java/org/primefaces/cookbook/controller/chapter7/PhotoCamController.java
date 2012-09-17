package org.primefaces.cookbook.controller.chapter7;

import org.primefaces.event.CaptureEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.ByteArrayInputStream;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 9/10/12
 */
@ManagedBean
@SessionScoped
public class PhotoCamController implements Serializable {

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