package com.example.youtubeapp3try


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.RenderScript
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : YouTubeBaseActivity() , View.OnClickListener {
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.recreatebtn2 -> recreate()
            R.id.recreatebtn1 -> recreate()
            R.id.recreatebtn4 -> recreate()
            R.id.btnplay1 -> initUI1()
            R.id.btnplay2 -> initUI2()
            R.id.btnplay4 -> initUI3()


        }
    }


    companion object {
        val YOUTUBE_API_KEY: String = "AIzaSyBDlD6j0nMvwYEmCA-bkPeXYZ_ssMNLKes"
        val VIDEO_ID1: String = ("YqggV_wGhM0")
        val VIDEO_ID2: String = ("v4pi1LxuDHc")
        val VIDEO_ID3: String = ("Mq4r_J-JGyg")
    }

    lateinit var youtubeplayerinit: YouTubePlayer.OnInitializedListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        recreatebtn1.setOnClickListener (this)
        recreatebtn2.setOnClickListener (this)
        recreatebtn4.setOnClickListener (this)
        btnplay1.setOnClickListener(this)
        btnplay2.setOnClickListener(this)
        btnplay4.setOnClickListener(this)

    }




    private fun initUI3() {

        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youtubeplayer: YouTubePlayer?, p2: Boolean) {
                youtubeplayer?.loadVideo(VIDEO_ID3)

            }

            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
                Toast.makeText(applicationContext,"something went wrong",Toast.LENGTH_LONG).show()
            }

        }

        youtubePlayer.initialize(YOUTUBE_API_KEY,youtubeplayerinit)



    }

    private fun initUI2() {


        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youtubeplayer: YouTubePlayer?, p2: Boolean) {
                youtubeplayer?.loadVideo(VIDEO_ID2)
            }

            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
                Toast.makeText(applicationContext,"something went wrong",Toast.LENGTH_LONG).show()
            }

        }

        youtubePlayer.initialize(YOUTUBE_API_KEY,youtubeplayerinit)
    }

    private fun initUI1() {


        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youtubeplayer: YouTubePlayer?, p2: Boolean) {
                youtubeplayer?.loadVideo(VIDEO_ID1)
            }

            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
                Toast.makeText(applicationContext,"something went wrong",Toast.LENGTH_LONG).show()
            }

        }

        youtubePlayer.initialize(YOUTUBE_API_KEY,youtubeplayerinit)

    }


}

