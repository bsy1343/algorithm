# [Platinum V] Cow-libi 2 - 35335

[문제 링크](https://www.acmicpc.net/problem/35335)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

그래프 이론, 애드 혹, 오일러 경로

### 문제 설명

<p>Farmer John and Farmer Nhoj have taken their respective cows to sit around a campfire in hopes of settling their personal differences. In total, there are $N$ ($2 \leq N \leq 10^5$) cows sitting in a circular formation. When the farmers are ready to take their cows back to their farms, they realize one crucial mistake: since all the cows look the same and are mixed up, they are unable to identify which cows belong to which farmer!</p>

<p>Then the $N$ cows are organized into one straight line to be interrogated by the two farmers. <strong> Because of the confusion, the order of the cows in the line, from $1$ to $N$, might not correspond to their circular order around the campfire. </strong></p>

<p>But the cows want to play a game. Instead of answering directly which farmer they belong to, they say which farmer the cows <strong> adjacent to them in the original circle </strong> belong to. Additionally, it is known that Farmer Nhoj's cows always lie but Farmer John raised his cows well and they will always tell the truth.</p>

<p>Given the statements of the cows, is it possible to assign each cow to either Farmer John or Farmer Nhoj such that the statements of the cows assigned to Farmer John are all true, and the statements of the cows assigned to Farmer Nhoj are all false?</p>

### 입력

<p>The first line contains $T$ ($1 \leq T \leq 1000$), the number of independent test cases, and an integer $C\in \{0,1\}$ (whether to output a construction or not).</p>

<p>The first line of each test case contains $N$.</p>

<p>The following line contains a string of length $N$ containing characters J or N. The $i$'th character is J if cow $i$ claims the cow to their <strong> left </strong> in the circle belongs to Farmer John, or Farmer Nhoj otherwise.</p>

<p>The following line contains a string of length $N$ containing characters J or N. The $i$'th character is J if cow $i$ claims the cow to their <strong> right </strong> in the circle belongs to Farmer John, or Farmer Nhoj otherwise.</p>

<p>It is guaranteed that the sum of $N$ over all tests does not exceed $5 \cdot 10^5$.</p>

### 출력

<p>For each test case, output YES or NO.</p>

<p>Additionally, if $C=1$ and the answer is YES, output two more lines describing your construction:</p>

<p>The first line should contain a permutation $p_1, p_2, \dots, p_N$ of $1\dots N$, representing the circular order of the cows around the campfire, where cow $p_i$ is to the left of cow $p_{i+1}$ for $i$ in $1 \dots N - 1$, and cow $p_N$ is to the left of cow $p_1$.</p>

<p>The second line should contain a string $b_1b_2\dots b_N$ consisting only of Js and Ns, meaning that cow $p_i$ belongs to Farmer John if $b_i$ is J, or Farmer Nhoj otherwise.</p>

<p>Any valid construction will be accepted.</p>