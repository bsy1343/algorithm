# [Platinum II] See the Sights on the Flights - 30820

[문제 링크](https://www.acmicpc.net/problem/30820)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

정렬, 기하학, 각도 정렬

### 문제 설명

<p>Dima is an architect. He is also a photographer. He spends his time on travelling around the world and making photos of cool buildings like Big Ben etc.</p>

<p>This time Dima went to Berland famous with its subway system. It consists of $n$ lines, each of which is represented with a line on the map of the city. For any two lines there is a subway station in their intersection point, those station entrances are considered to be the notable pieces of architecture. Dima decided to take a photo of them.</p>

<p>In order to take the panoramic photo, he is going to use a helicopter flight. Helicopter may use one of the $t$ routes. Each route is also represented with a line on the map of the city. Dima is able to make a photo from an arbitrary point of the route, though the smaller distance from his location to the station means the better photo and the larger number of likes he is going to receive in social networks. That&#39;s why Dima needs your help.</p>

<p>You are given $n$ descriptions of the subway lines and $t$ lines defining the helicopter routes. For each of the helicopter routes Dima asks you to find the distance to the closest subway station.</p>

<p>It is guaranteed that no two subway lines coincide, any two subway lines have a common point, any two routes have a common point and each route has exactly one common point with each subway line.</p>

### 입력

<p>In the first line of the input there are two integers $n$, $t$ ($2 \le n \le 100\,000$, $1 \le t \le 20$) --- the number of subway lines and the number of helicopter routes, respectively.</p>

<p>In each of the following $n$ lines there are three integers $a_i$, $b_i$ and $c_i$ ($|a_i|, |b_i| \le 10\,000$, $a_i^2+b_i^2&gt;0$, $|c_i| \le 10^8$) defining each of the subway lines. The corresponding line is defined by the equation $a_i\cdot x + b_i \cdot y + c_i = 0$.</p>

<p>In each of the following $t$ lines there are three integers $u_i$, $v_i$, $w_i$ ($|u_i|, |v_i| \le 10\,000$, $u_i^2+v_i^2 &gt; 0$, $|w_i| \le 10^8$) defining each of the helicopter routes. Similarly, each route is defined with the equation $u_i \cdot x + v_i \cdot y + w_i = 0$.</p>

### 출력

<p>For each route output the only real number --- the distance between $i$-th helicopter route and its most closest subway station. Your answer will be considered correct if the absolute or relative error between your answer and the answer of the jury doesn&#39;t exceed $10^{-9}$. Namely, $\frac{|p-j|}{\max(1,j)} \leq 10^{-9}$ where $p$ is your answer and $j$ is the answer of the jury.</p>

### 힌트

<p>The pictures for the samples are provided below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30820.%E2%80%85See%E2%80%85the%E2%80%85Sights%E2%80%85on%E2%80%85the%E2%80%85Flights/c0b6137e.png" data-original-src="https://upload.acmicpc.net/97a58815-e476-4499-bb93-5148e294af26/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 462px;" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30820.%E2%80%85See%E2%80%85the%E2%80%85Sights%E2%80%85on%E2%80%85the%E2%80%85Flights/933fa675.png" data-original-src="https://upload.acmicpc.net/a3d7b91e-e51b-4627-b71f-77381bf59879/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 461px; width: 500px;" /></p>