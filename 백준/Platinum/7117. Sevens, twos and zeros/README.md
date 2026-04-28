# [Platinum V] Sevens, twos and zeros - 7117

[문제 링크](https://www.acmicpc.net/problem/7117)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 134, 정답: 43, 맞힌 사람: 35, 정답 비율: 31.532%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 수학, 중간에서 만나기, 정수론

### 문제 설명

<p>The task is to write a program that outputs the smallest possible number s for an input natural number n. The number s must have the following properties:</p>

<ul>
	<li>s &ge; n;</li>
	<li>the value of s written in decimal form contains only digits 7, 2 and 0 and it does not start with 0;</li>
	<li>the decimal form of s contains at most 20 digits;</li>
	<li>the remainder of s divided by n equals 0.</li>
</ul>

### 입력

<p>A value of natural number n (0 &lt; n &lt; 500000) is input from the keyboard.</p>

### 출력

<p>The number s as described above must be output on the screen. If it is not possible to find the corresponding value of s to the given value of n, output one word &quot;NAV&quot;.</p>