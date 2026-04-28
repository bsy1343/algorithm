# [Gold IV] Trucking Troubles - 6909

[문제 링크](https://www.acmicpc.net/problem/6909)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 27, 맞힌 사람: 22, 정답 비율: 66.667%

### 분류

자료 구조, 분리 집합

### 문제 설명

<p>You are a salesperson selling trucks which can carry trucks which can carry trucks. Needless to say, your trucks are heavy. Also needless to say, you have to drive one of these trucks across a wide wet domain, and since it is wet, you need to drive over some bridges. In fact, on every road between two cities, there is a bridge but there is not a direct road between every pair of cities. Each bridge can support a certain maximum weight. This maximum weight is an integer from $0$ to $100\,000$.</p>

<p>You have been given a list of cities where there are customers who are eager to view one of your trucks. These cities are called <em>destination cities</em>. Since you must decide which truck you will drive through these cities, you will have to answer the following problem: what is the maximum weight that can be driven through these destination cities? You are to write a program to solve this problem.</p>

<p>The first line of input will contain three positive integers: $c$, $r$ and $d$ specifying the number of cities (in total), number of roads between cities and number of destination cities, respectively. The cities are numbered from $1$ to $c$. There are at most $10\,000$ cities and at most $100\,000$ roads. The next $r$ lines contain triples $x\ y\ w$ indicating that this road runs between city $x$ and city $y$ and it has a maximum weight capacity of $w$. The next $d$ lines give the destination cities you must visit with your truck. There will be at least one destination city.</p>

<p>You can assume that you are starting in city $1$ and that city $1$ is not a destination city. You can visit the $d$ destination cities in any order, but you must visit all $d$ destination cities.</p>

<p>The output from your program is a single integer, the largest weight that can be driven through all $d$ destination cities.</p>

### 입력



### 출력

