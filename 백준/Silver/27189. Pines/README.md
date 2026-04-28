# [Silver IV] Pines - 27189

[문제 링크](https://www.acmicpc.net/problem/27189)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 55, 정답: 44, 맞힌 사람: 17, 정답 비율: 85.000%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>In order to prepare for the celebration in the city P, it&#39;s been decided to decorate the alley. Two teams were hired for this, one is responsible for illuminating the alley, the other is responsible for planting the alley with pines.</p>

<p>Alley can be represented as a line. They decided to decorate it as follows  --- starting with a pine tree, alternate between trees and lamps. As a result, $n + 1$ pines will be planted on the alley and $n$ lamps will be installed.</p>

<p>Lamps were installed almost instantly, and they were of two types  --- &quot;<code>A</code>&quot; and &quot;<code>B</code>&quot;. &quot;<code>B</code>&quot;-type lamps always shine white light, color of &quot;<code>A</code>&quot;-type lamps on the other hand depends on its surroundings. If a tree standing to the left of the lamp is higher than a tree standing to the right of the lamp, then the lamp lights up red, otherwise it lights up blue.</p>

<p>When the pines have finally arrived it has turned out that all their heights are distinct and take values from $1$ to $n + 1$. It&#39;s been decided to arrange pines so that the number of red and the number of blue lamps were as close to each other as possible. </p>

<p>Help the team responsible for planting with arranging all $n + 1$ pines so that the difference between the number of red lamps and the number of blue outs was minimal possible. Formally, if after the planting there are $r$ red and $b$ blue lamps, it&#39;s required to minimize the value of $|r-b|$.</p>

### 입력

<p>The first line of input contains one integer $n$  --- the total number of lamps ($1 \leq n \leq 2 \cdot 10^5$).</p>

<p>The second line of input contains $n$ characters, $i$-th equal to &quot;<code>A</code>&quot; or &quot;<code>B</code>&quot; - the type of $i$-th lamp.</p>

### 출력

<p>Print $n + 1$ unique numbers from $1$ to $n + 1$  --- heights of pines in the optimal placement. If there are several optimal answers, you can print any of them.</p>

### 힌트

<p>Illustration for the second sample test:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/27189.%E2%80%85Pines/dfb02183.png" data-original-src="https://upload.acmicpc.net/fb0bb423-083d-4750-ae62-98aa97dfb6f0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 382px; height: 141px;" /></p>

<p>For clarity, red lamps in the illustration have a pentagon shape and blue lamps have a star shape.</p>

<p>Then $r = 1$, $b = 1$, $|r - b| = 0$ and this arrangement will be one of the most optimal.</p>