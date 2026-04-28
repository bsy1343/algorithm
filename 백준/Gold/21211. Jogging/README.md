# [Gold III] Jogging - 21211

[문제 링크](https://www.acmicpc.net/problem/21211)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 60, 맞힌 사람: 53, 정답 비율: 86.885%

### 분류

애드 혹, 데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>Pheobe has heard that exercise has a tremendous affect on both physical and mental health. She never went jogging before, and she wants to try it out. However, she knows that she gets bored quickly and it is difficult for her to repeatedly do the same thing. In order to get into the habit of jogging, Pheobe decided to take up a challenge: she will go out for a run every evening as long as she finds an interesting path to take. For her, a path is interesting if it goes through a street where she did not run before. Pheobe asks for your help in understanding what is the maximum number of days she can run if she plans well.</p>

<p>Pheobe gives you as input a description of her neighborhood. She lives on an intersection, and she describes all of the intersections in the neighborhood. She also tells you which intersections are connected by streets, and what is the length of each street in meters. Every street connects two different intersections, and it is not possible that two different streets connect the same two intersections. In addition, you may assume that Pheobe only describes streets that can be reached from her home and that streets can be traversed in both directions as Phoebe is on foot.</p>

<p>A valid run starts and ends in Pheobe&#39;s home, and its length should be within the range that Pheobe specifies. When Pheobe enters a street, she does not have to go through the entire street (she is allowed to turn around at any point), but even if she does that, it counts as if she has seen the entire street for the purpose of determining whether runs are interesting. A run is considered interesting if it includes a street (or a segment of it) that did not appear on previous runs. Reaching an intersection does not count as visiting all streets adjacent to it.</p>

### 입력

<p>The input begins with one line containing four space-separated integers, $I$ $S$ $L$ $U$, in that order. $I$ represents the number of intersections in the neighborhood, and $S$ represents the number of streets. $L$ is the minimum number of meters in a valid run, and $U$ is the maximum number of meters in a valid run.</p>

<p>Then, follow $S$ lines, each line representing a street. Each such line contains $3$ space-separated integers, $i$ $j$ $\ell$, in that order. Integers $i$ and $j$ are the intersections that the street connects, and $\ell$ is the length of the street in meters. The intersections are numbered between $0$ and $I-1$ such that Pheobe lives in intersection number $0$.</p>

### 출력

<p>A single line containing a single integer holding the length of the longest sequence of interesting runs.</p>

### 제한

<ul>
	<li>$1 \le I \le 100\,000$</li>
	<li>$0 \le S \le 100\,000$</li>
	<li>$1 \le L \le U \le 42\,195$ (Pheobe will not run more than a marathon)</li>
	<li>$1 \le \ell \le 1\,000$</li>
</ul>