# [Platinum III] Depot Rearrangement - 3338

[문제 링크](https://www.acmicpc.net/problem/3338)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 4, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

그래프 이론, 그래프 탐색, 이분 그래프, 오일러 경로

### 문제 설명

<p>A company operates N shops, selling M different products in each shop. The company has a large depot where the products are packed before delivering to shops. Each shop receives the same number of items of each product. Hence the company packs a certain number of items of a given product into a container, and labels that container with the product identifier. Products are identified by the numbers from 1 to M. Thus, at the end of packing, there are N*M containers in the depot, and exactly N containers are labeled with a given product label for each product. Because the depot is in a narrow building, the containers are arranged in a single row. In order to speed-up distribution, the manager of the depot wants to rearrange the containers. Since the product delivery to the shops occurs by sending exactly one truck to each shop, and each truck carries one container of each product, a suitable arrangement is the following. The first M containers in the row must be labeled with different product labels, the second M containers in the row must be labeled with different product labels, and so on. Unfortunately, there is only one free place at the end of the row to hold a container. Therefore the rearrangement must be performed by successively picking up a container and moving it to the free place. After the rearrangement the free place must be at the end of the row.</p>

<p>The goal is to achieve the required rearrangement by a minimal number of moves.</p>

<p>You are to write a program that computes a rearrangement which needs the minimal number of moves.</p>

### 입력

<p>The first line of the input contains two integers, N and M. N (1 &le; N &le; 400) is the number of shops and M (1 &le; M &le; 400) is the number of products. The second line contains N*M integers, the labels of the containers in their initial order. Each product identifier x (1 &le; x &le; M) occurs exactly N times in the line.</p>

### 출력

<p>The first line of the output contains one integer S, the minimal number of moves that are necessary to obtain a required order of the container row. The following S lines describe a rearrangement. Each line contains a pair of integers x y. The pair x y describes a move: the container at position x is to move to position y. Positions are identified by the numbers from 1 to N*M+1; initially the position N*M+1 is free (holds no container). A move from x to y is legal only if position y is free prior to the move. After a move from x to y the position x will be free.</p>

<p>If there are multiple possibilities, your program should output only one; it does not matter which one.</p>