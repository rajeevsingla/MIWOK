package com.example.keyss.miwok;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.*;
public class sign_in extends AppCompatActivity {


    public void submitOrder(View view)
    {
        EditText editText = findViewById(R.id.edit_text);
        String text;
        text = editText.getText().toString();
        if(text.isEmpty()){

            Toast toast=Toast.makeText(getApplicationContext(),"Enter your name and click on the send button",Toast.LENGTH_SHORT);

            toast.setGravity(Gravity.CENTER,0,0);

            toast.show();


        }
else {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rajeev25singla25@gmail.com"});
            intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback for miwok app");
            intent.putExtra(Intent.EXTRA_TEXT, "i am " + text);
            if (
                    intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }

        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);



        Toast toast=Toast.makeText(getApplicationContext(),"Thanks for choosing this application please your review and feed backs with ous.",Toast.LENGTH_LONG);

        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();


    }

}
