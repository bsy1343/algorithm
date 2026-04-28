# [Platinum I] Covered Walkway - 4787

[문제 링크](https://www.acmicpc.net/problem/4787)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 128 MB

### 통계

제출: 72, 정답: 29, 맞힌 사람: 25, 정답 비율: 60.976%

### 분류

다이나믹 프로그래밍, 볼록 껍질을 이용한 최적화

### 문제 설명

<p>Your university wants to build a new walkway, and they want at least part of it to be covered. There are certain points which must be covered. It doesn&rsquo;t matter if other points along the walkway are covered or not.</p>

<p>The building contractor has an interesting pricing scheme. To cover the walkway from a point at x to a point at y, they will charge c+(x-y)<sup>2</sup>, where c is a constant. Note that it is possible for x=y. If so, then the contractor would simply charge c.</p>

<p>Given the points along the walkway and the constant c, what is the minimum cost to cover the walkway?</p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with a line with two integers, n (1&le;n&le;1,000,000) and c (1&le;c&le;10<sup>9</sup>), where n is the number of points which must be covered, and c is the contractor&rsquo;s constant. Each of the following n lines will contain a single integer, representing a point along the walkway that must be covered. The points will be in order, from smallest to largest. All of the points will be in the range from 1 to 10<sup>9</sup>, inclusive. The input will end with a line with two 0s.</p>

### 출력

<p>For each test case, output a single integer, representing the minimum cost to cover all of the specified points. Output each integer on its own line, with no spaces, and do not print any blank lines between answers. All possible inputs yield answers which will fit in a signed 64-bit integer.</p>