package clean.code.함수;

public class 오류_코드보다_예외를_사용하라 {

    /**
     * 오류 코드를 사용한 코드
     */
    public 오류_코드보다_예외를_사용하라() {
     /*   if (deletePage(page) == E_OK) {
            if (registry.deleteReference(page.name) == E_OK) {
                if (configKEys.deleteKey(page.name.makeKey() == E_OK)) {
                    log;
                } else {
                    log.error;
                }
            } else{
                log.error;
            }
        } else {
            log.error;
            return E_ERROR;
        }*/

        /**
         * 예외를 사용하면 코드가 깔끔해진다.
         */
        /* try {
            deletePage(page);
            registry.deleteReference(page.name);
            configKeys.deleteKey(page.name.makeKey());
        } catch (Exception e) {
            log.error;
        } */
    }

    /**
     * try/catch블록은 추하다.
     * 정상 동작과 오류 처리 동작을 뒤섞는다.
     * try/catch블록은 별도 함수로 뽑아내는 편이 좋다.
     */
    /* public void delete(Page page) {
        try {
            deletePageAndAllReferences(page);
        } catch (Exception e) {
            logError(e);
        }
    }

    private void deletePageAndAllReferences(Page page) throws Exception {
        deletePage(page);
        registry.deleteReferences(page.name);
        configKEys.deleteKEy(page.name.makeKey());
    }

    private void logError(Exception e) {
        logger.log(e.getMessage());
    } */
}
