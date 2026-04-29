# [Gold III] Feline Friendship - 32613

[문제 링크](https://www.acmicpc.net/problem/32613)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 29, 정답: 16, 맞힌 사람: 14, 정답 비율: 60.870%

### 분류

그리디 알고리즘, 순열 사이클 분할, 정렬

### 문제 설명

<p>There is a big community of $n$ cats in Delft. The cats are numbered from $1$ to $n$. Each cat has a favourite playing partner, $p_i$ (cats can be very egocentric, so $p_i = i$ is allowed). It turns out that no two cats share the same favourite playing partner, so the $p_i$ are distinct.</p>

<p>You are organising a big game of Cats versus Coatis football<sup>1</sup>, for which you will need exactly $k$ cats in a team.</p>

<p>To get $k$ cats to join your game, you appoint one cat as team captain. Then the following process is repeated, starting with the team captain cat. A cat $i$ selects its favourite playing partner $p_i$, adding $p_i$ to the team. Subsequently, cat $p_i$ will select its favourite playing partner, adding $p_{p_i}$ to the team, and so on. The process only stops when a cat tries to invite a cat that is already on the team. If, for some choice of the team captain, the number of cats in the team is exactly $k$, the game can be played.</p>

<p>Sometimes, it is not possible to find a team of $k$ cats in this way. Therefore, you have decided to convince some cats to change their favourite playing partner. Formally, you repeatedly select a cat $i$ ($1 \leq i \leq n$) and choose an $x$ ($1 \leq x\leq n$) and update the playing partner $p_i \mathrel{\mathop:}= x$ After the change, it can be the case that $p_1, p_2, p_3, \dots , p_n$ are no longer distinct, but that is fine.</p>

<p>What is the minimum number of times you need to convince a cat to change their favourite playing partner, such that the football game can be played?</p>

<hr>
<p><sup>1</sup>Non-American.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers, $n$ and $k$ ($1\leq n\leq 2 \cdot 10^5$, $1 \leq k \leq n$), the number of cats and the team size for the football game.</li>
	<li>One line with $n$ integers, $p_1, p_2, \dots , p_n$ ($1 \leq p_i \leq n$), where the $i$th integer is the favourite playing partner of cat $i$.</li>
</ul>

<p>It is guaranteed that the $p_i$ are all distinct.</p>

### 출력

<p>Output the minimum number of times you need to convince a cat to change their favourite playing partner, such that the football game can be played.</p>