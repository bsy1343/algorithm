# [Platinum III] Heavenly Jewels - 22843

[문제 링크](https://www.acmicpc.net/problem/22843)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

기하학, 구현, 선분 교차 판정, 수학, 다각형의 넓이, 확률론, 정렬, 보로노이 다이어그램

### 문제 설명

<p>There is a at island whose shape is a perfect square. On this island, there are three habitants whose names are IC, PC, and ACM. Every day, one jewel is dropped from the heaven. Just as the jewel touches the ground, IC, PC, and ACM leave their houses simultaneously, run with the same speed, and then a person who first touched the jewel can get the jewel. Hence, the person whose house is nearest to the location of the jewel is the winner of that day.</p>

<p>They always have a quarrel with each other, and therefore their houses are located at distinct places. The locations of their houses are fixed. This jewel falls at a random point on the island, that is, all points on the island have even chance.</p>

<p>When there are two or more persons whose houses are simultaneously nearest, the last person in the order of</p>

<blockquote>
<p>IC, PC, ACM</p>
</blockquote>

<p>obtains the jewel. Our interest is to know the probability for IC to get the jewel under this situation.</p>

### 입력

<p>The input describes one problem instance per line. Each line contains the x- and y-coordinates of IC&#39;s home, those of PC&#39;s, and those of ACM&#39;s in this order. Note that the houses of IC, PC and ACM are located at distinct places. The end of the input is indicated by a line with six zeros.</p>

<p>The coordinates of the whole island are given by (0, 10000)(0, 10000) and coordinates of houses are given in integer numbers between 1 and 9999; inclusive. It should be noted that the locations of the jewels are arbitrary places on the island and their coordinate values are not necessarily integers.</p>

### 출력

<p>For each input line, your program should output its sequence number starting from 1, and the probability for the instance. The computed probability values should have errors less than 10<sup>-5</sup>.</p>

<p>The sequence number and the probability should be printed on the same line. The two numbers should be separated by a space</p>