package es.usj.mastertsa.jhernandez.musicquiz.singleton

sealed class SignState

object Unsigned: SignState()

class Signed(val publicToken: String, val timestamp: String, val hash: String): SignState()

class SignPresenter {

    private var state: SignState = Unsigned

    val isSigned: Boolean
        get() = when (state) {
            is Signed -> true
            is Unsigned -> false
        }

    val publicToken: String
        get() {
            return when (val state = this.state) {
                is Signed -> state.publicToken
                is Unsigned -> "Unknown"
            }
        }

    val timestamp: String
        get() {
            return when (val state = this.state) {
                is Signed -> state.timestamp
                is Unsigned -> "Unknown"
            }
        }

    val hash: String
        get() {
            return when (val state = this.state) {
                is Signed -> state.hash
                is Unsigned -> "Unknown"
            }
        }

    fun sign(publicToken: String, timestamp: String, hash: String) {
        state = Signed(publicToken, timestamp, hash)
    }

    fun unsign() {
        state = Unsigned
    }

    override fun toString() = "Signed with token '$publicToken', timestamp '$timestamp' and hash '$hash'"
}