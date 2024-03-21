package com.ddo.section04.constructor;

public class Application {
    public static void main(String[] args) {
        /* 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다.
        * 지금까지 우리가 객체를 생성했던 코드를 다시 한 번 살펴 볼 것이다.
        * 클래스명 레퍼런스 변수 = new 클래스명(); 이렇게 객체를 생성했을 것이다.
        * 하지만 new 뒤에 클래스명은 사실 생성자(Constructor)라 불리는 메소드를 호출하는 구문이다.
        * 정확히 말하자면 클래스명 레퍼런스 변수 = new 생성자(); 라고 표현한다.
        *  */

        /* 생성자란?
        * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출된다.
        * 생성자 함수에 매개변수가 없는 생성자를 기본생성자(default constructor)라고 하며,
        * 기본 생성자는 compiler에 의해 자동 추가되기 때문에 지금까지 명시적으로 작성하지 않고 사용할 수 있었다.
        * (인스턴스 생성 시 별도로 수행할 명령이 없었기 때문에 아무 것도 작성하지 않은 것이다.) */

        /* 기본생성자를 이요해 인스턴스를 생성하게 되면 자바에서는 자료형을 초기값을 이용해 필드를 초기화 한다.
        * 필드의 초기값을 사용자가 원하는 대로 설정하고 싶은 경우 생성자의 호출 시 인자로 값을 전달하여 호출할 수 있다.
        * 이러한 인자를 받아 필드를 초기화 할 목적의 생성자를 매개변수 있는 생성자라고 한다.
        * 하지만 매개변수 있는 생성자가 한 개라도 존재하는 경우 Compiler는 기본생성자를 자동으로 추가해주지 않으니
        * 사용시 주의해야 한다.
        * 매개변수 있는 생성자는 주로 인스턴스 생성 시점에 필드의 값을 사용자가 원하는대로 초기화 할 목적으로 사용한다.
        * */

        /* 1. 기본생성자 호출하여 인스턴스 생성 후 필드값 출력
        * 정상 동작하는 것 확인하고 User 클래스의 기본생성자 주석 후 확인해보면 찾지 못한다는 에러 발생한다. */
        User user1 = new User();
        System.out.println("user1.getInformation()");

        /* 2. id, pwd, name을 매개변수로 전달 받은 생성자를 호출하여 인스턴스 생성 후 필드값 출력 */
        User user2 = new User("user01", "pass01", "홍길동");
        System.out.println(user2.getInformation());

        /* 3. 모든 필드를 초기화하는 생성자를 호출하여 인스턴스 생성 후 필드값 출력
        * java.util.Date는 뒤에서 따로 다루게 될 것이다.
        * 기본생성자로 인스턴스를 생성하면 현재 프로그램이 동작하는 운영체제 상의 날짜/시간 정보를 이용해 인스턴스를 생성한다.
        * */
        User user3 = new User("user02", "pass02", "이순신", new java.util.Date());
        System.out.println(user3.getInformation());

        /* 4. 복사생성자를 호출하여 인스턴스 생성 후 필드값 출력
        * 위에 만든 user3과 지금 만든 user4는 동일한 필드 값을 가지지만 hashcode는 다르다.
        * */
        User user4 = new User(user3);
        System.out.println(user4.getInformation());
    }
}
