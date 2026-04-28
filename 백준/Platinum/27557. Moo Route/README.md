# [Platinum II] Moo Route - 27557

[문제 링크](https://www.acmicpc.net/problem/27557)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 156, 정답: 74, 맞힌 사람: 69, 정답 비율: 50.735%

### 분류

수학, 정수론, 조합론, 모듈로 곱셈 역원, 페르마의 소정리

### 문제 설명

<p>Farmer Nhoj dropped Bessie in the middle of nowhere! At time $t=0$, Bessie is located at $x=0$ on an infinite number line. She frantically searches for an exit by moving left or right by $1$ unit each second. However, there actually is no exit and after $T$ seconds, Bessie is back at $x=0$, tired and resigned.</p>

<p>Farmer Nhoj tries to track Bessie but only knows how many times Bessie crosses $x=.5, 1.5, 2.5, \ldots, (N-1).5$, given by an array $A_0,A_1,\dots,A_{N-1}$ ($1\leq N \leq 10^5$, $1 \leq A_i \leq 10^6$). Bessie never reaches $x&gt;N$ nor $x&lt;0$.</p>

<p>In particular, Bessie&#39;s route can be represented by a string of $T = \sum_{i=0}^{N-1} A_i$ $L$s and $R$s where the $i$th character represents the direction Bessie moves in during the $i$th second. The number of direction changes is defined as the number of occurrences of $LR$s plus the number of occurrences of $RL$s.</p>

<p>Please help Farmer Nhoj count the number of routes Bessie could have taken that are consistent with $A$ and minimize the number of direction changes. It is guaranteed that there is at least one valid route.</p>

### 입력

<p>The first line contains $N$. The second line contains $A_0,A_1,\dots,A_{N-1}$.</p>

### 출력

<p>The number of routes Bessie could have taken, modulo $10^9+7$.</p>

### 힌트

<p>Bessie must change direction at least 5 times. There are two routes corresponding to Bessie changing direction exactly 5 times:</p>

<pre>
RRLRLLRRLL
RRLLRRLRLL
</pre>