# [Silver I] Unit Rescue - 34379

[문제 링크](https://www.acmicpc.net/problem/34379)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 25, 정답: 21, 맞힌 사람: 19, 정답 비율: 82.609%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 너비 우선 탐색, 사칙연산, 수학, 자료 구조, 집합과 맵

### 문제 설명

<p>One day, the Google unit converter disappeared without warning and for no apparent reason. This has thrown the entire campus into chaos, with students being unable to do their homework problems!  In this time of crisis, Colorado School of Mines tasked you with creating a new unit converter that can be just as flexible as the Google converter.</p>

<p>Google's unit conversion is so useful in that it can convert from nearly any unit of measure to any other unit of measure, regardless of how esoteric the conversion is. For example, you could convert lightyears to furlongs to millimeters and then to AUs. To make your job easier, the physics department already hastily crafted a table of conversions for you to use in your program, organized as a list of entries consisting of a source unit, a destination unit, and a ratio to convert from the source unit to the destination unit.</p>

<p>There's a catch though: creating every possible conversion of every possible unit would simply take too long, so there may not be a direct conversion from one unit to another using the list given to you. For example, a conversion from picograms to stellar masses will likely not be on the list. However, there may be some chain of other conversions that will allow you to convert between units that do not have a direct conversion. This can even work in reverse when only a "destination to source" conversion is available by simply taking the inverse $\left(\frac{1}{m}\right)$ of the ratio. To continue the example given prior, you could use a chain of metric conversions to convert from picograms to kilograms, a unit that does have a direct conversion to stellar masses.</p>

### 입력

<p>The first line will contain a single number $n$ $\left(0 &lt; n \leq 10^{6}\right)$. Then the $n$ following lines will contain four elements, separated by spaces:</p>

<ol>
	<li>A lowercase alphabetical word giving the left hand unit of a particular conversion.</li>
	<li>A lowercase alphabetical word giving the right hand unit of a particular conversion.</li>
	<li>An integer $m$ $\left(0 &lt; m \leq 10^{19}\right)$ giving the numerator of a ratio that can be applied to an amount in order to convert it from the left hand unit to the right hand unit.</li>
	<li>An integer $d$ $\left(0 &lt; d \leq 10^{19}\right)$ giving the denominator of a ratio that can be applied to an amount in order to convert it from the left hand unit to the right hand unit.</li>
</ol>

<p>The input then ends a line containing the following three elements, separated by spaces:</p>

<ol>
	<li>A real number $a$ $\left(0 &lt; a \leq 10^{10}\right)$ giving the amount to be converted. The number contains at most $2$ digits after the decimal point.</li>
	<li>A lowercase alphabetical word giving the unit of the input amount (the "source" unit). This unit will exist within the list of conversions given prior.</li>
	<li>A lowercase alphabetical word giving the unit to convert to (the "destination" unit). This unit will exist within the list of conversions given prior.</li>
</ol>

### 출력

<p>If the conversion can be made, output a single real number that is the amount $a$ converted from the source unit to the destination unit. Answers within $10^{-2}$ will be accepted.</p>