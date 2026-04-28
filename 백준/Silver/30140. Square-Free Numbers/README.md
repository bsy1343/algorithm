# [Silver II] Square-Free Numbers - 30140

[문제 링크](https://www.acmicpc.net/problem/30140)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 97, 정답: 48, 맞힌 사람: 36, 정답 비율: 43.902%

### 분류

수학, 정수론, 소수 판정

### 문제 설명

<p>But wait, I haven&#39;t finished -- each of the factors that you find must be square-free.  A square-free number, however you factor it, won&#39;t have any factor that is a perfect square.  Of course, you can never include 1 as a factor.</p>

### 입력

<p>The first line of input is the number of test cases T.</p>

<p>The next T lines each have an integer N.</p>

### 출력

<p>For each testcase, output the smallest number of square-free factors.</p>

### 제한

<ul>
	<li>T &le; 10<sup>4</sup></li>
	<li>2 &le; N &le; 10<sup>6</sup></li>
</ul>

### 힌트

<p>6 can be factored as just 6 (further factorable as 2x3 only, and hence square free), a single factor.  8 has to be factored as 2x2x2 so that all factors are square-free.</p>