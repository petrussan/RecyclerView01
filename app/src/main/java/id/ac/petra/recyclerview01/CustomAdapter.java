package id.ac.petra.recyclerview01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<BookViewHolder> {
    private ArrayList<Book> myList;

    public CustomAdapter(ArrayList<Book> myList) {
        this.myList = myList;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout,parent,false);
        return new BookViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book current = myList.get(position);
        int image = current.image;
        String title = current.title;
        String description = current.description;

        holder.ivCover.setImageResource(image);
        holder.tvTitle.setText(title);
        holder.tvDesc.setText(description);
        setAnimation(holder.itemView);
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    private void setAnimation (View v) {
        ScaleAnimation animation = new ScaleAnimation(
                0.0f,
                1.0f,
                0.0f,
                1.0f,
                Animation.RELATIVE_TO_SELF,
                0.5f,
                Animation.RELATIVE_TO_SELF,
                0.5f
        );
        animation.setDuration(800);
        v.startAnimation(animation);
    }

}
