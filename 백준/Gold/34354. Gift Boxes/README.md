# [Gold III] Gift Boxes - 34354

[문제 링크](https://www.acmicpc.net/problem/34354)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 21, 정답: 10, 맞힌 사람: 10, 정답 비율: 58.824%

### 분류

두 포인터

### 문제 설명

<p>This year's EGOI is organized in Bonn. The organizers want to distribute at most one gift box to every team in the contest, with each team represented by a number from $0$ to $T-1$. The contestants are standing in a single row. However they are mixed up such that people from the same team might not be standing next to each other. Note that there will be at least one team with more than one person in the row. There are $N$ people in the row. Person $i$ is part of the team $a_i$. The problem is: each team should only receive a maximum of one gift box. In order to ensure the process runs smoothly - and willing to leave some teams with no gift as a consequence - the organisers wish to pause the gifting process exactly once, skipping a few contestants before resuming the gift box handouts. In other words, they will skip one consecutive segment $[\ell, r]$ of the contestants.</p>

<p>It is not necessary that every team receives a gift. Nevertheless, the organizers want to maximize the number of teams that will receive their gifts while ensuring that no team ends up with two or more gifts, equivalent to minimizing the number of contestants that are skipped under this condition. Please help the organizers to decide when it is best to pause and when to continue distributing gifts such that as few contestants as possible are skipped.</p>

### 입력

<p>The first line of input contains two integers, $T$ and $N$ -- the number of teams and the number of contestants in the row.</p>

<p>The second line contains $N$ integers, $a_i$, where the $i$th integer describes which team the person at position $i$ in the row belongs to. It is guaranteed that every integer between $0$ and $T-1$ appears at least once.</p>

### 출력

<p>Output two integers, $\ell$ and $r$, where $\ell$ is the index of the first person that is skipped and $r$ is the index of the last skipped person. Note that $\ell$ and $r$ are indexed from $0$ to $N-1$. If there is more than one solution, print any one of them.</p>

### 제한

<ul>
	<li>$1 \leq T &lt; N \leq 500\,000$.</li>
	<li>$0 \leq a_i \leq T-1$.</li>
</ul>