package org.example.model;

public class Collegs {
    private String cno;
    private String cname;

    public Collegs() {
    }

    public Collegs(String cno, String cname) {
        this.cno = cno;
        this.cname = cname;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Collegs{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }
}
