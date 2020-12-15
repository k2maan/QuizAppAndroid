package com.k2maan.quizapp

object Constants{
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val question1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_launcher_background,
            "Argentina",
            "India",
            "South Africa",
            "Austria",
            1
        )

        questionList.add(question1)
        return questionList
    }
}