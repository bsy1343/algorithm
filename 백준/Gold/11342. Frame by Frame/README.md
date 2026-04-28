# [Gold V] Frame by Frame - 11342

[문제 링크](https://www.acmicpc.net/problem/11342)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 55, 정답: 38, 맞힌 사람: 34, 정답 비율: 72.340%

### 분류

구현

### 문제 설명

<p>In this problem you will have to decide the final score of a game of bowling. A game of bowling has 10 frames. The tenth frame works in a slightly different way than the first 9.</p>

<p>For the first 9 frames, each will consist of 1 or 2 rolls. You will be presented with 10 pins. If you hit all 10 pins in the first roll you make a &ldquo;strike&rdquo;, and the frame is over. Otherwise you have a second roll to hit the remaining pins. If you hit all remaining pins you score a &ldquo;spare&rdquo;; otherwise you have an &ldquo;open frame&rdquo;. The number of points an open frame gives is simply the total number of pins you hit. A spare gives 10 points plus the number of pins hit on your next roll (in the next frame). A strike gives 10 points plus the number of pins hit on the next two rolls (in the next frame, or possibly the next two frames if you hit a strike in the next roll).</p>

<p>The last frame consists of 2 or 3 rolls. The way it works can be explained as:</p>

<ul>
	<li>10 pins are presented</li>
	<li>If you hit all 10 pins, you score a strike (10 points), and 10 pins are presented again:
	<ul>
		<li>If you hit all 10 pins again, you score a new strike, and 10 pins are presented again, for the last time.
		<ul>
			<li>If you hit 10 pins again, you score one more strike. (1)</li>
			<li>If you hit fewer than 10 pins, you score that number of pins. (2)</li>
		</ul>
		</li>
		<li>If you hit fewer than 10 pins, you score that number of points and the remaining pins are presented.
		<ul>
			<li>If you hit all remaining pins, you score a spare (10 points). (3)</li>
			<li>If you hit fewer than that, you score that many pins. (4)</li>
		</ul>
		</li>
	</ul>
	</li>
	<li>If you hit fewer than 10 pins on the first roll, the remaining pins are presented.
	<ul>
		<li>If you hit all remaining pins, you score a spare and 10 pins are presented again.
		<ul>
			<li>If you hit all 10 pins on the third roll, you score a strike. (5)</li>
			<li>If you hit fewer than 10 pins, you score as many points as pins hit. (6)</li>
		</ul>
		</li>
		<li>If you hit fewer than the remaining pins, you score the number of pins hit in both rolls. (7)</li>
	</ul>
	</li>
</ul>

<p>Note that the number of points in the last frame is the total number of pins hit in all rolls.</p>

<p>Your job is to compute the total score for a game of bowling given the scores for each of ten frames. A strike is represented by an &ldquo;X&rdquo;, a spare is represented by the number of pins hit in the first roll followed by a slash (&ldquo;/&rdquo;) and an open frame is represented by 2 numbers: the number of pins hit in each roll. Similarly, the tenth frame is represented either as: (1) &ldquo;X X X&rdquo;, or (2) &ldquo;X X a&rdquo;, or (3) &ldquo;X a /&rdquo; or (4) &ldquo;X a b&rdquo; or (5) &ldquo;a / X&rdquo; or (6) &ldquo;a / b&rdquo; or (7) &ldquo;a b&rdquo;, where a and b are numbers.</p>

### 입력

<p>Your program must read the notated scores for each of a set of games (preceded by the number of games) and compute the total scores. Note that the frames are not delimited in any way---it&rsquo;s your job to figure out if a frame has one, two, or three rolls.</p>

### 출력

<p>Print the total scores.</p>

### 힌트

<p>For the third input the game went like this:</p>

<table class="table table-bordered" style="width:40%">
	<thead>
		<tr>
			<th>Frame</th>
			<th>Notation</th>
			<th>Points</th>
			<th>Total</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td><code>8 1</code></td>
			<td>8 + 1 = 9</td>
			<td>9</td>
		</tr>
		<tr>
			<td>2</td>
			<td><code>X</code></td>
			<td>10 + 10 + 3 = 23</td>
			<td>32</td>
		</tr>
		<tr>
			<td>3</td>
			<td><code>X</code></td>
			<td>10 + 3 + 7 = 20</td>
			<td>52</td>
		</tr>
		<tr>
			<td>4</td>
			<td><code>3 /</code></td>
			<td>10 + 4 = 14</td>
			<td>66</td>
		</tr>
		<tr>
			<td>5</td>
			<td><code>4 5</code></td>
			<td>4 + 5 = 9</td>
			<td>75</td>
		</tr>
		<tr>
			<td>6</td>
			<td><code>1 /</code></td>
			<td>10 + 10 = 20</td>
			<td>95</td>
		</tr>
		<tr>
			<td>7</td>
			<td><code>X</code></td>
			<td>10 + 10 + 3 = 23</td>
			<td>118</td>
		</tr>
		<tr>
			<td>8</td>
			<td><code>X</code></td>
			<td>10 + 3 + 7 = 20</td>
			<td>138</td>
		</tr>
		<tr>
			<td>9</td>
			<td><code>3 /</code></td>
			<td>10 + 4 = 14</td>
			<td>152</td>
		</tr>
		<tr>
			<td>10</td>
			<td><code>4 / 8</code></td>
			<td>4 + 6 + 8 = 18</td>
			<td>170</td>
		</tr>
	</tbody>
</table>