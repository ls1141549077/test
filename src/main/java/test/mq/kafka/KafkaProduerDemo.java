package test.mq.kafka;


import com.alibaba.fastjson.JSON;
import org.apache.commons.codec.StringEncoder;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class KafkaProduerDemo {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "192.168.37.129:9092");
        props.put("acks", "all");
        // retries 设置较大的数字防止丢失消息
        props.put("retries", 9999);
        props.put("batch.size", 16384);
        props.put("key.serializer", StringSerializer.class.getName());
        props.put("value.serializer", StringSerializer.class.getName());
        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);
        for (int i = 0; i <1000 ; i++) {
            ProducerRecord record = new ProducerRecord("TEST-TOPIC-001","COFFE"+i,"value"+i);
            // 一定使用带Callback的,否则会丢失消息
            producer.send(record, (data,e)-> {
                    System.out.println("data:"+ JSON.toJSONString(data));
            });
            System.out.println("发送成功TEST-TOPIC-001"+i);
        }


    }

}
