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

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * Cadastro de Usuários
        **/
       /* ParseUser usuario = new ParseUser();
        usuario.setUsername("renatolessa");
        usuario.setPassword("123456");
        usuario.setEmail("renatolessa.2011@hotmail.com");

        //Cadastrar

        usuario.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if(e == null){//Deu certo
                    Log.i("cadastrousuario", "Sucesso ao cadastrar usuáio ");
                }else {//Erro
                    Log.i("cadastrousuario", "Erro ao cadastrar usuáio -  " + e.getMessage());
                }
            }
        });*/

        /***
         * Verificar usuário logado
         */

        //Deslogado

        /*ParseUser.logOut();

        //Verificar Logado

        if(ParseUser.getCurrentUser() != null){//Logado
            Log.i("LoginUsuario", "Usuário está logado");
        }else{//Não logado
            Log.i("LoginUsuario", "Usuário não está logado");
        }*/

        /**
         * Fazer login de usuário
         */
        ParseUser.logInInBackground("renatolessa", "123456", new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {

                if(e == null){

                    Log.i("VerificaLoginUsuario", "Login realizado com sucesso");
                }else{

                    Log.i("VerificaLoginUsuario", "Erro ao fazer login do usuário. " + e.getMessage());
                }
            }
        });

    }

}
