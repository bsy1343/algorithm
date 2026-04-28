# [Gold IV] Road Trip - 5138

[문제 링크](https://www.acmicpc.net/problem/5138)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 6, 맞힌 사람: 6, 정답 비율: 31.579%

### 분류

그래프 이론, 그리디 알고리즘, 트리, 오일러 경로

### 문제 설명

<p>Robert Prim and Joseph Kruskal have started a traveling band during their sabbatical. They hope to hit it big, but at the moment they&rsquo;re making even less money than before. This tight budget makes it difficult to plan their debut tour. They&rsquo;d like to visit every major city in their state and return to the city they started at, but after considering the cost of renting each venue, they&rsquo;ve discovered that they&rsquo;ll have to skip one of the cities. As they don&rsquo;t have an incredibly reliable nor comfortable vehicle to travel in, they&rsquo;ve decided to exclude the city that will result in the shortest road trip. Since Prim and Kruskal hate cycles, they&rsquo;ve already narrowed down the roads they plan to use for their trip such that there are no cycles whatsoever, yet they can still reach each city. The question is, what&rsquo;s the length of their optimal trip?</p>

### 입력

<p>Each data set should be followed by a blank line.</p>

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line of each data set contains two integers V and E, the number of cities and the number of roads, respectively, where 2 &le; V &le; 100 and 1 &le; E &le; 100.</p>

<p>This is followed by E lines, each describing a 2-way road. Each line has three integers a<sub>i</sub>, b<sub>i</sub>, d<sub>i</sub> where 1 &le; a<sub>i</sub>, b<sub>i</sub> &le; V are the cities at the endpoints of road i and d<sub>i</sub> is its length. Prim and Kruskal always start at city 1, and there are no cycles in the graph (other than the fact they can repeatedly go back and forth on the same road).</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the minimum distance they will travel assuming they skip the correct city, hit every other city, and return to where they began.</p>