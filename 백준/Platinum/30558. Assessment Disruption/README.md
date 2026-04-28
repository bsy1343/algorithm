# [Platinum V] Assessment Disruption - 30558

[문제 링크](https://www.acmicpc.net/problem/30558)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 20, 맞힌 사람: 17, 정답 비율: 60.714%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>It is finally time to submit your essays on economics for assessment!</p>

<p>Each essay is characterised by its word count $w$ and its quality $q$. The required word count is $W$, so the closer $w$ to $W$ is in your essay, the better mark you may expect. And, surely, the higher the quality, the better. However, one essay can have a better quality and a bigger deviation from $W$ than another, so it is not clear which one is better.</p>

<p>As an economics student, you may know that this kind of situation is captured by <em>Pareto dominance</em>. Formally, essay $A$ is said to <em>dominate</em> essay $B$ <em>in the Pareto sense</em> if $|w_A - W| \le |w_B - W|$, $q_A \ge q_B$, and at least one of these inequalities is strict.</p>

<p>The professor is known to use this relation to mark the essays. First, she finds all the best essays: those that are not dominated by any other essay. These essays receive the same mark, which is the highest among this year&#39;s students (but still can fall below their expectations!). Then she removes the marked essays and repeats the procedure, but the mark will be lower this time, and so on. More precisely, she uses the following algorithm:</p>

<ul>
	<li>All the essays are numbered from 1 to $N$.</li>
	<li>Each essay can be either <em>in work</em>, <em>postponed</em>, or <em>marked</em>. Initially, all essays are <em>in work</em>.</li>
	<li>A variable $r$ captures the <em>rank</em> of an essay, the lower, the better. Initially, $r \gets 1$.</li>
	<li>While there are any essays that are <em>in work</em>:
	<ul>
		<li>Iterate over all essay numbers from 1 to $N$. If the $i$-th essay is <em>in work</em>:
		<ul>
			<li>Iterate over all essay numbers from $i+1$ to $N$. If the $j$-th essay is <em>in work</em>, <strong>compare</strong> essays $i$ and $j$ for dominance:
			<ul>
				<li>If $i$ dominates $j$, turn $j$ into <em>postponed</em>.</li>
				<li>If $j$ dominates $i$, turn $i$ into <em>postponed</em> and break the loop.</li>
			</ul>
			</li>
			<li>If the $i$-th essay is still <em>in work</em>, it receives rank $r$ and turns into <em>marked</em>.</li>
		</ul>
		</li>
		<li>All <em>postponed</em> essays become <em>in work</em> again.</li>
		<li>The rank is increased: $r \gets r + 1$.</li>
	</ul>
	</li>
</ul>

<p>You are afraid that you, and everyone else, will get low marks, but someone told you that if it took the professor too long to perform the entire assessment, the department would take it over, and the final marks would be based on a simple multiple-choice quiz. By rigorous computations you found out that the number of essay <strong>comparisons</strong> should be at least $N^3 / 20$ for this to happen. Find the way to disrupt the assessment procedure.</p>

### 입력

<p>The first and only line of the input file contains two numbers, $N$ $(2 \le N \le 10^3)$ and $W$ $(0 \le W \le 10^4)$, separated by a whitespace.</p>

### 출력

<p>Output $N$ lines. The $i$-th line, $1 \le i \le N$, should contain the word count $w_i$ and the quality $q_i$ of the $i$-th essay. They should be integers that satisfy $0 \le w_i \le 10^4$ and $0 \le q_i \le 10^3$. No two essays should be described by the same pair of numbers, because this counts as collusion, which you would want to avoid at all costs.</p>