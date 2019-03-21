package com.lambdaschool.drugdataproject;

public class DrugDataRepository {
    public DrugDataModel getByBrandName(String name) {
        return DrugDataAPI.getByBrandName(name);
    }
}
