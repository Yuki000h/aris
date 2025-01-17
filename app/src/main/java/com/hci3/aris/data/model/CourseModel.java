package com.hci3.aris.data.model;

import java.util.Locale;

public class CourseModel {

    // Course Details
    private final String courseCode;
    private final String courseName;
    private final int courseUnits;

    // Course Grades
    private final double gradePrelim;
    private final double gradeMidterm;
    private final double gradeFinal;

    // Constructor
    public CourseModel(String courseCode, String courseName, int courseUnits,
                       double gradePrelim, double gradeMidterm, double gradeFinal) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseUnits = courseUnits;
        this.gradePrelim = gradePrelim;
        this.gradeMidterm = gradeMidterm;
        this.gradeFinal = gradeFinal;
    }

    // Getters
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseUnits() {
        return courseUnits;
    }

    public String getCourseGpa() {
        double gpa = (gradePrelim + gradeMidterm + gradeFinal) / 3;
        return String.format(Locale.ENGLISH, "%.2f", gpa);
    }

    public String getGradePrelim() {
        return String.format(Locale.ENGLISH, "%.2f", gradePrelim);
    }

    public String getGradeMidterm() {
        return String.format(Locale.ENGLISH, "%.2f", gradeMidterm);
    }

    public String getGradeFinal() {
        return String.format(Locale.ENGLISH, "%.2f", gradeFinal);
    }
}
