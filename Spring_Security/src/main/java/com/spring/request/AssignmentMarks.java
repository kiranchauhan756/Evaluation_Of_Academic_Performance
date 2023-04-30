package com.spring.request;

public class AssignmentMarks {

    private String assignType;
    private int  maxAssignMarks;

    public int  getObtainedAssignMarks() {
        return obtainedAssignMarks;
    }

    public void setObtainedAssignMarks(int obtainedAssignMarks) {
        this.obtainedAssignMarks = obtainedAssignMarks;
    }

    private int obtainedAssignMarks;

    public String getAssignType() {
        return assignType;
    }

    public void setAssignType(String assignType) {
        this.assignType = assignType;
    }

    public int  getMaxAssignMarks() {
        return maxAssignMarks;
    }

    public void setMaxAssignMarks(int maxAssignMarks) {
        this.maxAssignMarks = maxAssignMarks;
    }
}
