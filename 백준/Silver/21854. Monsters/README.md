# [Silver II] Monsters - 21854

[문제 링크](https://www.acmicpc.net/problem/21854)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 140, 정답: 94, 맞힌 사람: 76, 정답 비율: 66.667%

### 분류

수학, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>The 2017 International Congress of Monsters gathers n monsters coming from all over the world. Their chairman has to solve the following problem: if the i<sup>th</sup> monster (1 &le; i &le; n) has k<sub>i</sub> fingers, indexed from 0 to k<sub>i</sub> - 1, so he can lift j of those fingers (0 &le; j &le; k<sub>i</sub>), obtaining a certain number, in the following way: if a certain finger is lifted, 2<sup>finger index</sup> is added to the current number. As a result, the i<sup>th</sup> monster can count on his fingers nr<sub>i</sub> distinct numbers. Therefore, the demanded result is nr<sub>1</sub> + nr<sub>2</sub> + &hellip; + nr<sub>n</sub>, modulo 10<sup>9</sup>+7.</p>

<p>Compute the required sum, modulo 10<sup>9</sup>+7.</p>

### 입력

<p>The first line of the input&nbsp;contains the number n.</p>

<p>The second line contains n positive integers, k<sub>1</sub>, k<sub>2</sub>, &hellip;, k<sub>n</sub>, representing the numbers of fingers of each monster.</p>

### 출력

<p>The output must contain a single positive integer, the requested sum, modulo 10<sup>9</sup>+7.</p>

### 제한

<ul>
	<li>n &le; 200,000</li>
	<li>0 &le; k<sub>i</sub> &le; 1,000,000,000</li>
	<li>The fingers are indexed from 0.</li>
</ul>

### 힌트

<p>The first monster can obtain 8 numbers:</p>

<ul>
	<li>0 - no finger was lifted;</li>
	<li>1 - the index of lifted finger is 0;</li>
	<li>2 - the index of lifted finger is 1;</li>
	<li>3 - the indexes of lifted fingers are 0 and 1;</li>
	<li>4 - the index of lifted finger is 2;</li>
	<li>5 - the indexes of lifted fingers are 0 and 2;</li>
	<li>6 - the indexes of lifted fingers are 1 and 2;</li>
	<li>7 - the indexes of lifted fingers are 0, 1 and 2.</li>
</ul>

<p>The second monster can obtain 128 numbers.</p>