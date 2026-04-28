# [Platinum III] Friendship Graphs - 23569

[문제 링크](https://www.acmicpc.net/problem/23569)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 494, 정답: 211, 맞힌 사람: 180, 정답 비율: 48.518%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 배낭 문제, 이분 그래프

### 문제 설명

<p>Given a collection of people who interact, we can define a graph whose vertices are people, with an edge between two people if and only if they are friends with one another. Such graphs are called <em>social networks</em> and are well defined on any set of people, for example, the students in a college or the residents of a small town. An entire science analyzing social networks has sprung up in recent years, because many interesting aspects of people and their behavior are best understood as properties of this <em>friendship graph</em>.</p>

<p>Given a friendship graph where the vertices are the students in the Problem Solving class, your job is to write a program that decomposes the students in the class into two groups, $A$ and $B$, so that the following three conditions are satisfied simultaneously:</p>

<ul>
	<li>Each student in the class belongs to exactly one group, $A$ or $B$.</li>
	<li>Any two students in each group are friends with each other.</li>
	<li>The difference between the sizes of groups $A$ and $B$, denoted as $||A| - |B||$, is as small as possible.</li>
</ul>

<p>For example, suppose we are given a friendship graph shown in the figure below. Decomposing the students into $A = \{u_1, u_2, u_3, u_6\}$ and $B = \{u_4, u_5, u_7\}$ is not possible because $u_2$ and $u_6$ are not friends. On the other hand, in the decomposition into $A = \{u_1, u_2\}$ and $B = \{u_3, u_4, u_5, u_6, u_7\}$, any two students in each group are friends with each other; however, the size difference ($|2 - 5| = 3$) between the two groups is larger than the difference ($|3 - 4| = 1$) in the decomposition into $A = \{u_1, u_2, u_3\}$ and $B = \{u_4, u_5, u_6, u_7\}$. The last one is an optimal decomposition we want.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23569.%E2%80%85Friendship%E2%80%85Graphs/265e241f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/23569.%E2%80%85Friendship%E2%80%85Graphs/265e241f.png" data-original-src="https://upload.acmicpc.net/a74bd91c-648d-46ae-80f8-a1ea13567fa0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 255px; height: 125px;" /></p>

### 입력

<p>Your program is to read from standard input. The first line contains two integers $n$ and $m$, respectively indicating the numbers of vertices and edges of a friendship graph, in which we assume $2 &le; n &le; 1,000$ and $0 &le; m &le; \binom{n}{2}$. The vertices are indexed from $1$ to $n$. In the following $m$ lines, each line contains two integers $u$ and $v$ which represent an edge $(u, v)$ of the graph.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line that contains an integer. The integer should be the minimum of the size differences between two groups if the students can be decomposed into two groups satisfying the above three conditions; otherwise, the integer should be <code>-1</code>.</p>