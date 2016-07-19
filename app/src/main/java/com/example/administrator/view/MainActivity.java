package com.example.administrator.view;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.administrator.adapter.HomeAdapter;
import com.example.administrator.text5x.R;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements HomeAdapter.OnItemClickListener {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    private static final String TOOLBAR = "ToolBar";
    private static final String ANIMATION = "View state change Animation";
    private static final String NOTIFICATION = "Notifition";
    private static final String SVG = "SVG";
    private static final String SURFACEVIEW = "SurfaceView";
    private static final String VIEWDRAGHELPER = "ViewDragHelper";

    private List<String> mDatas;
    private String[] data = {TOOLBAR,ANIMATION,NOTIFICATION,SVG,SURFACEVIEW,VIEWDRAGHELPER};
    private HomeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniView();
        initData();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void iniView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RecyclerView recyclerview = (RecyclerView) findViewById(R.id.recycler);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        mDatas = new ArrayList<String>();
        mAdapter = new HomeAdapter(mDatas);
        mAdapter.setOnItemClickListener(this);
        recyclerview.setAdapter(mAdapter);
//        recyclerview.addItemDecoration(new DividerItemDecoration(this,
//                DividerItemDecoration.VERTICAL_LIST));




    }
    protected void initData()
    {
                Collections.addAll(mDatas,data);
//        mDatas
//        for (int i = 'A'; i < 'z'; i++)
//        {
//            mDatas.add("" + (char) i);
//        }
        mAdapter.notifyDataSetChanged();
    }
    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(MainActivity.this, mDatas.get(position), Toast.LENGTH_SHORT).show();
        String data =  mDatas.get(position);
        switch (data){
            case TOOLBAR:
                Intent intent1 = new Intent(this,ToolBarActivity.class);
                intent1.putExtra("flag",0);
                startActivity(intent1, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case ANIMATION:
                Intent intent2 = new Intent(this,AnimationActivity.class);
                intent2.putExtra("flag",1);
                intent2.putExtra("title",ANIMATION);
                startActivity(intent2, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case NOTIFICATION:
                Intent intent3 = new Intent(this,NotifitionActivity.class);
                intent3.putExtra("flag",2);
                intent3.putExtra("title", NOTIFICATION);
                startActivity(intent3, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case SVG:
                Intent intent4 = new Intent(this,SVGActivity.class);
                intent4.putExtra("flag",2);
                intent4.putExtra("title", SVG);
                startActivity(intent4, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case SURFACEVIEW:
                Intent intent5 = new Intent(this,SurfaceViewActivity.class);
                intent5.putExtra("flag",0);
                intent5.putExtra("title", SURFACEVIEW);
                startActivity(intent5, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case VIEWDRAGHELPER:
                Intent intent6 = new Intent(this,ViewDragHelperActivity.class);
                intent6.putExtra("flag",1);
                intent6.putExtra("title", VIEWDRAGHELPER);
                startActivity(intent6, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;

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
