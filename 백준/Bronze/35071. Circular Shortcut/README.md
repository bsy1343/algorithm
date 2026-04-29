# [Bronze II] Circular Shortcut - 35071

[문제 링크](https://www.acmicpc.net/problem/35071)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 123, 정답: 101, 맞힌 사람: 79, 정답 비율: 88.764%

### 분류

기하학, 사칙연산, 수학

### 문제 설명

<p>After the practice session, Katrin and her team join the guided city tour of Karlsruhe, where they learn all sorts of random fun facts about Karlsruhe. It is well-known that the first email in Germany was received here (sent by Laura Breeden, MIT) and that the bicycle was invented in Karlsruhe, but did you know that the palace has exactly 365 windows -- one for each day of the year? Or that there may (or may not) be an umbrella buried beneath the great pyramid in the city centre?</p>

<p>Later that evening, Katrin and her team find themselves in the western part of Karlsruhe, and they have to hurry to the Dining Hall to make it in time for dinner! They could take the direct route through the palace garden, which is a straight line. But on such a pleasant evening, the palace garden is crowded with pedestrians and cyclists who might slow them down. The alternative is to follow the <em>Adenauerring</em>, a street forming a perfect half-circle between their current location and the intersection close to the Dining Hall, and nothing will slow them down there.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/35071.%E2%80%85Circular%E2%80%85Shortcut/72194d88.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35071-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 269px;"></p>

<p style="text-align: center;"><small>Map data from <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a></small></p>

<p style="text-align: center;">Figure C.1: The two possible paths from their current location to the intersection close to the Dining Hall. The blue semi-circular road is the Adenauerring, and the orange straight path in the middle is the route through the palace garden.</p>

<p>Katrin and her team have arranged to meet up with their coach on the intersection close to the Dining Hall, as shown in Figure C.1. They would like to know: how much longer is the route along the Adenauerring?</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $d$ ($1\leq d\leq 10^9$), the length of the straight way through the palace garden, in metres.</li>
</ul>

### 출력

<p>Output how much longer the route along the Adenauerring is, compared to going straight through the palace garden, in metres.</p>

<p>Your answer should have an absolute or relative error of at most $10^{-9}$.</p>