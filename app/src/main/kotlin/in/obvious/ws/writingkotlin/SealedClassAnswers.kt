package `in`.obvious.ws.writingkotlin

sealed class Failure {
    data class ServerError(val errorMessage: String? = null) : Failure()
    data class AuthenticationError(val errorMessage: String? = null) : Failure()
    data class Exceptions(val cause: Exception? = null) : Failure()
}

fun handleFailure(failure: Failure): Unit? =
    when (failure) {
        is Failure.AuthenticationError -> println(failure.errorMessage)
        is Failure.Exceptions -> failure.cause?.printStackTrace()
        is Failure.ServerError -> println(failure.errorMessage)
        else -> println("something went wrong")
    }