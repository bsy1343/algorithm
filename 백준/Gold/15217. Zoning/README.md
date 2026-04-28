# [Gold IV] Zoning - 15217

[문제 링크](https://www.acmicpc.net/problem/15217)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 11, 맞힌 사람: 9, 정답 비율: 56.250%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>A town is often divided into zones, e.g, industrial zones, commercial zones, and residential zones. If some residential zone is very far from all commercial zones, then the people living there will have a long journey whenever they want to do some shopping, and this is undesirable.</p>

<p>The input will consist of an n&times;n grid of square zones. Each zone is labeled 1 (residential), 2 (industrial), or 3 (commercial). When travelling from one zone to another you are allowed to move north, east, south or west, and the distance travelled is the number of zone boundaries you traverse. So the distance between two adjacent zones is 1, and the distance from the zone in square (1, 1) (the most south-westerly zone) to the zone in square (2, 3) is 3 (one step east and two steps north). You may never move off the grid.</p>

<p>Your task is to find the longest distance one has to travel from a residential zone to get to the commercial zone closest to that residential zone.</p>

### 입력

<p>The first line of input contains an integer n, 2 &le; n &le; 1500, followed by n lines of length n giving the map of the city zones as an n &times; n matrix where each entry is 1, 2, or 3 depending on zone type. You can assume that the city has zones of all three types.</p>

### 출력

<p>Output a single integer d, the largest distance from a residential zone to its closest commercial zone.</p>