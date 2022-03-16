// 정수형
// Byte -128 ~ 127
// Short -32768 ~ 32767
// Int, 가장 많이 사용한다
// Long
// UByte - ULong, 양수만

// 실수형
// Float
// Double

// 논리형(참, 거짓)

// 문자형

// 문자열형

// 자료형 추론
var changeYes : Byte = 100
var changeYes = 200

// 추론 힌트를 주는 방법
var number1 = 1000 -> Int
var number1 = 1000 -> Long
var number1 = 0x100 -> 16진수 표기가 사용된  Int형 추론
var number4 = 200u -> UByte