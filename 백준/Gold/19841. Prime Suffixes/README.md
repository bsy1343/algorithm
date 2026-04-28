# [Gold III] Prime Suffixes - 19841

[문제 링크](https://www.acmicpc.net/problem/19841)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 183, 정답: 55, 맞힌 사람: 36, 정답 비율: 26.866%

### 분류

수학, 정수론, 런타임 전의 전처리, 소수 판정

### 문제 설명

<p>Let us call a number $y$ a <em>suffix</em> of a number $x$, if we can remove digits from the beginning of a decimal representation of $x$ to get $y$. Note that if there are no zeroes in a decimal representation of $x$, all suffixes of $x$ contain no leading zeroes. For example, suffixes of $283$ are $283$, $83$ and $3$.</p>

<p>An integer is called prime, if its has exactly two positive integer divisors. The number $1$ is not prime --- it has only one positive integer divisor.</p>

<p>Senya likes prime numbers that have no zeroes in their decimal representation, such that all of their suffixes are also prime.</p>

<p>You are given integers $a$ and $b$. Help Senya to find out, how many integers between $a$ and $b$ are there that he likes.</p>

### 입력

<p>Input contains two integers $a$ and $b$ ($1 \le a \le b \le 10^{11}$).</p>

### 출력

<p>Print the number of primes between $a$ and $b$ inclusive, such that they have no zeroes in their decimal representation, and if any number of their leading digits are removed, the resulting number is still prime.</p>

### 힌트

<p>In the first example Senya likes integers $5$, $7$ and $13$.</p>

<p>In the second example all integers in the range contain $0$ in their decimal respresentation.</p>

<p>In the third example Senya likes integer $283$, since $283$, $83$ and $3$ are all prime.</p>