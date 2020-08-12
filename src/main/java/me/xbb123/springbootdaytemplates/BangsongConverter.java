package me.xbb123.springbootdaytemplates;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author xbb123
 */
@Component
public class BangsongConverter implements Converter<String, Bangsong> {

    @Override
    public Bangsong convert(String id) {
        Bangsong bangsong = new Bangsong();
        bangsong.setId(Integer.parseInt(id));
        return bangsong;
    }

}
