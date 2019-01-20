package sinanaj.aldo.scstreamkafkakotlin.message

import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel

interface PaymentSource {

    companion object {
        const val CHANNEL_NAME = "paymentChannel"
    }

    @Output(PaymentSource.CHANNEL_NAME)
    fun paymentChannel(): MessageChannel
}
