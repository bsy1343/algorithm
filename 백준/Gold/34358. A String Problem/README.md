# [Gold II] A String Problem - 34358

[문제 링크](https://www.acmicpc.net/problem/34358)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 25, 정답: 10, 맞힌 사람: 10, 정답 비율: 40.000%

### 분류

구현, 그래프 이론, 기하학, 애드 혹, 해 구성하기

### 문제 설명

<p>Lara loves flea markets. Last Saturday, there was the Rheinaue-Flohmarkt in Bonn, one of the biggest flea markets in Germany. Of course, Lara spent the whole day there, strolling through the market, haggling over prices, and buying all kinds of curious things. The most interesting thing she brought home was a small harp in a perfectly circular shape. When she wanted to start playing it, she noticed that the strings were all over the place rather than being parallel to each other.</p>

<p>More specifically, there are $2\cdot N$ pins distributed evenly around the circular frame. Each of the $N$ strings is held in place by two of the pins, and every pin has exactly one string attached.</p>

<p>Lara does not know much about harps, but she strongly suspects that the strings should be aligned so that they are parallel to each other. To fix this issue, she decides to restring the harp. In each step, she can detach one end of a string from its pin and reattach it to a different pin. During the process it is okay if the ends of multiple strings are attached to the same pin. In the end, there should be exactly one string attached to every pin once again, and the $N$ strings should be parallel to each other.</p>

<p>Below you can find two examples of harps with parallel strings.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34358.%E2%80%85A%E2%80%85String%E2%80%85Problem/17f7cd86.png" data-original-src="https://boja.mercury.kr/assets/problem/34358-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 387px; height: 200px;"></p>

<p>Since each step of restringing is a lot of work, Lara wants to restring the harp with as few steps as possible. Help Lara find a restringing sequence that takes the minimum number of steps!</p>

### 입력

<p>The first line of input contains one integer $N$, denoting the number of strings. The strings are numbered from $0$ to $N - 1$.</p>

<p>Then follow $N$ lines, where the $i$th line ($0\le i \le N-1$) contains two integers $a_i$ and $b_i$, the two pins that hold the $i$th string in place. The pins are numbered in clockwise order from $0$ to $2\cdot N - 1$. Every pin has exactly one string attached.</p>

### 출력

<p>Output an integer $K$, the minimum number of steps needed to restring the harp such that all strings are parallel to each other.</p>

<p>Further, output $K$ lines, each containing three integers $p$, $s$, and $e$, denoting that in this step of your solution, one end of the $p$th string should be detached from pin $s$ and reattached to pin $e$ ($0 \leq p \leq N - 1$, $0 \leq s, e \leq 2\cdot N - 1$).</p>

<p>Note that if the $p$th string is not attached to pin $s$ at that moment, the sequence of moves is considered to be incorrect.</p>

<p>If several answers exist, you may print any of them. Note that partially correct answers may still score some points, as explained in the next section.</p>

### 제한

<ul>
	<li>$4 \leq N \leq 100\,000$.</li>
	<li>$0 \leq a_i, b_i \leq 2\cdot N - 1$.</li>
	<li>All $a_i$ and $b_i$ are unique.</li>
</ul>