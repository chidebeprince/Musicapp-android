package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    final float RIGHT_VOL = 1;
    final float LEFT_VOL = 1;
    final int PRIORITY = 1;
    final int LOOP = 0;
    final int RATE = 1;

  SoundPool soundPool = new SoundPool(7, AudioManager.STREAM_MUSIC,0);
    int soundC;
    int soundD;
    int soundE;
    int soundF;
    int soundG;
    int soundA;
    int soundB;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soundC = soundPool.load(MainActivity.this,R.raw.note1_c,1);
        soundD = soundPool.load(MainActivity.this,R.raw.note2_d,1);
        soundE = soundPool.load(MainActivity.this,R.raw.note3_e,1);
        soundF = soundPool.load(MainActivity.this,R.raw.note4_f,1);
        soundG = soundPool.load(MainActivity.this,R.raw.note5_g,1);
        soundA = soundPool.load(MainActivity.this,R.raw.note6_a,1);
        soundB = soundPool.load(MainActivity.this,R.raw.note7_b,1);

    }

    public void playC (View v){
        soundPool.play(soundC,LEFT_VOL,RIGHT_VOL,PRIORITY,LOOP,RATE);
    }
    public void playD (View v){
        soundPool.play(soundD,LEFT_VOL,RIGHT_VOL,PRIORITY,LOOP,RATE);
    }
    public void playE (View v){
        soundPool.play(soundE,LEFT_VOL,RIGHT_VOL,PRIORITY,LOOP,RATE);
    }
    public void playF (View v){
        soundPool.play(soundF,LEFT_VOL,RIGHT_VOL,PRIORITY,LOOP,RATE);
    }
    public void playG (View v){
        soundPool.play(soundG,LEFT_VOL,RIGHT_VOL,PRIORITY,LOOP,RATE);
    }
    public void playA (View v){
        soundPool.play(soundA,LEFT_VOL,RIGHT_VOL,PRIORITY,LOOP,RATE);
    }
    public void playB (View v){
        soundPool.play(soundB,LEFT_VOL,RIGHT_VOL,PRIORITY,LOOP,RATE);
    }







}
