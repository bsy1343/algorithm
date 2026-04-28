# [Platinum III] Atomic Energy - 21337

[문제 링크](https://www.acmicpc.net/problem/21337)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 291, 정답: 86, 맞힌 사람: 69, 정답 비율: 32.547%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>The <em>Next Wave Energy Research Club</em> is looking at several atoms as potential energy sources, and has asked you to do some computations to see which are the most promising.</p>

<p>Although an atom is composed of various parts, for the purposes of this method only the number of neutrons in the atom is relevant (In fact, for this problem you might want to forget everything you thought you knew about chemistry.). In the method, a laser charge is fired at the atom, which then releases energy in a process formally called <em>explodification</em>. Exactly how this process proceeds depends on the number of neutrons $k$:</p>

<ul>
	<li>If the atom contains $k \leq n$ neutrons, it will be converted into $a_k$ joules of energy.</li>
	<li>If the atom contains $k &gt; n$ neutrons, it will decompose into two atoms with $i$ and $j$ neutrons respectively, satisfying $i,j \geq 1$ and $i+j=k$. These two atoms will then themselves explodificate.</li>
</ul>

<p>When an atom with $k$ neutrons is explodificated, the total energy that is released depends on the exact sequence of decompositions that occurs in the explodification process. Modern physics is not powerful enough to predict exactly how an atom will decompose---however, for explodification to be a reliable energy source, we need to know the minimum amount of energy that it can release upon explodification. You have been tasked with computing this quantity.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $q$ ($1 \leq n \leq 100$, $1 \leq q \leq 10^5$), the neutron threshold and the number of experiments.</li>
	<li>One line with $n$ integers $a_1,\ldots,a_n$ ($1 \leq a_i \leq 10^9$ for each $i$), where $a_i$ is the amount of energy released when an atom with $i$ neutrons is explodificated.</li>
	<li>Then $q$ lines follow, each with an integer $k$ ($1 \leq k \leq 10^9$), asking for the minimum energy released when an atom with $k$ neutrons is explodificated.</li>
</ul>

### 출력

<p>For each query $k$, output the minimum energy released when an atom with $k$ neutrons is explodificated.</p>