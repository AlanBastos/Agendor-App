package com.example.allan.agendorapptests.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.allan.agendorapptests.R;
import com.example.allan.agendorapptests.modelOrg.Organization;

import java.util.List;

public class ListAdapterOrganization extends RecyclerView.Adapter<ListAdapterOrganization.ListViewHolder> {

    private Context context;
    private List<Organization> organizationList;

    public ListAdapterOrganization(Context context, List<Organization> organizationList) {
        this.context = context;
        this.organizationList = organizationList;
    }

    @Override
    public ListAdapterOrganization.ListViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_organizations_view, parent, false);
        return new ListAdapterOrganization.ListViewHolder(view);

    }

    @Override
    public void onBindViewHolder( ListAdapterOrganization.ListViewHolder holder, int position) {
        holder.orgName.setText(organizationList.get(position).getName());

        String orgImage = organizationList.get(position).getLogo().getThumbLarge();

        Glide.with(context)
                .load(orgImage)
                .into(holder.orgImage);
    }

    @Override
    public int getItemCount() {
        return organizationList.size();
    }


    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView orgImage;
        TextView orgName;

        public ListViewHolder(View itemView) {
            super(itemView);
            orgImage = itemView.findViewById(R.id.image_organization);
            orgName = itemView.findViewById(R.id.organization_name);
            
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        Organization clickedDataItem = organizationList.get(position);
                        Intent intent = new Intent(context, OrganizationsDetailsActivity.class);

                        intent.putExtra("organization_image", organizationList.get(position).getLogo().getThumb());
                        intent.putExtra("organization_name", organizationList.get(position).getName());
                        intent.putExtra("organization_sector", organizationList.get(position).getSector().getName());
                        intent.putExtra("organization_website", organizationList.get(position).getWebsite());
                        intent.putExtra("organization_orgName", organizationList.get(position).getName());
                        intent.putExtra("organization_description", organizationList.get(position).getDescription());
                        intent.putExtra("organization_cnpj", organizationList.get(position).getCnpj());
                        intent.putExtra("organization_streetName", organizationList.get(position).getAddress().getStreetName());
                        intent.putExtra("organization_streetNumber", organizationList.get(position).getAddress().getStreetNumber());
                        intent.putExtra("organization_postal_code", organizationList.get(position).getAddress().getPostalCode());
                        intent.putExtra("organization_district", organizationList.get(position).getAddress().getDistrict());
                        intent.putExtra("organization_city", organizationList.get(position).getAddress().getCity());
                        intent.putExtra("organization_state", organizationList.get(position).getAddress().getState());
                        intent.putExtra("organization_country", organizationList.get(position).getAddress().getCountry());
                        intent.putExtra("organization_category", organizationList.get(position).getCategory().getName());
                        intent.putExtra("organization_email", organizationList.get(position).getContact().getEmail());
                        intent.putExtra("organization_phone", organizationList.get(position).getContact().getWork());
                        intent.putExtra("organization_cellphone", organizationList.get(position).getContact().getMobile());

                        
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);

                        Toast.makeText(view.getContext(), clickedDataItem.getName(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

}
