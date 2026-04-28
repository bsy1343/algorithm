# [Platinum I] Equilateral Triangles - 18778

[문제 링크](https://www.acmicpc.net/problem/18778)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 134, 정답: 53, 맞힌 사람: 42, 정답 비율: 46.667%

### 분류

누적 합

### 문제 설명

<p>Farmer John&#39;s pasture can be represented by a $N\times N$ square grid $(1\le N\le 300)$ consisting of positions $(i,j)$ for all $1\le i,j\le N$. For each square of the grid, the corresponding character in the input is equal to &#39;*&#39; if there exists a single cow at that position and &#39;.&#39; if there does not exist a cow at that position.</p>

<p>FJ believes that the beauty of his pasture is directly proportional to the number of triples of cows such that their positions are equidistant from each other. In other words, they form an equilateral triangle. Unfortunately, it was only quite recently that FJ realized that since all of his cows are located at integer coordinates, no beautiful triples can possibly exist if Euclidean distance is used! Thus, FJ has decided to switch to use &quot;Manhattan&quot; distance instead. Formally, the Manhattan distance between two positions $(x_0,y_0)$ and $(x_1,y_1)$ is equal to $|x_0-x_1|+|y_0-y_1|$.</p>

<p>Given the grid representing the positions of the cows, compute the number of equilateral triples.</p>

### 입력

<p>The first line contains a single integer $N.$</p>

<p>For each $1\le i\le N,$ line $i+1$ of the input contains a string of length $N$ consisting solely of the characters &#39;*&#39; and &#39;.&#39;. The $j$th character describes whether there exists a cow at position $(i,j)$ or not.</p>

### 출력

<p>Output a single integer containing the answer. It can be shown that it fits into a signed 32-bit integer.</p>

### 힌트

<p>There are three cows, and they form an equilateral triple because the Manhattan
distance between each pair of cows is equal to two.