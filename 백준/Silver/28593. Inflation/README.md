# [Silver I] Inflation - 28593

[문제 링크](https://www.acmicpc.net/problem/28593)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 63, 정답: 28, 맞힌 사람: 25, 정답 비율: 50.000%

### 분류

자료 구조, 집합과 맵, 누적 합, 해시를 사용한 집합과 맵

### 문제 설명

<p>People in southern Sweden are known to eat falafel a lot. The price of falafel is highly volatile, and the best way to analyze the state of the economy is to go to the same falafel place every day and add up all the prices on their menu.</p>

<p>A falafel place has $N$ different dishes on their menu. The $i$th dish has price $p_i$.</p>

<p>Every day, one of the following events happen:</p>

<ul>
	<li><code>INFLATION x</code>: The integer $x$ is added to all prices.</li>
	<li><code>SET x y</code>: Every dish with price $x$ gets its price set to $y$.</li>
</ul>

<p>Your task is to process $Q$ days, and after each day print the sum of all prices $p_i$.</p>

### 입력

<p>The first line contains one integer $N$, the number of dishes.</p>

<p>The second line contains $N$ integers $p_1, p_2, \ldots, p_N$.</p>

<p>The third line contains one integer $Q$, the number of days.</p>

<p>The following $Q$ lines each contain a string $s$ followed by either one or two integers.</p>

<p>If $s$ is <code>INFLATION</code>, then one integer $x$ follows. This means that $x$ is added to all prices on this day.</p>

<p>If $s$ is <code>SET</code>, then two integers $x$ and $y$ follow. This means that all dishes with price $x$ get their price set to $y$ on this day.</p>

### 출력

<p>Print $Q$ lines, the sum of all prices $p_i$ after each day.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 3 \cdot 10^5$.</li>
	<li>$1 \leq p_i \leq 10^6$ (for each $i$ such that $1 \leq i \leq N$).</li>
	<li>$1 \leq Q \leq 10^5$.</li>
	<li>$1 \leq x,y \leq 10^6$ for all days.</li>
</ul>

<p><strong>Note</strong>: The answer may not fit in a $32$-bit integer, so be aware of overflows if you are using C++.</p>

### 힌트

<p>This figure corresponds to the first two days of sample $1$. Note that the sum of prices after the first day is $16$, so the first integer in the output is $16$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/28593.%E2%80%85Inflation/2b8bc805.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/28593.%E2%80%85Inflation/2b8bc805.png" data-original-src="https://upload.acmicpc.net/71e451eb-3315-48d7-80e2-52a70587ca08/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>