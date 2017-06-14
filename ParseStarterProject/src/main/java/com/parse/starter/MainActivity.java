/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.parse.GetCallback;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.SaveCallback;


public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ParseObject pontuacao = new ParseObject("Pontuacao");
    pontuacao.put("nome","Javaneiro");
    pontuacao.put("pontos" , 150);
    pontuacao.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {
        if(e == null ){//Não temos erro
          Log.i("salvarPontos", "Dados salvos com sucesso");
        }else{
          Log.i("salvarPontos", "Dados salvos com sucesso");

        }
      }
    });

    /*ParseQuery<ParseObject> consulta = ParseQuery.getQuery("Pontuacao");
    consulta.getInBackground("GSGDnl1KBG", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject object, ParseException e) {

        if(e == null ){//Não temos erro
          object.put("pontos", 1200);
          object.saveInBackground();
        }else{
          Log.i("salvarPontos", "Dados salvos com sucesso");

        }
      }
    });*/
  }

}
