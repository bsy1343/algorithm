# [Platinum III] Human Pyramid - 20220

[문제 링크](https://www.acmicpc.net/problem/20220)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 512 MB

### 통계

제출: 83, 정답: 46, 맞힌 사람: 43, 정답 비율: 55.844%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The Barefooted Acrobatics People&#39;s Club wants to make a group photo in an original way. For the photo, they want to make a human pyramid, where each person rests on the ground or rests on the shoulders of two people below him or her.</p>

<p>Making a human pyramid demands a lot from the acrobats involved, so the club selected a group consisting of strong people of which they are assured that these people can carry enough weight. The others are &#39;agile&#39; and to make sure everyone is comfortable during the photo, there can only be agile people directly above an agile person.</p>

<p>The photographer wants to make a photo of a pyramid with $h$ people on the floor, $h-1$ on the second layer, $h-2$ on the third layer, and so on, with a single person on the $h$th layer. You have $s$ strong people at your disposal, and the other $\frac12 h (h+1) - s$ people are agile. What is the number of ways you can arrange the pyramid satisfying the demands of the photographer? Since this number may be large, you should find it modulo $10^9 + 7$.</p>

<p>Two pyramids $P_1$ and $P_2$ are different if there exists a location where $P_1$ has an agile person and $P_2$ a strong person, or vice versa.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line containing two integers $h$ ($1 \leq h \leq 100$) and $s$ ($0 \leq s \leq \frac{1}{2} h (h + 1)$), the number of layers in the pyramid and the number of strong people.</li>
</ul>

### 출력

<p>Output the number of possible ways to build a pyramid with the given constraints, modulo $10^9 + 7$.</p>