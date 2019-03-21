package com.lambdaschool.drugdataproject;

public class DrugDataRepository {
    public static DrugDataModel getByBrandName(String name) {
        return DrugDataAPI.getByBrandName(name);
    }
}
