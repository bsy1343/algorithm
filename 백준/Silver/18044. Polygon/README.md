# [Silver III] Polygon - 18044

[문제 링크](https://www.acmicpc.net/problem/18044)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 158, 정답: 96, 맞힌 사람: 85, 정답 비율: 62.044%

### 분류

그리디 알고리즘, 정렬, 기하학

### 문제 설명

<p>You are given <em>n</em> segments of lengths <em>ℓ</em><sub>1</sub>, <em>ℓ</em><sub>2</sub>, . . . , <em>ℓ</em><em><sub>n</sub></em>, respectively. Determine the largest possible circumference of a convex polygon that can be constructed using these segments (in any order, and not neccessarily all of them). The polygon must be non-degenerate &ndash; in other words, its area must be positive.</p>

### 입력

<p>The first line of input contains the number of test cases <em>z</em> (1 &le; <em>z</em> &le; 100 000). The test cases follow, each one in the following format:</p>

<p>The first line of a test case contains the number of segments <em>n</em> (1 &le; <em>n</em> &le; 100 000). In the second line, there are <em>n</em> integers <em>ℓ</em><sub>1</sub>, <em>ℓ</em><sub>2</sub>, . . . , <em>ℓ</em><em><sub>n</sub></em> (1 &le; <em>ℓ<sub>i</sub></em> &le; 10<sup>9</sup> ) &ndash; the lengths of the segments.</p>

<p>The sum of <em>n</em> values over all test cases does not exceed 1 000 000.</p>

### 출력

<p>For each test case, output a single integer &ndash; the largest possible circumference of a convex polygon made of given segments. If no such polygon can be constructed at all, output 0.</p>