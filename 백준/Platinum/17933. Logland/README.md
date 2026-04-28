# [Platinum V] Logland - 17933

[문제 링크](https://www.acmicpc.net/problem/17933)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 75, 정답: 38, 맞힌 사람: 31, 정답 비율: 53.448%

### 분류

그리디 알고리즘

### 문제 설명

<p>Two thieves (who strongly &quot;recommended&quot; us not to reveal their names) has broken into the central bank of Logland, where the country&#39;s cash reserve is stored. In Logland, the currency has the $k$ denominations $1, 2, 4, 8, \ldots, 2^{k - 1}$, and the bank currently stores $x_i$ coins of denominations $2^i$.</p>

<p>Thieves live by a very strict honor code, which stipulates that any loot grabbed must be divided evenly between the theives. Unfortunately (for the thieves), this may mean that some loot must be left behind. For example, if the bank contained a single coin of denomination $8$, and two coins of denomination $2$, there is no way they could bring the $8$ coin. Instead, they would have to take one coin of value $2$ each, leaving more than half of the possible loot!</p>

<p>Since neither leaving loot nor solving NP-hard problems are things thieves like to do, they have asked you to compute the minimum value of the loot they must leave behind, in order to be able to split the remaining loot evenly.</p>

### 입력

<p>The first line of input contains the integer $1 \le k \le 10^6$ -- the number of denominations in Logland. The next line contains the $k$ integers $0 \le x_0, x_1, \dots, x_{k-1} \le 2^{30}$, the number of coins of the denominations $2^0, 2^1, \dots, 2^{k - 1}$.</p>

### 출력

<p>Output a single line, the minimum amount of money the thieves must leave behind. Since this number may be very large, output it modulo the prime number $10^9 + 7$.</p>