# [Platinum II] Multi Communication - 34111

[문제 링크](https://www.acmicpc.net/problem/34111)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 8, 맞힌 사람: 8, 정답 비율: 36.364%

### 분류

해 구성하기

### 문제 설명

<p>Chairman K has prepared a game for the participants of the spring training camp.</p>

<p>There are $N$ participants in the training camp, each assigned a unique number from $1$ to $N$. Each participant has a board. The game follows these steps:</p>

<ol>
	<li>Chairman K selects one participant to be the <strong>parent</strong>, while all other participants become <strong>children</strong>. However, the identity of the parent is not revealed to the participants.</li>
	<li>Chairman K writes the letter ‘<code>T</code>’ on the parent’s board and the letter ‘<code>F</code>’ on all the children’s boards.</li>
	<li>Each participant reads the letter on their own board. Then, following a predefined <strong>strategy</strong>, they perform the following turn-based process for $L$ turns:
	<ol>
		<li>Each participant erases the letter on their board and writes either ‘<code>T</code>’ or ‘<code>F</code>’. Then, they submit their board to Chairman K.</li>
		<li>For each participant $i$ ($i = 1, 2, \dots , N$):
		<ul>
			<li>Participant $i$ selects a participant $p$ ($1 ≤ p ≤ N$) and informs Chairman K of the number $p$. Chairman K shows the board of participant $p$ to participant $i$, who then reads the letter on it. A participant is allowed to choose themselves as $p$.</li>
		</ul>
		</li>
	</ol>
	</li>
	<li>After $L$ turns, each participant must guess who the parent is.</li>
</ol>

<p>The goal of the game is to establish a strategy beforehand so that, regardless of who is chosen as the parent, all participants can correctly identify the parent by the end of the process.</p>

<p>A smaller value of $L$ results in a higher score. Your goal is to devise a strategy that minimizes $L$ while ensuring that all participants correctly identify the parent by the end of the process.</p>

<p>A <strong>strategy</strong> consists of a non-negative integer $L$, representing the number of turns, and a set of rules that determine the actions of each participant. The rules are as follows:</p>

<ul>
	<li>For participant $i$ ($1 ≤ i ≤ N$), at the beginning of turn $t$ ($1 ≤ t ≤ L$), if the sequence of letters they have read up to that point is $a_0, a_1, \dots , a_{t-1}$, then based only on this information $(i, t, a_0, a_1, \dots , a_{t-1})$, they must determine:
	<ul>
		<li>The letter they will write on their board for turn $t$.</li>
		<li>The participant number they will choose to observe for turn $t$.</li>
	</ul>
	</li>
	<li>For participant $i$ ($1 ≤ i ≤ N$), after the $L$-th turn, if the sequence of letters they have read up to that point is $a_0, a_1, \dots , a_L$, then based only on this information $(i, L, a_0, a_1, \dots , a_L)$, they must determine the participant number of the parent.</li>
</ul>

<p>Devise a strategy that allows all participants to correctly identify the parent, regardless of who is chosen as the parent. Then, for each possible parent selection $(1, 2, \dots , N)$, output the values that each participant writes on their board and the participant they choose to observe in each turn, following the established strategy.</p>

### 입력

<p>Read the following data from the standard input.</p>

<blockquote>
<p>$N$</p>
</blockquote>

### 출력

<p>Print the output in the following format:</p>

<blockquote>
<p>$L$</p>

<p>$acts_1$</p>

<p>$acts_2$</p>

<p>$\vdots$</p>

<p>$acts_N$</p>
</blockquote>

<p>Here, $acts_s$ represents the sequence of actions taken by each participant when participant $s$ is the parent. The format of $acts_s$ is as follows:</p>

<p>First, print the integer $s$. For each participant $i$ ($1 ≤ i ≤ N$), print a single line containing the sequence of actions they take during the $L$ turns. Each line should have the following values:</p>

<ul>
	<li>The character $c_{i,t}$ (‘<code>T</code>’ or ‘<code>F</code>’), which the participant writes on their board in turn $t$.</li>
	<li>The participant number $p_{i,t}$, which they choose to observe in turn $t$.</li>
</ul>

<p>These values should be printed for each turn $t$ ($1 ≤ t ≤ L$) in sequence. Thus, the output format for $acts_s$ is:</p>

<blockquote>
<p>$s$</p>

<p>$c_{1,1}$ $p_{1,1}$ $c_{1,2}$ $p_{1,2}$ $\cdots$ $c_{1,L}$ $p_{1,L}$</p>

<p>$c_{2,1}$ $p_{2,1}$ $c_{2,2}$ $p_{2,2}$ $\cdots$ $c_{2,L}$ $p_{2,L}$</p>

<p>$\vdots$</p>

<p>$c_{N,1}$ $p_{N,1}$ $c_{N,2}$ $p_{N,2}$ $\cdots$ $c_{N,L}$ $p_{N,L}$</p>
</blockquote>

### 제한

<ul>
	<li>$N$ is one of $4$, $32$, or $48$.</li>
</ul>