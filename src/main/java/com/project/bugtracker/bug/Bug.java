package com.project.bugtracker.bug;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bug {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "reporter")
    private String reporter;

    public Bug() {}

    public Bug(String n, String r) {
        this.title = n;
        this.reporter = r;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    @Override
    public String toString() {
        return "Bug: " + this.title + ", " + this.reporter;
    }
}
