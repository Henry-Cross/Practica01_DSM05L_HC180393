package sv.edu.udb.guia3.ejemplo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFrame(View v){
        Intent llamar = new Intent(this,ejemplo_frame_layout.class);
        startActivity(llamar);
    }
    public void onClickLinear(View v){
        Intent llamar = new Intent(this,ejemplo_liner_layout.class);
        startActivity(llamar);
    }
    public void onClickRelative(View v){
        Intent llamar = new Intent(this,ejemplo_relative_layout.class);
        startActivity(llamar);
    }
    public void onClickTable(View v){
        Intent llamar = new Intent(this,ejemplo_table_layout.class);
        startActivity(llamar);
    }
    public void onClickGrid(View v){
        Intent llamar = new Intent(this,ejemplo_grid_layout.class);
        startActivity(llamar);
    }
}