package cn.tu.test;

import cn.tu.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class JacksonTest {
    @Test
    public void test() throws Exception {
        Person person = new Person();
        person.setName("张三");
        person.setAge(23);
        person.setGender("男");

        ObjectMapper objectMapper = new ObjectMapper();
        String p = objectMapper.writeValueAsString(person);
        System.out.println(p);
        objectMapper.writeValue(new File("C:\\Users\\98461\\Desktop\\test\\a.txt"),person);
    }
    @Test
    public void test2() throws Exception {
        Person person = new Person();
        person.setName("张三");
        person.setAge(23);
        person.setGender("男");
        person.setBirth(new Date());
        ObjectMapper objectMapper = new ObjectMapper();
        String p = objectMapper.writeValueAsString(person);
        System.out.println(p);
    }
    @Test
    public void test3() throws Exception {
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(23);
        person1.setGender("男");
        person1.setBirth(new Date());

        Person person2 = new Person();
        person2.setName("张三");
        person2.setAge(23);
        person2.setGender("男");
        person2.setBirth(new Date());

        Person person3 = new Person();
        person3.setName("张三");
        person3.setAge(23);
        person3.setGender("男");
        person3.setBirth(new Date());

        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(people);
        System.out.println(str);
    }
    @Test
    public void test4() throws Exception {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("age",23);
        map.put("gender","男");

        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(map);
        System.out.println(str);
    }
    @Test
    public void test5() throws Exception{
        String json = "{\"name\":\"张三\",\"age\":23,\"gender\":\"男\",\"birth\":\"2019-05-09  07:58:16\"}";
        //创建ObjectMapper对象
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);
    }
}
