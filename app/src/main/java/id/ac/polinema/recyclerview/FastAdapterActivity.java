package id.ac.polinema.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.models.TeamItem;

public class FastAdapterActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fastadapter);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        ItemAdapter itemAdapter = new ItemAdapter<>();
        FastAdapter fastAdapter = FastAdapter.with(itemAdapter);

        List teams = new ArrayList<>();
        teams.add(new TeamItem("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool"));
        teams.add(new TeamItem("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City"));
        teams.add(new TeamItem("https://upload.wikimedia.org/wikipedia/id/thumb/4/47/FC_Barcelona_%28crest%29.svg/1200px-FC_Barcelona_%28crest%29.svg.png", "Barcelona"));
        teams.add(new TeamItem("https://upload.wikimedia.org/wikipedia/id/thumb/c/cc/Chelsea_FC.svg/1024px-Chelsea_FC.svg.png", "Chelsea"));
        teams.add(new TeamItem("https://upload.wikimedia.org/wikipedia/id/thumb/5/53/Arsenal_FC.svg/1200px-Arsenal_FC.svg.png", "Arsenal"));
        teams.add(new TeamItem("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/Logo_FC_Bayern_München_%282002–2017%29.svg/1200px-Logo_FC_Bayern_München_%282002–2017%29.svg.png", "Bayern"));

        itemAdapter.add(teams); teamsView.setAdapter(fastAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);

    }
}