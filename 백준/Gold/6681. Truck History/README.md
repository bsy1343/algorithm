# [Gold IV] Truck History - 6681

[문제 링크](https://www.acmicpc.net/problem/6681)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 34, 정답: 14, 맞힌 사람: 11, 정답 비율: 40.741%

### 분류

그래프 이론, 브루트포스 알고리즘, 최소 스패닝 트리

### 문제 설명

<p>Advanced Cargo Movement, Ltd. uses trucks of different types. Some trucks are used for vegetable delivery, other for furniture, or for bricks. The company has its own code describing each type of a truck. The code is simply a string of exactly seven lowercase letters (each letter on each position has a very special meaning but that is unimportant for this task). At the beginning of company&#39;s history, just a single truck type was used but later other types were derived from it, then from the new types another types were derived, and so on.</p>

<p>Today, ACM is rich enough to pay historians to study its history. One thing historians tried to find out is so called derivation plan -- i.e. how the truck types were derived. They defined the distance of truck types as the number of positions with different letters in truck type codes. They also assumed that each truck type was derived from exactly one other truck type (except for the first truck type which was not derived from any other type). The quality of a derivation plan was then defined as&nbsp;</p>

<p>\[\frac{1}{\sum_{(t_i,t_d)}{d(t_o,t_d)}}\]</p>

<p>where the sum goes over all pairs of types in the derivation plan such that to is the original type and t<sub>d</sub> the type derived from it and d(t<sub>o</sub>,t<sub>d</sub>) is the distance of the types.</p>

<p>Since historians failed, you are to write a program to help them. Given the codes of truck types, your program should find the highest possible quality of a derivation plan.</p>

<p>&nbsp;</p>

### 입력

<p>The input consists of several test cases. Each test case begins with a line containing the number of truck types, N, 2 &nbsp;&lt;= N &nbsp;&lt;= 2 000. Each of the following N lines of input contains one truck type code (a string of seven lowercase letters). You may assume that the codes uniquely describe the trucks, i.e., no two of these N lines are the same. The input is terminated with zero at the place of number of truck types.</p>

<p>&nbsp;</p>

### 출력

<p>For each test case, your program should output the text &quot;The highest possible quality is 1/Q.&quot;, where 1/Q is the quality of the best derivation plan.</p>

<p>&nbsp;</p>