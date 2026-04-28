# [Platinum II] Wooden blocks - 31452

[문제 링크](https://www.acmicpc.net/problem/31452)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 1024 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Giving in to the lobby of the International Toddlers Association, and with the full support of the International Exhausted Parents Association, the 2024 Olympic Committee decided to inaugurate the Toddlers Olympics, a special and massively attended event.</p>

<p>The Wooden Blocks Stacking contest is one of the main trials thereof, intended towards dramatically challenging contestants&rsquo; strength, patience, and hand-to-eye coordination.</p>

<p>For this contest, participants are given $N$ equal-depth wooden blocks $B_1, B_2, \dots , B_N$, having integer height and width (measured in centimetres). The purpose of the contest is to obtain a <em>complete stack</em> containing all of these $N$ blocks. The winner is the toddler achieving this truly impressive result in the least amount of time. To build the complete stack, contestants are allowed to build partial stacks, i.e., stacks containing consecutive blocks $B_i , B_{i+1}, \dots , B_j$ from bottom to top, in that order; in particular, each block is a partial stack containing exactly one block, and a stack is complete when it contains all the blocks. Moreover, the contestants must comply with the following rules:</p>

<ul>
	<li>Stacks are built against a wall. Thus, when placing the block $B_{i+1}$ on top of the block $B_i$, both blocks are perfectly aligned depth-wise, with their front and back borders perfectly aligned. Moreover, the left border of $B_{i+1}$ must be either perfectly aligned with the left border of $B_i$, or shifted left or right by an integer amount of centimetres.</li>
	<li>At each step, participants must place a partial stack containing blocks $B_j , B_{j+1}, \dots , B_k$ on top of another partial stack containing blocks $B_i , B_{i+1}, \dots , B_{j-1}$.</li>
	<li>Each (partial or complete) stack ever formed must be stable: a stack containing the blocks $B_i , B_{i+1}, \dots , B_j$ is stable if, for any block $B_k$ such that $i \le k \le j - 1$, the center of gravity of the sub-stack formed by the blocks $B_{k+1} , \dots , B_j$ does not project strictly outside of the block $B_k$.</li>
</ul>

<p>You have somehow managed to get the dream job of surveillance assistant in the Wooden Blocks Stacking trial. Although the contest is in itself intense and exciting, your tireless brain issues an additional challenge: you wonder, given the sequence of $N$ blocks, how many possible configurations can be obtained for the complete stack? Since this may be a very large number, you further wish to count these configurations modulo the prime number $1\, 000\, 000\, 007$.</p>

### 입력

<p>The first line contains the number $N$. This line is followed by $N$ lines, which describe the $N$ wooden blocks, starting from block $1$ and up to block $N$. The $i$<sup>th</sup> such line contains two space-separated integers $w_i$ and $h_i$; $w_i$ is the width of the block $i$, and $h_i$ is its height.</p>

### 출력

<p>The output should contain a single line, consisting of an integer representing the number of distinct stable complete stacks that can be obtained by stacking the input blocks, modulo $1\, 000\, 000\, 007$.</p>

### 제한

<ul>
	<li>$1 \le N \le 200$</li>
	<li>$1 \le w_i \le 10$ and $1 \le h_i \le 10$ for all $i \le N$.</li>
</ul>