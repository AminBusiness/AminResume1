package com.example.amin_elhasan.resume1

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonWorkExperience = findViewById<Button>(R.id.buttonWorkExperience)

        buttonWorkExperience.setOnClickListener {
            println("You clicked the work experience button!")

            var showWorkExperiencePage = Intent(getApplicationContext(),
                    Main2Activity::class.java)
            startActivity(showWorkExperiencePage)
        }

        var buttonEducation = findViewById<Button>(R.id.buttonEducation)

        buttonEducation.setOnClickListener {println("You cliked the education button!")

            var showEducationPage = Intent(getApplicationContext(),
                    Main3Activity::class.java)
            startActivity(showEducationPage)

        }


        var call = findViewById<Button>(R.id.buttonCall)

            call.setOnClickListener {
                println("You click the CALL ME button")

                var phoneUri = Uri.parse("tel:3146424085")
                var callIntent = Intent(Intent.ACTION_DIAL, phoneUri)
                startActivity(callIntent)


        }

        val email = findViewById<Button>(R.id.buttonEmail)
        email.setOnClickListener{
            println("You clicked the EMAIL button!")

            val emailIntent = Intent(Intent.ACTION_SEND)
            val myEmail = arrayOf("elhasan2018@gmail.com")
            emailIntent.type = "plain/text"
            emailIntent.putExtra(Intent.EXTRA_EMAIL,myEmail)
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Regarding your resume")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"This email is in regards to your job inquiry")

            startActivity(emailIntent)
        }
    }
}
