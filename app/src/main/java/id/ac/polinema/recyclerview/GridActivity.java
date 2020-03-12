package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import id.ac.polinema.recyclerview.adapters.GridAdapter;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class GridActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid);

		RecyclerView teamsView = findViewById(R.id.rv_teams);

		List<TeamLogo> teams = new ArrayList<>();
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/FC_Internazionale_Milano_2014.svg/1200px-FC_Internazionale_Milano_2014.svg.png", "Milan"));
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/id/thumb/c/cc/Chelsea_FC.svg/1024px-Chelsea_FC.svg.png", "Chealsea"));
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/id/thumb/4/47/FC_Barcelona_%28crest%29.svg/757px-FC_Barcelona_%28crest%29.svg.png", "Barcelona"));
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/hif/8/82/Arsenal_FC.png", "Arsenal"));
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool"));
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City"));

		GridAdapter adapter = new GridAdapter(this, teams);
		teamsView.setAdapter(adapter);

		RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
		teamsView.setLayoutManager(layoutManager);
	}
}
