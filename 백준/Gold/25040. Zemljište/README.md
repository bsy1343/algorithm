# [Gold II] Zemljište - 25040

[문제 링크](https://www.acmicpc.net/problem/25040)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 124, 정답: 40, 맞힌 사람: 38, 정답 비율: 38.000%

### 분류

누적 합, 두 포인터

### 문제 설명

<p>Matej is, as is well known, the biggest Croatian innovator and businessman. His company is expanding, which is why he decided to buy a plot of land near Velika Gorica. The available land is a rectangle-shaped region consisting of $r \times s$ square unit cells. Each cell has its own price and it&rsquo;s not possible to purchase only a part of a cell. Matej is an experienced businessman and he knows that the key to success is not simply to buy the biggest plot of land or the least expensive one. Instead, he should buy a plot of land whose price is as close as possible to the magic numbers given to him by Milan the psychic.</p>

<p>At the beginning of his career, Milan revealed to Matej two magic numbers $a$ and $b$ crucial for commercial success. Therefore, Matej wishes to buy a (nonempty) rectangular plot of land so that the distance between its price and the magic numbers is as small as possible. The distance between the price and a single magic number is just the absolute value of their difference, and the distance between the price and both of the magic numbers is the sum of these absolute differences. Help Matej and determine the minimum possible distance between the price of the plot of land and the two magic numbers.</p>

### 입력

<p>The first line contains positive integers $r$, $s$, $a$ and $b$ ($1 &le; r, s &le; 500$, $1 &le; a, b &le; 10^9$) from the problem.</p>

<p>The $i$-th of the following $r$ lines contains a sequence of s positive integers $c_{ij}$ ($1 &le; c_{ij} &le; 10^9$), the prices of the individual cells, in order.</p>

### 출력

<p>In the only line print the minimum possible distance between the price of the plot of land and the two magic numbers.</p>

### 힌트

<p>Clarification of the second example: Matej can buy a plot of land consisting of two adjacent cells of cost $1$. The total price is then $1 + 1 = 2$, and the distance between it and the magic numbers is $|3 - 2| + |4 - 2| = 3$.</p>