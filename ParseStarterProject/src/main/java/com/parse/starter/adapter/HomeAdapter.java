package com.parse.starter.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.starter.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends ArrayAdapter<ParseObject> {

    private Context context;
    private ArrayList<ParseObject> postagens;

    public HomeAdapter(Context c,  ArrayList<ParseObject> objects) {
        super(c, 0, objects);
        this.context = c;
        this.postagens = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View  view = convertView;


        // Verificar se não exist e o objeto criado.Pois a view utilizada é armazenada no cache do android e fica as variável convertView

        if(view == null){
            //Inicializa o objeto para montagem do layout
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            //Monta a view a partir do xml

            view = inflater.inflate(R.layout.lista_postagem, parent, false);

        }
        //verifica se existe postagens
        if( postagens.size() > 0 ){

            //recupera componentes da tela
            ImageView imagemPostagem = (ImageView) view.findViewById(R.id.image_lista_postagem);

            ParseObject parseObject = postagens.get( position );

            //parseObject.getParseFile("imagem")
            Picasso.with( context )
                    .load(  parseObject.getParseFile("imagem").getUrl()  )
                    .fit()
                    .into( imagemPostagem );

        }



        return view;
    }
}
