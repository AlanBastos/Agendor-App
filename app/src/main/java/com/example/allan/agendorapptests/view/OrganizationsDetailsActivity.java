package com.example.allan.agendorapptests.view;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.allan.agendorapptests.R;

public class OrganizationsDetailsActivity extends AppCompatActivity {

    TextView oName, oSector, oWebsite, oDescription, oCnpj, oAddress, oCategory, oEmail, oPhone, oCellphone;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizations_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = findViewById(R.id.orgImage);
        oName = findViewById(R.id.orgName);
        oSector = findViewById(R.id.orgSector);
        oWebsite = findViewById(R.id.website);
        oDescription = findViewById(R.id.orgdescription);
        oCnpj = findViewById(R.id.textView23);
        oAddress = findViewById(R.id.orgAddress);
        oCategory = findViewById(R.id.categoria);
        oEmail = findViewById(R.id.orgEmail);
        oPhone = findViewById(R.id.orgPhone);
        oCellphone = findViewById(R.id.orgcellphone);

        Intent intentForStartThisActivity = getIntent();
        if (intentForStartThisActivity.hasExtra("organization_image")) {


            String orgImage = getIntent().getExtras().getString("organization_image");
            String orgName = getIntent().getExtras().getString("organization_name");
            String orgSector = getIntent().getExtras().getString("organization_sector");
            String orgWebsite = getIntent().getExtras().getString("organization_website");
            String orgDescription = getIntent().getExtras().getString("organization_description");
            String orgCnpj = getIntent().getExtras().getString("organization_cnpj");
            String orgStreetName = getIntent().getExtras().getString("organization_streetName");
            int orgStreetNumber = getIntent().getExtras().getInt("organization_streetNumber");
            String orgPostalCode = getIntent().getExtras().getString("organization_postal_code");
            String orgDistrict = getIntent().getExtras().getString("organization_district");
            String orgCity = getIntent().getExtras().getString("organization_city");
            String orgState = getIntent().getExtras().getString("organization_state");
            String orgCountry = getIntent().getExtras().getString("organization_country");
            String orgCategory = getIntent().getExtras().getString("organization_category");
            String orgEmail = getIntent().getExtras().getString("organization_email");
            String orgPhone = getIntent().getExtras().getString("organization_phone");
            String orgCellphone = getIntent().getExtras().getString("organization_cellphone");

            Glide.with(this)
                    .load(orgImage)
                    .into(imageView);


            oName.setText(orgName);
            oSector.setText(orgSector);
            oWebsite.setText(orgWebsite);
            oDescription.setText(orgDescription);
            oCnpj.setText(orgCnpj);
            oAddress.setText(orgStreetName + ", " + orgStreetNumber + ", " + orgPostalCode + ", " + orgDistrict + ", " + orgCity + ", " + orgState + ", " + orgCountry);
            oCategory.setText(orgCategory);
            oEmail.setText(orgEmail);
            oPhone.setText(orgPhone);
            oCellphone.setText(orgCellphone);

        } else  {
            Toast.makeText(this, "No API data", Toast.LENGTH_SHORT).show();
        }

    }
}
