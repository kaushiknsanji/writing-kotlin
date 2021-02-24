package `in`.obvious.ws.writingkotlin

data class EmailAddress(val username: String, val emailProvider: String)

data class PhoneNumber(val number: String, val countryISDCode: String)

data class User(
    val id: Int,
    val name: String,
    val phoneNumber: PhoneNumber,
    val emailAddress: EmailAddress
)

fun scratchForDataClasses() {
    val userVinayShenoy: User = User(
        1,
        "Vinay Shenoy",
        PhoneNumber("1234567890", "+91"),
        EmailAddress("vinay", "obvious.in")
    )

    val userVinayShenoyUpdatedPhoneNumber =
        userVinayShenoy.copy(phoneNumber = PhoneNumber("0987654321", "+91"))
}