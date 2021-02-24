package `in`.obvious.ws.writingkotlin.lambdas.kotlin

import `in`.obvious.ws.writingkotlin.lambdas.java.Account

class Bank(
    private val accounts: MutableList<Account>,
    private val accountAddedListener: (addedAccount: Account) -> Unit,
    private val accountRemovedListener: (removedAccount: Account) -> Unit
) {

    fun addAccount(account: Account) {
        accounts.add(account)
        accountAddedListener(account)
    }

    fun removeAccount(account: Account) {
        accounts.remove(account)
        accountRemovedListener(account)
    }
}
