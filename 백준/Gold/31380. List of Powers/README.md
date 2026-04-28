# [Gold III] List of Powers - 31380

[문제 링크](https://www.acmicpc.net/problem/31380)

### 성능 요약

시간 제한: 3.5 초, 메모리 제한: 1024 MB

### 통계

제출: 200, 정답: 37, 맞힌 사람: 13, 정답 비율: 9.848%

### 분류

수학, 자료 구조, 브루트포스 알고리즘, 정수론, 해시를 사용한 집합과 맵, 분할 정복을 이용한 거듭제곱, 페르마의 소정리

### 문제 설명

<p>Let $p$ be a prime number and $a$ an integer such that $0 &lt; a &lt; p$. Consider all integers from $l$ to $r$ inclusive which can be expressed as $a^{k} \bmod p$ for some non-negative integer $k$. Given that the number of such integers is at most $100$, print these integers in ascending order.</p>

### 입력

<p>The only line contains four integers $p$, $a$, $l$, and $r$ separated by spaces ($0 &lt; a &lt; p \le 10^{9}$, $p$ is prime, $0 \le l \le r &lt; p$).</p>

### 출력

<p>Print all integers from $l$ to $r$ inclusive which can be expressed as $a^{k} \bmod p$ for some non-negative integer $k$. The integers must be printed in ascending order. Separate consecutive integers by spaces. The input is guaranteed to be such that the correct answer contains at most $100$ numbers.</p>

### 힌트

<p>In the first example, we must find all integers from $l = 0$ up to $r = 3$ inclusive which can be expressed as $3^{k} \bmod 5$ for some integer $k \ge 0$. These are numbers $3^{0} \bmod 5 = 1$, $3^{1} \bmod 5 = 3$ and $3^{3} \bmod 5 = 27 \bmod 5 = 2$. The number $0$ can not be expressed this way because $3^{k}$ does not divide evenly by $5$ for any integer $k \ge 0$. So, we must print the numbers $1$, $2$, and $3$ in ascending order.</p>

<p>In the second example, we must find all integers from $l = 2$ up to $r = 3$ inclusive which can be expressed as $4^{k} \bmod 5$ for some integer $k \ge 0$. Let us write down the first few such numbers: $4^{0} \bmod 5 = 1$, $4^{1} \bmod 5 = 4$, $4^{2} \bmod 5 = 16 \bmod 5 = 1$, $4^{3} \bmod 5 = 64 \bmod 5 = 4$, $4^{4} \bmod 5 = 256 \bmod 5 = 1$, $\ldots$. It can be proved that this sequence contains only numbers $1$ and $4$. So, the result is an empty list.</p>