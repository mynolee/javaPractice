package Example7;

public class Ex7_00{

}

/*
자바의 정석 기초편 7장 객체 지향 프로그래밍 2  이론

1. 상속, 포함

키워드 extends
상속해주는 클래스를 '조상 클래스'   상속받는 클래스를 '자손 클래스'
상속 관계를 그림으로 표현한 것을 상속 계층도
자손 클래스는 조상 클래스의 모든 멤버를 상속 받음
조상 클래스가 변경되면 자손 클래스는 자동적으로 영향을 받지만, 자손 클래스가 변경되는 것은 조상 클래스에 아무 영향 없다.
자손 클래스는 조상 클래스의 모든 멤버를 상속 받으므로 항상 조상 클래스보다 같거나 많은 멤버를 갖는다
상속에 상속을 거듭할수록 상속받는 클래스의 멤버 개수는 점점 늘어나게 된다.
생성자와 초기화 블럭은 상속되지 않는다
자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다
자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버도 함께 생성되기 때문에 따로 조상 클래스의 인스턴스를 생성하지 않고도
조상 클래스의 멤버들을 사용할 수 있다
클래스 간의 포함관계를 맺어 주는 것은 한 클래스의 멤버변수로 다른 클래스 타입의 참조변수를 선언하는 것을 의미
하나의 거대한 클래스를 작성하는 것보다 단위별로 여러 개의 클래스를 작성한 다음, 이 단위 클래스들을 포함관계로
재사용하면 보다 간결하고 손쉽게 클래스를 작성 가능
작성된 단위 클래스들은 다른 클래스를 작성하는데 재사용될 수 있음
상속 관계 : ~은 ~이다 ( is -a)    원은 점이다.  --점이 조상 클래스
포함 관계 : ~은 ~을 가지고 있다 (has -a)  원은 점을 가지고 있다  --이게 더 맞는 표현
단일 상속
c++에서는 여러 조상 클래스로부터 상속받는 것이 가능한 다중 상속을 허용하지만
자바에서는 단일 상속만을 허용한다
다중 상속 단점
- 클래스 관계 매우 복잡
- 서로 다른 클래스로부터 상속받은 멤버간의 이름이 같은 경우 구별할 수 있는 방법이 없다
- 한 클래스에 여러 메서드가 있지만 그 중 한두개만 필요한 경우 낭비가 심함-효용성 낮음-상속 잘안쓰임-적재적소에 쓰여야
단일 상속
클래스 간의 관계가 보다 명확해지고 코드를 더욱 신뢰할 수 있게 만들어 준다
object 클래스 - 모든 클래스의 조상

오버라이딩(override -- ~위에 덮어쓰다(overwrite))
조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것
자손 클래스 자신에 맞게 변경해야하는 경우 많음-- 조상의 메서드를 오버라이딩
오버라이딩 조건
메서드의 선언부(메서드 이름, 매개변수,  반환타입)이 조상의 것과 완전히 일치해야
접근제어자와 예외는 제한된 조건 하에서 다르게 변경 가능
-접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
public, protected, (default), private 순으로 좁아짐
-조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.

오버로딩 vs 오버라이딩
오버로딩은 기준에 없는 새로운 메서드를 추가하는 것이고         --new
오버라이딩은 조상으로부터 상속받은 메서드의 내용을 변경하는 것    --change, modify

참조변수 super
상속받은 멤버와 자신의 멤버와 이름이 같은 때 super를 붙여서 구별 가능
super()  ---this() 와 같은 생성자
this() 는 같은 클래스의 다른 생성자를 호출하는데 사용
super() 는 조상의 생성자를 호춯하는데 사용
클래스 자신에 선언된 변수는 자신의 생성자가 초기화를 책임지도록 작성하는 것이 좋다
생성자는 상속되지 않는다

패키지 --클래스의 묶음
같은 이름의 클래스 일지라도 서로 다른 패키지에 존재하는 것이 가능
자신만의 패키지 체계를 유지함으로써 다른 개발자가 개발한 클래스 라이브러리의 클래스와 이름이 충돌하는 것 피할 수 있음
하나의 소스파일의 맨 위에 단 한 번만 선언 가능
선언 안 할시 기본적으로 제공하는 '이름 없는 패키지(unnamed package)' 쓰여짐
패키지를 지정하지 않는 모든 클래스들은 같은 패키지에 속하는 셈

import
import 문의 역할은 컴파일러에게 소스파일에 사용된 클래스의 패키지에 대한 정보를 제공하는 것
키워드 import 와 패키지명을 생략하고자 하는 클래스의 이름을 패키지명과 함께 써주면 됌
클래스이름을 지정해주는 대신 '*'을 사용하면, 컴파일러는 해당 패키지에서 일치하는 클래스이름을 찾아야하는 수고를 더 해야함
실행 시 성능상의 차이는 전혀 없다
static import 문을 사용하면 static 멤버를 호출할 때 클래스 이름 생략 가능

제어자(modifier)

제어자는 클래스, 변수 또는 메서드의 선언부에 함께 사용되어 부가적인 의미를 부여한다
제어자의 종류는 접근 제어자와 그 외의 제어자로 분류
접근 제어자는 public, protected, (default), private 순으로 좁아지고 4가지중 하나만 선택하여 사용 가능
제어자들 간의 순서는 관계없지만, 주로 접근 제어자를 제일 왼쪽에 놓는 경향이 있다

static-'클래스의' , '공통적인' 의 의미를 가지고 있음
클래스 변수(static 멤버변수)는 인스턴스에 관계없이 같은 값을 갖는다 -- 하나의 변수를 모든 인스턴스가 공유하기 때문
인스턴스를 생성하지 않고도 사용 가능
static 사용 가능한 곳 - 멤버변수, 메서드, 초기화 블럭

final- '마지막의', '변경될 수 없는'--거의 모든 대상에 사용 가능
변수에 사용시 값 변경 불가한 상수
메서드에 사용시 오버라이딩 불가
클래스에 사용시 자신을 확장하는 자손클래스 정의 불가
final 사용 가능한 곳 - 클래스, 메서드, 멤버변수, 지역변수
대표적인 예 - String, Math

abstract - '미완성'
클래스 - 클래스 내에 추상 메서드가 선언되어 있음을 의미
메서드 - 선언부만 작성하고 구현부는 작성하지 않은 추상 메서드임을 알림
추상 메서드 - 완성되지 않은 메서드가 존재하는 '미완성 설계도' --인스턴스 생성 불가

접근 제어자(access modifier)
사용 가능한 곳 - 클래스, 멤버변수, 메서드, 생성자
private - 같은 클래스 내에서만 접근 가능
(default) - 같은 패키지 내에서만 접근 가능
protected - 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능
public    - 접근 제한이 없음

    public  >   protected   >   (default)   >   private
접근 제한 없음    같은 패키지 + 자손     같은 패키지      같은 클래스

protected  는
패키지에 관계없이 상속관계에 있는 자손클래스에서 접근할 수 있도록하는 것이 제한목적이지만, 같은 패키지 내에서도 접근 가능
--> protected 가 default 보다 접근 범위가 더 넓다

캡슐화와 접근 제어자
클래스 및 멤버에 접근 제어자를 사용하는 이유는 클래스의 내부에 선언된 데이터를 보호하기 위해서
--> 외부로부터의 접근을 제한하는 것이 필요
--> 데이터 감추기(data hiding)  -- 객체지향개념의 캡슐화(encapsulation)
메서드 등의 멤버들을 클래스 내부에 감추기 위해서
외부에서 접근할 필요가 없는 멤버들을 private으로 지정하여 외부에 노출시키지 않음으로써 복잡성 줄일 수 있음
--> 이것 또한 캡슐화
--외부로부터 데이터를 보호하기 위해서, 외부에는 불필요한 내부적으로만 사용되는 부분을 감추기 위해서
만일 상속을 통해 확장될 것이 예상되는 클래스라면 멤버에 접근 제한을 주되 자손클래스에서 접근하는 것이 가능하도록
하기 위해 private 대신 protected 사용 --private이 붙은 멤버는 자손 클래스에서도 접근이 불가하기 때문
보통 멤버변수의 값을 읽는 메서드의 이름을 'get 멤버변수이름'으로 하고,
멤버변수의 값을 변경하는 메서드의 이름을 'set 멤버변수이름'으로 한다.
get 으로 시작하는 메서드를 '겟터(getter)' , set 으로 시작하는 메서드를 '셋터(setter)'라고 부른다

다형성 ( polymorphism ) -- 여러가지 형태를 가질 수 있는 능력
조상 클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 함
클래스가 서로 상속 관계에 있을 경우, 조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조하게 가능
but, 같은 타입의 인스턴스일지라도, 참조변수의 타입에 따라 사용할 수 있는 멤버의 개수가 달라짐
조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다
반대로 자손타입의 참조변수로 조상타입의 인스턴스를 참조할 수는 없다

참조변수 형변환 -- 서로 상속관계에 있는 클래스 사이에서 가능
자손타입의 참조변수를 조상타입의 참조변수로, 조상타입의 참조변수를 자손타입의 참조변수로 형변환 가능
조상의 조상도 가능 --> 모든 참조변수는 object 클래스 타입으로 형변환 가능
---기본형의 형변환과 달리 참조형의 형변환은 변수에 저장된 값(주소값)이 변환되는 것이 아님
리모컨(참조변수)를 다른 종류의 것으로 바꾸는 것 뿐
-사용할 수 있는 멤버 개수를 조절하기 위해서
조상타입으로의 형변환을 생략할 수 있는 이유는 좋상타입으로 형변환하면 다룰 수 있는 멤버의 개수가 줄어들기 때문에 항상 안전
반대로 실제 객체가 가진 기능보다 리모컨의 버튼이 더 많으면 안된다.
상속관계에 있는 타입간의 형변환은 양방향으로 자유롭게 수행
but, 참조 변수가 가리키는 인스턴스의 자손타입으로 형변환은 허용 불가
--> 참조변수가 가리키는 인스턴스의 타입이 무엇인지 먼저 확인하는 것이 중요

조상이 자손으로 --생략 x --작은거가 큰거...없으면 안됌
instanceof 로 확인을 해봐야
자손이 조상으로 --생략 o --큰거가 작은거...포함안된거 문제 x--못쓰면 그만인 문제 없

ex) 부모-123    자식- 12345
자식이 부모로 형변환-- 123만 쓰일 수 있음--45은 못쓰면 그만--문제 x
부모가 자식으로 형변환 --- 부모가 자식으로 형변환 시에 4,5 때문에 문제가 됌--문제 없는지 instanceof 사용
4,5
....좀더 공부해야될 듯



instanceof 연산자
참조변수가 참조하고 있는 인스턴스의 실제 타입 위해 사용, 주로 조건문에 사용
참조 변수 instance of 클래스명   으로 쓰임
연산 결과 boolean 값이 true 이면 참조변수가 검사한 타입으로 형변환이 가능
메서드 내에서는 정확히 어떤 인스턴스인지 알 수 없음
실제 인스턴스와 같은 타입의 참조변수로 형변환을 해야만 인스턴스의 모든 맴버들을 사용할 수 있음

참조변수의 다형적인 특징은 메서드의 매개변수에도 적용된다
다른 제품 클래스를 추가할 때 조상 클래스를 상속받기만 하면, 메서드(조상 클래스 매개변수) 형식으로
메서드의 매개변수로 받아들여질 수 있다.

'참조변수 + 문자열' 은 '참조변수.toString() + 문자열'로 처리된다.
--자동 toString 변환을 사용한 문자열 연결

조상타입의 참조변수로 자손타입의 객체를 참조하는 것이 가능
조상타입의 참조변수 배열을 사용하면, 공통의 조상을 가진 서로 다른 종류의 객체를 배열로 묶어서 다룰 수 있음
묶어서 다루고 싶은 객체들의 상속관계를 따져서 가장 가까운 공통조상 클래스 타입의 참조변수 배열을 생성해서 객체들을 저장
조상 클래스 타입의 배열을 사용함으로써 자식클래스들을 하나의 배열로 간단하게 다룰 수 있음

배열의 크기를 무조건 크게 설정할 수도 없음 -> Vector 클래스 사용
Vector 클래스
- 내부적으로 Object 타입의 배열을 가지고 있어서 이 배열에 객체를 추가하거나 제거할 수 있게 작성되어 있음
- 배열의 크기를 알아서 관리 -- 저장할 인스턴스의 개수에 신경 쓰지 않아도 됌
- 이름 때문에 오해 -- 단지 동적으로 크기가 관리되는 객체 배열일 뿐임


추상 클래스(abstract class)

추상이란?
낱낱의 구체적 표상이나 개념에서 공통된 성질을 뽑아 이를 일반적인 개념으로 파악하는 정신 작용

클래스 - 설계도  ,  추상 클래스 - 미완성 설계도
-- 단지 미완성 메서드 (추상 클래스)를 포함하고 있다는 의미
미완성 설계도로 완성된 제품을 만들 수 없듯이 추상 클래스로 인스턴스는 생성 불가
추상 클래스는 상속을 통해서 자손클래스에 의해서만 완성 가능
추상 클래스 자체로는 클래스로서의 역할을 다 못하지만, 새로운 클래스를 작성하는데 있어서 바탕이 되는 조상 클래스로서 중요한 의미
새로운 클래스 작성 시 아무것도 없는 상태에서 시작하는 것보다 어느 정도 틀을 갖춘 상태에서 시작하는게 훨씬 효율적
추상 클래스는 키워드 'abstract'를 붙이기만 하면 됌
클래스 선언부의 abstract를 보고 이 클래스에는 추상메서드가 있으니 상속을 통해서 구현해주어야 한다는 것을 쉽게 알 수 있음
추상 클래스는 추상 메서드를 포함하고 있다는 것을 제외하고는 일반 클래스와 전혀 다르지 않다.
추상 클래스에도 생성자가 있으며, 멤버변수와 메서드도 가질 수 있다.

추상 메서드
선언부만 작성하고 구현부는 작성하지 않은 채로 남겨 둔 것
메서드의 내용이 상속받는 클래스에 따라 달라질 수 있기 때문에 조상 클래스에서는 선언부만을 작성
추상클래스를 상속받는 자손 클래스는 조상의 추상메서드를 상황에 맞게 적절히 구현해주어야
조상으로부터 상속받은 추상메서드 중 하나라도 구현하지 않는다면, 자손클래스 역시 추상클래스로 지정해주어야
메서드 작성시 실제 작업내용인 구현부보다 더 중요한 부분이 선언부
선언부만 알고 있으면 내용이 없을 지라도 추상메서드를 사용하는 코드를 작성하는 것이 가능
실제로는 자손클래스에 구현된 완성된 메서드가 호출되도록 가능

상속이 자손 클래스를 만드는데 조상클래스를 사용하는 것이라면,
반대로 추상화는 기존의 클래스의 공통부분을 뽑아내서 조상 클래스를 만드는 것
추상화 < -- > 구체화
상속 계층도를 따라 내려갈수록 세분화되며 ---기능이 추가되어 구체화의 정도가 심해짐
올라갈수록 공통요소만 남게 된다.      --- 추상화의 정도가 심해진다
다형성에서 배웠듯이 조상 타입의 참조변수로 자손 타입의 인스턴스를 참조하는 것이 가능
메서드는 참조변수의 타입에 관계없이 실제 인스턴스에 구현된 것이 호출됌
실제로는 추상메서드가 구현된 인스턴스의 메서드가 호출되는 것
모든 클래스의 조상인 Object클래스 타입의 배열로도 서로 다른 종류의 인스턴스를 하나의 묶음으로 다룰 수 있지만,
Object 클래스에는 정의되지 않은 메서드가 있을 수 있어 호출하는 부분에서 에러가 발생할 수 있다


인터페이스 (interface)
일종의 추상클래스
추상클래스처럼 추상메서드를 갖지만 추상클래스보다 추상화 정도가 높음
--> 추상클래스와 달리 몸통을 갖춘 일반 메서드 또는 멤버변수를 구성원으로 가질 수 없음
추상메서드와 상수만을 멤버로 가질 수 있음. 그 외의 다른 어떤 요소도 허용 불가
추상 클래스 -- '미완성 설계도'   ,   인터페이스 -- '기본 설계도'
구현된 것은 아무 것도 없고 밑그림만 그려져 있음
추상클래스처럼 완성되지 않은 불완전한 것이기 때문에 그 자체만으로 사용되기 보다는 다른 클래스 작성 시 도움 줄 목적으로 작성
작성 방법은 클래스 작성과 동일
키워드로 interface 사용
접근제어자로 public, default 만 사용 가능

인터페이스 멤버들의 제약사항
-- 모든 멤버변수는 public static final 이어야 하며, 이를 생략 가능
-- 모든 메서드는 public abstract 이어야 하며, 이를 생략 가능
단, static 메서드와 디폴트 메서드는 예외(JDK1.8부터)

public static final 타입 상수이름 = 값;
public abstract 메서드이름(매개변수목록);

인터페이스는 인터페이스로부터만 상속받을 수 있음
클래스와 달리 다중 상속, 여러 개의 인터페이스로부터 상속을 받는 것이 가능
인터페이스는 클래스와 달리 Object클래스와 같은 최고 조상이 없다
인터페이스 상속은 클래스 상속과 같이 정의된 멤버 모두 상속 받음
추상클래스처럼 그 자체로는 인스턴스를 생성 불가
자신에 정의된 추상메서드의 몸통을 만들어주는 클래스를 작성해야
-- 추상클래스가 자신을 상속받는 클래스를 정의하는 것과 동일
클래스는 확장한다는 의미의 키워드 'extends' 사용
인터페이스는 구현한다는 의미의 키워드 'implements' 사용

class 클래스이름 implements 인터페이스이름 {}

구현하는 인터페이스의 메서드 중 일부만 구현한다면, abstract를 붙여서 추상클래스로 선언해야
상속과 구현을 동시에 가능

인터페이스 타입의 참조변수로 이를 구현한 클래스의 인스턴스를 참조할 수 있으며, 인터페이스 타입으로의 형변환도 가능
인터페이스는 메서드의 매개변수의 타입으로도 사용 가능
--> 메서드 호출 시 해당 인터페이스를 구현한 클래스의 인스턴스를 매개변수로 제공해야한다는 것

리턴타입이 인터페이스 라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미

인터페이스를 사용하는 이유, 장점
- 개발시간을 단축시킬 수 있음
프로그램 작성 가능- 메서드를 호출하는 쪽에서는 메서드의 내용에 관계없이 선언부만 알면 되기 때문
동시에 다른 한 쪽에서는 인터페이스를 구현하는 클래스를 작성하게 되면, 인터페이스를 구현하는 클래스가 작성될 때까지
기다리지 않고도 양쪽에서 동시에 개발 진행 가능
- 표준화가 가능
프로젝트에 사용되는 기본 틀을 인터페이스로 작성 -- 보다 일관되고 정형화된 프로그램 개발 가능
- 서로 관계없는 클래스들에게 관계를 맺어줄 수 있음
서로 상속관계도 아니고, 같은 조상클래스를 가지고 있지도 않은 무관계한 클래스들에게
하나의 인터페이스를 공통적으로 구현하도록 함으로써 관계를 맺어줄 수 있음
- 독립적인 프로그래밍이 가능
클래스의 선언과 구현을 분리 가능하기 때문에 실제구현에 독립적인 프로그램을 작성 가능
클래스와 클래스 간의 직접적인 관계를 인터페이스를 이용해서 간접적인 관계로 변경하면,
한 클래스의 변경이 관련된 다른 클래스에 영향을 미치지 않는 독립적인 프로그래밍이 가능




 */
