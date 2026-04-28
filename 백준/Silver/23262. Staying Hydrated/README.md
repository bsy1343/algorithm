# [Silver I] Staying Hydrated - 23262

[문제 링크](https://www.acmicpc.net/problem/23262)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 52, 정답: 37, 맞힌 사람: 29, 정답 비율: 67.442%

### 분류

그리디 알고리즘, 정렬, 삼분 탐색

### 문제 설명

<p>With online classes in full swing, it is important for Grace to take breaks and keep herself hydrated at all times. She has decided to place a water bottle in her room in the most convenient place. This means that the position of this water bottle should be close to all the places in the room where she generally hangs out like the study desk, bed and coffee table among other places.</p>

<p>The room is represented in the form of a coordinate plane. The number of steps Grace needs to go from Point A to Point B is equal to the Manhattan distance between the 2 points. This means, Grace can only walk parallel to the axes of the coordinate plane and with each step, she can move one unit in either of the four directions.</p>

<p>Can you help her find a position in the room to keep the bottle, such that the sum of steps from the bottle to all her favourite furniture pieces will be minimum?</p>

<p>Notes:</p>

<ul>
	<li>All the furniture (like study desk, bed, or coffee table) can be represented as rectangles of non-zero area in the plane with edges parallel to the axes.</li>
	<li>It is possible for furniture pieces to overlap, as she likes to work on her bed-table too.</li>
	<li>Assume that Grace can simply pass through the furniture while walking and does not need to go around them.</li>
</ul>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$&nbsp;test cases follow.</p>

<p>The first line of each test case contains an integer&nbsp;$K$&nbsp;which represents the number of objects in Grace&#39;s room.</p>

<p>$K$&nbsp;lines follow, each of them describing one object. The&nbsp;$i$-th line contains four integers,&nbsp;$x_{i,1}$,&nbsp;$y_{i,1}$,&nbsp;$x_{i,2}$,&nbsp;$y_{i,2}$, where ($x_{i,1}$,&nbsp;$y_{i,1}$) represents coordinates of the bottom left corner and ($x_{i,2}$,&nbsp;$y_{i,2}$) represents coordinates of the top right corner of the $i$-th rectangular object.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #i:&nbsp;x y</code>, where $i$&nbsp;is the test case number (starting from 1) and&nbsp;$x$&nbsp;and&nbsp;$y$&nbsp;are coordinates of the water bottle such that the sum of steps from these coordinates to all the furniture pieces will be minimum.</p>

<p>Note, the bottle can lie on the floor or on top of any furniture but should be placed on integer coordinates only.</p>

<p>If multiple solutions exist, output the one with minimum x coordinate, if multiple solutions have the same x coordinate output the one with minimum y coordinate.</p>

### 제한

<ul>
	<li>$1 \le T \le 100$.</li>
	<li>$x_{i,1} &lt; x_{i,2}$, for all $i$.</li>
	<li>$y_{i,1} &lt; y_{i,2}$, for all $i$..</li>
</ul>