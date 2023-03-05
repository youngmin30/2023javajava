package chap06.exam01_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* 
 * 리플렉션
 *
 * 런타임 시에 클래스의 메타 정보를 얻는 기능을 말함.
 * 클래스가 가지고 있는 필드, 생성자, 메소드, 적용된 어노테이션을 알아내는 것
 * 런타임 시에 어노테이션 정보를 얻으려면 어노테이션 유지 정책을 RUNTIME으로 해야 함.
 * 어노테이션 유지 정책을 지정할 때 @Retention 어노테이션을 사용함.
 * @Retention의 기본 엘리먼트인 value는 RetentionPolicy 타입이므로 위 세 가지 상수 중 하나를 지정하면 됨.
 * 
 */

/*
 * 
 * 사용 방법
 * @Target({ElementType.})
 * @Target({ElementType.FIELD})
 * @Target({ElementType.METHOD})
 * 
 * @Retention(RetentionPolicy.RUNTIME)
 * 
 */

@Target({ElementType.METHOD}) // ?????????????????????????
@Retention(RetentionPolicy.RUNTIME) // 런타임으로 해야 함.

public @interface PrintAnnotation { // 엘리먼트 선언(엘리먼트란 외부에서 가져온 값)
	String value() default "-"; // 타입 elementName() default 값; 기본값 필요 없을 경우 default 값은 생략
	int number() default 15; // 기본타입이나 참조타입 모두가 타입 자리에 올 수 있음.
}
