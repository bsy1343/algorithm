# [Silver I] Mountain Bike Trail - 34433

[문제 링크](https://www.acmicpc.net/problem/34433)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 2048 MB

### 통계

제출: 25, 정답: 16, 맞힌 사람: 12, 정답 비율: 66.667%

### 분류

그리디 알고리즘, 자료 구조

### 문제 설명

<p>When riding on a singletrack mountain bike trail, the courtesy is for riders going downhill to yield to riders going uphill. Often, the uphill riders will let the downhill rider know about how many riders are behind them in their group so the downhill rider knows what to watch for. For example, if there are five riders in a group, the first one may say <em>"4 back"</em>, the second may say <em>"3 back"</em>, repeating this pattern until the last rider says <em>"just me."</em></p>

<p>You have been volunteering for the local mountain bike trail maintenance club and have been put in charge of collecting statistics on the <em>number of groups</em> riding up your favorite trail. To do so, you decided the most fun way would be to ride down the trail and use a tape recorder to record what everyone says as you let them by, and use a computer program to do the counting.</p>

<p>Due to the fact that some riders fall really far behind from their group, the groups may not be in order. Additionally, some members of the group may have gotten really tired and decided to wait at the bottom of the trail, so not every group will end with <em>"just me."</em></p>

### 입력

<p>The first line of input contains a single integer $N$ ($0 \le N \le 10^6$), indicating the number of riders you passed as you biked down the trail.</p>

<p>The next $N$ lines contain either:</p>

<ul>
	<li>The text "<code>just me</code>", indicating the rider was the last rider in a group.</li>
	<li>Or, an integer $m$ ($1 \le m &lt; 10^6$), indicating the number of riders in the same group who are behind the uphill rider, followed by the string "<code>back</code>".</li>
</ul>

<p>You may assume that all riders are completely knowledgeable of the current number of riders behind themselves in their group, and will always correctly answer the number of riders in their group behind themselves. Likewise, riders will never disappear on the trail. If a rider says "<code>4 back</code>" then the next rider in their group (if one is on the trail) will not say anything but "<code>3 back</code>".</p>

### 출력

<p>Output two integers on the same line, separated by a space. The first integer represents the minimum number of groups you may have seen on the trail, and the second integer represents the maximum number of groups you may have seen on the trail.</p>