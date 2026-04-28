# [Bronze I] Daily Trips - 28043

[문제 링크](https://www.acmicpc.net/problem/28043)

### 성능 요약

시간 제한: 0.1 초, 메모리 제한: 1024 MB

### 통계

제출: 194, 정답: 155, 맞힌 사람: 133, 정답 비율: 84.713%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Bella is a simple girl with a simple life: wake up, go to work, work, go home, rest, sleep, and repeat. Bella commutes via bus, and it rains often in her city, so sometimes she needs an umbrella. However, the local weather forecast is unreliable, so Bella can&rsquo;t be sure if it&rsquo;s going to rain or not until right before she begins a trip. To avoid getting caught unprepared, Bella created a system.</p>

<p>She owns one or more umbrellas, keeping them at home or her workplace. Before any trip (from home to work, or vice versa), Bella looks outside to decide whether to bring an umbrella on that trip:</p>

<ul>
	<li>if it&rsquo;s raining, she brings an umbrella;</li>
	<li>otherwise, if there are currently no umbrellas at her destination (either work or home), she still brings an umbrella, just in case;</li>
	<li>otherwise, she doesn&rsquo;t bring an umbrella.</li>
</ul>

<p>The second rule above is meant to prevent a situation where Bella needs an umbrella but has none at her current location (a bad memory she will talk about to anyone who asks). This guarantees that Bella will never catch rain and get sick.</p>

<p>Now we need you to simulate Bella&rsquo;s method for a certain period. The simulation starts with Bella at home. Each day she takes two bus trips: to and back from work. Given the starting numbers of umbrellas at her home and workplace, and the weather reports during $N$ consecutive days, find out whether or not Bella brought an umbrella on each of her $2N$ bus trips.</p>

### 입력

<p>The first line contains three integers $N$ ($1 &le; N &le; 10^4$), $H$ ($1 &le; H &le; 100$), and $W$ ($0 &le; W &le; 100$), indicating respectively the duration of the simulation period in days, and the starting numbers of umbrellas at Bella&rsquo;s home and workplace. For $i = 1, 2, \dots , N$, the $i$-th of the next $N$ lines contains two characters representing whether it rained on each trip of the $i$-th day. The first character refers to the first trip of the day (from home to work), while the second character refers to the second trip of the day (from work to home). Each character is the uppercase letter &ldquo;<code>Y</code>&rdquo; if it rained, and the uppercase letter &ldquo;<code>N</code>&rdquo; otherwise.</p>

### 출력

<p>Output $N$ lines. For $i = 1, 2, \dots , N$, the $i$-th line must contain two characters indicating whether Bella brought an umbrella on each trip of the $i$-th day. The first character refers to the first trip while the second character refers to the second trip. Each character must be the uppercase letter &ldquo;<code>Y</code>&rdquo; if Bella brought an umbrella, and the uppercase letter &ldquo;<code>N</code>&rdquo; otherwise.</p>