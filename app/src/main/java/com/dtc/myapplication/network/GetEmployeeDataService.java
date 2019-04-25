package com.dtc.myapplication.network;

import com.dtc.myapplication.model.EmployeeList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Fournit les données JSON
 */
public interface GetEmployeeDataService {

    // http://navjacinth9.000webhostapp.com/json/retrofit-demo.php?company_no=123

    // nom du fichier qui fournira les données JSON
    @GET("retrofit-demo.php")

    // Call méthode type retour EmployeeList
    // @Query = paramètre d'URL
    Call<EmployeeList> getEmployeeData(@Query("company_no") int companyNo);
}
