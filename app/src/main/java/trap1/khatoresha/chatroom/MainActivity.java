package trap1.khatoresha.chatroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity implements ActivityCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, LoginFragment.newInstance())
                .commit();
        /* // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("messages/01");

        myRef.setValue("Hello, World!");
        //myRef.sin
        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
//                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
//                Log.w(TAG, "Failed to read value.", error.toException());
            }
        }); */
    }

    /// Callback methods
    @Override
    public void openChat() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, ChatFragment.newInstance())
                .commit();
    }

    @Override
    public void openCreateAccount() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, CreateAccountFragment.newInstance())
                .commit();
    }

    @Override
    public void logout() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, LoginFragment.newInstance())
                .commit();
    }
    //aaaaaaaaaa
}
