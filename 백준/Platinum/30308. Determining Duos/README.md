# [Platinum III] Determining Duos - 30308

[문제 링크](https://www.acmicpc.net/problem/30308)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 75, 정답: 36, 맞힌 사람: 28, 정답 비율: 52.830%

### 분류

수학

### 문제 설명

<p>As a coach of $2n$ students, you are making $n$ duos (teams of two) for the upcoming programming contest season. After the duos have been created, they will participate in $r$ contests, each about a different topic: DP, graphs, geometry, etc. You already ran a set of internal selection contests to rank the students, and from this you were able to rank all the students with a unique integer score between $1$ and $2n$ inclusive for each topic, with $2n$ being the best.</p>

<p>When a duo participates in a contest on a given topic, their score will be the maximum of the two scores of the two students for this topic.</p>

<p>You think it would be amazing if summed up over all duos and contests, your students could achieve a total score of at least $\frac 12 rn(3n+1)$. Is this possible?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers \(n\) and \(r\) (\(1 \leq n \leq 4000\), \(1 \leq r \leq 100\)), the number of duos and the number of topics.</li>
	<li>\(r\) lines, the \(i\)th of which contains \(2n\) integers \(x_{i,1}, \ldots, x_{i,2n}\) (\(1 \leq x_{i,j} \leq 2n\) for each \(i, j\)) where \(x_{i,j}\) is the score of student \(j\) on topic \(i\).</li>
</ul>

### 출력

<p>If it is possible to make duos such that the total score over all duos and contests is at least $\frac 12 rn(3n+1)$, output &quot;<code>possible</code>&quot;. Otherwise, output &quot;<code>impossible</code>&quot;.</p>