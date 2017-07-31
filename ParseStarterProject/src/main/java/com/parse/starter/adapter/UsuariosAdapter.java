package com.parse.starter.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.parse.ParseUser;
import com.parse.starter.R;

import java.util.ArrayList;
import java.util.List;

public class UsuariosAdapter extends ArrayAdapter<ParseUser>{

    private Context context;
    private ArrayList<ParseUser> usuarios;

    public UsuariosAdapter(Context c, ArrayList<ParseUser> objects) {
        super(c, 0, objects);
        this.context = c;
        this.usuarios = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View  view = convertView;


        // Verificar se não exist e o objeto criado.Pois a view utilizada é armazenada no cache do android e fica as variável convertView

        if(view == null){
            //Inicializa o objeto para montagem do layout
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            //Montar a view a partir do xml

            view = inflater.inflate(R.layout.lista_usuarios, parent, false);

        }
        //Recuperar elementos para exibição

        TextView username = (TextView) view.findViewById(R.id.text_username);

        //Configurar o textview para exibir os usuarios
        ParseUser parseUser = usuarios.get(position);
        username.setText(parseUser.getUsername());

        return view;
    }
}
