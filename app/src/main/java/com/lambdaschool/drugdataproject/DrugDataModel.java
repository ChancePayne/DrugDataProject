package com.lambdaschool.drugdataproject;

public class DrugDataModel {
    private int id;
    private String company, drugBrandName, icd10DiagnosisCode, icd10DxDesc;

    public DrugDataModel(int id, String company, String drugBrandName, String icd10DiagnosisCode, String icd10DxDesc) {
        this.id = id;
        this.company = company;
        this.drugBrandName = drugBrandName;
        this.icd10DiagnosisCode = icd10DiagnosisCode;
        this.icd10DxDesc = icd10DxDesc;
    }

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getDrugBrandName() {
        return drugBrandName;
    }

    public String getIcd10DiagnosisCode() {
        return icd10DiagnosisCode;
    }

    public String getIcd10DxDesc() {
        return icd10DxDesc;
    }
}
