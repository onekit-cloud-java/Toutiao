package com.toutiao.developer;


import com.toutiao.developer.entity.v2.*;

public interface ToutiaoAPI2 {

    tags__text__antidirt_response tags__text__antidirt(
            String tt_X_Token, tags__text__antidirt_body tt_body) throws ToutiaoError;

    tags__image_response tags__image(String tt_X_Token, tags__image_body tt_body) throws ToutiaoError;
}
