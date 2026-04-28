# [Gold II] Bridge Removal - 10237

[문제 링크](https://www.acmicpc.net/problem/10237)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>ICPC islands once had been a popular tourist destination. For nature preservation, however, the government decided to prohibit entrance to the islands, and to remove all the man-made structures there. The hardest part of the project is to remove all the bridges connecting the islands.</p>

<p>There are <i>n</i> islands and <i>n</i>-1 bridges. The bridges are built so that all the islands are reachable from all the other islands by crossing one or more bridges. The bridge removal team can choose any island as the starting point, and can repeat either of the following steps.</p>

<ul>
	<li>Move to another island by crossing a bridge that is connected to the current island.</li>
	<li>Remove one bridge that is connected to the current island, and stay at the same island after the removal.</li>
</ul>

<p>Of course, a bridge, once removed, cannot be crossed in either direction. Crossing or removing a bridge both takes time proportional to the length of the bridge. Your task is to compute the shortest time necessary for removing all the bridges. Note that the island where the team starts can differ from where the team finishes the work.</p>

### 입력

<p>The input consists of at most 100 datasets. Each dataset is formatted as follows.</p>

<blockquote>
<p><i>n</i></p>

<p><i>p</i><sub>2</sub> <i>p</i><sub>3</sub> ... <i>p<sub>n</sub></i></p>

<p><i>d</i><sub>2</sub> <i>d</i><sub>3</sub> ... <i>d<sub>n</sub></i></p>
</blockquote>

<p>The first integer <i>n</i> (3 &le; <i>n</i> &le; 800) is the number of the islands. The islands are numbered from 1 to <i>n</i>. The second line contains <i>n</i>-1 island numbers <i>p<sub>i</sub></i> (1 &le; <i>p<sub>i</sub></i> &lt; <i>i</i>), and tells that for each <i>i</i> from 2 to <i>n</i> the island <i>i</i> and the island <i>p<sub>i</sub></i> are connected by a bridge. The third line contains <i>n</i>-1 integers <i>d<sub>i</sub></i> (1 &le; <i>d<sub>i</sub></i> &le; 100,000) each denoting the length of the corresponding bridge. That is, the length of the bridge connecting the island <i>i</i> and <i>p<sub>i</sub></i> is <i>d<sub>i</sub></i>. It takes <i>d<sub>i</sub></i> units of time to cross the bridge, and also the same units of time to remove it. Note that, with this input format, it is assured that all the islands are reachable each other by crossing one or more bridges.</p>

<p>The input ends with a line with a single zero.</p>

### 출력

<p>For each dataset, print the minimum time units required to remove all the bridges in a single line. Each line should not have any character other than this number.</p>