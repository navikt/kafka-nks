package no.nav.kafka.dialog.kafka
import org.apache.kafka.clients.consumer.KafkaConsumer

class KafkaConsumerFactory {
    fun createConsumer(): KafkaConsumer<out Any, out Any?> = KafkaConsumer<String, String?>(propertiesPlain)
}
