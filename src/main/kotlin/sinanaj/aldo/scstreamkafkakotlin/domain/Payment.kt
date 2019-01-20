package sinanaj.aldo.scstreamkafkakotlin.domain

data class Payment(val id: String,
                   val debtorIban: String,
                   val creditorIban: String,
                   val description: String? = null)