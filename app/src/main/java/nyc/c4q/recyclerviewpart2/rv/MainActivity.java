package nyc.c4q.recyclerviewpart2.rv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.recyclerviewpart2.R;

/**
 * Created by joannesong on 11/11/17.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView dogRecyclerView = (RecyclerView) findViewById(R.id.verticalRv);


        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Huskey", "Large", 7, R.drawable.husky));
        dogs.add(new Dog("Pomeranian", "Small", 17,R.drawable.pomeranian));
        dogs.add(new Dog("Chihuahua", "Small", 2, R.drawable.malamute));
        dogs.add(new Dog("Malamute", "Large", 4, R.drawable.malamute));
        dogs.add(new Dog("Shiba", "Medium", 3, R.drawable.shiba));
        dogs.add(new Dog("Beagle", "Medium", 6, R.drawable.beagle));
        dogs.add(new Dog("Corgi", "Medium", 8, R.drawable.corgi));

        DogAdapter dogAdapter = new DogAdapter(dogs);
        dogRecyclerView.setAdapter(dogAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        dogRecyclerView.setLayoutManager(linearLayoutManager);
    }
}