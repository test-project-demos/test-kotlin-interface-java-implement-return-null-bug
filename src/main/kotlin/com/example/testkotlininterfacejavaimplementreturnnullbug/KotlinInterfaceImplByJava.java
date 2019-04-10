package com.example.testkotlininterfacejavaimplementreturnnullbug;

import org.springframework.stereotype.Service;

/**
 * @author zhixiao.mzx
 * @date 2019-04-10
 */
@Service
public class KotlinInterfaceImplByJava implements KotlinInterface {
    //@NotNull
    @Override
    public String test() {
        return null;
    }
}
