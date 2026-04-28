# [Silver II] Parking Party - 28228

[문제 링크](https://www.acmicpc.net/problem/28228)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 108, 정답: 48, 맞힌 사람: 42, 정답 비율: 54.545%

### 분류

그리디 알고리즘, 구현

### 문제 설명

<p>Peyman has decided to host a dinner party in his house at Zabol. His house has a rectangular parking lot which can be represented by a grid with n rows and m columns. A car can park in one of the n &times; m cells in this grid. However, some cells are occupied by immovable pillars and thus, no car can park in or pass through them. Each row or column in the parking lot has an entrance on both its ends. When a car enters the parking lot through an entrance, it can just move forward straightly in the corresponding row or column; it stops and parks in a grid cell when it reaches the opposite entrance or when the next cell is occupied by a pillar or another parked car. Additionally, a car cannot enter a row or column if its first cell is already occupied.</p>

<p>Peyman wants to maximize the number of cars that can be parked in his parking lot. In order to do that, he can instruct the guests on which entrance to take upon arrival. Your task is to help Peyman achieve this task.</p>

### 입력

<p>The first line of input contains two space-separated integers n and m (1 ⩽ n, m ⩽ 1000), the number of rows and columns in the parking lot, respectively. Each of the following n lines contain a string of length m made of &ldquo;.&rdquo; and &ldquo;o&rdquo; characters. the j-th character of the (i + 1)-th line is an &ldquo;o&rdquo; if the cell in row i and column j contains a pillar, and it is a &ldquo;.&rdquo; if it is empty.</p>

### 출력

<p>Print a single integer k, the maximum number of cars Peyman can park in his parking lot.</p>