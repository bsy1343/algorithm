# [Silver II] Amsterdam Distance - 15003

[문제 링크](https://www.acmicpc.net/problem/15003)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 166, 정답: 118, 맞힌 사람: 106, 정답 비율: 72.603%

### 분류

브루트포스 알고리즘, 기하학

### 문제 설명

<p>Your friend from Manhattan is visiting you in Amsterdam. Because she can only stay for a short while, she wants to see as many tourist attractions in Amsterdam in as little time as possible. To do that, she needs to be able to figure out how long it takes her to walk from one landmark to another. In her hometown, that is easy: to walk from point m = (m<sub>x</sub>, m<sub>y</sub>) to point n = (n<sub>x</sub>, n<sub>y</sub>) in Manhattan you need to walk a distance</p>

<p style="text-align: center;">|n<sub>x</sub> &minus; m<sub>x</sub>| + |n<sub>y</sub> &minus; m<sub>y</sub>|,</p>

<p>since Manhattan looks like a rectangular grid of city blocks. However, Amsterdam is not well approximated by a rectangular grid. Therefore, you have taken it upon yourself to figure out the shortest distances between attractions in Amsterdam. With its canals, Amsterdam looks much more like a half-disc, with streets radiating at regular angles from the center, and with canals running the arc of the circle at equally spaced intervals. A street corner is given by the intersection of a circular canal and a street which radiates from the city center.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/15003.%E2%80%85Amsterdam%E2%80%85Distance/390d7229.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15003/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:239px; width:421px" /></p>

<p style="text-align: center;">Figure 1: The first sample input.</p>

<p>Depending on how accurately you want to model the street plan of Amsterdam, you can split the city into more or fewer half rings, and into more or fewer segments. Also, to avoid conversion problems, you want your program to work with any unit, given as the radius of the half circle. Can you help your friend by writing a program which computes the distance between any two street corners in Amsterdam, for a particular approximation?</p>

### 입력

<p>The input consists of</p>

<ul>
	<li>One line with two integers M, N and a floating point number R.
	<ul>
		<li>1 &le; M &le; 100 is the number of segments (or &lsquo;pie slices&rsquo;) the model of the city is split into.</li>
		<li>1 &le; N &le; 100 is the number of half rings the model of the city is split into.</li>
		<li>1 &le; R &le; 1000 is the radius of the city.</li>
	</ul>
	</li>
	<li>One line with four integers, a<sub>x</sub>, a<sub>y</sub>, b<sub>x</sub>, b<sub>y</sub>, with 0 &le; a<sub>x</sub>, b<sub>x</sub> &le; M, and 0 &le; a<sub>y</sub>, b<sub>y</sub> &le; N, the coordinates of two corners in the model of Amsterdam.</li>
</ul>

### 출력

<p>Output a single line containing a single floating point number, the least distance needed to travel from point a to point b following only the streets in the model. The result should have an absolute or relative error of at most 10<sup>&minus;6</sup>.</p>