package com.example.dell.fire;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Second extends AppCompatActivity {

//    TextView tv,sy;
//    String tablet,symptoms;
    DatabaseReference reference,ref2;
    RecyclerView recyclerView;
    ArrayList<medicines> med;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_second);
//         tv=findViewById(R.id.data);
//         sy=findViewById(R.id.symp);
       // Intent intent=getIntent();
//       tablet=intent.getStringExtra("tabname");
//       symptoms=intent.getStringExtra("symptoms");
        final String tabname= getIntent().getStringExtra("tabname");
       String sympt= getIntent().getStringExtra("symptoms");
        recyclerView=findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        reference=FirebaseDatabase.getInstance().getReference();
       // ref2=reference.child(tabname);
        med = new ArrayList<medicines>();
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot data:dataSnapshot.getChildren()){
                    medicines m=data.getValue(medicines.class);
                    med.add(m);
                }
                adapter =new MyAdapter(Second.this,med);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(Second.this, "oops something went wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
