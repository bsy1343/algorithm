# [Bronze III] Exactly Electrical - 14683

[문제 링크](https://www.acmicpc.net/problem/14683)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 670, 정답: 383, 맞힌 사람: 353, 정답 비율: 58.155%

### 분류

수학, 구현, 사칙연산, 홀짝성

### 문제 설명

<p>You live in Grid City, which is composed of integer-numbered streets which run east-west (parallel to the x-axis) and integer-numbered avenues which run north-south (parallel to the y-axis). The streets and avenues have infinite length, and there is a street for every integer y-coordinate and an avenue for every x-coordinate. All intersections are labelled by their integer coordinates: for example, avenue 7 and street -3 intersect at (7,-3).</p>

<p>You drive a special electric car which uses up one unit of electrical charge moving between adjacent intersections: that is, moving either north or south to the next street, or moving east or west to the next avenue). Until your battery runs out, at each intersection, your car can turn left, turn right, go straight through, or make a U-turn. You may visit the same intersection multiple times on the same trip.</p>

<p>Suppose you know your starting intersection, your destination intersection and the number of units of electrical charge in your battery. Determine whether you can travel from the starting intersection to the destination intersection using the charge available to you in such a way that your battery is empty when you reach your destination.</p>

### 입력

<p>The input consists of three lines. The first line contains a followed by b, indicating the starting coordinate (a, b) (&minus;1000 &le; a &le; 1000; &minus;1000 &le; b &le; 1000).</p>

<p>The second line contains c followed by d, indicating the destination coordinate (c, d) (&minus;1000 &le; c &le; 1000; &minus;1000 &le; d &le; 1000).</p>

<p>The third line contains an integer t (0 &le; t &le; 10 000) indicating the initial number of units of electrical charge of your battery.</p>

<p>For 3 of the 15 available marks, 0 &le; a, b, c, d &le; 2.</p>

<p>For an additional 3 of the 15 marks available, t &le; 8.</p>

### 출력

<p>Output Y if it is possible to move from the starting coordinate to the destination coordinate using exactly t units of electrical charge. Otherwise output N.</p>

### 힌트

<p>Explanation for Output for Sample Input 1</p>

<p>One possibility is to travel from (3, 4) to (4, 4) to (4, 3) to (3, 3).</p>

<p>Explanation for Output for Sample Input 2</p>

<p>It is possible to get from (10, 2) to (10, 4) using exactly 2 units of electricity, by going north 2 units.</p>

<p>It is also possible to travel using 4 units of electricity as in the following sequence:</p>

<p style="text-align: center;">(10, 2) &rarr; (10, 3) &rarr; (11, 3) &rarr; (11, 4) &rarr; (10, 4).</p>

<p>It is also possible to travel using 5 units of electricity from (10, 2) to (11, 4) by the following sequence:</p>

<p style="text-align: center;">(10, 2) &rarr; (10, 3) &rarr; (11, 3) &rarr; (12, 3) &rarr; (12, 4) &rarr; (11, 4).</p>

<p>It is not possible to move via any path of length 5 from (10, 2) to (10, 4), however.</p>