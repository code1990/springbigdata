import net.sf.json.JSONObject;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * kafka监听
 * @author Lvjiapeng
 *
 */
@Component
public class RawDataListener {
    Logger logger = Logger.getLogger(RawDataListener.class);
//    @Autowired
//    private MatchRoadService matchRoadService;

    /**
     * 实时获取kafka数据(生产一条，监听生产topic自动消费一条)
     *
     * @param record
     * @throws IOException
     */
    @KafkaListener(topics = {"${kafka.consumer.topic}"})
    public void listen(ConsumerRecord<?, ?> record) throws IOException {
        String value = (String) record.value();
        System.out.println(value);
    }

}