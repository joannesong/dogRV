package nyc.c4q.recyclerviewpart2.rv;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.c4q.recyclerviewpart2.R;
import nyc.c4q.recyclerviewpart2.rv.Dog;


/**
 * Created by joannesong on 11/11/17.
 */

public class DogHolder extends RecyclerView.ViewHolder {
    private TextView breed;
    private TextView size;
    private TextView age;
    private ImageView image;

    public DogHolder(View itemView) {
        super(itemView);

        breed = (TextView) itemView.findViewById(R.id.dogBreed);
        size = (TextView) itemView.findViewById(R.id.dogSize);
        age = (TextView) itemView.findViewById(R.id.dogAge);
        image = (ImageView) itemView.findViewById(R.id.image);

    }
    public void onBind(Dog dog){
        breed.setText("Breed: " + dog.getBreed());
        size.setText("Size " + dog.getSize());
        age.setText("Age: " + dog.getAge());
        image.setImageResource(dog.getImage());
    }
}
