# [Platinum IV] Interplanetary - 17537

[문제 링크](https://www.acmicpc.net/problem/17537)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 12, 맞힌 사람: 10, 정답 비율: 40.000%

### 분류

플로이드–워셜, 그래프 이론, 최단 경로

### 문제 설명

<p>It is year 2306 and with the advancement of nanotechnology, interplanetary travel is becoming generally available. Bibika works at the largest interplanetary travel agency in the universe and receives interested clients every day.</p>

<p>Bibika customers are demanding and make several constraints before closing their travel itinerary, such as minimizing the total distance traveled. But the biggest constraints are on the temperatures of the planets visited on the route (excluding the source and destination planets). The temperature of a planet, measured in degrees Anidos, can range from 109 negative degrees Anidos to 109 positive degrees Anidos. Bibika&rsquo;s clients come from planets of varying climates and, consequently, have different temperature preferences: some worry about very cold planets and others about very hot planets. Bibika needs to plan the travel route so as to save its customers from any discomfort, even if the total length of the route is not as short as possible (or even there is no route: in which case Bibika simply informs customers that the trip is impossible).</p>

<p>Bibika provided you with the historical average temperature of each of the N planets and the R routes that connect pairs of planets directly (it is guaranteed that between two planets there is at most one direct route), along with their respective distances. She will also provide you with travel requests from Q customers. Each travel request consists of a source planet A, a destination planet B, and the customer&rsquo;s restriction on intermediate planet temperatures: each customer may require only planets with temperatures between the lowest K or the highest K temperatures among all N planets.</p>

<p>Your task is, for each travel request, to find the shortest possible distance given the restrictions described, or to say that such travel is impossible.</p>

### 입력

<p>The first line of input contains two integers N and R (2 &le; N &le; 400 and 0 &le; R &le; N &middot; (N &minus; 1)/2), which represent the number of known planets and number of direct routes between them. The first planet is represented by the number 1, the second by the number 2, . . ., up to N-th represented by the number N. The second line of input contains N integers T<sub>i</sub> (&minus;10<sup>9</sup> &le; T<sub>i</sub> &le; 10<sup>9</sup>), which represents the average temperature of each of the planets. Then there will be R lines, each with three integers X, Y and D (1 &le; X, Y &le; N where X 6= Y and 1 &le; D &le; 10<sup>3</sup>), which represents a direct route of length D between planets X and Y . Then there will be an integer Q (1 &le; Q &le; 10<sup>5</sup>), which represents the number of customer travel orders. Finally, each of the following Q lines will contain four integers A, B, K and T (1 &le; A, B, K &le; N with A &ne;&nbsp;B and T &isin; {0, 1}), which represents a customer who wants to go from planet A to planet B going only through planets with temperatures that are among the coldest K temperatures if T = 0 or the hottest K temperatures if T = 1.</p>

### 출력

<p>Your program must print one line per customer request, containing an integer representing the shortest total travel distance between the two planets given the client&rsquo;s restrictions, or &minus;1 if the trip is impossible.</p>