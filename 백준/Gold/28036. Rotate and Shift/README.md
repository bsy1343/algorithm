# [Gold I] Rotate and Shift - 28036

[문제 링크](https://www.acmicpc.net/problem/28036)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 172, 정답: 77, 맞힌 사람: 55, 정답 비율: 63.218%

### 분류

수학, 자료 구조, 덱

### 문제 설명

<p>To celebrate the start of spring, Farmer John&#39;s $N$ cows ($1 \leq N \leq 2 \cdot 10^5$) have invented an intriguing new dance, where they stand in a circle and re-order themselves in a predictable way.</p>

<p>Specifically, there are $N$ positions around the circle, numbered sequentially from $0$ to $N-1$, with position $0$ following position $N-1$. A cow resides at each position. The cows are also numbered sequentially from $0$ to $N-1$. Initially, cow $i$ starts in position $i$. You are told a set of $K$ positions $0=A_1&lt;A_2&lt; \ldots&lt; A_K&lt;N$ that are &quot;active&quot;, meaning the cows in these positions are the next to move ($1 \leq K \leq N$).</p>

<p>In each minute of the dance, two things happen. First, the cows in the active positions rotate: the cow at position $A_1$ moves to position $A_2$, the cow at position $A_2$ moves to position $A_3$, and so on, with the cow at position $A_K$ moving to position $A_1$. All of these $K$ moves happen simultaneously, so the after the rotation is complete, all of the active positions still contain exactly one cow. Next, the active positions themselves shift: $A_1$ becomes $A_1+1$, $A_2$ becomes $A_2+1$, and so on (if $A_i = N-1$ for some active position, then $A_i$ circles back around to $0$).</p>

<p>Please calculate the order of the cows after $T$ minutes of the dance ($1\le T\le 10^9$).</p>

### 입력

<p>The first line contains three integers $N$, $K$, and $T$.</p>

<p>The second line contains $K$ integers representing the initial set of active positions $A_1,A_2, \ldots A_K$. Recall that $A_1 = 0$ and that these are given in increasing order.</p>

### 출력

<p>Output the order of the cows after $T$ minutes, starting with the cow in position $0$, separated by spaces.</p>