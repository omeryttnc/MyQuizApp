package com.example.myquizapp

object Constants {

    fun getQuestions(): ArrayList<Question> {

        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.flag_of_afghanistan,
            "Argentina",
            "Australia",
            "Turkey",
            "Afghanistan",
            4
        )

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.flag_of_albania,
            "Argentina",
            "Albania",
            "Turkey",
            "Afghanistan",
            2
        )
        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.flag_of_algeria,
            "Argentina",
            "Albania",
            "Algaria",
            "Afghanistan",
            3
        )
        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.flag_of_andorra,
            "Argentina",
            "Albania",
            "Turkey",
            "Andorra",
            4
        )
        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.flag_of_angola,
            "Angola",
            "Albania",
            "Turkey",
            "Afghanistan",
            1
        )
        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.flag_of_antarctica,
            "Argentina",
            "Albania",
            "Turkey",
            "Antarctica",
            4
        )



        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)
        questionList.add(que6)


        return questionList
    }

}