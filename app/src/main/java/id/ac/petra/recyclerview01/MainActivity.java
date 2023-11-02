package id.ac.petra.recyclerview01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<Book> bookList;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.myrecycler);
        rv.setLayoutManager(new LinearLayoutManager(this));
        bookList = new ArrayList<Book>();

        bookList.add(new Book(R.drawable.cover1,
                getString(R.string.title01),getString(R.string.desc01)));
        bookList.add(new Book(R.drawable.cover2,
                getString(R.string.title02),getString(R.string.desc02)));
        bookList.add(new Book(R.drawable.cover1,
                getString(R.string.title01),getString(R.string.desc01)));
        bookList.add(new Book(R.drawable.cover2,
                getString(R.string.title02),getString(R.string.desc02)));
        bookList.add(new Book(R.drawable.cover1,
                getString(R.string.title01),getString(R.string.desc01)));
        bookList.add(new Book(R.drawable.cover2,
                getString(R.string.title02),getString(R.string.desc02)));
        bookList.add(new Book(R.drawable.cover1,
                getString(R.string.title01),getString(R.string.desc01)));
        bookList.add(new Book(R.drawable.cover2,
                getString(R.string.title02),getString(R.string.desc02)));

        customAdapter = new CustomAdapter(bookList);
        rv.setAdapter(customAdapter);
    }
}