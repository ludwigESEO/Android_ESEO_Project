package fr.eseo.dis.couroulu.android_eseo_project.Data;

/**
 * Created by florent on 10/01/18.
 */

public class Presentation {
    int idPresentation;
    int project;
    String filePathPDF;

    public int getIdPresentation() {
        return idPresentation;
    }

    public void setIdPresentation(int idPresentation) {
        this.idPresentation = idPresentation;
    }

    public int getProject() {
        return project;
    }

    public void setProject(int project) {
        this.project = project;
    }

    public String getFilePathPDF() {
        return filePathPDF;
    }

    public void setFilePathPDF(String filePathPDF) {
        this.filePathPDF = filePathPDF;
    }
}
