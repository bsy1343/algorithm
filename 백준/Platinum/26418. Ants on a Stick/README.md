# [Platinum V] Ants on a Stick - 26418

[문제 링크](https://www.acmicpc.net/problem/26418)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 24, 맞힌 사람: 16, 정답 비율: 59.259%

### 분류

애드 혹, 정렬

### 문제 설명

<p>Ada has $N$ ants labelled from $1$ to $N$. She decides to test John&#39;s concentration skills. She takes a stick $L$ cm long, and drops the ants on it.</p>

<p>The positions on the stick at which the ants are dropped are represented by an integer array $P$, where ant $i$ is dropped at the position $P_i$ (that is, $P_i$ cm away from the left end) on the stick. Each ant travels either to the left or right with a constant speed of $1$ cm per second. The initial directions of the ants is represented by an array $D$, where the direction of ant $i$ is $D_i$: $0$ if left, and $1$ if right. When two ants meet, they bounce off each other and reverse their directions. The ants fall off the stick when they reach either end of it.</p>

<p>Ada challenges John to find the exact order in which the ants fall off the stick. John needs your help!</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$. $T$ test cases follow.</p>

<p>The first line of each test case contains two integers, $N$ and $L$: the number of ants, and the length of the stick, respectively.</p>

<p>The next $N$ lines describe the positions and directions of the ants. The $i$-th line contains two integers, $P_i$ and $D_i$: the position and direction of ant $i$, respectively.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: A<sub>1</sub>A<sub>2</sub>&hellip;A<sub>N</sub></code>, where $x$ is the test case number (starting from 1), and $A_i$ is the label of the $i$-th ant that falls off the stick. In other words, the first ant to fall off the stick is the ant labelled $A_1$, the second is the ant labelled $A_2$, and so on. If multiple ants fall off at the same time, output their labels in the <i>increasing</i> order.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$N&lt;L$.</li>
	<li>$D_i&isin;\{0,1\}$, for all $i$.</li>
	<li>$0&lt;P_i&lt;L$, for all $i$.</li>
	<li>All $P_i$ are distinct.</li>
</ul>