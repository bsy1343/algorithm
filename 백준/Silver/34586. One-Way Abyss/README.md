# [Silver III] One-Way Abyss - 34586

[문제 링크](https://www.acmicpc.net/problem/34586)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 54, 정답: 34, 맞힌 사람: 33, 정답 비율: 62.264%

### 분류

구현, 다이나믹 프로그래밍, 시뮬레이션

### 문제 설명

<p>Mitty is a brave adventurer exploring a mysterious underground cave system known as <em>The Abyss</em>. The Abyss is composed of $n$ parallel vertical shafts and $m$ horizontal tunnels. Each tunnel connects exactly two shafts at the same depth. All $m$ tunnels have distinct depths, and surprisingly, there is a treasure in the middle of every tunnel!</p>

<p>Mitty can pick any shaft to start with. He moves downward from the top of the chosen shaft, obeying the following rules:</p>

<ul>
<li>He can only move downward, going upward is not allowed.</li>
<li>Whenever he encounters a horizontal tunnel, he <strong>must</strong> enter it immediately and will arrive at the connected shaft.</li>
<li>Once he enters a horizontal tunnel, he cannot go back.</li>
</ul>

<p>These treasures in the tunnels have various values. Mitty wants to collect as much treasure as possible. Please help him calculate the maximum total value of treasures he can collect when starting from one of the shafts.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$. The description of the test cases follows.</p>

<p>The first line contains two integers $n$ and $m$, representing the number of vertical shafts and horizontal tunnels, respectively.</p>

<p>Each of the following $m$ lines contains three integers $x$, $y$ and $v$, representing a horizontal tunnel at a certain depth that connects shafts numbered $x$ and $y$, and contains a treasure worth $v$.</p>

<p>The horizontal tunnels are given from top to bottom. This implies that no two horizontal tunnels situated at the same depth.</p>

### 출력

<p>For each test case, print a single integer, representing the maximum total value of treasures Mitty can collect.</p>

### 제한

<ul>
<li>$1 ≤ t ≤ 20$</li>
<li>$1 ≤ n ≤ 2 \times 10^5$</li>
<li>$0 ≤ m ≤ 2 \times 10^5$</li>
<li>$1 ≤ x &lt; y ≤ n$</li>
<li>$0 ≤ v ≤ 10^9$</li>
<li>It is guaranteed that the sum of $n$ over all test cases does not exceed $2 \times 10^5$.</li>
<li>It is guaranteed that the sum of $m$ over all test cases does not exceed $2 \times 10^5$.</li>
</ul>