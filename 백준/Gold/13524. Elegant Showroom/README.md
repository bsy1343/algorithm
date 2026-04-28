# [Gold IV] Elegant Showroom - 13524

[문제 링크](https://www.acmicpc.net/problem/13524)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 67, 정답: 32, 맞힌 사람: 30, 정답 비율: 51.724%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>A car showroom is one of the few places where cars can be found indoors. Showrooms often&nbsp;have many cars, even above ground level! As cars are sold and new cars are bought in to sell,&nbsp;the cars must be moved carefully out of the showroom.</p>

<p>Clearly employees only wish to move cars if they have to. So, given a map of a showroom&nbsp;including its walls, doors and where the cars are, and the co-ordinates of the car to move, how&nbsp;many cars must be moved?</p>

<p>Cars can be rotated on the spot, but can only be moved through a completely empty space and&nbsp;not diagonally. Doors are always wide enough to move a car through.</p>

### 입력

<ul>
	<li>One line containing two integers R, C (3 &le; R, C &le; 400), the size of the showroom in rows and columns.</li>
	<li>Another R lines, each containing a string of C characters with the following meaning:
	<ul>
		<li>&rsquo;#&rsquo;: a wall;</li>
		<li>&rsquo;c&rsquo;: a car;</li>
		<li>&rsquo;D&rsquo;: a door in a wall.</li>
	</ul>
	</li>
	<li>The first and last lines must be walls or doors. The first and last characters in a row must be walls or doors.</li>
	<li>The next line will contain two integers r (1 &lt; r &lt; R), and c (1 &lt; c &lt; C), the co-ordinates of the car to move. 1, 1 is the top-left corner.</li>
</ul>

### 출력

<ul>
	<li>&nbsp;One line containing one integer: the smallest number of cars that need to be moved&nbsp;(including the car we are moving) to allow our desired car to leave the building.</li>
</ul>