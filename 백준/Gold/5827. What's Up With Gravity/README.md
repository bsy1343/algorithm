# [Gold II] What's Up With Gravity - 5827

[문제 링크](https://www.acmicpc.net/problem/5827)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 1531, 정답: 353, 맞힌 사람: 191, 정답 비율: 19.896%

### 분류

구현, 그래프 이론, 그래프 탐색, 시뮬레이션, 최단 경로, 데이크스트라, 격자 그래프, 0-1 너비 우선 탐색

### 문제 설명

<p>Captain Bovidian is on an adventure to rescue her crew member, Doctor Beefalo. Like all great adventures, this story plays out in a two dimensional N by M grid (1 &lt;= N, M &lt;= 500), representing a side view of the captain&#39;s world. Some grid cells are empty while others are blocked and cannot be traversed.</p>

<p>Unfortunately, Captain Bovidian cannot jump. She must obey the following rules of physics while traversing her world.</p>

<p>1) If there is no cell directly underneath Captain Bovidian (that is, if she is at the edge of the grid), then she flies out into space and fails her mission. 2) If the cell directly underneath Captain Bovidian is empty, then she falls into that cell. 3) Otherwise: a) Captain Bovidian may move left or right if the corresponding cell exists and is empty. b) Or, Captain Bovidian may flip the direction of gravity.</p>

<p>When Captain Bovidian changes the direction of gravity, the cell that&#39;s &#39;underneath&#39; her (as mentioned in rules 1 and 2) toggles between the cell with one higher row index and the cell with one lower row index (the first row in the input has index 1, and the last row has index N). Initially, the cells with one higher row index are underneath Captain Bovidian.</p>

<p>Doctor Beefalo is lost somewhere in this world. Help Captain Bovidian arrive at her cell using the least number of gravity flips as possible. If it is impossible to reach Doctor Beefalo, please output -1.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers N and M.</li>
	<li>Lines 2..1+N: Line i+1 describes the ith row of Captain Bovidian&#39;s world: &#39;.&#39; indicates an empty cell, &#39;#&#39; indicates a blocked cell, &#39;C&#39; indicates Captain Bovidian&#39;s starting position, and &#39;D&#39; indicates Doctor Beefalo&#39;s starting position.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer indicating the minimum number of times Captain Bovidian must flip gravity to reach Doctor Beefalo, or -1 if it is impossible to reach Doctor Beefalo.</li>
</ul>

### 힌트

<h4>Output Details</h4>

<p>The captain starts at position (4, 2). She flips gravity and falls to position (2, 2) and then moves right twice to arrive at (2, 4). She flips gravity again and falls to position (4, 4) and then moves right once to position (4, 5). Finally she flips gravity again to fall to Doctor Beefalo&#39;s position at (3, 5).</p>