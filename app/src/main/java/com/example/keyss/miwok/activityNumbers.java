package com.example.keyss.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.*;
import java.lang.*;
import java.util.*;
import android.media.*;
import android.view.*;
import android.content.*;

public class activityNumbers extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.word_list);


        setContentView(R.layout.avtivity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();


    }}