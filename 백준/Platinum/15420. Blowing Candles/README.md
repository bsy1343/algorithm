# [Platinum II] Blowing Candles - 15420

[문제 링크](https://www.acmicpc.net/problem/15420)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 813, 정답: 213, 맞힌 사람: 158, 정답 비율: 27.915%

### 분류

기하학, 볼록 껍질, 회전하는 캘리퍼스

### 문제 설명

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15420.%E2%80%85Blowing%E2%80%85Candles/25f1a86f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15420/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:268px; width:268px" /></p>

<p>As Jacques-&Eacute;douard really likes birthday cakes, he celebrates his birthday every hour, instead of every year. His friends ordered him a round cake from a famous pastry shop, and placed candles on its top surface. The number of candles equals the age of Jacques-&Eacute;douard in hours. As a result, there is a huge amount of candles burning on the top of the cake. Jacques-&Eacute;douard wants to blow all the candles out in one single breath.</p>

<p>You can think of the flames of the candles as being points in the same plane, all within a disk of radius R (in nanometers) centered at the origin. On that same plane, the air blown by Jacques-&Eacute;douard follows a trajectory that can be described by a straight strip of width W, which comprises the area between two parallel lines at distance W, the lines themselves being included in that area. What is the minimum width W such that Jacques-&Eacute;douard can blow all the candles out if he chooses the best orientation to blow?</p>

### 입력

<p>The first line consists of the integers N and R, separated with a space, where N is Jacques-&Eacute;douard&rsquo;s age in hours. Then N lines follow, each of them consisting of the two integer coordinates xi and yi of the ith candle in nanometers, separated with a space.</p>

<p>Limits</p>

<ul>
	<li>3 &le; N &le; 2 &middot; 10<sup>5</sup>;</li>
	<li>10 &le; R &le; 2 &middot; 10<sup>8</sup>;</li>
	<li>for 1 &le; i &le; N, x<sub>i</sub><sup>2</sup> + y<sub>i</sub><sup>2</sup> &le; R<sup>2</sup>;</li>
	<li>all points have distinct coordinates.</li>
</ul>

### 출력

<p>Print the value W as a floating point number. An additive or multiplicative error of 10<sup>&minus;5</sup> is tolerated: if y is the answer, any number either within [y &minus; 10<sup>&minus;5</sup> ; y + 10<sup>&minus;5</sup>] or within [(1 &minus; 10<sup>&minus;5</sup>)y;(1 + 10<sup>&minus;5</sup>)y] is accepted.</p>