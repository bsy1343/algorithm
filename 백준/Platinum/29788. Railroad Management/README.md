# [Platinum I] Railroad Management - 29788

[문제 링크](https://www.acmicpc.net/problem/29788)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 그리디 알고리즘, 트리

### 문제 설명

<p>You are in charge of the management of a railroad network. The network consists of $\mathbf{N}$ stations. Each station $i$ needs to ship goods to exactly one other station $\mathbf{D_i}$. Station $i$ will send exactly one shipment, in a train with exactly $\mathbf{C_i}$ railroad cars.</p>

<p>You get all the shipment information well in advance, so you plan on saving on railroad cars by reusing them. If station $i$ sends $n$ railroad cars to station $\mathbf{D_i}$, then $\mathbf{D_i}$ can add those railroad cars to its supply to use for its own shipment if it did not already happen.</p>

<p>Formally, you must give an initial supply of railroad cars to each station (some stations may get $0$) and provide an order for the shipments so that, by the time station $i$ must ship, the number of railroad cars between its initial supply and any <i>previous</i> shipments that arrived at $i$ must be at least the number it needs for its own shipment $\mathbf{C_i}$. You cannot send more than $\mathbf{C_i}$ cars in a shipment out of station $i$, even if the station has more than $\mathbf{C_i}$ available.</p>

<p>For example, suppose that station $1$ sends a train carrying exactly $3$ railroad cars to station $4$. Now, if station $4$ needs $2$ cars, it could reuse $2$ of the cars it received from station $1$. And if station $4$ needs to send $5$ cars, it can reuse all $3$ cars received from station $1$ and add $2$ of its own supply. Note that when station $4$ needs to send $2$ cars, it cannot send all $3$ it received from station $1$.</p>

<p>Given the shipment information, what is the minimum number of railroad cars you need to distribute for the stations&#39; initial supplies, such that you can do all shipments in some order?</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow. Each test case consists of $3$ lines. The first line contains a single integer $\mathbf{N}$, the number of stations in the network. The second line contains $\mathbf{N}$ integers $\mathbf{D_1}, \mathbf{D_2}, \dots, \mathbf{D_N}$ and the third and last line contains $\mathbf{N}$ integers $\mathbf{C_1}, \mathbf{C_2}, \dots, \mathbf{C_N}$. These represent that station $i$ must send a train of exactly $\mathbf{C_i}$ railroad cars to station $\mathbf{D_i}$.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the minimum number of railroad cars you need to distribute among the stations so that all shipments can be performed.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{D_i} \le \mathbf{N}$, for all $i$.</li>
	<li>$\mathbf{D_i} \ne i$, for all $i$.</li>
	<li>$1 \le \mathbf{C_i} \le 10^9$, for all $i$.</li>
</ul>

### 힌트

<p>In Sample Case #1 one optimal way is to do the shipments in increasing order of departure station. That requires sending $4$ cars to station $1$. But after that, each station receives enough cars for its shipment, for a total of $4$ overall. Since no cars arrive at station $1$, it definitely needs the initial $4$, so this is also the minimum possible.</p>

<p align="center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29788.%E2%80%85Railroad%E2%80%85Management/1c8b866b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/29788.%E2%80%85Railroad%E2%80%85Management/1c8b866b.png" data-original-src="https://upload.acmicpc.net/db3b7b39-50c1-4ad7-a77c-1fbd5a2390bc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>In Sample Case #2 one minimal way is to supply $1$ car to station $3$ and $2$ cars each to stations and $2$ and $4$, for a total of $5$. Then, we can start with the shipment $3 \to 4$ which gets one additional car to station $4$. This makes station $4$ have the $3$ cars it needs to ship $4 \to 1$. Station $1$ now has $3$ cars which is enough to do $1 \to 2$ with a single car, taking the total at station $2$ to $3$ cars, enough to do the final shipment $2 \to 3$. Notice that the shipment $1 \to 2$ cannot bring extra cars to station $2$, even though there are cars available and it would be helpful to do so. There are other ways to do all shipments with $5$ initial cars, but no way to do it with less.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29788.%E2%80%85Railroad%E2%80%85Management/31229fa2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/29788.%E2%80%85Railroad%E2%80%85Management/31229fa2.png" data-original-src="https://upload.acmicpc.net/8bd8d5ba-240f-4e72-a2c0-3fbfdc650388/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>In Sample Case #3, one optimal starting number of cars is $3$ cars at stations $1$ and $4$ and $2$ cars at stations $5$ and $7$.</p>