# [Platinum IV] Island Alliances - 28363

[문제 링크](https://www.acmicpc.net/problem/28363)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 24, 맞힌 사람: 22, 정답 비율: 40.000%

### 분류

자료 구조, 집합과 맵, 분리 집합, 트리를 사용한 집합과 맵, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>In a vast ocean there are $n$ islands numbered from $1$ to $n$, where each island constitutes a sovereign state.</p>

<p>However, the large number of states is making foreign policy a very complicated matter, so the inhabitants of the islands have decided to simplify things by joining into larger (but fewer) states. This endeavour has turned out to be easier said than done, because there are $m$ pairs of islands whose inhabitants distrust each other and refuse to be part of the same state.</p>

<p>The islanders have sent you $q$ proposals that you should process in order. The $i$th proposal calls for the state containing island $a_i$ to merge with the state containing island $b_i$. If the two states contain a pair of islands whose inhabitants distrust each other the proposal should be rejected, but otherwise the proposal should be approved and all the islands in the two states will henceforth be part of the same state.</p>

<p>Please help the islanders figure out which proposals should be rejected and which should be approved!</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with three integers $n$, $m$, and $q$, the number of islands, the number of distrusting pairs of islands, and the number of proposals.</li>
	<li>$m$ lines, the $i$th of which contains two integers $u_i$ and $v_i$, where $1 \leq u_i,v_i \leq n$, $u_i \neq v_i$, meaning that the inhabitants of islands $u_i$ and $v_i$ distrust each other. Each pair $(u_i, v_i)$ will be listed at most once.</li>
	<li>$q$ lines, the $i$th of which contains two integers $a_i$ and $b_i$, where $1 \leq a_i,b_i \leq n$, describing the $i$th proposal. It is guaranteed that no proposal will ever call for a state to merge with itself, meaning that at the time when you receive the $i$th proposal, $a_i$ and $b_i$ are guaranteed to belong to different states.</li>
</ul>

### 출력

<p>Output $q$ lines, where the $i$th line should be &quot;<code>REFUSE</code>&quot; if the $i$th proposal should be refused, or &quot;<code>APPROVE</code>&quot; if the $i$th proposal should be approved.</p>