# [Platinum II] Favorite Colors - 18875

[문제 링크](https://www.acmicpc.net/problem/18875)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 276, 정답: 79, 맞힌 사람: 65, 정답 비율: 31.863%

### 분류

자료 구조, 분리 집합, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>Each of Farmer John&#39;s $N$ cows ($1\le N\le 2\cdot 10^5$) has a favorite color. The cows are conveniently labeled $1\ldots N$ (as always), and each color can be represented by an integer in the range $1\ldots N$.</p>

<p>There exist $M$ pairs of cows $(a,b)$ such that cow $b$ admires cow $a$ ($1\le M\le 2\cdot 10^5$). It is possible that $a=b$, in which case a cow admires herself. For any color $c$, if cows $x$ and $y$ both admire a cow with favorite color $c$, then $x$ and $y$ share the same favorite color.</p>

<p>Given this information, determine an assignment of cows to favorite colors such that the number of distinct favorite colors among all cows is maximized. As there are multiple assignments that satisfy this property, output the lexicographically smallest one (meaning that you should take the assignment that minimizes the colors assigned to cows $1\ldots N$ in that order).</p>

### 입력

<p>The first line contains $N$ and $M$.</p>

<p>The next $M$ lines each contain two space-separated integers $a$ and $b$ ($1\le a,b\le N$), denoting that cow $b$ admires cow $a$. The same pair may appear more than once in the input.</p>

### 출력

<p>For each $i$ in $1\ldots N$, output the color of cow $i$ in the desired assignment on a new line.</p>

### 힌트

<p>In the image below, the circles with bolded borders represent the cows with favorite color 1.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/7031a8be-2191-4cfc-8050-13b07a658639/-/preview/" /></p>