package com.k2maan.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_questions.*

class QuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val questionsList = Constants.getQuestions()

        val currentPos = 0
        val question : Question? = questionsList[currentPos - 1]

        progressBar.progress = currentPos
        tvProgress.text = "$currentPos" + "/" + progressBar.max

        tvQuestion.text = question!!.question

        ivImage.setImageResource(question.image)

        tvOptionOne.text = question.option1
        tvOptionTwo.text = question.option2
        tvOptionThree.text = question.option3
        tvOptionFour.text = question.option4
    }
}