package nyc.c4q.recyclerviewpart2.rv;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.recyclerviewpart2.R;

/**
 * Created by joannesong on 11/11/17.
 */

public class DogAdapter extends RecyclerView.Adapter{
    private List<Dog> dogList;


    public DogAdapter(List<Dog> dogList){
        this.dogList = dogList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview, parent, false);
        return new DogHolder(childView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        DogHolder dogHolder = (DogHolder) holder;
        Dog dog = dogList.get(position);

        dogHolder.onBind(dog);
    }

    @Override
    public int getItemCount() {
        return dogList.size();
    }
}
