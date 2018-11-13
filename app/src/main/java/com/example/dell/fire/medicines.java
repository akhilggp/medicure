package com.example.dell.fire;

public class medicines {
    private String tablet,symptoms;
   private String child_dose,adult_dose;
    public medicines(){

    }

    public medicines(String tablet, String symptoms, String child_dose, String adult_dose) {
        this.tablet = tablet;
        this.symptoms = symptoms;
        this.child_dose = child_dose;
        this.adult_dose = adult_dose;
    }

    public String getTablet() {
        return tablet;
    }

    public void setTablet(String tablet) {
        this.tablet = tablet;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getChild_dose() {
        return child_dose;
    }

//    //public void setChild_dose(Float child_dose) {
//        this.child_dose = child_dose;
//    }

    public String getAdult_dose() {
        return adult_dose;
    }

//    //public void setAdult_dose(Float adult_dose) {
//        this.adult_dose = adult_dose;
//    }
}
