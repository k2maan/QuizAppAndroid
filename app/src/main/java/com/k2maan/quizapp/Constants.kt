package com.k2maan.quizapp

object Constants{

    const val USER_NAME:String = "username"
    const val TOTAL_QUESTIONS:String = "Total questions"
    const val CORRECT_ANSWERS:String = "Correct Answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "Which country's flag is this?",
            R.drawable.ic_argentina,
            "Argentina",
            "India",
            "South Africa",
            "Austria",
            1
        )
        questionList.add(question1)

        val question2 = Question(
                2,
                "What is the capital of China?",
                R.drawable.ic_bejeing,
                "Beijing",
                "Shanghai",
                "Hong Kong",
                "Seoul",
                1
        )
        questionList.add(question2)

        val question3 = Question(
                3,
                "Which country's map is this?",
                R.drawable.ic_aus,
                "USA",
                "Japan",
                "South Africa",
                "Austria",
                4
        )
        questionList.add(question3)

        val question4 = Question(
                4,
                "Which country's flag is this?",
                R.drawable.ic_ireland,
                "France",
                "Ireland",
                "Italy",
                "India",
                2
        )
        questionList.add(question4)

        val question5 = Question(
                5,
                "Which country's flag is this?",
                R.drawable.ic_kenya,
                "South Africa",
                "Ireland",
                "Kenya",
                "Spain",
                3
        )
        questionList.add(question5)

        val question6 = Question(
                6,
                "What is the capital of England?",
                R.drawable.ic_london,
                "London",
                "Manchester",
                "New York",
                "Birmingham",
                1
        )
        questionList.add(question6)

        val question7 = Question(
                7,
                "Which country's map is this?",
                R.drawable.ic_japan,
                "England",
                "Japan",
                "Singapore",
                "China",
                2
        )
        questionList.add(question7)

        val question8 = Question(
                8,
                "What is the capital of Canada?",
                R.drawable.ic_canada,
                "Ottawa",
                "Toronto",
                "Montreal",
                "Ontario",
                1
        )
        questionList.add(question8)

        val question9 = Question(
                8,
                "What is the capital of Japan?",
                R.drawable.ic_tokyo,
                "Tokyo",
                "Osaka",
                "Hiroshima",
                "Saitama",
                1
        )
        questionList.add(question9)

        val question10 = Question(
                8,
                "What is the capital of USA?",
                R.drawable.ic_washington,
                "New York",
                "Washington",
                "Seattle",
                "Sydney",
                2
        )
        questionList.add(question10)

        return questionList
    }
}