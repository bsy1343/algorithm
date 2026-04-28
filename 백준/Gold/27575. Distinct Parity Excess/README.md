# [Gold IV] Distinct Parity Excess - 27575

[문제 링크](https://www.acmicpc.net/problem/27575)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 43, 맞힌 사람: 32, 정답 비율: 80.000%

### 분류

수학, 정수론, 누적 합, 소수 판정, 에라토스테네스의 체, 소인수분해

### 문제 설명

<p>A property of any positive integer is its <em>prime parity</em>, which is derived from the count of its distinct prime factors.  If this count is even, the prime parity is even; if the count is odd, the prime parity is odd.</p>

<p>You are given a sequence of ranges to test.  Each range is given as two numbers $a$ and $b$, defining the range from $a$ to $b$ inclusive. You want to compute the excess of even parity integers over odd parity integers over this range.  If there are more odd parity integers, the computed difference will be negative.</p>

### 입력

<p>The first line of the input contains a single integer $n$ $(1\le n\le 100)$, which is the number of ranges to test.</p>

<p>Each of the next $n$ lines contains two integers $a$ and $b$ ($2\le a\le b\le 10^7$), which is a range to test.</p>

### 출력

<p>Output $n$ lines, one for each range in the input. For each range, output a single integer giving the excess of even parity integers over odd parity integers.</p>