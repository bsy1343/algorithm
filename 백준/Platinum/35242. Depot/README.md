# [Platinum IV] Depot - 35242

[문제 링크](https://www.acmicpc.net/problem/35242)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

(분류 없음)

### 문제 설명

<p>We have acquired a state-of-the-art ore processing facility, supposedly "to evaluate whether gzip can produce diamonds". The facility sequentially processes ore through $n$ stages, from a crude stage $1$, to the final stage $n$.</p>

<p>Each stage of refinement can consist of several machines. Each machine converts material $i$ into material $i+1$, but their efficiency varies, and only one is available at a time. Machine specifications detail how many units of an input material they consume and how many units of an output material they produce.</p>

<p>Storage being expensive, all input and output materials are stored in the same shared warehouse with maximum capacity $k$. Excess material can be sent away from the warehouse for disposal at any time.</p>

<p>Each stage must occur in-order; once any stage of processing is completed, it cannot be revisited.</p>

<p>As the new operations manager your task is to determine the maximum quantity of material $n$ that can be produced, given your initial stockpile of raw material $1$ and limited warehouse capacity $k$.</p>

### 입력

<ul>
<li>One line containing the number of materials $n$ ($2 \leq n \leq 30$), and the number of machines $m$ ($n-1 \leq m \leq 500$).</li>
<li>One line containing the initial quantity of material 1, $s$, and the capacity of the warehouse $k$ ($1 \leq s \leq k \leq 10^4$)</li>
<li>$m$ lines, each describing a machine, consisting of three integers:
<ul>
<li>$i$ ($1 \leq i \leq n-1$), the input material (The machine converts material $i$ into material $i+1$).</li>
<li>$M_I$ ($1 \leq M_I \leq k$), the amount of material $i$ consumed.</li>
<li>$M_O$ ($1 \leq M_O \leq k$), the amount of material $i+1$ produced.</li>
</ul>
</li>
</ul>

### 출력

<p>Output an integer, the maximum final quantity of material $n$.</p>