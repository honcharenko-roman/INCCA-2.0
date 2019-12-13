package com.android.odessatourguide.BuildingsInfoGrid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.odessatourguide.R;

public class FullInfoActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_info);

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");

        ImageAdapter imageAdapter = new ImageAdapter(this);
        final GridElement gridElement = (GridElement) imageAdapter.getItem(position);

        ImageView buildingPhoto = (ImageView) findViewById(R.id.full_image);
        TextView descriptionText = (TextView) findViewById(R.id.full_text);
        Button button = (Button) findViewById(R.id.full_button);

        buildingPhoto.setImageResource(gridElement.getImage());
        descriptionText.setText(gridElement.getDescription());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(gridElement.getLink()));
                startActivity(browserIntent);
            }
        });


    }

}
