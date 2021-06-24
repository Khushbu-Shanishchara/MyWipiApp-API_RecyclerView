package com.app.mywikiapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.app.mywikiapp.Adapters.CustomAdapter;
import com.app.mywikiapp.Adapters.RetrofitClient;
import com.app.mywikiapp.Model.Pages;
import com.app.mywikiapp.Model.SearchResults;
import com.app.mywikiapp.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<String> listviewTitle;


    List<String> listviewImage;

    List<String> listviewShortDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listviewTitle = new ArrayList<>();
        listviewShortDescription = new ArrayList<>();
        listviewImage = new ArrayList<>();

        getSearchResults();

    }

    private void setAdapterToRecylerView() {

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        CustomAdapter customAdapter = new CustomAdapter(listviewTitle, listviewShortDescription, listviewImage);
        customAdapter.notifyDataSetChanged();
        recyclerView.setAdapter(customAdapter);

    }

    private void getSearchResults() {

        System.out.println("In getSearchResults");

        Call<SearchResults> call = RetrofitClient.getInstance().getMyApi().getSearchResults();
        call.enqueue(new Callback<SearchResults>() {
            @Override
            public void onResponse(Call<SearchResults> call, Response<SearchResults> response) {
                SearchResults data = response.body();

                if(data != null) {

                    if(data.getQuery().getPages().length > 0) {
                        Pages[] pages = data.getQuery().getPages();
                        for(int i=0; i < pages.length; i++) {
                            Pages p = pages[i];

                            listviewTitle.add((!p.getTitle().isEmpty()) ? p.getTitle() : "" );

                            if(p.getTerms().getDescription().length > 0)
                                listviewShortDescription.add((!p.getTerms().getDescription()[0].isEmpty()) ? p.getTerms().getDescription()[0] : "");
                            else
                                listviewShortDescription.add("");

                            String noImageFound = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZ3MS-lSnmz-3dSpWhZSLqaSHSPYlCpJzdxg&usqp=CAU";
                            if(p.getThumbnail() != null)
                                listviewImage.add((!p.getThumbnail().getSource().isEmpty()) ? p.getThumbnail().getSource() : noImageFound);
                            else
                                listviewImage.add(noImageFound);
                        }
                    }
                }

                setAdapterToRecylerView();
            }

            @Override
            public void onFailure(Call<SearchResults> call, Throwable t) {
                //t.printStackTrace();
                Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
            }

        });
    }
}
