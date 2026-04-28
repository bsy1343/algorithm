# [Platinum V] Silver Lilypad Pond - 6226

[문제 링크](https://www.acmicpc.net/problem/6226)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 120, 정답: 49, 맞힌 사람: 43, 정답 비율: 43.000%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로, 데이크스트라

### 문제 설명

<p>FJ has installed a beautiful pond for his cows&#39; esthetic enjoyment and exercise. The rectangular pond has been partitioned into square cells of M rows and N columns (1 &lt;= M &lt;= 30; 1 &lt;= N &lt;= 30). Some of the cells have astonishingly sturdy lilypads; others have rocks; the remainder are just beautiful, cool, blue water.</p>

<p>Bessie is practicing her ballet moves by jumping from one lilypad to another and is currently located at one of the lilypads. She wants to travel to another lilypad in the pond by jumping from one lilypad to another.</p>

<p>Surprising only to the uninitiated, Bessie&#39;s jumps between lilypads always appear as a chess-knight&#39;s move: one move in one direction and then two more in the orthogonal direction (or perhaps two in one direction and then one in the orthogonal direction).</p>

<p>Farmer John is observing Bessie&#39;s ballet drill and realizes that sometimes she might not be able to jump to her destination lilypad because intermediary lilypads are missing.</p>

<p>Ever thrifty, he wants to place a minimum of additional lilypads so she can complete her quest (perhaps quickly; perhaps by using a large number of intermediate lilypads). Of course, lilypads cannot be placed where rocks are present.</p>

<p>Help Farmer John determine the minimum number of additional lilypads he has to place. Also determine the minimum number of jumps required to reach the destination when placing that minimum number of additional lilypads in some optimal location. Finally, determine the total number of unique ways Bessie can jump from the start to the end in the minimum number of jumps (after the smallest number of lily pads is placed in locations as needed, of course). The final number includes jumps using any of the possible ways the new lilypads are placed!</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: M and N</li>
	<li>Lines 2..M+1: Line i+1 describes row i of the pond using N space-separated integers with these values: 0 indicates empty water; 1 indicates a lilypad in place; 2 indicates rock in place; 3 indicates the lilypad Bessie starts on; 4 indicates the lilypad Bessie wants to travel to.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: One integer: the minimum number of additional lilypads required. If it is not possible to help Bessie jump to her destination, print -1.</li>
	<li>Line 2: One integer: the minimum number of jumps Bessie must make when placing the minimum number of additional lilypads. Do not output this line if line 1 contains -1.</li>
	<li>Line 3: One integer: the number of paths from start to end that uses the minimum number of additional pads and the minimum number of jumps calculated in line 2. Do not output this line if line 1 contains -1.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>Two lilypads are required as shown by the x&#39;s in each of the two instances below:</p>

<pre>
    0 0 0 1 0 0 0 0     0 0 0 1 0 0 0 0
    0 x 0 0 0 2 0 1     0 0 0 0 0 2 0 1
    0 0 0 0 x 4 0 0     0 0 x 0 x 4 0 0
    3 0 0 0 0 0 1 0     3 0 0 0 0 0 1 0</pre>

<p>Bessie must make at least 6 jumps to reach destination and there are two different paths of 6 jumps as shown below.</p>

<pre>
    0 0 0 C 0 0 0 0     0 0 0 C 0 0 0 0
    0 B 0 0 0 2 0 F     0 0 0 0 0 2 0 F
    0 0 0 0 D G 0 0     0 0 B 0 D G 0 0
    A 0 0 0 0 0 E 0     A 0 0 0 0 0 E 0</pre>