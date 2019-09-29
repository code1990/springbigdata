## springbigdata

为了更好的把springboot+大数据技术整合 特地设立此项目

### springboot+hadoop



### springboot+hive



### springboot+hbase



### springboot+kafka

总结：

①  生产者环境类配置好以后，@Autowired自动注入KafkaTemplate类，使用send方法生产消息

②  消费者环境类配置好以后，方法头前使用@KafkaListener(topics = {"${kafka.consumer.topic}"})注解监听topic并传入ConsumerRecord<?, ?> record对象即可自动消费topic

③  相关kafka配置只需在application.properties照葫芦画瓢添加，修改或者删除配置并在环境配置类中做出相应修改即可

https://github.com/527515025/springBoot/tree/dev/springboot-kafka


### springboot+spark





