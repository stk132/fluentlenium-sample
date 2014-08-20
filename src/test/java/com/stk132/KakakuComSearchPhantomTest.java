package com.stk132;

import com.stk132.page.KakakuComKeywordSearchResultPage;
import com.stk132.page.KakakuComTopPage;
import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by stk132 on 14/07/13.
 */
public class KakakuComSearchPhantomTest extends FluentTest {

    @Page
    KakakuComTopPage page;

    @Test
    public void 検索ボタンをクリックするとキーワード検索を実行すること () {
        page.go();
        page.inputKeyword("ipad").executeKeywordSearch();
        assertThat(page.title()).isEqualTo("ipadの通販・ネットショッピング - 価格.com");
    }

    @Test
    public void TOP画面から商品詳細画面に遷移できること () {
        page.go();
        KakakuComKeywordSearchResultPage searchResultPage = page.inputKeyword("ipad").executeKeywordSearch();
        searchResultPage.goToFirstItemDetailPage();
        assertThat(title()).contains("価格比較");
    }

    @Override
    public WebDriver getDefaultDriver() {
        return new PhantomJSDriver();
    }
}
