package fr.eseo.dis.couroulu.android_eseo_project.Data;

/**
 * Created by florent on 10/01/18.
 */

public class Project {
    private int idProject;
    private String title;
    private String description;
    private int confidentiality;

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getConfidentiality() {
        return confidentiality;
    }

    public void setConfidentiality(int confidentiality) {
        this.confidentiality = confidentiality;
    }
}
