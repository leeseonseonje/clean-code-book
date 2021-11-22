package clean.code.함수;

public class 작게_만들어라 {

    /**
     * 함수를 만드는 첫째 규칙은 '작게!'다.
     * 함수를 만드는 둘째 규칙은 '더 작게!'다.
     */
     public static String renderPageWithSetupsAndTeardowns(
             PageData pageData, boolean isSuite) throws Exception {
         if (isTestPage(pageData))
             includeSetupAndTeardownPages(pageData, isSuite);
         return pageData.getHtml();
     }

    public static boolean isTestPage(PageData pageData) {
        return true;
    }

    public static void includeSetupAndTeardownPages(PageData pageData, boolean isSuite) {

    }

    class PageData {
        String html;

        public String getHtml() {
            return html;
        }
    }
}

