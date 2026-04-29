# [Silver IV] Exact Change - 32791

[문제 링크](https://www.acmicpc.net/problem/32791)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 72, 정답: 44, 맞힌 사람: 33, 정답 비율: 67.347%

### 분류

그리디 알고리즘, 문자열, 비트마스킹

### 문제 설명

<p>While in Binaria, you find a store where you want to buy some presents for your friends. In Binaria, the currency is bits, and the coin denominations are the set of all integer powers of $2$. You know that you want to spend at least $a$ bits here, but no more than $b$ bits. </p>

<p>When you make a purchase, you must pay with exact change. You have an unlimited number of bits that you can access from your bank account, but you can choose to withdraw them in whatever denominations you find most convenient. Carrying many coins is inconvenient though, so you wish to minimize the number of coins you carry with you.</p>

<p>Compute the minimum number of coins you need to bring with you such that you can pay any integer amount of bits between $a$ and $b$, inclusive.</p>

### 입력

<p>The first line of input contains a single integer $a$, $1 \le a &lt; 2^{1000000}$. $a$ will be written in base 2 with no leading zeros.</p>

<p>The second line of input contains a single integer $b$, $a \le b &lt; 2^{1000000}$. $b$ will be written in base 2 with no leading zeros.</p>

### 출력

<p>Output a single integer $k$, the minimum number of coins you need to bring.</p>