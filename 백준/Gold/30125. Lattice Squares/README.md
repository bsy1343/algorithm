# [Gold III] Lattice Squares - 30125

[문제 링크](https://www.acmicpc.net/problem/30125)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

수학

### 문제 설명

<p>Count the number of distinct squares you can draw using only integer co-ordinates for its 4 corners with the following restrictions.</p>

<ul>
	<li>The x and y co-ordinate of each corner should be within the range <i>0</i> to <i>2*n</i> (range includes <i>0</i> and <i>2*n</i>).</li>
	<li>None of the corners should lie in the central <i>2*k</i> by <i>2*k</i> square. It means both x and y co-ordinates of the corners should not lie in the range <i>(n-k)</i> to <i>(n+k)</i> (range inclusive of both ends) at the same time.</li>
</ul>

<p>Two squares are distinct if and only if at least one of its corners is different.</p>

<p>Note that the edges can go through the central forbidden square. The only condition is that the corners itself should not lie in the central forbidden square.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30125.%E2%80%85Lattice%E2%80%85Squares/06589f97.png" data-original-src="https://upload.acmicpc.net/2cf83432-c1f1-4cb1-89e0-df807eaddd99/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>The above figure shows the case n = 2 and k = 1. In the figure the central 2 x 2 square is forbidden and the forbidden lattice points are marked with red. When drawing a square you cannot use these points (marked red) for any of the corners. You are allowed to use only the points marked with black. So the only allowed square you can draw is the 4 x 4 square. Hence the answer for this case is 1.</p>

### 입력

<p>The first line contains one integer <b>t</b>, the number of testcases. (1 &le; <b>t</b> &le; 50)</p>

<p>This will be followed by <b>t</b> test cases. Each case is specified in a separate line containing two space separated integers <b>n</b> and <b>k</b>.</p>

### 출력

<p>For each testcase print the number of distinct squares you can draw under the given constraints.</p>

### 제한

<ul>
	<li>The numbers <b>n</b> and <b>k</b> will be between 1 and 500.</li>
	<li><b>k</b> will be strictly less than <b>n</b> (<b>k</b>&lt;<b>n</b>).</li>
</ul>