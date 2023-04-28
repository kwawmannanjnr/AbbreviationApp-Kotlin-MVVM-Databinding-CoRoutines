package snitch.police.scanner.radio.broadcastify.mvvmkotlinabbrevationapp.model

data class Lf(
    val freq: Int,
    val lf: String,
    val since: Int,
    val vars: List<Var>
)