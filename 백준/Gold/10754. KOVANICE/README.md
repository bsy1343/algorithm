# [Gold I] KOVANICE - 10754

[문제 링크](https://www.acmicpc.net/problem/10754)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 25, 맞힌 사람: 23, 정답 비율: 48.936%

### 분류

다이나믹 프로그래밍, 자료 구조, 그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색, 분리 집합, 트리에서의 다이나믹 프로그래밍, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Mirko paid a touristic visit to a land far away where banknotes aren&rsquo;t used, but only coins. More precisely, the country has N types of coins in circulation. Their names are, respectively, &lsquo;K1&rsquo;, &lsquo;K2&rsquo;, &lsquo;K3&rsquo;, . . . , &lsquo;KN&rsquo;. The coins are of the same size and shape, but different weights. &lsquo;K1&rsquo; is the lightest type of coin, &lsquo;K2&rsquo; is the second lightest and so on until the heaviest type &lsquo;KN&rsquo;.</p>

<p>Mirko has M coins in his pocket, but he doesn&rsquo;t know which one is of which type. In order to determine that, he only has a simple balance scale at his disposal.</p>

<p>Initially, Mirko marked his unknown coins with numbers from 1 to M and after that performed V weighings. In each weighing, he put one coin on one side of the scale, and another coin on the other side of the scale. Then he saw whether the two coins weigh equally, and if they don&rsquo;t, which one is heavier.</p>

<p>Write a programme that will, based on the weighing results, determine the type of coin for each coin for which it is possible to determine it uniquely.</p>

### 입력

<p>The first line of input contains integers N, M and V &ndash; the number of types of coins in the country, the number of coins in Mirko&rsquo;s pocket and the number of weighings.</p>

<p>Each of the following V lines contains the result of one weighing in the form of ACB where A and B are different integers less than or equal to M, and C is the character &lsquo;<code>=</code>&rsquo; (equal) or &lsquo;<code>&lt;</code>&rsquo; (less).</p>

<p>There is no space between the numbers and character C. The result of one weighing tells us that Mirko&rsquo;s coin marked with A is of equal weight as the coin marked with B or lighter than it.</p>

<p>The weighing results won&rsquo;t be contradictory.</p>

### 출력

<p>Output M lines. The i<sup>th</sup> line must contain the type of coin marked with i &ndash; a sequence of characters of the form &lsquo;KX&rsquo; where X is an integer between 1 and N.</p>

<p>If it isn&rsquo;t possible to uniquely determine the weight of the coin marked with i, output the character &lsquo;<code>?</code>&rsquo; in the i<sup>th</sup> line.</p>

### 제한

<p>In all subtasks, it will hold 2 &le; N &le; 300 000 and 1 &le; V &le; 300 000.</p>