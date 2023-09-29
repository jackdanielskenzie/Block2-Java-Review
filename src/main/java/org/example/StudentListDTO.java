package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public abstract class StudentListDTO {

    @JsonProperty("students")
    private List<Students> students;

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }
}
