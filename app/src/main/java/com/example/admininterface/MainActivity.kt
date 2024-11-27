package com.example.admininterface

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manageUsersButton: Button = findViewById(R.id.manageUsersButton)
        val viewLogsButton: Button = findViewById(R.id.viewLogsButton)
        val viewMoreButton: Button = findViewById(R.id.showMoreButton)
        val controlSystemButton: Button = findViewById(R.id.controlSystemButton)

        manageUsersButton.setOnClickListener {
            startActivity(Intent(this, ManageUsersActivity::class.java))
        }

        viewMoreButton.setOnClickListener {
            startActivity(Intent(this, SuperAdminActivity::class.java))
        }


        viewLogsButton.setOnClickListener {
            // Placeholder for View Logs screen
        }

        controlSystemButton.setOnClickListener {
            // Placeholder for Control System Settings screen
        }
    }
}

