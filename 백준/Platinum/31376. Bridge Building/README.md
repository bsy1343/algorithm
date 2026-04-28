# [Platinum II] Bridge Building - 31376

[문제 링크](https://www.acmicpc.net/problem/31376)

### 성능 요약

시간 제한: 5.5 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 3, 맞힌 사람: 3, 정답 비율: 8.333%

### 분류

이분 탐색, 다이나믹 프로그래밍, 배낭 문제, 매개 변수 탐색

### 문제 설명

<blockquote>
<p>A long time ago in 2009...</p>
</blockquote>

<p>In the village Zaykino, heavy rain is common. After such rain, the river Dubrovka which can usually be just stepped over, overflows. To be able to get across the flooded river, the villagers want to build a floating bridge. Luckily, after construction of a bath-house which belongs to a businessman who settled nearby, there are some logs left.</p>

<p>All remaining logs have the same thickness. There are $x$ logs of length $a$ and $y$ logs of length $b$.</p>

<p>The bridge will consist of $l$ rows, each of which will be composed of one or more logs. Unfortunately, the last saw in Zaykino drowned in Dubrovka during the previous overflow and disappeared, so the logs can not be cut into pieces.</p>

<p>The chief engineer wants to build a bridge of maximum possible width. The width of a bridge is determined by the minimum width of a row of logs in it.</p>

<p>For example, if the villagers want to build a bridge of seven rows, and there are six logs of length $3$ and ten logs of length $2$, then they can build a bridge of width $5$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/154d0572-d0fa-4c9b-85e4-02932480d583/-/preview/" style="width: 145px; height: 139px;" /></p>

### 입력

<p>Input contains one or more test cases. Each test case consists of five positive integers $x$, $a$, $y$, $b$ and $l$. Each of these numbers does not exceed $500$. The total number of logs in each test case is at least $l$.</p>

<p>Let $d = \max (x, a, y, b, l)$. It is guaranteed that the sum of $d$ over all the tests is at most $5000$.</p>

### 출력

<p>For each test case, print an integer on a separate line: the maximum possible width of the bridge.</p>