package sinanaj.aldo.scstreamkafkakotlin.rest

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.messaging.MessageChannel
import org.springframework.messaging.support.MessageBuilder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import sinanaj.aldo.scstreamkafkakotlin.domain.Payment
import sinanaj.aldo.scstreamkafkakotlin.message.PaymentSource
import java.util.*

@RestController
class PaymentController(@Qualifier(PaymentSource.CHANNEL_NAME) private val paymentChannel: MessageChannel) {

    @GetMapping("/process")
    fun process() {
        val message = MessageBuilder.withPayload(Payment(UUID.randomUUID().toString(), "IBAN1", "IBAN2")).build()
        paymentChannel.send(message)
    }
}