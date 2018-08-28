package com.example.allan.agendorapptests.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.allan.agendorapptests.R;
import com.example.allan.agendorapptests.modelPeople.People;

import java.util.List;

public class ListAdapterPeople extends RecyclerView.Adapter<ListAdapterPeople.ListViewHolder> {

    private Context context;
    private List<People> peopleList;

    public ListAdapterPeople(Context context, List<People> peopleList) {
        this.context = context;
        this.peopleList = peopleList;
    }

    @Override
    public ListAdapterPeople.ListViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_peoples_view, parent, false);
        return new ListAdapterPeople.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListAdapterPeople.ListViewHolder holder, int position) {
        holder.peopleName.setText(peopleList.get(position).getName());
        holder.orgName.setText(peopleList.get(position).getOrganization().getName());

        String peopleImage = peopleList.get(position).getAvatar();

        Glide.with(context)
                .load(R.drawable.organization)
                .into(holder.orgImage);


        Glide.with(context)
                .load(peopleImage)
                .into(holder.peopleImage);



    }


    @Override
    public int getItemCount() {
        return peopleList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView peopleImage;
        ImageView orgImage;
        TextView peopleName;
        TextView orgName;

        public ListViewHolder(View itemView) {
            super(itemView);
            peopleImage = itemView.findViewById(R.id.peopleImage);
            orgImage = itemView.findViewById(R.id.orgImage);
            peopleName = itemView.findViewById(R.id.peopleName);
            orgName = itemView.findViewById(R.id.orgName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        People clickedDataItem = peopleList.get(position);
                        Intent intent = new Intent(context, PeoplesDetailsActivity.class);

                        intent.putExtra("people_image", peopleList.get(position).getAvatar());
                        intent.putExtra("people_name", peopleList.get(position).getName());
                        intent.putExtra("people_role", peopleList.get(position).getRole());
                        intent.putExtra("people_orgName", peopleList.get(position).getOrganization().getName());
                        intent.putExtra("people_description", peopleList.get(position).getDescription());
                        intent.putExtra("people_cpf", peopleList.get(position).getCpf());
                        intent.putExtra("people_birthday", peopleList.get(position).getBirthday());
                        intent.putExtra("people_streetName", peopleList.get(position).getAddress().getStreetName());
                        intent.putExtra("people_streetNumber", peopleList.get(position).getAddress().getStreetNumber());
                        intent.putExtra("people_postal_code", peopleList.get(position).getAddress().getPostalCode());
                        intent.putExtra("people_district", peopleList.get(position).getAddress().getDistrict());
                        intent.putExtra("people_city", peopleList.get(position).getAddress().getCity());
                        intent.putExtra("people_state", peopleList.get(position).getAddress().getState());
                        intent.putExtra("people_country", peopleList.get(position).getAddress().getCountry());
                        intent.putExtra("people_category", peopleList.get(position).getCategory().getName());
                        intent.putExtra("people_email", peopleList.get(position).getContact().getEmail());
                        intent.putExtra("people_phone", peopleList.get(position).getContact().getWork());
                        intent.putExtra("people_cellphone", peopleList.get(position).getContact().getMobile());

                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);

                        Toast.makeText(view.getContext(), clickedDataItem.getName(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
