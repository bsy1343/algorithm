# [Platinum IV] GCD Pairs - 32793

[문제 링크](https://www.acmicpc.net/problem/32793)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 131, 정답: 25, 맞힌 사람: 19, 정답 비율: 19.000%

### 분류

소수 판정, 소인수분해, 수학, 자료 구조, 정수론, 조합론, 집합과 맵, 포함 배제의 원리

### 문제 설명

<p>In the Shape Galaxy, where all shapes are sentient beings, there is currently a feud between circles and squares. Circles want all pathways to be flat while squares argue that they should be evenly spaced inverted catenary shaped bumps. Because of this feud, circles have begun to dislike all square-biased numbers. A number $s$ is square-biased if it is divisible by $x^2$, for some integer $x &gt; 1$.</p>

<p>Mr. Circle has taken this feud to heart. He is given the assignment of calculating the greatest common divisor between all pairs of numbers in an array. He wants to go one step further and count the number of greatest common divisors that are not square biased.</p>

### 입력

<p>The first line of input contains a single integer, $n$ $(1 \le n \le 10^5)$, representing the length of the array of numbers.</p>

<p>The next $n$ lines contain the integers $a_i$ $(1 \le a_i \le 10^{12})$ which comprise the numbers in the array.</p>

### 출력

<p>Output a single integer, the number of pairs $(i, j)$ $(1 \le i &lt; j \le n)$ such that $\gcd(a_i, a_j)$ is not square-biased.</p>