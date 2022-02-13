package com.hakanerdogmus.simpsoncreatkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hakanerdogmus.simpsoncreatkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var name =""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



    }

    fun makeSimpson (view : View){
         name = binding.nameText.text.toString()
       /* if(name != null){
            name = binding.nameText.text.toString()
        }else{
            name = ""
        }*/
        var age = binding.ageText.text.toString().toIntOrNull()
        if (age == null){
            age = 0
        }
        var job = binding.jobText.text.toString()
       /* if (job != null){
            job = binding.jobText.text.toString() }
        else{
            job = ""
        }*/
        val simpson = Simpson(name, age, job)

        binding.resultText.text = "Name : ${simpson.name}, Age : ${simpson.age}, Job : ${simpson.job}"



    }

    fun scopeExample (view : View){
        //Scope
        println(name)

    }







        }
