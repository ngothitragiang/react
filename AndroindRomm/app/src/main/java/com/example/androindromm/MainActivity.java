package com.example.androindromm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    User Database;
    TextView tvUsers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name").build();
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                User user = new User("Nam");
                db.userDao().insert(user);

                final List<User> users = db.userDao().getAll();
                Log.i("giang", "giang" + users.size());
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        displayUser(users);
                    }
                });

                displayUser(users);
                return null;

            }
        }.execute();
    }

    void displayUser(List<User> users) {
        String str= new String();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(0);
            str += user.name + "\n";

        }
        tvUsers.setText(str);
    }
}





