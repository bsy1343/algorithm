# [Platinum II] Tree Number Generator - 24587

[문제 링크](https://www.acmicpc.net/problem/24587)

### 성능 요약

시간 제한: 13 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 65, 정답: 24, 맞힌 사람: 21, 정답 비율: 44.681%

### 분류

수학, 자료 구조, 트리, 정수론, 최소 공통 조상, 희소 배열

### 문제 설명

<p>One day Young Anna comes up with a whimsical idea of using a tree to create a number generator. The generator is created with a modulus m and an internal tree of n nodes numbered from 1 to n. Each tree node is assigned a single digit between 0 to 9. The generator provides a method Get(a, b) that can be used to produce an integer in [0, m). The two arguments a and b specify two tree nodes. The generator walks the path from a to b in the tree, concatenates all the digits along the path (including the digits of node a and b), and obtains a decimal integer v as a result of such digit concatenation. Note that v can be quite large and may contain leading zeroes. The return value of Get(a, b) is v modulo m.</p>

<p>Given a tree and the value of m to be used by Anna&rsquo;s number generator, calculate the return values of q queries Get(a, b).</p>

### 입력

<p>The first line of input has three integers n (2 &le; n &le; 2 &middot; 10<sup>5</sup>), m (1 &le; m &le; 10<sup>9</sup>), and q (1 &le; q &le; 2 &middot; 10<sup>5</sup>).</p>

<p>The next n &minus; 1 lines describe the tree edges. Each line has two integers x, y (1 &le; x, y &le; n) listing an edge connecting node x and node y. It is guaranteed that those edges form a tree.</p>

<p>The next n lines each have a single digit between 0 to 9. The ith digit is assigned to node i.</p>

<p>The next q lines each have two integers a, b (1 &le; a, b &le; n) specifying a query Get(a, b).</p>

### 출력

<p>For each Get(a, b) query output its return value on a single line.</p>