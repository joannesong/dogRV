package nyc.c4q.recyclerviewpart2.rv;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.recyclerviewpart2.R;

/**
 * Created by joannesong on 11/11/17.
 */

public class Dog {

    String breed;
    String size;
    int age;
    @DrawableRes
    int image;

    List<String> dogAttributes = new ArrayList<>();

    public List<String> getDogAttributes() {
        return dogAttributes;
    }

    public Dog(String breed, String size, int age, @DrawableRes int image) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.image = image;

        dogAttributes.add(breed);
        dogAttributes.add(size);
        dogAttributes.add(String.valueOf(age));
        dogAttributes.add(String.valueOf(image));
    }

    public String getBreed() {
        return breed;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public int getImage() {
        return image;
    }
}
