package androidproject.com.materialdesignportfolio;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar mGeneralToolbar;
    CollapsingToolbarLayout collapsingToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mGeneralToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mGeneralToolbar);

        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_tool);

        collapsingToolbar.setTitle(mGeneralToolbar.getTitle());

    }
}
