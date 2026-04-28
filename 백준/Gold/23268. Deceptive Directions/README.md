# [Gold II] Deceptive Directions - 23268

[문제 링크](https://www.acmicpc.net/problem/23268)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 116, 정답: 47, 맞힌 사람: 45, 정답 비율: 48.913%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>You find yourself on a remote island, searching for a legendary lost treasure. &nbsp;However, despite having gotten your hands on directions leading straight to the treasure, you have a problem. &nbsp;It turns out you have a saboteur in your expedition, and that at some point they edited the precious directions so they might no longer lead to the treasure.</p>

<p>The island can be viewed as a rectangular grid, and the instructions are a sequence of east/west/north/south steps to take in this grid, from a given starting position. &nbsp;These instructions lead straight to the treasure (but may involve walking around obstacles) in the sense that there is no shorter way of reaching the treasure. &nbsp;However, the saboteur has arbitrarily replaced each step of the instructions by a step in one of the other three directions. &nbsp;In other words, any &quot;west&quot; step has been replaced by &quot;east&quot;, &quot;north&quot; or &quot;south&quot;. &nbsp;This replacement has been done independently for each step, so one &quot;west&quot; may have been replaced by &quot;north&quot; and another by &quot;south&quot;, and so on.</p>

<p>Because of this sabotage, the instructions seem pretty useless. &nbsp;But maybe they can still be used to narrow down the search. &nbsp;Write a program to find all possible locations of the treasure.</p>

### 입력

<p>The first line of input consists of two integers $w$ and $h$ ($3 \le w, h \le 1000$), the width and height of the map. &nbsp;Then follow $h$ lines, each containing $w$ characters, describing the map. &nbsp;Each such character is either a &#39;<code>.</code>&#39; symbolizing a walkable space, &#39;<code>#</code>&#39; symbolizing an obstacle such as a body of water, dense forest, or a mountain, or &#39;<code>S</code>&#39; symbolizing the starting point of the directions.</p>

<p>Finally, there is a line containing a string $I$ ($1 \le |I| \le 10^5$) consisting only of the characters &#39;<code>NWSE</code>&#39;, giving the faulty instruction sequence.</p>

<p>The map has exactly one &#39;<code>S</code>&#39; and its boundary consists only of obstacle cells. &nbsp;The faulty instruction sequence is such that there is at least one possible location of the treasure.</p>

### 출력

<p>Output the map in the same format as the input (without the first line specifying the dimensions), with all possible locations of the treasure indicated by exclamation marks (&#39;<code>!</code>&#39;).</p>