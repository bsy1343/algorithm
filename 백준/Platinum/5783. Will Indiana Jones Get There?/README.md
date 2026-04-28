# [Platinum V] Will Indiana Jones Get There? - 5783

[문제 링크](https://www.acmicpc.net/problem/5783)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 6, 맞힌 사람: 4, 정답 비율: 12.121%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>Indiana Jones is in a deserted city, annihilated during a war. Roofs of all houses have been destroyed and only portions of walls are still standing. The ground is so full of mines that the only safe way to move around the city is walking over the remaining walls. The mission of our hero is to save a person who is trapped in the city. In order to move between two walls which are not connected Indiana Jones thought of taking with him a wooden board which he could place between the two walls and then cross from one to the other.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5783.%E2%80%85Will%E2%80%85Indiana%E2%80%85Jones%E2%80%85Get%E2%80%85There%3F/959701f0.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/5783/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%205.19.48.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:170px; width:308px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5783.%E2%80%85Will%E2%80%85Indiana%E2%80%85Jones%E2%80%85Get%E2%80%85There%3F/959701f0.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/5783/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%205.19.48.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:170px; width:308px" /></p>

<p>Fig. 1:City map with route used by Indiana Jones</p>

<p>Initial positions of Indiana Jones and the trapped person are both on some section of the walls. Besides, walls are either in the direction South-North or West-East.</p>

<p>You will be given a map of the city remains. Your mission is to determine the minimum length of the wooden board Indiana Jones needs to carry in order to get to the trapped person.</p>

### 입력

<p>Your program should process several test cases. Each test case starts with an integer N indicating the number of wall sections remaining in the city (2 &le; N &le; 1000). Each of the next N lines describes a wall section. The first wall section to appear is the section where Indiana Jones stands at the beginning. The second section to appear is the section where the trapped person stands. Each wall section description consists of three integers X, Y and L (&ndash;10000 &le; X, Y, L &le; 10000), where X an Y define either the southernmost point of a wall section (for South-North sections) or the westernmost point (for West-East wall sections). The value of L determines the length and direction of the wall: if L &ge; 0, the section is West-East, with length L; if L &lt; 0, the section is North-South, with length | L |. The end of input is indicated by N = 0.</p>

<p>&nbsp;</p>

### 출력

<p>For each test case in the input your program should produce one line of output, containing a real value representing the length of the wooden board Indiana Jones must carry. The length must be printed as a real number with two-digit precision, and the last decimal digit must be rounded. The input will not contain test cases where differences in rounding are significant.</p>

<p>&nbsp;</p>