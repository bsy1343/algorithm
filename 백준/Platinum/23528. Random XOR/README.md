# [Platinum V] Random XOR - 23528

[문제 링크](https://www.acmicpc.net/problem/23528)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 32, 정답: 9, 맞힌 사람: 7, 정답 비율: 36.842%

### 분류

수학, 다이나믹 프로그래밍, 정수론, 조합론, 비트마스킹, 확률론, 분할 정복을 이용한 거듭제곱, 모듈로 곱셈 역원, 기댓값의 선형성, 페르마의 소정리

### 문제 설명

<p>There is an array $a$ containing $n$ integers. Also, there is initially empty array $b$. Some elements of $a$ are going to be added to $b$. Each element is added with probability $P$ independently from others. Then the value of $s$ is to be computed: $$s = \oplus_{i = 0}^{|b|} b_{i}$$ where $\oplus$ is bitwise exclusive OR (if the array $b$ is empty, $s$ equals to zero). You are required to compute the expected value of $s^{2}$.</p>

### 입력

<p>The first line of input contains three integers $n$, $X$ and $Y$. The probability $P$ is equal to $\frac{X}{Y}$.</p>

<p>The second line contains $n$ integers $a_{i}$ divided by spaces --- elements of the array $a$.</p>

### 출력

<p>The answer can be always represented as a fraction $\frac{u}{v}$ where $u$ and $v$ are co-prime numbers and $v \neq 0 \mod (10^9+7)$ You are required to output only one number --- $u \times v^{-1} \mod (10^9+7)$</p>

### 제한

<ul>
	<li>$1 \le n \le 10^5$</li>
	<li>$0 \le X &lt; 10^9+7$</li>
	<li>$0 &lt; Y &lt; 10^9+7$</li>
	<li>$X \le Y$</li>
	<li>$0 \le a_i &lt; 10^9+7$</li>
</ul>