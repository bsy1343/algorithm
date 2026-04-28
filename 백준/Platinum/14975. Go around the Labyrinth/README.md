# [Platinum I] Go around the Labyrinth - 14975

[문제 링크](https://www.acmicpc.net/problem/14975)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 15, 맞힌 사람: 12, 정답 비율: 32.432%

### 분류

이중 연결 요소, 그리디 알고리즘, 구현

### 문제 설명

<p>Explorer Taro got a floor plan of a labyrinth. The floor of this labyrinth is in the form of a two-dimensional grid. Each of the cells on the floor plan corresponds to a room and is indicated whether it can be entered or not. The labyrinth has only one entrance located at the northwest corner, which is upper left on the floor plan. There is a treasure chest in each of the rooms at other three corners, southwest, southeast, and northeast. To get a treasure chest, Taro must move onto the room where the treasure chest is placed.</p>

<p>Taro starts from the entrance room and repeats moving to one of the enterable adjacent rooms in the four directions, north, south, east, or west. He wants to collect all the three treasure chests and come back to the entrance room. A bad news for Taro is that, the labyrinth is quite dilapidated and even for its enterable rooms except for the entrance room, floors are so fragile that, once passed over, it will collapse and the room becomes not enterable. Determine whether it is possible to collect all the treasure chests and return to the entrance.</p>

### 입력

<p>The input consists of at most 100 datasets, each in the following format.</p>

<pre>
<em>N</em> <em>M</em>
<em>c</em><sub>1,1</sub>...<em>c</em><sub>1,<em>M</em></sub>
...
<em>c</em><sub><em>N</em>,1</sub>...<em>c</em><sub><em>N</em>,<em>M</em></sub>
</pre>

<p>The first line contains&nbsp;<em>N</em>, which is the number of rooms in the north-south direction, and&nbsp;<em>M</em>, which is the number of rooms in the east-west direction.&nbsp;<em>N</em>&nbsp;and&nbsp;<em>M</em>&nbsp;are integers satisfying 2 &le;&nbsp;<em>N</em>&nbsp;&le; 50 and 2 &le;&nbsp;<em>M</em>&nbsp;&le; 50. Each of the following&nbsp;<em>N</em>&nbsp;lines contains a string of length&nbsp;<em>M</em>. The&nbsp;<em>j</em>-th character&nbsp;<em>c</em><sub><em>i,j</em></sub>&nbsp;of the&nbsp;<em>i</em>-th string represents the state of the room (<em>i,j</em>),&nbsp;<em>i</em>-th from the northernmost and&nbsp;<em>j</em>-th from the westernmost; the character is the period (&#39;<code>.</code>&#39;) if the room is enterable and the number sign (&#39;<code>#</code>&#39;) if the room is not enterable. The entrance is located at (1,1), and the treasure chests are placed at (<em>N,</em>1), (<em>N,M</em>) and (1,<em>M</em>). All of these four rooms are enterable. Taro cannot go outside the given&nbsp;<em>N</em>&nbsp;&times;&nbsp;<em>M</em>&nbsp;rooms.</p>

<p>The end of the input is indicated by a line containing two zeros.</p>

### 출력

<p>For each dataset, output&nbsp;<code>YES</code>&nbsp;if it is possible to collect all the treasure chests and return to the entrance room, and otherwise, output&nbsp;<code>NO</code>&nbsp;in a single line.</p>