# [Gold I] Kbin - 16005

[문제 링크](https://www.acmicpc.net/problem/16005)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 107, 정답: 22, 맞힌 사람: 17, 정답 비율: 34.694%

### 분류

수학, 조합론

### 문제 설명

<p>We call the k-binary number a natural number which has in its binary representation exactly k digits of 1. For example, the 23 is a 4-binary number because the binary representation is 10111 and contains 4 digits of 1.</p>

<p>Given the N and k values, calculate the sum S of all k-binary numbers which are strictly lower than N. Because the sum is very large, you have to calculate modulo 1234567.</p>

### 입력

<p>The standard input contains the values N and k separated by a single space.</p>

### 출력

<p>The standard output will contain the number S modulo 1234567.</p>

### 제한

<ul>
	<li>2 &le; N &le; 10<sup>15</sup></li>
	<li>0 &le; K &le; 50</li>
</ul>

### 힌트

<ul>
	<li>1 &ndash; 1</li>
	<li>2 &ndash; 10</li>
	<li>3 &ndash; 11</li>
	<li>4 &ndash; 100</li>
	<li>5 &ndash; 101</li>
	<li>6 &ndash; 110</li>
	<li>7 &ndash; 111</li>
	<li>8 &ndash; 1000</li>
	<li>9 &ndash; 1001</li>
	<li>10 &ndash; 1010</li>
	<li>11 &ndash; 1011</li>
	<li>12 &ndash; 1100</li>
	<li>13 &ndash; 1101</li>
	<li>14 &ndash; 1110</li>
</ul>

<p>S=7+11+13+14=45</p>