package zaman.example.com.playwithnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
      int randomNumber;
    public void toast(String string){
        Toast.makeText(MainActivity.this,string,Toast.LENGTH_SHORT).show();
    }
    public void buttonClick(View view){
        EditText guessNumber=(EditText)findViewById(R.id.numberId);
        int intGuessNumber= Integer.parseInt(guessNumber.getText().toString());
            if (intGuessNumber <= 25) {
                if (intGuessNumber > randomNumber) {
                    toast("Enter a lower number!");
                } else if (intGuessNumber < randomNumber) {
                    toast("Enter a higher number!");
                } else {
                    toast("\uD83D\uDE0E That's right.You can guess it!!");
                }
            } else {
                toast("Invalid Number.Enter a valid number!!");
            }
    }
    public void againClick(View view){
        EditText guess=(EditText)findViewById(R.id.numberId);
        guess.setText("");
        toast("Start now\uD83D\uDE07");
        Random r = new Random();
        randomNumber = r.nextInt(25) +1;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r = new Random();
        randomNumber = r.nextInt(25) +1;

    }
}
