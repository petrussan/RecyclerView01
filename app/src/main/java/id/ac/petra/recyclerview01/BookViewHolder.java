package id.ac.petra.recyclerview01;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookViewHolder extends RecyclerView.ViewHolder {
    ImageView ivCover;
    TextView tvTitle;
    TextView tvDesc;
    public BookViewHolder(@NonNull View itemView) {
        super(itemView);
        ivCover = itemView.findViewById(R.id.ivCover);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvDesc = itemView.findViewById(R.id.tvDescr);
    }
}
