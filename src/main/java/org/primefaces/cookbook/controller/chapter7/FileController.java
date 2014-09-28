package org.primefaces.cookbook.controller.chapter7;

import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.InputStream;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 9/5/12
 */
@Named
@ViewScoped
public class FileController implements Serializable {

    private UploadedFile file;

    private StreamedContent downloadFile;

    public FileController() {
        InputStream stream = this.getClass().getResourceAsStream("/chapter7/PFSamplePDF.pdf");
        downloadFile = new DefaultStreamedContent(stream, "application/pdf", "PFSample.pdf");
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public void handleFileUpload(FileUploadEvent event) {
        UploadedFile file = event.getFile();
        MessageUtil.addInfoMessage("upload.successful", file.getFileName() + " is uploaded.");
    }

    public StreamedContent getDownloadFile() {
        return downloadFile;
    }
}