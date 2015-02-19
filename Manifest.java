package com.example.schuloch.hpapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import junit.framework.TestCase;
import static java.lang.System.out;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        int[] ArrayInit = {12, 14, 23, 7, 3, 2, 67, 5, 10};
        int i, j, l;
        int a = 0;
        int b = 0;
        int[] Array2 = { a, b};



            int sum = 0;
            for (i = 0; i <= ArrayInit.length; i++)

            {
                if (ArrayInit[i] % 2 == 0)

                {
                    sum = sum + ArrayInit[i];
                }

            }

            System.out.println("The sum of even numbers is " + sum);




            j=0;
            Array2[a]=Array2[j];
            Array2[b]=Array2[j+1];

            for(j=2;j<=ArrayInit.length;j++)

            {


                if (Array2[a] < Array2[j]) {
                    Array2[a] = Array2[j];

                }


                if (Array2[b] < Array2[j]) {
                    Array2[b] = Array2[j];

                }

            }


            System.out.println("The first biggest number is "+Array2[a]);
            System.out.println("The second biggest number is "+Array2[b]);


            for(l=0;l<=ArrayInit.length;l++)

            {

                if (ArrayInit[l] == ArrayInit[l + 1]) {
                    System.out.println("The duplicates are " + ArrayInit[l]);
                } else {
                    l++;
                    if (ArrayInit[l] == ArrayInit.length) {
                        System.out.println("There are no duplicates! ");
                    }
                }

            }





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
