# [Platinum I] Hobson’s Trains - 17157

[문제 링크](https://www.acmicpc.net/problem/17157)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 112, 정답: 41, 맞힌 사람: 40, 정답 비율: 42.553%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 작은 집합에서 큰 집합으로 합치는 테크닉, 함수형 그래프

### 문제 설명

<p>Mr. Hobson has retired from running a stable and has invested in a more modern form of transport, trains. He has built a rail network with n stations. However, he has retained his commitment to free the passenger from the burden of too many choices: from each station, a passenger can catch a train to exactly one other station. Such a journey is referred to as a leg. Note that this is a one-way journey, and it might not be possible to get back again.</p>

<p>Hobson also offers exactly one choice of ticket, which allows a passenger to travel up to k legs in one trip. At the exit from each station is an automated ticket reader (only one, so that passengers do not need to decide which to use). The reader checks that the distance from the initial station to the final station does not exceed k legs.</p>

<p>Each ticket reader must be programmed with a list of valid starting stations, but the more memory this list needs, the more expensive the machine will be. Help Hobson by determining, for each station A, the number of stations (including A) from which a customer can reach A in at most k legs.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e7cf3b6d-d168-4e14-86f8-302447a4e3c6/-/preview/" style="width: 460px; height: 222px;" /></p>

<p style="text-align: center;">Figure H.1: Illustration of Sample Input 1. Each circle represents a station. The numbers outside the circles are the station numbers loaded into the ticket readers when k = 2.</p>

### 입력

<p>The first line of input contains two integers n and k, where n (2 &le; n &le; 5 &middot; 10<sup>5</sup>) is the number of stations and k (1 &le; k &le; n &minus; 1) is the maximum number of legs that may be traveled on a ticket. Then follow n lines, the i<sup>th</sup> of which contains an integer d<sub>i</sub> (1 &le; d<sub>i</sub> &le; n and d<sub>i</sub> &ne; i), the station which may be reached from station i in one leg.</p>

### 출력

<p>Output n lines, with the i<sup>th</sup> line containing the number of stations from which station i can be reached in at most k legs.</p>