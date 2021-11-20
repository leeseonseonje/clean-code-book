package clean.code.의미있는이름;

public class 의미_있게_구분하라 {

    /**
     * a1, a2와 같은 이름은 그릇된 정보를 제공하는 이름도 아니고, 아무런 정보를 제공하지 못하는 이름일 뿐이다.
     * 저자 의도가 전혀 드러나지 않는다.
     */
    public static void copyChars(char a1[], char a2[]) {

        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
    }

    /**
     * a1과 a2의 이름을 source 와 destination 을 사용한다면 코드 읽기가 훨씬 더 쉬워진다.
     */
    public static void copyCharsGoodNaming(char[] source, char[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }
}
