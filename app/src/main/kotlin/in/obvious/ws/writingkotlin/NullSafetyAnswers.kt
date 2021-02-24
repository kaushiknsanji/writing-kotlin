package `in`.obvious.ws.writingkotlin

data class Dessert(val pastry: String, var amountOfCalories: Int? = null) {
    fun setCalories(amountOfCalories: Int?) {
        this.amountOfCalories = amountOfCalories ?: -1
    }
}