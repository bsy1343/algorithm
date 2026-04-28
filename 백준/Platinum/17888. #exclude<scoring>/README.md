# [Platinum II] #exclude<scoring> - 17888

[문제 링크](https://www.acmicpc.net/problem/17888)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

이분 탐색, 다이나믹 프로그래밍, 누적 합, 정렬

### 문제 설명

<p>You are participating in a programming contest cup. The cup consists of a series of programming contests, followed by a final at the end of the season for the 15 top ranked contestants in the cup. With only one contest left to go before the final, you are starting to wonder if your performance in the earlier contests has been good enough to already secure you a spot in the finals. If so, you could succumb to your laziness and skip the last contest.</p>

<p>The ranking of the cup works as follows. In each contest, a contestant earns some number of points between 0 and 101 (the details of this are described below). Their aggregate score is then defined to be the sum of the four highest scores achieved. For instance if a contestant got 45, 15, 32, 0, 30, and 20 points over 6 contests, their aggregate score is 45 + 32 + 30 + 20 = 127. The rank of a contestant X in the cup is defined to be 1 plus the number of contestants that have a strictly larger aggregate score than X.</p>

<p>The score a contestant earns from a contest is based on the rank they achieve in that contest, according to the following table.</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th style="text-align: center;">Rank</th>
			<th style="text-align: center;">Points</th>
			<th style="text-align: center;">Rank</th>
			<th style="text-align: center;">Points</th>
			<th style="text-align: center;">Rank</th>
			<th style="text-align: center;">Points</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">100</td>
			<td style="text-align: center;">11</td>
			<td style="text-align: center;">24</td>
			<td style="text-align: center;">21</td>
			<td style="text-align: center;">10</td>
		</tr>
		<tr>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">75</td>
			<td style="text-align: center;">12</td>
			<td style="text-align: center;">22</td>
			<td style="text-align: center;">22</td>
			<td style="text-align: center;">9</td>
		</tr>
		<tr>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">60</td>
			<td style="text-align: center;">13</td>
			<td style="text-align: center;">20</td>
			<td style="text-align: center;">23</td>
			<td style="text-align: center;">8</td>
		</tr>
		<tr>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">50</td>
			<td style="text-align: center;">14</td>
			<td style="text-align: center;">18</td>
			<td style="text-align: center;">24</td>
			<td style="text-align: center;">7</td>
		</tr>
		<tr>
			<td style="text-align: center;">5</td>
			<td style="text-align: center;">45</td>
			<td style="text-align: center;">15</td>
			<td style="text-align: center;">16</td>
			<td style="text-align: center;">25</td>
			<td style="text-align: center;">6</td>
		</tr>
		<tr>
			<td style="text-align: center;">6</td>
			<td style="text-align: center;">40</td>
			<td style="text-align: center;">16</td>
			<td style="text-align: center;">15</td>
			<td style="text-align: center;">26</td>
			<td style="text-align: center;">5</td>
		</tr>
		<tr>
			<td style="text-align: center;">7</td>
			<td style="text-align: center;">36</td>
			<td style="text-align: center;">17</td>
			<td style="text-align: center;">14</td>
			<td style="text-align: center;">27</td>
			<td style="text-align: center;">4</td>
		</tr>
		<tr>
			<td style="text-align: center;">8</td>
			<td style="text-align: center;">32</td>
			<td style="text-align: center;">18</td>
			<td style="text-align: center;">13</td>
			<td style="text-align: center;">28</td>
			<td style="text-align: center;">3</td>
		</tr>
		<tr>
			<td style="text-align: center;">9</td>
			<td style="text-align: center;">29</td>
			<td style="text-align: center;">19</td>
			<td style="text-align: center;">12</td>
			<td style="text-align: center;">29</td>
			<td style="text-align: center;">2</td>
		</tr>
		<tr>
			<td style="text-align: center;">10</td>
			<td style="text-align: center;">26</td>
			<td style="text-align: center;">20</td>
			<td style="text-align: center;">11</td>
			<td style="text-align: center;">30</td>
			<td style="text-align: center;">1</td>
		</tr>
	</tbody>
</table>

<p>If a contestant gets a worse rank than 30, they get 0 points. If two or more contestants get the same rank in the contest, they are instead assigned the average points of all the corresponding ranks. This average is always rounded up to the closest integer. For example, if three contestants are tied for second place they all receive &lceil;(75+60+50)/3&rceil; = 62 points, and the next contestant will have rank 5 and receives 45 points (or less, if there is a tie also for 5&rsquo;th place). This applies also at rank 30, e.g., if 4 711 contestants are tied for 30&rsquo;th place, they all receive 1 point.</p>

<p>Contestants may participate in every contest either on-site or online. If they compete on-site, they get 1 extra point, no matter their original number of points. If a contestant does not participate in a contest, they get 0 points.</p>

### 입력

<p>The first line of input contains two integers n and m (2 &le; n &le; 10, 1 &le; m &le; 10<sup>5</sup>), where n is the number of contests in the cup (excluding the final), and m is the number of people who participated in any of the first n &minus; 1 contests.</p>

<p>Then follow m lines, each describing a contestant. Each such line consists of n &minus; 1 integers 0 &le; s<sub>1</sub>, . . . , s<sub>n&minus;1</sub> &le; 101, where s<sub>i</sub> is the score that this contestant received in the ith contest.</p>

<p>The first contestant listed is you. The point values in the input might not correspond to actual points from a contest.</p>

### 출력

<p>Output a single integer r, the worst possible rank you might end up in after the last contest, assuming you do not participate in it.</p>