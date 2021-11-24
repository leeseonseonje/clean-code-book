package clean.code.함수;

public class 부수_효과를_일으키지_마라 {

    private Cryptographer cryptographer;

    /**
     * 여기서 해당 함수가 일으키는 부수효과는 Session.initialize()호출이다.
     * 이름만 봐서는 세션을 초기화 한다는 사실이 드러나지 않음
     * 함수 이름만 보고 함수를 호출하는 사용자는 원치않게 세션 정보를 지울 수 있음
     * 만약 필요하다면 함수 이름에 분명히 명시한다.
     * checkPasswordAndInitializeSession이라는 이름이 훨씬 좋다.
     * 하지만, 함수가 '한 가지'만 한다는 규칙은 위반하게 된다.
     */
    public boolean checkPassword(String username, String password) {

        User user = UserGateway.findByName(username);
        if (user != User.NULL) {
            String codedPhrase = user.getPhraseEncodedByPassword();
            String phrase = cryptographer.decrypt(codedPhrase, password);
            if ("Valid Password".equals(phrase)) {
                Session.initialize();
                return true;
            }
        }
        return false;
    }

    /**
     * sample
     */
    class Cryptographer { public String decrypt(String codedPhrase, String password) {return ""; }}

    static class User{ public static final User NULL = new User();
                        public String getPhraseEncodedByPassword() { return ""; }}

    static class UserGateway { public static User findByName(String username) { return null; }}

    static class Session {public static void initialize() {} }
}
