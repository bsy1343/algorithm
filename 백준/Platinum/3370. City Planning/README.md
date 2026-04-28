# [Platinum III] City Planning - 3370

[문제 링크](https://www.acmicpc.net/problem/3370)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 38, 정답: 11, 맞힌 사람: 9, 정답 비율: 30.000%

### 분류

수학, 이분 탐색

### 문제 설명

<p>A space station is being built on a planet. The station will employ N persons. They have to live somewhere, and for that, a city will be built around the station. The land surrounding the station is divided into equal-sized square lots, and an apartment building with up to K floors may be built on each lot. Each building shall have exactly one apartment on each floor, and each person shall live in a separate apartment. The lots are assigned coordinates in the form (x, y), where the space station has coordinates (0, 0) and the rest of the lots are numbered as shown below:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3370.%E2%80%85City%E2%80%85Planning/a2f89d4c.png" data-original-src="https://upload.acmicpc.net/718d1b32-b619-45ed-a142-4a85c513a29f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 294px; height: 293px;" /></p>

<p>As the traffic can only flow on streets between the lots, the distance of the lot (x, y) from the space station is |x| + |y| &ndash; 1 units.</p>

<p>The cost of building a house is equal to the sum of the costs of each floor. It is known that the cost to build a floor depends on the height of the floor, but not on the location of the building.</p>

<p>The houses to be built will last for 30 years. People living in those houses will go to work in the space station, and to transport them to and from the station during these 30 years will cost T&middot;d per person, where d is the distance of the person&rsquo;s building from the station.</p>

<p>We can assume that the planet is big enough and the city to be built occupies a small enough portion of the surface that we do not need to consider the curvature of the planet&rsquo;s surface.</p>

<p>Your task is to write a program that determines the minimal total cost of building the houses and operating the transportation system for the 30 years.</p>

### 입력

<p>The first line of the input file contains the integers N (1 &le; N &le; 1 000 000 000 000), T (1 &le; T &le; 500 000), and K (1 &le; K &le; 20 000). The following K lines specify the costs of building the apartments on each floor. The (i + 1)-th line contains the integer c<sub>i</sub> (1 &le; c<sub>i</sub> &le; 2 000 000 000), the cost of building an apartment on the i-th floor (assuming all the i &minus; 1 floors below have already been built). It is known that building a higher floor is always more expensive than building a lower floor: c<sub>1</sub> &lt; c<sub>2</sub> &lt; &hellip; &lt; c<sub>K</sub>.</p>

### 출력

<p>The first and only line of the output file should contain a single integer &mdash; the total cost to build the city and to operate the transportation system for 30 years. It may be assumed that the answer will not exceed 8&middot;1018 (that is, it will fit into a 64-bit signed integer).</p>