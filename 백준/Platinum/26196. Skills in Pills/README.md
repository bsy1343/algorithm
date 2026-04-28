# [Platinum II] Skills in Pills - 26196

[문제 링크](https://www.acmicpc.net/problem/26196)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 116, 정답: 46, 맞힌 사람: 38, 정답 비율: 47.500%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>An unnamed protagonist of this task received amazing e-mail offers for wondrous pills that will enhance their cognitive and all other sorts of abilities. After carefully analysing all offers and side effects, he has decided that he will order 2 types of pills, let&#39;s call them $A$ and $B$. He needs to take pill $A$ every $k$ days and pill $B$ every $j$ days. He will follow this meticulously over the next $n$ days.</p>

<p>More formally, in the next $n$ days, there should be no $k$ consecutive days where he does not take pill $A$ and no $j$ consecutive days where pill $B$ is not taken. However, there is a twist - the two pills are highly potent and must not be taken on the same day, lest horrible side effects should happen. Given this constraint, what is the smallest number of pills that he needs to take to meet these requirements?</p>

### 입력

<p>You are given three space-separated integers, $k$, $j$, and $n$.</p>

### 출력

<p>Print one number - the minimum number of pills that need to be taken. It is easy to prove that a solution always exists for the given constraints.</p>

### 제한

<ul>
	<li>$2 \leq n \leq 10^6$</li>
	<li>$2 \leq k,j \leq n$</li>
</ul>

### 힌트

<p>In the first case, we can take pill A on days $2$, $4$, $5$, and $7$, and pill $B$ on days $3$ and $6$, giving the sequence <code>.ABAABA.</code> In the second case, the best approach is to take pills in sequence <code>.ABAABAABA.</code> which requires taking 9 pills.</p>