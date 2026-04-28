# [Platinum II] Cloud Retainer's Game - 31183

[문제 링크](https://www.acmicpc.net/problem/31183)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 11, 맞힌 사람: 11, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Cloud Retainer, the builder of the Dwelling in the clouds above Qingyun Peak, is very interested in mechanics. Although there is more than one month away from the Lantern Rite Festival in Liyue, she has already started the design of a gaming event for it.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/45fb9984-7035-49f8-b35c-4e178a0d4d6f/-/preview/" style="width: 512px; height: 288px;" /></p>

<p style="text-align: center;">Cloud Retainer and the Traveler</p>

<p>The game is mainly about releasing pinballs to get a score as high as possible. It is played on the 2-dimensional plane with two horizontal straight lines $y = 0$ and $y = H$. Between the two lines, there are $n$ tiny wooden boards and $m$ coins, both can be regarded as single points. The $i$-th wooden board is located at $(x_i, y_i)$ while the $i$-th coin is located at $(x&#39;_i, y&#39;_i)$.</p>

<p>A pinball is released from $(10^{-9}, 10^{-9})$ by the player. Let $\overrightarrow{v} = (v_x, v_y)$ be the velocity of the ball (that is to say, if the ball is currently located at $(x, y)$ it will move to $(x + v_x\epsilon, y + v_y\epsilon)$ after $\epsilon$ seconds). Initially $\overrightarrow{v} = (1, 1)$.</p>

<p>When the ball hits a wooden board or one of the two horizontal straight lines, $v_y$ will be negated (that is, $v_y$ becomes $-v_y$) while $v_x$ remains unchanged. If the ball hits a coin, the player&#39;s score is increased by $1$ and the velocity of the ball remains unchanged.</p>

<p>To gain a higher score, the player can choose to remove any number of wooden boards before the pinball is released. It is also OK not to remove any wooden board. Cloud Retainer wants you to help her estimate the difficulty by computing the maximum score the player can get after $10^{10^{10^{10^{10}}}}$ seconds under the best strategy?</p>

### 입력

<p>There are multiple test cases. The first line of the input contains an integer $T$ indicating the number of test cases. For each test case:</p>

<p>The first line contains one integer $H$ ($2 \le H \le 10^9$).</p>

<p>The second line contains one integer $n$ ($1 \le n \le 10^5$) indicating the number of wooden boards.</p>

<p>For the following $n$ lines, the $i$-th line contains two integers $x_i$ and $y_i$ ($1 \le x_i \le 10^9$, $1 \le y_i &lt; H$) indicating a wooden board located at $(x_i, y_i)$.</p>

<p>The following line contains one integer $m$ ($1 \le m \le 10^5$) indicating the number of coins.</p>

<p>For the following $m$ lines, the $i$-th line contains two integers $x&#39;_i$ and $y&#39;_i$ ($1 \le x&#39;_i \le 10^9$, $1 \le y&#39;_i &lt; H$) indicating a coin located at $(x&#39;_i, y&#39;_i)$.</p>

<p>It&#39;s guaranteed that the given $(n + m)$ points in the same test case will be distinct. It&#39;s also guaranteed that neither the sum of $n$ nor the sum of $m$ of all test cases will exceed $5 \times 10^5$.</p>

### 출력

<p>For each test case output one line containing one integer indicating the maximum score the player can get after removing some (or not removing any) wooden boards.</p>

### 힌트

<p>The two sample test cases are shown below. Solid diamonds represent the remaining wooden boards, while hollow diamonds represent the removed wooden boards and round dots represent the coins.</p>

<table class="table table-bordered td-center td-middle">
	<tbody>
		<tr>
			<td><img alt="" src="https://upload.acmicpc.net/7620e1f8-4557-45c0-ba6d-69b9649ab7d6/-/preview/" style="width: 290px; height: 156px;" /></td>
			<td><img alt="" src="https://upload.acmicpc.net/3962f5c2-fd8d-419d-a35a-3df8ce53ce27/-/preview/" style="width: 360px; height: 125px;" /></td>
		</tr>
		<tr>
			<td>Sample test case No. 1</td>
			<td>Sample test case No. 2</td>
		</tr>
	</tbody>
</table>