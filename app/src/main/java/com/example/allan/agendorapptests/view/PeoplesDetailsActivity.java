package com.example.allan.agendorapptests.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.allan.agendorapptests.R;

public class PeoplesDetailsActivity extends AppCompatActivity {

    TextView pName, pRule, pOrgName, pDescription, pCpf, pAddress, pCategory, pEmail, pPhone, pCellphone, pBirthday;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peoples_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = findViewById(R.id.peopleImage);
        pName = findViewById(R.id.peoplen);
        pRule = findViewById(R.id.peopleRule);
        pOrgName = findViewById(R.id.pepleorg);
        pDescription = findViewById(R.id.peopledescription);
        pCpf = findViewById(R.id.peoplecpf);
        pAddress = findViewById(R.id.peopleaddress);
        pCategory = findViewById(R.id.peoplecategory);
        pEmail = findViewById(R.id.peopleemail);
        pPhone = findViewById(R.id.peoplephone);
        pCellphone = findViewById(R.id.peoplecelphone);
        pBirthday = findViewById(R.id.peoplebirthday);


        Intent intentForStartThisActivity = getIntent();
        if (intentForStartThisActivity.hasExtra("people_image")) {


            String ppImage = getIntent().getExtras().getString("people_image");
            String ppName = getIntent().getExtras().getString("people_name");
            String ppRole = getIntent().getExtras().getString("people_role");
            String ppOrgName = getIntent().getExtras().getString("people_orgName");
            String ppDescription = getIntent().getExtras().getString("people_description");
            String ppCpf = getIntent().getExtras().getString("people_cpf");
            String ppStreetName = getIntent().getExtras().getString("people_streetName");
            int ppStreetNumber = getIntent().getExtras().getInt("people_streetNumber");
            String ppPostalCode = getIntent().getExtras().getString("people_postal_code");
            String ppDistrict = getIntent().getExtras().getString("people_district");
            String ppCity = getIntent().getExtras().getString("people_city");
            String ppState = getIntent().getExtras().getString("people_state");
            String ppCountry = getIntent().getExtras().getString("people_country");
            String ppCategory = getIntent().getExtras().getString("people_category");
            String ppEmail = getIntent().getExtras().getString("people_email");
            String ppPhone = getIntent().getExtras().getString("people_phone");
            String ppCellphone = getIntent().getExtras().getString("people_cellphone");
            String ppBirthday = getIntent().getExtras().getString("people_birthday");

            Glide.with(this)
                    .load(ppImage)
                    .into(imageView);

            pName.setText(ppName);
            pRule.setText(ppRole);
            pOrgName.setText(ppOrgName);
            pDescription.setText(ppDescription);
            pCpf.setText(ppCpf);
            pAddress.setText(ppStreetName + ", " + ppStreetNumber + ", " + ppPostalCode + ", " + ppDistrict + ", " + ppCity + ", " + ppState + ", " + ppCountry);
            pCategory.setText(ppCategory);
            pEmail.setText(ppEmail);
            pPhone.setText(ppPhone);
            pCellphone.setText(ppCellphone);
            pBirthday.setText(ppBirthday);

        } else {
            Toast.makeText(this, "No API data", Toast.LENGTH_SHORT).show();
        }

    }
}
