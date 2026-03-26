package org.example.model;

public class Student {
    private String sname;
    private String sno;
    private String sgender;
    private String cname;

    public Student() {
    }

    public Student(String sname, String sno, String sgender, String cname) {
        this.sname = sname;
        this.sno = sno;
        this.sgender = sgender;
        this.cname = cname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", sno='" + sno + '\'' +
                ", sgender='" + sgender + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }
}
