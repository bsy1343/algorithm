# [Gold IV] Equator - 10274

[문제 링크](https://www.acmicpc.net/problem/10274)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 144, 정답: 73, 맞힌 사람: 62, 정답 비율: 51.667%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>In a galaxy far away, the planet Equator is under attack! The evil gang Galatic Criminal People Cooperation is planning robberies in Equator&rsquo;s cities. Your help is needed! In order to complete your training for becoming a lord of the dark side you should help them deciding which cities to rob. As the name says, the desert planet Equator only can be inhabited on its equator. So the gang lands there at some point and travels into some direction robbing all cities on their way until leaving the planet again.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10274.%E2%80%85Equator/5d147a3e.png" data-original-src="https://www.acmicpc.net/upload/images2/escape.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:203px; width:367px" /></p>

<p>But what is still open for them is to decide where to land, which direction to take, and when to leave. Maybe they shouldn&rsquo;t even enter the planet at all? They do not consider costs for traveling or for running their ship, those are peanuts compared to the money made by robbery!</p>

<p>The cities differ in value: some are richer, some are poorer, some have better safety functions. So the gang assigned expected profits or losses to the cities. Help them deciding where to begin and where to end their robbery to maximize the money in total when robbing every city in between.</p>

### 입력

<p>The input starts with the number of test cases T &le; 30. Each test case starts a new line containing the number of cities 1 &le; n &le; 1 000 000. In the same line n integers c<sub>i</sub> follow. Each c<sub>i</sub> (0 &le; i &lt; n, &minus;1000 &le; c<sub>i</sub> &le; +1000) describes the money obtained when robbing city i, a negative c<sub>i</sub> describes the amount of money they would lose.</p>

### 출력

<p>For each test case print one integer describing the maximum money they can make in total.</p>