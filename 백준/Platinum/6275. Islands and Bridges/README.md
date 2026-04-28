# [Platinum III] Islands and Bridges - 6275

[문제 링크](https://www.acmicpc.net/problem/6275)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 5, 맞힌 사람: 5, 정답 비율: 31.250%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 외판원 순회 문제

### 문제 설명

<p>Given a map of islands and bridges that connect these islands, a Hamilton path, as we all know, is a path along the bridges such that it visits each island exactly once. On our map, there is also a positive integer value associated with each island. We call a Hamilton path the best triangular Hamilton path if it maximizes the value described below.&nbsp;</p>

<p>Suppose there are n islands. The value of a Hamilton path C<sub>1</sub>C<sub>2</sub>...C<sub>n</sub> is calculated as the sum of three parts. Let V<sub>i</sub> be the value for the island C<sub>i</sub>. As the first part, we sum over all the V<sub>i</sub> values for each island in the path. For the second part, for each edge C<sub>i</sub>C<sub>i+1</sub> in the path, we add the product V<sub>i</sub>*V<sub>i+1</sub>. And for the third part, whenever three consecutive islands C<sub>i</sub>C<sub>i+1</sub>C<sub>i+2</sub> in the path forms a triangle in the map, i.e. there is a bridge between C<sub>i</sub> and C<sub>i+2</sub>, we add the product V<sub>i</sub>*V<sub>i+1</sub>*V<sub>i+2</sub>.&nbsp;</p>

<p>Most likely but not necessarily, the best triangular Hamilton path you are going to find contains many triangles. It is quite possible that there might be more than one best triangular Hamilton paths; your second task is to find the number of such paths.&nbsp;</p>

### 입력

<p>The input file starts with a number q (q&lt;=20) on the first line, which is the number of test cases. Each test case starts with a line with two integers n and m, which are the number of islands and the number of bridges in the map, respectively. The next line contains n positive integers, the i-th number being the Vi value of island i. Each value is no more than 100. The following m lines are in the form x y, which indicates there is a (two way) bridge between island x and island y. Islands are numbered from 1 to n. You may assume there will be no more than 13 islands.</p>

### 출력

<p>For each test case, output a line with two numbers, separated by a space. The first number is the maximum value of a best triangular Hamilton path; the second number should be the number of different best triangular Hamilton paths. If the test case does not contain a Hamilton path, the output must be `0 0&#39;.</p>

<p>Note: A path may be written down in the reversed order. We still think it is the same path.</p>