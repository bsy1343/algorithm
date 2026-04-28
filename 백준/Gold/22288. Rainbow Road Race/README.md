# [Gold I] Rainbow Road Race - 22288

[문제 링크](https://www.acmicpc.net/problem/22288)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 23, 맞힌 사람: 21, 정답 비율: 77.778%

### 분류

그래프 이론, 비트마스킹, 최단 경로, 데이크스트라

### 문제 설명

<p>Marcy is attending Pride Fest and has signed up to participate in the Rainbow Road Race. On each street, there are volunteers who have colored chalk powder. As contestants walk along a street, volunteers throw chalk onto the contestants. The chalk thrown on each street is one of the seven colors of the rainbow (Red, Orange, Yellow, Green, Blue, Indigo, Violet). &nbsp;Once a person starts walking along a street, they must walk to the end of that street.</p>

<p>The race starts at the <em>Festival Tent</em>. The goal of the race is to get covered by chalk of every color and come back to the tent. Help Marcy determine the shortest distance she has to travel to get every color and make it back to the tent.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22288.%E2%80%85Rainbow%E2%80%85Road%E2%80%85Race/bd94bd8b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22288.%E2%80%85Rainbow%E2%80%85Road%E2%80%85Race/bd94bd8b.png" data-original-src="https://upload.acmicpc.net/678132ad-8444-404f-955a-8305739923bb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 445px; height: 203px;" /></p>

<p style="text-align: center;">Figure J.1:&nbsp;The left picture illustrates Sample Input 1 and the right picture illustrates Sample Input 2. The triangle is the Festival Tent.</p>

### 입력

<p>The first line of input contains two integers $n$ ($7 \leq n \leq 7^3$), which is the number of fun locations at the festival, and $m$ ($7 \leq m \leq 7^4$), which is the number of streets connecting the fun locations. The fun locations are numbered $1, \dots , n$ and the Festival Tent is location $1$.</p>

<p>The next $m$ lines describe the streets. Each of these lines contains three integers $\ell_1$, $\ell_2$ ($1 \leq \ell_1 &lt; \ell_2 \leq n$) and $d$ ($1 \leq d \leq 7^5$), followed by a single character $c$ ($c$ is one of <code>R</code>, <code>O</code>, <code>Y</code>, <code>G</code>, <code>B</code>, <code>I</code>, <code>V</code>). This specifies that this street connects locations $\ell_1$ and $\ell_2$, is $d$ meters long and the chalk thrown is color $c$.</p>

<p>It is always possible to travel between any pair of fun locations. There is at most one street between any two pairs of locations and each color appears at least once.</p>

### 출력

<p>Display the shortest distance Marcy has to travel to get every color and make it back to the Festival Tent.</p>