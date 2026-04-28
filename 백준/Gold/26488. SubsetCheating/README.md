# [Gold II] SubsetCheating - 26488

[문제 링크](https://www.acmicpc.net/problem/26488)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 10, 맞힌 사람: 9, 정답 비율: 56.250%

### 분류

수학, 정수론, 조합론, 분할 정복을 이용한 거듭제곱, 모듈로 곱셈 역원, 페르마의 소정리

### 문제 설명

<p><em>Little Square</em> and <em>Little Triangle</em> took a math test. <em>Little Triangle</em> didn&rsquo;t study for the test, but, fortunately for him, <em>Little Square</em>, his best friend, succeeded in studying for the exam, so <em>Little Triangle</em> was able to copy parts of <em>Little Square&rsquo;s</em> solutions on the test.</p>

<p>We know that the test had $N$ problems in total and that at each one of them <em>Little Triangle&rsquo;s</em> score is not more than <em>Little Square&rsquo;s</em> score. All scores are nonegative integers. We don&rsquo;t know the exact score of any of them at any problem, but we know that in total <em>Little Square</em> has $A$ points while <em>Little Triangle</em> has $B$ points total.</p>

<p>Knowing $N$ (the number of problems that made up the math test), $A$ (the sum of the scores that Little Square got on the problems) and $B$ (<em>Little Triangle&rsquo;s</em> sum of scores), we want to compute the number of ways in which the two of them could have been scored on the test, modulo $10^9 + 7$.</p>

### 입력

<p>The sole line of standard input will contain tree nonnegative integers $N$, $A$ and $B$, separated by a single space, with the same meaning as explained above.</p>

### 출력

<p>The standard output will contain only one integer, representing the number of ways in which <em>Little Square</em> and <em>Little Triangle</em> could have been scored on the test, modulo $10^9 + 7$.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 10^6$</li>
	<li>$0 &le; A, B &le; 10^6$</li>
	<li>$2$ ways of scoring are considered distinct (different) if <em>Little Square</em> or <em>Little Triangle</em> have a different number of points on at least one of the $N$ problems.</li>
</ul>

### 힌트

<p>In the first example, we have $N = 2$ problems on the math test. <em>Little Square</em> has $A = 3$ points in total, while <em>Little Triangle</em> has $B = 2$ points in total. From now on let $P1$ be the first problem, and $P2$ the second problem.</p>

<p>There are $6$ distinct ways in which <em>Little Square</em> and <em>Little Triangle</em> could have scored on the test:</p>

<ul>
	<li><em>Little Square</em>: $0$ points - $P1$, $3$ points - $P2$; <em>Little Triangle</em>: $0$ points - $P1$, $2$ points - $P2$</li>
	<li><em>Little Square</em>: $1$ points - $P1$, $2$ points - $P2$; <em>Little Triangle</em>: $0$ points - $P1$, $2$ points - $P2$</li>
	<li><em>Little Square</em>: $1$ points - $P1$, $2$ points - $P2$; <em>Little Triangle</em>: $1$ points - $P1$, $1$ points - $P2$</li>
	<li><em>Little Square</em>: $2$ points - $P1$, $1$ points - $P2$; <em>Little Triangle</em>: $2$ points - $P1$, $0$ points - $P2$</li>
	<li><em>Little Square</em>: $2$ points - $P1$, $1$ points - $P2$; <em>Little Triangle</em>: $1$ points - $P1$, $1$ points - $P2$</li>
	<li><em>Little Square</em>: $3$ points - $P1$, $0$ points - $P2$; <em>Little Triangle</em>: $2$ points - $P1$, $0$ points - $P2$</li>
</ul>