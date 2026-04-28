# [Silver V] The Pleasant Walk - 19829

[문제 링크](https://www.acmicpc.net/problem/19829)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 300, 정답: 177, 맞힌 사람: 142, 정답 비율: 57.724%

### 분류

구현, 두 포인터

### 문제 설명

<p>There are $n$ houses along the road where Anya lives, each one is painted in one of $k$ possible colors.</p>

<p>Anya likes walking along this road, but she doesn&#39;t like when two adjacent houses at the road have the same color. She wants to select a long segment of the road such that no two adjacent houses have the same color.</p>

<p>Help Anya find the longest segment with this property.</p>

### 입력

<p>The first line contains two integers $n$ and $k$ --- the number of houses and the number of colors ($1 \le n \le 100\,000$, $1 \le k \le 100\,000$).</p>

<p>The next line contains $n$ integers $a_1, a_2, \ldots, a_n$ --- the colors of the houses along the road ($1 \le a_i \le k$).</p>

### 출력

<p>Output a single integer --- the maximum number of houses on the road segment having no two adjacent houses of the same color.</p>

### 힌트

<p>In the example, the longest segment without neighboring houses of the same color is from the house 4 to the house 7. The colors of the houses are $[3, 2, 1, 2]$ and its length is 4 houses.</p>