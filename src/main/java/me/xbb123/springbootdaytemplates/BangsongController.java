package me.xbb123.springbootdaytemplates;

import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * @author xbb123
 */
@RestController
public class BangsongController {
    @GetMapping("bs")
    public Bangsong bangsong() {
        Bangsong bangsong = new Bangsong();
        bangsong.setStreamer("dhshin");
        bangsong.setTitle("스프링 부트 2.0 레퍼런스 코딩");
        return bangsong;
    }

    @GetMapping("bs/{id}")
    public BangsongResource getBangSong(@PathVariable("id") Bangsong bangsong) {
        if (bangsong.getId() == 100) {
            throw new BangsongException();
        }
        BangsongResource resource = new BangsongResource();
        resource.setTitle(bangsong.getId() + " 번째 방송 중입니다.");
        Link link = linkTo(BangsongController.class).slash("bs").slash(bangsong.getId())
                .withSelfRel();
        Link listLink = linkTo(BangsongController.class).slash("bs")
                .withRel("bangsongList");
        resource.add(link, listLink);
        return resource;
    }
}
