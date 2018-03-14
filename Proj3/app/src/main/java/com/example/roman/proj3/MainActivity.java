package com.example.roman.proj3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.RadioGroup;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    /* vaste values voor antwoorden vaststellen */
    final int VRAAG_1_ANTWOORD = R.id.antwoord_1_1;
    final int VRAAG_2_ANTWOORD = R.id.antwoord_2_3;
    final int VRAAG_3_ANTWOORD = R.id.antwoord_3_2;
    final int VRAAG_4_ANTWOORD = R.id.antwoord_4_2;
    final int VRAAG_5_ANTWOORD = R.id.antwoord_5_1;
    final int VRAAG_6_ANTWOORD = R.id.antwoord_6_2;
    final int VRAAG_7_ANTWOORD = R.id.antwoord_7_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* antwoord check methode met zelfde View manier als in project 2 */
    public void antwoordCheck(View v){
        /* Array maken van foute antwoorden */
        ArrayList<String> fouteAntwoordenList = new ArrayList<>();
        /* aantal goede antwoorden */
        int goedeAntwoorden = 0;
        /* checkVraag returnt true als de antwoord klopt, en false als niet */
        if(checkVraag1()){
            goedeAntwoorden++;
        }else{
            /* als je een fout hebt gemaakt wordt de vraag opgeslagen in de array van foute antwoorden */
            fouteAntwoordenList.add("Vraag 1");
        }

        if(checkVraag2()){
            goedeAntwoorden++;
        }else{
            fouteAntwoordenList.add("Vraag 2");
        }

        if(checkVraag3()){
            goedeAntwoorden++;
        }else{
            fouteAntwoordenList.add("Vraag 3");
        }

        if(checkVraag4()){
            goedeAntwoorden++;
        }else{
            fouteAntwoordenList.add("Vraag 4");
        }

        if(checkVraag5()){
            goedeAntwoorden++;
        }else{
            fouteAntwoordenList.add("Vraag 5");
        }

        if(checkVraag6()){
            goedeAntwoorden++;
        }else{
            fouteAntwoordenList.add("Vraag 6");
        }

        if(checkVraag7()){
            goedeAntwoorden++;
        }else{
            fouteAntwoordenList.add("Vraag 7");
        }
        /* */
        String fout = "";
        /* voor elke index in fouteAntwoordenList heb je een String 's' die elke keer aan het einde van 'fout' wordt geplakt */
        for(String s : fouteAntwoordenList){
            fout += s;
            /* een newline na elke foute antwoord */
            fout += "\n";
        }
        /* toast moet weten op welke pagina hij moet poppen dit krijg je met getApplicationContext()*/
        Context context = getApplicationContext();
        /* toast text met een paar appends van alle info */
        String text = "";
        if(goedeAntwoorden == 7){
            text = "Gefeliciteerd! Je hebt alle antwoorden goed beantwoord!";
        }
        else {
            text = "Je hebt " + goedeAntwoorden + "/7 antwoorden goed. Deze antwoorden waren fout:\n" + fout;
        }
        /* toast lifetime */
        int toastDuur = Toast.LENGTH_LONG;
        /* instanceer de toast */
        Toast resultaatToast = Toast.makeText(context, text, toastDuur);
        /* show toast op het scherm */
        resultaatToast.show();

    }
    /* return een true of false als de gecheckde Id overeenkomt met de antwoord Id of niet  */
    private boolean checkVraag1() {
        RadioGroup rg = findViewById(R.id.vraag_1_radio);

        if( rg.getCheckedRadioButtonId() == VRAAG_1_ANTWOORD ) {
            return true;
        }

        return false;
    }

    private boolean checkVraag2() {
        RadioGroup rg = findViewById(R.id.vraag_2_radio);

        if( rg.getCheckedRadioButtonId() == VRAAG_2_ANTWOORD ) {
            return true;
        }

        return false;
    }

    private boolean checkVraag3() {
        RadioGroup rg = findViewById(R.id.vraag_3_radio);

        if( rg.getCheckedRadioButtonId() == VRAAG_3_ANTWOORD ) {
            return true;
        }

        return false;
    }

    private boolean checkVraag4() {
        RadioGroup rg = findViewById(R.id.vraag_4_radio);

        if( rg.getCheckedRadioButtonId() == VRAAG_4_ANTWOORD ) {
            return true;
        }

        return false;
    }

    private boolean checkVraag5() {
        RadioGroup rg = findViewById(R.id.vraag_5_radio);

        if( rg.getCheckedRadioButtonId() == VRAAG_5_ANTWOORD ) {
            return true;
        }

        return false;
    }

    private boolean checkVraag6() {
        RadioGroup rg = findViewById(R.id.vraag_6_radio);

        if( rg.getCheckedRadioButtonId() == VRAAG_6_ANTWOORD ) {
            return true;
        }

        return false;
    }

    private boolean checkVraag7() {
        RadioGroup rg = findViewById(R.id.vraag_7_radio);

        if( rg.getCheckedRadioButtonId() == VRAAG_7_ANTWOORD ) {
            return true;
        }

        return false;
    }

    }
