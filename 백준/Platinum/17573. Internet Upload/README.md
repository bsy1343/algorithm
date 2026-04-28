# [Platinum II] Internet Upload - 17573

[문제 링크](https://www.acmicpc.net/problem/17573)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 58, 정답: 16, 맞힌 사람: 6, 정답 비율: 18.750%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>You made it! You tricked your way into the embassy and managed to copy the files your informant told you about. After a difficult escape, the authorities know what you&rsquo;ve done and sealed off the city. You need to upload the data to the internet before they catch you.</p>

<p>Luckily the city is full of coffee shops with free wifi and you researched their details before you started your heist. The only downside is that they have strange opening hours and you may need to move between them. When travelling between coffee shops you can&rsquo;t upload any data at all.</p>

<p>Given the list of coffee shops, their opening hours and Wifi speed, what is the earliest time when all of your data can been uploaded?</p>

### 입력

<ul>
	<li>The first line contains an integer d (1 &le; d &le; 10<sup>9</sup>), the size of the data in megabytes.</li>
	<li>The second line contains an integer n (1 &le; n &le; 100), the number of cafes.</li>
	<li>The next n lines each contain:
	<ul>
		<li>The integer opening and closing times of the cafe in seconds, o and c (0 &le; o &le; c &le; 24 &lowast; 60 &lowast; 60).</li>
		<li>The wifi speed of the cafe w (1 &le; c &le; 1000) in megabytes per second.</li>
	</ul>
	</li>
	<li>n lines, each with n integers, the time to travel to each cafe from the nth cafe, in seconds (0 &le; d<sub>i</sub> &le; 24 &lowast; 60 &lowast; 60).</li>
</ul>

<p>You may start in any single cafe when it opens and start using wifi the moment you arrive at a cafe.</p>

### 출력

<p>One line containing an integer number of seconds, the smallest integer time by which all of the data can be uploaded.</p>