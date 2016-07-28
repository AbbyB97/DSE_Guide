package com.dse_guide.dseguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dse_guide.dseguide.DSE_candidate.DSE_candidate_dashboard;
import com.dse_guide.dseguide.DSE_guide.DSE_guide_Registration;
import com.dse_guide.dseguide.DSE_guide.DSE_guide_dashboard;

public class user_type_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_type_selection);
    }

    public void Dse_candidate_selected(View v)
    {
        Intent intent=new Intent(this,DSE_candidate_dashboard.class);
        startActivity(intent);

    }

    public  void Dse_guide_selected(View v)
    {
        Intent nextact=new Intent(this, DSE_guide_dashboard.class);
        startActivity(nextact);
    }
}
