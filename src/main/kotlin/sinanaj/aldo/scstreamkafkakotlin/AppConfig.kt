package sinanaj.aldo.scstreamkafkakotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.annotation.EnableBinding
import sinanaj.aldo.scstreamkafkakotlin.message.PaymentSource

@SpringBootApplication
@EnableBinding(PaymentSource::class)
class ScstreamKafkaKotlinApplication

fun main(args: Array<String>) {
    runApplication<ScstreamKafkaKotlinApplication>(*args)
}
