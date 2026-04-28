# [Gold V] Step Step Evolution - 13798

[문제 링크](https://www.acmicpc.net/problem/13798)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 16, 맞힌 사람: 13, 정답 비율: 76.471%

### 분류

다이나믹 프로그래밍, 구현, 시뮬레이션

### 문제 설명

<p>Japanese video game company has developed the music video game called Step Step Evolution. The gameplay of Step Step Evolution is very simple. Players stand on the dance platform, and step on panels on it according to a sequence of arrows shown in the front screen.</p>

<p>There are eight types of direction arrows in the Step Step Evolution: UP, UPPER RIGHT, RIGHT, LOWER RIGHT, DOWN, LOWER LEFT, LEFT, and UPPER LEFT. These direction arrows will scroll upward from the bottom of the screen. When the direction arrow overlaps the stationary arrow nearby the top, then the player must step on the corresponding arrow panel on the dance platform. The figure below shows how the dance platform looks like.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13798.%E2%80%85Step%E2%80%85Step%E2%80%85Evolution/443bceec.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13798.%E2%80%85Step%E2%80%85Step%E2%80%85Evolution/443bceec.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13798/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-26%20%EC%98%A4%ED%9B%84%206.26.56.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:251px; width:252px" /><br />
Figure 1: the dance platform for Step Step Evolution</p>

<p>In the game, you have to obey the following rule:</p>

<ul>
	<li>Except for the beginning of the play, you must not press the arrow panel which is not correspond to the edit data.</li>
	<li>The foot must stay upon the panel where it presses last time, and will not be moved until it&rsquo;s going to press the next arrow panel.</li>
	<li>The left foot must not step on the panel which locates at right to the panel on which the right foot rests. Conversely, the right foot must not step on the panel which locates at left to the panel on which the left foot rests.</li>
</ul>

<p>As for the third condition, the following figure shows the examples of the valid and invalid footsteps.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13798.%E2%80%85Step%E2%80%85Step%E2%80%85Evolution/9e47dbb7.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13798.%E2%80%85Step%E2%80%85Step%E2%80%85Evolution/9e47dbb7.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13798/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-26%20%EC%98%A4%ED%9B%84%206.28.11.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:170px; width:520px" /><br />
Figure 2: the examples of valid and invalid footsteps</p>

<p>The first one (left foot for LEFT, right foot for DOWN) and the second one (left foot for LOWER LEFT, right foot for UPPER LEFT) are valid footstep. The last one (left foot for RIGHT, right foot for DOWN) is invalid footstep.</p>

<p>Note that, at the beginning of the play, the left foot and right foot can be placed anywhere at the arrow panel. Also, you can start first step with left foot or right foot, whichever you want.</p>

<p>To play this game in a beautiful way, the play style called &ldquo; Natural footstep style&rdquo; is commonly known among talented players. &ldquo;Natural footstep style&rdquo; is the style in which players make steps by the left foot and the right foot in turn. However, when a sequence of arrows is difficult, players are sometimes forced to violate this style.</p>

<p>Now, your friend has created an edit data (the original sequence of direction arrows to be pushed) for you. You are interested in how many times you have to violate &ldquo;Natural footstep style&rdquo; when you optimally played with this edit data. In other words, what is the minimum number of times you have to step on two consecutive arrows using the same foot?</p>

### 입력

<p>The input consists of several detasets. Each dataset is specified by one line containing a sequence of direction arrows. Directions are described by numbers from 1 to 9, except for 5. The figure below shows the correspondence between numbers and directions.</p>

<p>You may assume that the length of the sequence is between 1 and 100000, inclusive. Also, arrows of the same direction won&rsquo;t appear consecutively in the line. The end of the input is indicated by a single &ldquo;#&rdquo;.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13798.%E2%80%85Step%E2%80%85Step%E2%80%85Evolution/635776cb.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13798.%E2%80%85Step%E2%80%85Step%E2%80%85Evolution/635776cb.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13798/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-26%20%EC%98%A4%ED%9B%84%206.29.12.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:250px; width:252px" /><br />
Figure 3: the correspondence of the numbers to the direction arrows</p>

### 출력

<p>For each dataset, output how many times you have to violate &ldquo;Natural footstep style&rdquo; when you play optimally in one line.</p>