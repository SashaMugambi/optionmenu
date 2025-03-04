package com.example.optionmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Inflating the menu

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.optionsmenu1, menu);
        return true;
    }
    //what happens when you click menu items
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id=item.getItemId();
        if(id==R.id.Home){
            Toast.makeText(this, "Home is clicked", Toast.LENGTH_SHORT).show();
            return true;
        }else if(id==R.id.gyn){
            Toast.makeText(this, "Gynecology is clicked", Toast.LENGTH_SHORT).show();
            return true;
        }else if(id==R.id.dermatology){
            Toast.makeText(this, "Dermatology is clicked", Toast.LENGTH_SHORT).show();
            return true;
        }else if(id==R.id.logout){
            Toast.makeText(this, "Logging out", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}