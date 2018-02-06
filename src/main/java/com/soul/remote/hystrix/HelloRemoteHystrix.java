package com.soul.remote.hystrix;

import com.soul.remote.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Soul on 2018/2/6.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello2(String name) {
        return "HelloController," + name + ",远程服务暂时无法调用！";
    }
}
