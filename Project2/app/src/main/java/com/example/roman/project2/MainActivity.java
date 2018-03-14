package com.example.roman.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Maak statische punt waarden
    final int WIN_PUNTEN = 2;
    final int GELIJKSPEL_PUNTEN = 1;
    //Teams beginnen met 0 punten
    int team_1_score = 0;
    int team_2_score = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* spel knoppen hieronder*/

    /* reset het spel */
    /* gebruik een view om makkelijk te vinden welke id's worden ingedrukt */
    public void herstartSpel(View v) {
        team_1_score = 0;
        team_2_score = 0;

        updateScore1(team_1_score);
        updateScore2(team_2_score);
    }
    /* scores worden hier uitgedeeld */
    /* Nogmaals wordt hier een view gebruikt om in de java code te vinden op welke knoppen er zijn gedrukt */
        public void updateScores(View v){
            /* switch met verschillende resultaten, v.getId() vangt de ID op van de gedrukte knop(view) */
            switch(v.getId()){
            /* "als de id die gevonden 'R.id.team1plus' is dan geef je WIN_PUNTEN aan team_1_score en etc voor alle andere knoppen*/
                case R.id.team1plus:
                    team_1_score += WIN_PUNTEN;
                    break;

                case R.id.team2plus:
                    team_2_score += WIN_PUNTEN;
                    break;
            /* bijde teams krijgen gelijkspel punten */
                case R.id.gelijkspelplus:
                    team_1_score += GELIJKSPEL_PUNTEN;
                    team_2_score += GELIJKSPEL_PUNTEN;
                    break;
                default:
                    break;
            }
            /* de variabelen worden geupdate naar de TextView */
            updateScore1(team_1_score);
            updateScore2(team_2_score);
    }
    /* hier worden de variabelen van de teams geupdate in de app */

    public void updateScore1(int score){
            /* een type TextView variabele wordt aangemaakt met de gevonden TextView bij 'R.id.team1score' */
            TextView scoreLabel = (TextView) findViewById(R.id.team1score);
            /* de aangemaakte variabel wordt aangeroepen en een nieuwe waarde gegeven door setText. Deze wordt ook geconverteerd naar String met de int waarde van 'score' (team_1_score) */
            scoreLabel.setText(String.valueOf(score));
    }
    /* herhaling van hierboven met de andere team */
    public void updateScore2(int score){
            TextView scoreLabel = (TextView) findViewById(R.id.team2score);
            scoreLabel.setText(String.valueOf(score));
    }
}
