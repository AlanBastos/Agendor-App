package com.example.allan.agendorapptests.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.allan.agendorapptests.R;
import com.example.allan.agendorapptests.modelPeople.DataResponse;
import com.example.allan.agendorapptests.modelPeople.People;
import com.example.allan.agendorapptests.service.PeopleApi;
import com.example.allan.agendorapptests.service.PeopleService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FragmentPeoples extends Fragment {

    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_peoples, container, false);

        recyclerView = view.findViewById(R.id.recylerviewpeoples);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        getData();

        return view;
    }

    private void getData() {

        PeopleService peopleService = new PeopleService();
        PeopleApi peopleApi = peopleService.getPeople().create(PeopleApi.class);
        Call<DataResponse> call = peopleApi.getResults();
        call.enqueue(new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
                List<People> people = response.body().getData();
                recyclerView.setAdapter(new ListAdapterPeople(getContext(), people));
                recyclerView.smoothScrollToPosition(0);
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {

            }
        });
    }
}
