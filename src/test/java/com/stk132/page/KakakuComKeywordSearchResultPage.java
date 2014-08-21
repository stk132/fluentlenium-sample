package com.stk132.page;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by stk132 on 14/08/20.
 */
public class KakakuComKeywordSearchResultPage extends FluentPage {
    @FindBy(id = "query")
    FluentWebElement keywordInput;
    @FindBy(id = "search")
    FluentWebElement keywordSearchSubmitButton;


    /**
     * 検索結果一覧の最初の商品詳細ページに遷移する
     * @return
     */
    public KakakuComItemDetailPage goToFirstItemDetailPage() {
        FluentWebElement itemDetailButton = findFirst(".iviewbtn");
        itemDetailButton.click();
        return createPage(KakakuComItemDetailPage.class);
    }

    /**
     * 検索窓にキーワードを入力する
     * @param keyword
     * @return
     */
    public KakakuComKeywordSearchResultPage inputKeyword(String keyword) {
        keywordInput.fill().with(keyword);
        return this;
    }

    /**
     * 検索ボタンを押下して検索結果画面に遷移する
     * @return
     */
    public KakakuComKeywordSearchResultPage executeKeywordSearch() {
        keywordSearchSubmitButton.click();
        return createPage((this.getClass()));
    }
}
