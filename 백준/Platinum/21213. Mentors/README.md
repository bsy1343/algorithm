# [Platinum II] Mentors - 21213

[문제 링크](https://www.acmicpc.net/problem/21213)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 112, 정답: 56, 맞힌 사람: 50, 정답 비율: 54.945%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>The Happy Tree Friends have gathered for their annual meeting, in which they take their most important decisions for the year to come. This year, they will set up a mentoring program to help each other take better care of their loved ones. This programme follows a tree-like hierarchical structure as follows.</p>

<p>The $N$ members of the programme are ranked from $1$ to $N$ (each rank is assigned once), by increasing seniority. For the mentorship programme to be efficient, a person ranked $A$ can mentor a person ranked $B$ only if $A &gt; B$. The most senior Happy Tree Friend can have no mentor, but everybody else has a unique mentor. Conversely, everybody is allowed to mentor from zero to two people.</p>

<p>However, Mr. Pickles, who was assigned the rank $R$, plans to take a sabbatical this year. Thus, he will not be able to mentor anybody, and the Happy Tree Friends should choose their hierarchical structure among those trees in which the node labelled $R$ is a leaf.</p>

<p>Aiming to help his friends to choose such a tree, Mr. Pickles decides to first count how many trees would match his constraint. Unfortunately, he stopped school early, and thus did not learn how to manipulate integers of arbitrary size. Instead, he counts modulo $M$, where $M$ is a fixed positive integer: this is already enough for most purposes in life.</p>

<p>What is the number $L$ that Mr. Pickles will obtain after counting all suitable trees?</p>

### 입력

<p>The input consists of a single line, with three space-separated integers: $R$, $N$, $M$, in that order.</p>

### 출력

<p>The output should contain a single line with the single integer $L$, which is the number of tree-like hierarchical structures that would match Mr. Pickles&#39; constraints, counted modulo $M$.</p>

### 제한

<ul>
	<li>$1 \leqslant R \leqslant N \leqslant 2021$</li>
	<li>$1 \leqslant M \leqslant 1\,000\,000\,000$</li>
</ul>