# [Gold III] The Value of an Expression - 7109

[문제 링크](https://www.acmicpc.net/problem/7109)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 13, 맞힌 사람: 5, 정답 비율: 15.152%

### 분류

브루트포스 알고리즘, 자료 구조, 해시를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>The operation # is defined for any two positive integers.</p>

<p>If x and y are positive integers, then</p>

<p>(x#y) = sum_of_digits_in_x_decimal_notation &times; greatest_digit_in_y_decimal_notation + least_digit_in_y_decimal_notation</p>

<p>For example,&nbsp;(9#30) = 9&times;3+0 = 27, but&nbsp;(30#9) = 3&times;9+9 = 36.</p>

<p>Let us say that&nbsp;this problem&#39;s expression&nbsp;is such an expression which is either the single variable&nbsp;a&nbsp;(whose value is positive integer), or it can be written in the form (this problem&#39;s expression # this problem&#39;s expression).</p>

<p>For example, the following expressions are&nbsp;this problem&#39;s expressions:</p>

<ul>
	<li>a</li>
	<li>(a#a)</li>
	<li>((a#a)#a)</li>
	<li>(a#((a#a)#((a#a)#a)))</li>
</ul>

<p>You are to write a program, which for the given value of&nbsp;a&nbsp;determines what is the least possible number of operations # with which&nbsp;this problem&#39;s expression&nbsp;with given value&nbsp;K&nbsp;(K - positive integer) can be written.</p>

### 입력

<p>From the keyboard two positive integer values are input - the value of integer variable a (1 &le; a &le; 999999999) and the value of the expression K (1 &le; K &le; 999999999).</p>

### 출력

<p>On the screen the least necessary number of operations # must be written. If for the given value of a it is impossible to obtain K as a value of this problem&#39;s expression , then the word &#39;NEVAR&#39; must be written.</p>