
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random;
    ImageView pokemonImg;
    ImageView pokeBall;
    int  [] randomImages;
    int randomNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pokemonImg =  (ImageView) findViewById(R.id.pokemonimg);
        pokeBall = (ImageView) findViewById(R.id.pokeball);


        pokeBall.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                randomImageGenerator();
            }});
            
    }

    public void randomImageGenerator(){
        randomImages = new int[]{R.drawable.pikachu, R.drawable.ekans, R.drawable.clefairy, R.drawable.caterpie};
        random = new Random();
        randomNum = random.nextInt(4);
        pokemonImg.setImageResource(randomImages[randomNum]);
    }



}
