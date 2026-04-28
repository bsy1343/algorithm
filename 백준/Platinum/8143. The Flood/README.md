# [Platinum II] The Flood - 8143

[문제 링크](https://www.acmicpc.net/problem/8143)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 45, 정답: 27, 맞힌 사람: 25, 정답 비율: 58.140%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 스위핑, 분리 집합, 격자 그래프

### 문제 설명

<p>Byteburg, the capital of Byteotia, is a picturesque city situated in a valley in the midst of mountains. Unfortunately, recent heavy rainfall has caused a flood - all the Byteburg is now completely under water. Byteasar, the king of Byteotia, has summoned his most enlightened advisors, including you, to a council. After long deliberations the council agreed to bring a few pumps, set them up in the flooded area and drain Byteburg. The king has asked you to determine the minimum number of pumps sufficing to drain the city.</p>

<p>You are provided with a map of the city and the valley it is situated in. The map is in the shape of a m x n rectangle, divided into unitary squares. For each such square the map tells its height above sea level and also whether it is a part of Byteburg or not. The whole area depicted in the map is under water. Furthermore, it is surrounded by much higher mountains, making the outflow of water impossible. Obviously, there is no need to drain the area that does not belong to Byteburg.</p>

<p>Each pump can be placed in any unitary square depicted in the map. The pump will be drawing the water until its square is completely drained. Of course, the communicating tubes principle makes its work, so draining one square results in lowering the water level or complete draining of those squares from which the water can flow down to the one with the pump. Water can flow only between squares with a common side (or, more exact, squares whose projections onto horizontal plane have a common side, since the squares may be at different level). Apart from that, the water obviously only flows down.</p>

<p>Write a programme that:</p>

<ul>
	<li>reads description of the map from the standard input,</li>
	<li>determines the minimum number of pumps needed to drain whole Byteburg,</li>
	<li>writes out the outcome to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there are two integers m and n, separated by a single space, 1 &le; n,m &le; 1,000. The following m lines contain the description of the map. The (i+1)&rsquo;th line describes the i&rsquo;th row of unitary squares in the map. It contains n integers x<sub>i.1</sub>, x<sub>i.2</sub>, &hellip;, x<sub>i.n</sub> separated by single spaces, -1,000 &le; x<sub>i.j</sub> &le; 1,000, x<sub>ij</sub>&nbsp;&ne; 0. The number x<sub>ij</sub>&nbsp;describes the j&rsquo;th square of the i&rsquo;th line. The ground level in this square is |x<sub>ij</sub>| above sea level. If x<sub>ij</sub> &gt; 0, then the square is part of Byteburg, otherwise it is outside the city. Notice, that the area of Byteburg need not be connected. In fact the city may have several separate parts.</p>

### 출력

<p>Your programme should write out one integer to the standard output - the minimum number of pumps needed to drain Byteburg.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8143.%E2%80%85The%E2%80%85Flood/92c91736.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8143.%E2%80%85The%E2%80%85Flood/92c91736.gif" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/8143/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:111px; width:165px" /></p>

<p>In the figure you can see the area of Byteburg and an exemplary setup of two pumps.</p>

<p>&nbsp;</p>