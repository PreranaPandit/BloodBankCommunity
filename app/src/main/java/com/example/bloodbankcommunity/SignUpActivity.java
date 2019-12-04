package com.example.bloodbankcommunity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SignUpActivity extends AppCompatActivity {


    private Spinner spinGender;
    private Spinner spinBloodGroup;
    private Spinner spinCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //spinner for gender
        spinGender = findViewById(R.id.spinGender);
        spinBloodGroup = findViewById(R.id.spinBloodGroup);
        spinCity = findViewById(R.id.spinCity);


        String gender[] = {"Select Gender","Male","Female","Others"};
        ArrayAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,gender);
        spinGender.setAdapter(adapter);

        String bloodGroup[] = {"Select Blood Group","A+","B+","O+","AB+","AB-"};
        ArrayAdapter adapterbg = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,bloodGroup);
        spinBloodGroup.setAdapter(adapterbg);

        String city[] = {"Select City","Kathmandu","Lalitpur","Bhaktapur","Pokhara","Mustang"};
        ArrayAdapter adaptercity = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,city);
        spinBloodGroup.setAdapter(adaptercity);

    }
}
