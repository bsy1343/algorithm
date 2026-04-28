# [Platinum IV] ICPC Camp - 18530

[문제 링크](https://www.acmicpc.net/problem/18530)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 90, 정답: 49, 맞힌 사람: 40, 정답 비율: 54.054%

### 분류

그리디 알고리즘, 정렬, 이분 탐색, 집합과 맵, 매개 변수 탐색

### 문제 설명

<p>John is a leading organizer of this year&rsquo;s North America ICPC training camp. The camp lasts several days. On each day, there will be a lecture introducing two problems: one classical problem and one creative problem. Each problem can only be introduced once during the entire camp. Every problem has an integer difficulty level.</p>

<p>John knows that the lecture on each day should not be too overwhelming. Therefore, the sum of the difficulties of the two problems in a single day shall not exceed some fixed value. Also, the two problems on each day should be roughly on the same level. Let d be the absolute difference between the difficulties of the two problems introduced on any given day. The maximum of all of the ds, defined as D, should be as small as possible.</p>

<p>If John chooses problems well and arranges them wisely, what is the smallest D he can achieve for the n days of the ICPC training camp?</p>

### 입력

<p>The first line of input contains four space-separated integers n, p, q (1 &le; n, p, q &le; 2 &middot; 10<sup>5</sup>, n &le; min(p, q)) and s (0 &le; s &le; 10<sup>9</sup>), where n is the number of days of the camp, p is the number of classical problems, q is the number of creative problems, and s is the maximum sum of difficulties on any given day.</p>

<p>Each of the next p lines contains an integer x (0 &le; x &le; 10<sup>9</sup>). These are difficulties of the p classical problems.</p>

<p>Each of the next q lines contains an integer y (0 &le; y &le; 10<sup>9</sup>). These are difficulties of the q creative problems.</p>

### 출력

<p>Output a single integer, which is the smallest D John can achieve, or &minus;1 if there is no way John can select problems for the n training days.</p>