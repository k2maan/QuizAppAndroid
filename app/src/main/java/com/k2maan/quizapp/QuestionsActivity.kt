package com.k2maan.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_questions.*

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList:ArrayList<Question>? = null
    private var mSelectedOptionPosition:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        mQuestionsList = Constants.getQuestions()
        setQuestion()

        tvOptionOne.setOnClickListener(this)
        tvOptionTwo.setOnClickListener(this)
        tvOptionThree.setOnClickListener(this)
        tvOptionFour.setOnClickListener(this)

    }

    private fun setQuestion(){
        mCurrentPosition = 1
        val question = mQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        progressBar.progress = mCurrentPosition
        tvProgress.text = "$mCurrentPosition" + "/" + progressBar.max

        tvQuestion.text = question!!.question

        ivImage.setImageResource(question.image)

        tvOptionOne.text = question.option1
        tvOptionTwo.text = question.option2
        tvOptionThree.text = question.option3
        tvOptionFour.text = question.option4
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()

        options.add(0, tvOptionOne)
        options.add(1, tvOptionTwo)
        options.add(2, tvOptionThree)
        options.add(3, tvOptionFour)

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                    this,
                    R.drawable.default_option_bg
            )
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tvOptionOne -> {
                selectedOptionView(tvOptionOne, 1)
            }

            R.id.tvOptionTwo -> {
                selectedOptionView(tvOptionTwo, 2)
            }

            R.id.tvOptionThree -> {
                selectedOptionView(tvOptionThree, 3)
            }

            R.id.tvOptionFour -> {
                selectedOptionView(tvOptionFour, 4)
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNumber: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNumber

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
                this,
                R.drawable.selected_option_bg
        )
    }
}