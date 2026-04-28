# [Platinum II] Zoning Houses - 16050

[문제 링크](https://www.acmicpc.net/problem/16050)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 16, 맞힌 사람: 14, 정답 비율: 60.870%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>Given a registry of all houses in your state or province, you would like to know the minimum size of an axis-aligned square zone such that every house in a range of addresses lies in the zone or on its border. The zoning is a bit lenient and you can ignore any one house from the range to make the zone smaller.</p>

<p>The addresses are given as integers from 1..n. Zoning requests are given as a consecutive range of houses. A valid zone is the smallest axis-aligned square that contains all of the points in the range, ignoring at most one.</p>

<p>Given the (x, y) locations of houses in your state or province, and a list of zoning requests, you must figure out for each request: What is the length of a side of the smallest axis-aligned square zone that contains all of the houses in the zoning request, possibly ignoring one house?</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. Each test case will begin with a line containing two integers n and q (1 &le; n, q &le; 10<sup>5</sup>), where n is the number of houses, and q is the number of zoning requests.</p>

<p>The next n lines will each contain two integers, x and y (&minus;10<sup>9</sup> &le; x, y &le; 10<sup>9</sup>), which are the (x,y) coordinates of a house in your state or province. The address of this house corresponds with the order in the input. The first house has address 1, the second house has address 2, and so on. No two houses will be at the same location.</p>

<p>The next q lines will contain two integers a and b (1 &le; a &lt; b &le; n), which represents a zoning request for houses with addresses in the range [a..b] inclusive.</p>

### 출력

<p>Output q lines. On each line print the answer to one of the zoning requests, in order: the side length of the smallest axis-aligned square that contains all of the points of houses with those addresses, if at most one house can be ignored.</p>