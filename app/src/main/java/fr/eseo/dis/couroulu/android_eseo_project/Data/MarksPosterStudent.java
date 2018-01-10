package fr.eseo.dis.couroulu.android_eseo_project.Data;

/**
 * Created by florent on 10/01/18.
 */

public class MarksPosterStudent {
    int idStudent;
    int idJury;
    int idMember;
    float mark;

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdJury() {
        return idJury;
    }

    public void setIdJury(int idJury) {
        this.idJury = idJury;
    }

    public int getIdMember() {
        return idMember;
    }

    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
}
