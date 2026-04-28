# [Platinum III] Quantum Moochanics - 31644

[문제 링크](https://www.acmicpc.net/problem/31644)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 53, 정답: 34, 맞힌 사람: 33, 정답 비율: 63.462%

### 분류

자료 구조, 트리를 사용한 집합과 맵, 우선순위 큐, 연결 리스트

### 문제 설명

<p>In her free time, Bessie likes to dabble in experimental physics. She has recently discovered a pair of new subatomic particles, named <strong>mootrinos</strong> and <strong>antimootrinos</strong>. Like standard <a href="https://en.wikipedia.org/wiki/Antimatter"> matter-antimatter pairs</a>, mootrinos and antimootrinos annihilate each other and disappear when they meet. But what makes these particles unique is that they switch their direction of motion (while maintaining the same speed) whenever Bessie looks at them.</p>

<p>For her latest experiment, Bessie has placed an <strong>even number</strong> $N$ ($2 \leq N \leq 2 \cdot 10^5$) of these particles in a line. The line starts with a mootrino on the left and then alternates between the two types of particles, with the $i$-th particle located at position $p_i$ ($0 \leq p_1 &lt; \cdots &lt; p_N \leq 10^{18}$). Mootrinos initially move <strong>right</strong> while antimootrinos initially move <strong>left</strong>, and the $i$-th particle moves with a constant speed of $s_i$ units per second ($1 \leq s_i \leq 10^9$).</p>

<p>Bessie makes observations at the following times:</p>

<ul>
	<li>First, $1$ second after the start of the experiment.</li>
	<li>Then $2$ seconds after the first observation.</li>
	<li>Then $3$ seconds after the second observation.</li>
	<li>...</li>
	<li>Then $n + 1$ seconds after the $n$-th observation.</li>
</ul>

<p>During each observation, Bessie notes down which particles have disappeared.</p>

<p>This experiment may take an extremely long time to complete, so Bessie would like to first simulate its results. Given the experiment setup, help Bessie determine when (i.e., <strong>the observation number</strong>) she will observe each particle disappear! It may be shown that all particles will eventually disappear.</p>

### 입력

<p>Each input contains $T$ ($1\le T\le 10$) independent test cases.</p>

<p>Each test case consists of three lines. The first line contains $N$, the second line contains $p_1,\dots,p_N$, and the third line contains $s_1\dots,s_N$.</p>

<p>It is guaranteed that the sum of all $N$ does not exceed $2\cdot 10^5$.</p>

### 출력

<p>For each test case, output the observation number for each particle&#39;s disappearance, separated by spaces.</p>