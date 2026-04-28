# [Gold II] Awesome Arrowland Adventure - 17631

[문제 링크](https://www.acmicpc.net/problem/17631)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 41, 맞힌 사람: 38, 정답 비율: 76.000%

### 분류

너비 우선 탐색, 데이크스트라, 그래프 이론, 그래프 탐색, 최단 경로

### 문제 설명

<p>European Junior Olympiad in Informatics 2542 is held in Arrowland. Arrowland is shaped like a grid with <em>m</em> rows (numbered 0 through <em>m</em>-1) and <em>n</em> columns (numbered 0 through <em>n</em>-1), where each cell represents a city. Let (<em>r</em>, <em>c</em>) denote the cell in row <em>r</em> and column <em>c</em>. The contestants are accommodated in the cell (0, 0), and the competition hall is in the cell (<em>m</em>-1, <em>n</em>-1).</p>

<p>A strange tourist attraction of Arrowland is that some cities have giant arrows. Even stranger, these arrows can only be rotated clockwise by 90 degrees at a time. Each arrow initially points to either North, East, South, or West. Because of the host country&#39;s name, the EJOI organizers want to make use of the arrows.</p>

<p>The contestants will blindly follow the arrows, regardless of their current position. From each city, they simply move to the adjacent city pointed to by the arrow. If they enter a city with no arrow or if they leave Arrowland, they will just stay there and will never reach the competition hall. Since the EJOI organizers want the contestants to arrive to the hall from their accomodation (cell (0, 0)), they might have to rotate some arrows. Help them determine the minimum number of rotations required to achieve their goal, or tell them that the contestants cannot reach the hall, regardless of the arrows&#39; orientation.</p>

### 입력

<p>The first line contains two integers, <em>m</em> and <em>n</em>, denoting the number of rows and columns, respectively. The next <em>m</em> lines each contain <em>n</em> characters denoting the initial direction of the arrows (<code>N</code> &ndash; north, <code>E</code> &ndash; east, <code>S</code> &ndash; south, <code>W</code> &ndash; west, <code>X</code> &ndash; no arrow in this cell). The last character in the last row (i.e., the character corresponding to the competition hall) is guaranteed to be <code>X</code>.</p>

<p>In the input matrix, the directions North, East, South, and West have the same meaning as they do on a standard map. Therefore, the character <code>N</code> means &quot;upwards&quot;, <code>E</code> means &quot;to the right&quot;, <code>S</code> means &quot;downwards&quot;, and <code>W</code> means &quot;to the left&quot;.</p>

### 출력

<p>Output the minimum number of rotations that EJOI organizers have to perform. Output -1 if their task is impossible.</p>

### 제한

<ul>
	<li>1 &le; <em>m</em> &le; 500</li>
	<li>1 &le; <em>n</em> &le; 500</li>
	<li>Each cell contains one of these characters: <code>N</code>, <code>E</code>, <code>S</code>, <code>W</code>, <code>X</code>.</li>
</ul>