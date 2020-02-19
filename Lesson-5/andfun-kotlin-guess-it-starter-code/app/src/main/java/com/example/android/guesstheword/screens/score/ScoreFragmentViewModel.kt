package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

class ScoreFragmentViewModel(finalScore: Int) : ViewModel(){
    init {
        Log.i("ScoreFragmentViewModel", "Final Score: $finalScore")
    }
}