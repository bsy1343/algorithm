# [Gold III] Space Elevator - 27006

[문제 링크](https://www.acmicpc.net/problem/27006)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 16, 맞힌 사람: 16, 정답 비율: 76.190%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 배낭 문제, 정렬

### 문제 설명

<p>The cows are going to space! They plan to achieve orbit by building a sort of space elevator: a giant tower of blocks. They have K (1 &le; K &le; 400) different types of blocks with which to build the tower. Each block of type i has height h_i (1 &le; h_i &le; 100) and is available in quantity c_i (1 &le; c_i &le; 10). Due to possible damage caused by cosmic rays, no part of a block of type i can exceed a maximum altitude a_i (1 &le; a_i &le; 40000).</p>

<p>Help the cows build the tallest space elevator possible by stacking blocks on top of each other according to the rules.</p>

### 입력

<ul>
	<li>Line 1: A single integer, K</li>
	<li>Lines 2..K+1: Each line contains three space-separated integers: h_i, a_i, and c_i. Line i+1 describes block type i.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer H, the maximum height of a tower that can be built</li>
</ul>

### 힌트

<p>From the bottom: 3 blocks of type 2, below 3 of type 1, below 6 of type 3. Stacking 4 blocks of type 2 and 3 of type 1 is not legal, since the top of the last type 1 block would exceed height 40.</p>