package test.com.mmocc.learn;

import com.google.common.collect.Lists;
import com.mmall.DTO.PersonDTO;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.*;
import java.util.stream.Collectors;

public class CommonTest {

    @Test
    public void collectorsTest(){


        PersonDTO personDTO0 = new PersonDTO(011,"张三","N");
        PersonDTO personDTO1 = new PersonDTO(011,"李四","N");
        PersonDTO personDTO2 = new PersonDTO(012,"小艳","W");

        List<PersonDTO> personDTOList = Lists.newArrayList();
        personDTOList.add(personDTO0);
        personDTOList.add(personDTO1);
        personDTOList.add(personDTO2);
        List<PersonDTO> newPersonList = personDTOList.stream().collect(Collectors.collectingAndThen(
                Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(PersonDTO::getId))), ArrayList::new));
        //默认是自然排序，下面的方法逆序
        newPersonList.sort((a,b) -> b.getId().compareTo(a.getId()));
        newPersonList.forEach(a -> System.out.println("id:" + a.getId() + "name:" + a.getName()));
    }


    @Test
    public void treeSetTest(){
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");

        System.out.println("treeSet:"+ treeSet);
        System.out.println("treeSet: desc"+treeSet.comparator());

    }

    @Test
    public void arraysTest(){
        String str = "I am chinese";
        char[] strChar = str.toCharArray();
        Arrays.sort(strChar);
        String processStr = String.valueOf(strChar);
        System.out.println("str:"+ str);
        System.out.println("processStr:"+processStr);
    }

    @Test
    public void MD5Test(){

        String password = "123";
        //MD5Util(password);
        System.out.println("process password:"+MD5Util(password));

    }

    public static String MD5Util(String pwd){

        MessageDigest md5 = null;

        try {
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){
            System.out.println("初始化MD5工具类错误");
        }

        StringBuilder sb = new StringBuilder(40);
        if(StringUtils.isNotEmpty(pwd) && md5 != null){
            byte[] bs;
            try {
                bs= md5.digest(pwd.getBytes("UTF-8"));
            }catch (UnsupportedEncodingException e){
                bs= md5.digest(pwd.getBytes());
            }
            for(byte x : bs){
                if((x & 0xff) >> 4 == 0){
                    sb.append("0").append(Integer.toHexString(x & 0xff));
                }else {
                    sb.append(Integer.toHexString(x & 0xff));
                }
            }
        }
        return sb.toString();
    }

    @Test
    public void optionalTest(){
        String strData = null;
        Optional<String> optional = Optional.ofNullable(strData);
        System.out.println("optional:"+optional.orElse("123"));

    }

}
