# [Platinum I] Mi Teleférico - 33726

[문제 링크](https://www.acmicpc.net/problem/33726)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 90, 정답: 26, 맞힌 사람: 25, 정답 비율: 33.333%

### 분류

그래프 이론, 두 포인터, 방향 비순환 그래프, 세그먼트 트리, 자료 구조

### 문제 설명

<p>La Paz, the capital city of Bolivia, is famous as a tourist spot and for an aerial cable car called Mi Teleférico. You are now visiting La Paz for sightseeing, and you want to visit as many sightseeing places as possible. In this task, we consider the following simplified situation.</p>

<p>There are $N$ aerial cable car stations in La Paz, numbered from $1$ to $N$ in ascending order of altitude. There are $M$ <strong>one-way</strong> lines, numbered from $1$ to $M$. There are $P$ aerial cable car companies, numbered from $1$ to $P$. Each line is managed by a single company. Line $i$ ($1 ≤ i ≤ M$) is operated from station $A_i$ to station $B_i$, and is managed by the company $C_i$. Here, the line always runs from the lower altitude station to the higher altitude station. In other words, $A_i &lt; B_i$ holds.</p>

<p>The Bureau of transportation of La Paz issued unlimited ride passes for convenience. Each ride pass contains $2$ integers $l$, $r$, which satisfy $1 ≤ l ≤ r ≤ P$. The pass enables the possessor to ride lines, which are managed by any one of company $l, l + 1, \dots ,r$. In other words, for an integer $i$ which satisfies $1 ≤ i ≤ M$, the pass enables the possessor to ride line $i$ when $l ≤ C_i ≤ r$ holds. It is possible to use a single pass for several lines. Let a ride pass $(l,r)$ denote this ride pass.</p>

<p>Now, $Q$ tourists, numbered from $1$ to $Q$, visit La Paz. Tourist $j$ ($1 ≤ j ≤ Q$) has a ride pass $(L_j, R_j)$ and $X_j$ boliviano cash.</p>

<p>Each tourist’s goal is to ensure that no station cannot be travelled from station $1$, using only lines that can be ridden with the ride pass he or she has. Tourist $j$ ($1 ≤ j ≤ Q$) can exchange his or her ride pass described in the following process to achieve their goal. Here, each tourist can exchange at most once.</p>

<ol>
	<li>He or she chooses $2$ integers $l'$, $r'$, which satisfy $1 ≤ l' ≤ r' ≤ P$.</li>
	<li>He or she exchanges a ride pass $(L_j, R_j)$ for a ride pass $(l', r')$. It costs $|L_j − l'| + |R_j − r'|$ boliviano as a fee.</li>
</ol>

<p>Your purpose is to determine, for each tourist, whether or not he or she can achieve his or her goal within the cash he or she has.</p>

<p>Write a program which, given information about stations, lines, and tourists, determines whether or not he or she can achieve his or her goal within the cash he or she has for each tourist.</p>

### 입력

<p>Read the following data from the standard input.</p>

<blockquote>
<p>$N$ $M$ $P$</p>

<p>$A_1$ $B_1$ $C_1$</p>

<p>$A_2$ $B_2$ $C_2$</p>

<p>$\vdots$</p>

<p>$A_M$ $B_M$ $C_M$</p>

<p>$Q$</p>

<p>$L_1$ $R_1$ $X_1$</p>

<p>$L_2$ $R_2$ $X_2$</p>

<p>$\vdots$</p>

<p>$L_Q$ $R_Q$ $X_Q$</p>
</blockquote>

### 출력

<p>Write $Q$ lines to the standard output. On the $j$-th line ($1 ≤ j ≤ Q$), output <code>Yes</code> if tourist $j$ can achieve his or her goal, and <code>No</code> otherwise.</p>

### 제한

<ul>
	<li>$2 ≤ N ≤ 300\, 000$.</li>
	<li>$1 ≤ M ≤ 300\, 000$.</li>
	<li>$1 ≤ P ≤ 10^9$.</li>
	<li>$1 ≤ A_i &lt; B_i ≤ N$ ($1 ≤ i ≤ M$).</li>
	<li>$1 ≤ C_i ≤ P$ ($1 ≤ i ≤ M$).</li>
	<li>$1 ≤ Q ≤ 400\, 000$.</li>
	<li>$1 ≤ L_j ≤ R_j ≤ P$ ($1 ≤ j ≤ Q$).</li>
	<li>$0 ≤ X_j ≤ 10^9$ ($1 ≤ j ≤ Q$).</li>
	<li>Given values are all integers.</li>
</ul>