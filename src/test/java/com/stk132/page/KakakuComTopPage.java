package com.stk132.page;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by stk132 on 14/07/13.
 */
public class KakakuComTopPage extends FluentPage {

    @FindBy(name = "query")
    FluentWebElement keywordInput;
    @FindBy(name = "search")
    FluentWebElement keywordSearchSubmitButton;

    @Override
    public String getUrl() {
        return "http://kakaku.com/";
    }

    /**
     * 検索窓にキーワードを入力する
     * @param keyword
     * @return
     */
    public KakakuComTopPage inputKeyword(String keyword) {
        keywordInput.fill().with(keyword);
        return this;
    }

    /**
     * 検索ボタンを押下して、検索結果ページに遷移する
     * @return
     */
    public KakakuComKeywordSearchResultPage executeKeywordSearch() {
        keywordSearchSubmitButton.click();
        return createPage(KakakuComKeywordSearchResultPage.class);
    }
}
