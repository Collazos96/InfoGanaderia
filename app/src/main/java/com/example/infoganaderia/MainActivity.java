package com.example.infoganaderia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_main);
    }

    public void irIniciar(View view){
        Intent i = new Intent(this, IniciarSesionActivity.class);
                startActivity(i);
    }

    public void irRegistrarse(View view){
        Intent i = new Intent(this, RegistrarseActivity.class);
        startActivity(i);
    }

    public void irNoticias(View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://todosobreganado.com/category/noticias-sobre-ganaderia/"));
        startActivity(i);
    }

    public void irConsejos(View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://ganaderia.win/category/consejos/"));
        startActivity(i);
    }

    public void irRazas(View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://todosobreganado.com/razas/"));
        startActivity(i);
    }

    public void irTipos(View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://todosobreganado.com/tipos-de-ganaderia/"));
        startActivity(i);
    }

    public void irFacebook(View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
        startActivity(i);
    }

    public void irTwitter(View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://twitter.com/home"));
        startActivity(i);
    }

    public void irInstagram(View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
        startActivity(i);
    }
}