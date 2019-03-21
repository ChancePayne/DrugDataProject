package com.lambdaschool.drugdataproject;

import java.util.ArrayList;

public class DrugDataRepository {
    public static DrugDataModel getByBrandName(String name) {
        return DrugDataAPI.getByBrandName(name);
    }

    public static ArrayList<DrugDataModel> getByPartialBrandName(String name) {
        return DrugDataAPI.getByPartialBrandName(name);
    }
}
