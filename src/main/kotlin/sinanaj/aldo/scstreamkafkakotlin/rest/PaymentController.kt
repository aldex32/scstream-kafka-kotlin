package sinanaj.aldo.scstreamkafkakotlin.rest

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.messaging.MessageChannel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import sinanaj.aldo.scstreamkafkakotlin.message.PaymentSource

@RestController
class PaymentController(@Qualifier(PaymentSource.CHANNEL_NAME) private val paymentChannel: MessageChannel) {

    @GetMapping("/process")
    fun process() = "ok"
}