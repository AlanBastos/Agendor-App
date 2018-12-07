package com.example.allan.agendorapptests.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.allan.agendorapptests.R;
import com.example.allan.agendorapptests.modelOrg.DataResponse;
import com.example.allan.agendorapptests.modelOrg.Organization;
import com.example.allan.agendorapptests.service.OrgApi;
import com.example.allan.agendorapptests.service.OrgService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FragmentOrganizations extends Fragment {

    RecyclerView recyclerView;


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_organizations, container, false);


        recyclerView = view.findViewById(R.id.recylervieworganizations);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        getData();

        return view;

    }

    private void getData() {

        OrgService Org = new OrgService();
        OrgApi orgApi = Org.getOrg().create(OrgApi.class);
        Call<DataResponse> call = orgApi.getResults();
        call.enqueue(new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
                List<Organization> organizations = response.body().getData();
                recyclerView.setAdapter(new ListAdapterOrganization(getContext(), organizations));
                recyclerView.smoothScrollToPosition(0);
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {

            }
        });

    }

}
