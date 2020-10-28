package test.mq.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Arrays;
import java.util.Properties;

public class KafkaConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        Properties props = new Properties();
        props.put("bootstrap.servers", "192.168.37.129:9092");
        props.put("group.id", "testConsumerGroup");
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        props.put("session.timeout.ms", "30000");
        props.put("max.poll.records", 1000);
        props.put("auto.offset.reset", "earliest");
        props.put("key.deserializer", StringDeserializer.class.getName());
        props.put("value.deserializer", StringDeserializer.class.getName());
        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
        consumer.subscribe(Arrays.asList("TEST-TOPIC-001"));
        ConsumerRecords<String, String> msgList = null;
        for (;;) {
            msgList = consumer.poll(1000);
            if(null!=msgList&&msgList.count()>0){
                for (ConsumerRecord<String, String> record : msgList) {
                    String key = record.key();
                    String value = record.value();
                    System.out.println(key + ":" + value);
                }
            }else{
                Thread.sleep(1000);
            }
        }

    }



}
