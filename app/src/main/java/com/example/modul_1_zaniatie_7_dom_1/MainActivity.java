package com.example.modul_1_zaniatie_7_dom_1;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.LocaleData;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1_1 Find Jonson

        Log.d("MYLOG", " - - - Find Jonson or John or any word from string and show full string");

        ArrayList<String> personBase = new ArrayList<>();

        personBase.add(0, "Andryi Shevchenko, 48 years");
        personBase.add("Petro Lipko, 32 years");
        personBase.add("Valeryi Markovich, 22 years");
        personBase.add("Stepan Moroz, 18 years");
        personBase.add("Ivan Kozak, 62 years");
        personBase.add("John Jonson, 44 years");
        personBase.add("Viktor Stelmach, 28 years");
        personBase.add("Illia Hetman, 26 years");


        String requiredName = "Jonson";
        String checking = "";
        String result = "";

    //loop for all strings
        for (int i = 0; i < personBase.size(); i++){
            String item = personBase.get(i);
            checking = "";
    //loop for each word in string
            for (int u = 0; u < item.length(); u++){
                String itemChar = item.substring(u, u+1);  // same as = String itemChar = String.valueOf(item.charAt(u));
    //comparison to check if word is over
                if (itemChar.equals(" ") || itemChar.equals(",")){
                    checking = "";
                    continue;
                }else {
                    checking = checking + itemChar;
    //comparison for checking == requiredName
                    if (checking.equals(requiredName)){
                        Log.d("MYLOG", "NAME FOUND!!! :)");
                        result = personBase.get(i);
                    }
                }
            }
        }

        Log.d("MYLOG", "Person found: " + result);




        Log.d("MYLOG", " - - - Find age from String, age is income after ', ': ");

        String personFound = "";
        requiredName = "Stepan";
        String ageFound = "";

        for (int i = 0; i < personBase.size(); i++){
            String item = personBase.get(i);
            checking = "";

            for (int u = 0; u < item.length(); u++){
                String itemChar = item.substring(u, u+1);

                if (itemChar.equals(" ") || itemChar.equals(",")){
                    checking = "";
                    continue;
                }else {
                    checking = checking + itemChar;

                    if (checking.equals(requiredName)){
                        Log.d("MYLOG", "FOUND! :)");
                        personFound = personBase.get(i);
                        break;
                    }
                }
            }

            for (int y = 0; y < personFound.length(); y++){
                String itemFirstChar = personFound.substring(y, y+1);
                if (itemFirstChar.equals(",")){
                    if (personFound.substring(y+1, y+2).equals(" ")){
                        ageFound = personFound.substring(y+2);
                    }
                }
            }
        }

        Log.d("MYLOG", "Age is: " + ageFound);











        //        String result = "";
        //
        //        String element = personBase.get(7);
        //        for (int u = 0; u < element.length(); u++){
        //            String item = element.substring(u, u+1);
        //
        //            if (item.equals(" ") || item.equals(",")){
        //                result = "";
        //                continue;
        //            }else {
        //                result = result + item;
        //
        //                if (result.equals("26")){
        //                    Log.d("MYLOG", "NAME FOUND!!! :)");
        //                }
        //            }
        //        }
        //
        //        Log.d("MYLOG", result);




        //String str1 = personBase.get(7);
        //
        //        for (int u = 0; u < str1.length(); u++){
        //            String result = str1.substring(u, u+1);
        //            Log.d("MYLOG", "Element: " + result);
        //        }



        //        //loop for each
        //        Log.d("MYLOG", " - - - loop for each: - - - ");
        //        for (String item : personBase){
        //            Log.d("MYLOG", item);
        //        }
        //
        //        //loop for
        //        Log.d("MYLOG", " - - - loop for: - - - ");
        //        for (int i = 0; i < personBase.size(); i++){
        //            Log.d("MYLOG", personBase.get(i));
        //        }


    }
}