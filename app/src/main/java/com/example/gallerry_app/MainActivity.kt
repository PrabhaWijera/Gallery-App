package com.example.gallerry_app

import android.content.Context
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {

    private var imageRecycler:RecyclerView?=null
    private var progressBar:ProgressBar?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    imageRecycler=findViewById(R.id.image_recycler)
        progressBar=findViewById(R.id.recycler_progress)

        //storage permision
        if (ContextCompat.checkSelfPermission(this@MainActivity,android.Manifest.permission.READ_EXTERNAL_STORAGE)!=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this@MainActivity, arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),101)
        }
    }
}