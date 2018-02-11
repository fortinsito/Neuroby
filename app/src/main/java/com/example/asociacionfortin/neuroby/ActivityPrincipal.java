package com.example.asociacionfortin.neuroby;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class ActivityPrincipal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        //Esto corresponde al menú principal, indica qué actividad se inicializa al tocar un ítem

        int id = item.getItemId();

        if (id == R.id.nav_asignaturas) {


            Intent intent = new Intent(ActivityPrincipal.this, Asignaturas.class);
            startActivity(intent);
            return true;


        } else if (id == R.id.nav_calculemos) {

        } else if (id == R.id.nav_grafiquemos) {

        } else if (id == R.id.nav_acordeon) {

        } else if (id == R.id.nav_relaja) {


            Intent intent = new Intent(ActivityPrincipal.this, RelajaLaNeurona.class);
            startActivity(intent);
            return true;



        } else if (id == R.id.nav_compartir) {

            /*

            // Este bloque de código es para abrir WhatsApp, aunque también se puede abrir otra App bajo la misma lógica
            Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
            startActivity(launchIntent);
            */




            //Este bloque de código es para enviar un mensaje por algún medio. Generalmente para compartir una invitación.
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);

            sendIntent.putExtra(Intent.EXTRA_TEXT, "¡Ey! ¿Aún sufriendo con las materias de ingeniería? \n\n Echa un vistazo a la app Neuroby. Ahí está todo lo que necesitas.\n\n\n Para más info contacta al CEO:\ninstagram.com/adolfo.ordinola\ntwitter.com/AdolfoOrdinola\nfacebook.com/adolfo.ordinola");

            //Esta línea de código indica el tipo de mensaje que se enviará
            sendIntent.setType("text/plain");

            startActivity(sendIntent);



        } else if (id == R.id.nav_ayuda) {

            Intent intent = new Intent(ActivityPrincipal.this, Ayuda.class);
            startActivity(intent);
            return true;

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
