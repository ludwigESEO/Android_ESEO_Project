package fr.eseo.dis.couroulu.android_eseo_project.Data;

/**
 * Created by florent on 10/01/18.
 */

public class Poster {
    int idPoster;
    int project;
    String filePathPDF;

    public int getIdPoster() {
        return idPoster;
    }

    public void setIdPoster(int idPoster) {
        this.idPoster = idPoster;
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
