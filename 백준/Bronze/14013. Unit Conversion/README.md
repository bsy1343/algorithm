# [Bronze III] Unit Conversion - 14013

[문제 링크](https://www.acmicpc.net/problem/14013)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 575, 정답: 415, 맞힌 사람: 345, 정답 비율: 70.122%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p><strong>&quot;How do you say &#39;two kilos&#39; in English?</strong>&nbsp;-- Dudu, 2015</p>

<p>Dudu always had trouble with measurements and unit conversions. Can you help him?</p>

### 입력

<p>The input will begin with a line containing 2 numbers x and y meaning that &quot;x of unit A&quot; is equal to &quot;y of unit B&quot;. For instance, if A is &quot;kilos&quot; and B is &quot;pounds&quot; one possibility is x = 3.25 and y = 7.165024.</p>

<p>The next line will contain a single integer N, containing the number of conversions to be performed.</p>

<p>Each of the next N lines will be of the form &quot;z q&quot; where z is a number and q is either &#39;A&#39; or &#39;B&#39;.</p>

<ul>
	<li>1 &le; N &le; 100000</li>
	<li>x,y are strictly positive numbers</li>
	<li>z is a nonnegative number</li>
</ul>

### 출력

<p>Output N lines with a number each. See the sample input/output for further details.</p>

### 힌트

<p>Errors smaller than 10<sup>-4</sup>&nbsp;will be considered correct.</p>

<ul>
	<li>3.25 A = 7.165024 B</li>
	<li>1 A = 2.20462277 B</li>
	<li>0 B = 0 A</li>
	<li>2.1 B = 0.952543913321 A</li>
	<li>0 A = 0 B</li>
</ul>