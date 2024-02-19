package uz.yxdev.famouspersons.data.repsitory

import android.content.Context
import uz.yxdev.famouspersons.R
import uz.yxdev.famouspersons.data.model.QuestionData

class QuestionRepository(private val context: Context) {
    private val questions = ArrayList<QuestionData>()

    init {
        loadList()
    }

    private fun loadList() {
        addQuestion(
            QuestionData(
                id = 0,
                famousID = 0,
                questionText = context.getString(R.string.alisher_question_1),
                variantA = "1441-yilda Hirotda",
                variantB = "1440-yilda Samarqandda",
                variantC = "1501-yilda Hirotda",
                variantD = "1401-yilda Xurosonda",
                correctAnswer = "1441-yilda Hirotda"
            )
        )
        addQuestion(
            QuestionData(
                id = 1,
                famousID = 0,
                questionText = context.getString(R.string.alisher_question_2),
                variantA = "Lutfiy",
                variantB = "Buxoriy",
                variantC = "Bobur",
                variantD = "Ahmad Yassaviy",
                correctAnswer = "Lutfiy"
            )
        )
        addQuestion(
            QuestionData(
                id = 2,
                famousID = 0,
                questionText = context.getString(R.string.alisher_question_3),
                variantA = "Husayn Boyqaro",
                variantB = "Shoxrux Mirzo",
                variantC = "Lutfiy",
                variantD = "Bobur Mirzo",
                correctAnswer = "Husayn Boyqaro"
            )
        )
        addQuestion(
            QuestionData(
                id = 3,
                famousID = 0,
                questionText = context.getString(R.string.alisher_question_4),
                variantA = "4",
                variantB = "6",
                variantC = "5",
                variantD = "1",
                correctAnswer = "5"
            )
        )
        addQuestion(
            QuestionData(
                id = 4,
                famousID = 0,
                questionText = context.getString(R.string.alisher_question_5),
                variantA = "90",
                variantB = "60",
                variantC = "65",
                variantD = "63",
                correctAnswer = "60"
            )
        )
        addQuestion(
            QuestionData(
                id = 5,
                famousID = 1,
                questionText = context.getString(R.string.lutfiy_question_1),
                variantA = "1367",
                variantB = "1336",
                variantC = "1441",
                variantD = "1483",
                correctAnswer = "1367"
            )
        )
        addQuestion(
            QuestionData(
                id = 6,
                famousID = 1,
                questionText = context.getString(R.string.lutfiy_question_2),
                variantA = "Shohrux",
                variantB = "Ulug'bek",
                variantC = "Bobur",
                variantD = "Ahmad Yassaviy",
                correctAnswer = "Shohrux"
            )
        )
        addQuestion(
            QuestionData(
                id = 7,
                famousID = 1,
                questionText = context.getString(R.string.lutfiy_question_3),
                variantA = "Fors",
                variantB = "Turkiy",
                variantC = "Fors va Turkiy",
                variantD = "Arab",
                correctAnswer = "Fors va Turkiy"
            )
        )
        addQuestion(
            QuestionData(
                id = 8,
                famousID = 1,
                questionText = context.getString(R.string.lutfiy_question_4),
                variantA = "Hirotda",
                variantB = "Samarqandda",
                variantC = "Kobulda",
                variantD = "Dahbedda",
                correctAnswer = "Hirotda"
            )
        )
        addQuestion(
            QuestionData(
                id = 9,
                famousID = 1,
                questionText = context.getString(R.string.lutfiy_question_5),
                variantA = "63",
                variantB = "60",
                variantC = "65",
                variantD = "90",
                correctAnswer = "90"
            )
        )
        addQuestion(
            QuestionData(
                id = 10,
                famousID = 2,
                questionText = context.getString(R.string.buxoriy_question_1),
                variantA = "Muhaddis",
                variantB = "Fizik",
                variantC = "Shoir",
                variantD = "Tabib",
                correctAnswer = "Muhaddis"
            )
        )
        addQuestion(
            QuestionData(
                id = 11,
                famousID = 2,
                questionText = context.getString(R.string.buxoriy_question_2),
                variantA = "819-yil",
                variantB = "810-yil",
                variantC = "825-yil",
                variantD = "800-yil",
                correctAnswer = "810-yil"
            )
        )
        addQuestion(
            QuestionData(
                id = 12,
                famousID = 2,
                questionText = context.getString(R.string.buxoriy_question_3),
                variantA = "Ziji Jadidi Ko'ragoniy",
                variantB = "Xamsa",
                variantC = "Boburnoma",
                variantD = "Al-Jome as-Sahih",
                correctAnswer = "Al-Jome as-Sahih"
            )
        )
        addQuestion(
            QuestionData(
                id = 13,
                famousID = 2,
                questionText = context.getString(R.string.buxoriy_question_4),
                variantA = "15",
                variantB = "9",
                variantC = "16",
                variantD = "19",
                correctAnswer = "15"
            )
        )
        addQuestion(
            QuestionData(
                id = 14,
                famousID = 2,
                questionText = context.getString(R.string.buxoriy_question_5),
                variantA = "890",
                variantB = "865",
                variantC = "870",
                variantD = "859",
                correctAnswer = "870"
            )
        )
        addQuestion(
            QuestionData(
                id = 15,
                famousID = 3,
                questionText = context.getString(R.string.behbudiy_question_1),
                variantA = "1875",
                variantB = "1800",
                variantC = "1789",
                variantD = "1483",
                correctAnswer = "1875"
            )
        )
        addQuestion(
            QuestionData(
                id = 16,
                famousID = 3,
                questionText = context.getString(R.string.behbudiy_question_2),
                variantA = "Nazm",
                variantB = "Dramaturgiya",
                variantC = "G'azal",
                variantD = "Hikoya",
                correctAnswer = "Dramaturgiya"
            )
        )
        addQuestion(
            QuestionData(
                id = 17,
                famousID = 3,
                questionText = context.getString(R.string.behbudiy_question_3),
                variantA = "Hirotda",
                variantB = "Samarqandda",
                variantC = "Kobulda",
                variantD = "Dahbedda",
                correctAnswer = "Samarqandda"
            )
        )
        addQuestion(
            QuestionData(
                id = 18,
                famousID = 3,
                questionText = context.getString(R.string.behbudiy_question_4),
                variantA = "Jadid",
                variantB = "Shifokor",
                variantC = "Tarixchi",
                variantD = "Siyosatchi",
                correctAnswer = "Jadid"
            )
        )
        addQuestion(
            QuestionData(
                id = 19,
                famousID = 3,
                questionText = context.getString(R.string.behbudiy_question_5),
                variantA = "63",
                variantB = "44",
                variantC = "65",
                variantD = "56",
                correctAnswer = "44"
            )
        )

    }

    fun getList(famousID: Int): List<QuestionData> {
        val newLs = questions.filter { item ->
            item.famousID == famousID
        }
        return newLs.shuffled()
    }

    private fun addQuestion(data: QuestionData) {
        questions.add(data)
    }
}