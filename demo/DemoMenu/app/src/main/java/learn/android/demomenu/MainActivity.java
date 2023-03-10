package learn.android.demomenu;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_affiche_msg:
                Toast.makeText(this, "Hello message", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_home:
                startActivity(new Intent(this, MainActivity.class));
                finish();
                break;
            case R.id.menu_start_a:
                startActivity(new Intent(this, ActivityA.class));
                finish();
                break;
        }


        return true;
    }
}