package com.example.allan.agendorapptests.presenter;

import com.example.allan.agendorapptests.modelOrg.Organization;
import com.example.allan.agendorapptests.service.OrgService;
import com.example.allan.agendorapptests.view.OrganizationView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OrganizationsPresenter {

    private OrganizationView organizationView;
    private OrgService orgService;

    public OrganizationsPresenter(OrganizationView view) {
        this.organizationView = view;

        if (this.orgService == null) {
            this.orgService = new OrgService();
        }
    }

//    public void getOrganizations() {
//        orgService.getOrg()
//                .getResults()
//                .enqueue(new Callback<Organization>() {
//                    @Override
//                    public void onResponse(Call<Organization> call, Response<Organization> response) {
//                        Organization organization = response.body();
//
//                    }
//
//                    @Override
//                    public void onFailure(Call<Organization> call, Throwable t) {
//
//                    }
//                });
//    }

}
