package com.stk132;

import org.fluentlenium.adapter.FluentTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by stk132 on 14/08/20.
 */
public class FluentLeniumTest extends FluentTest {

    @Test
    public void 価格comで検索する () {
        goTo("http://kakaku.com/");
        fill("input[name=query]").with("ipad");
        submit("input[name=search]");
        assertThat(title()).isEqualTo("ipadの通販・ネットショッピング - 価格.com");
    }
}
