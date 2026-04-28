# [Gold I] Island Buses - 10490

[문제 링크](https://www.acmicpc.net/problem/10490)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 64, 정답: 21, 맞힌 사람: 19, 정답 비율: 44.186%

### 분류

자료 구조, 분리 집합, 그래프 이론, 그래프 탐색

### 문제 설명

<p>The Island Cargo and Passenger Company is planning to provide bus service for a number of South Pacific island nations. Each nation consists of a collection of islands, some of which are connected by bridges. To save costs, the company wants to use the fewest number of buses possible. Every island must have access to a bus, but the company will only use one bus for any group of two or more islands that is connected by bridges.</p>

<p>Your job is to write a program which, given a map of the island nation, computes the number of islands, bridges, and the smallest number of buses needed for that country</p>

### 입력

<p>Input contains a sequence of maps, each given as a rectangular array of characters (at most 80 by 80). There is one blank line between each pair of maps. Input ends at end of file.</p>

<p>All maps contain only the characters dot (.), X, #, and B. Dots represent ocean water. X&rsquo;s and #&rsquo;s represent island land. B&rsquo;s represents bridges, and each X represents the land that is the endpoint of one or more bridges.</p>

<p>Each map contains 1 or more rectangular islands. Different islands are not adjacent vertically or horizontally. Diagonal adjacency is not enough to drive a bus across.</p>

<p>Each map contains 0 or more horizontal or vertical bridges. Each bridge has at least one B, and connects only the two islands at its two endpoints. Bridges do not cross each other or extend over the # land of an island. No B may be adjacent to another B or X unless they are part of the same bridge.</p>

### 출력

<p>For each map you should print the map number, followed by lines giving the number of islands, bridges, and buses needed. Print a blank line between each pair of map outputs. Follow the format of the sample output.</p>