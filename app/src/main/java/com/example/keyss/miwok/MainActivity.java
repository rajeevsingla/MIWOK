package com.example.keyss.miwok;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.TabLayout;




import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {



    // move to color page

//    public void Colors_page(View view)
//    {
//        Intent c=new Intent(this,activityColors.class);
//        startActivity(c);
//
//    }
    //to move to more




//    public void more(View view)
//    {
//        Intent m=new Intent(this,Extra.class);
//        startActivity(m);
//
//    }





//move to color page
//    public void family_page(View view)
//    {
//
//        Intent f=new Intent(this,activityFamilyMembers.class);
//        startActivity(f);
//
//
//    }


    //moev to numbers page


//    public void numbers_page(View view)
//    {
//        Intent n=new Intent(this,activityNumbers.class);
//        startActivity(n);
//
//    }


    // to move to phrases page


//    public void phrases_page(View view)
//    {
//
//        Intent p=new Intent(this,activityPhrases.class);
//        startActivity(p);
//
//
//    }

/// to send e-mail






    //to move to the about page




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        // Create an adapter that knows which fragment should be shown on each page
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);





        Toolbar toolbar= (Toolbar) findViewById(R.id.tool_bar);
        // Setting toolbar as the ActionBar with setSupportActionBar() call
        setSupportActionBar(toolbar);


    }



public void TO_read(View view)
{
    Intent t=new Intent(this,about_app.class);
    startActivity(t);


}

}
