# [Silver I] Managing Difficulties - 18079

[문제 링크](https://www.acmicpc.net/problem/18079)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 165, 정답: 68, 맞힌 사람: 59, 정답 비율: 44.697%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Every day a new programming problem is published on Codehorses. Thus, n problems will be published in the following n days: the difficulty of the i-th problem is a<sub>i</sub>.</p>

<p>Polycarp wants to choose exactly three days i, j and k (i &lt; j &lt; k) so that the difference of difficulties on the day j and the day i is equal to the difference of difficulties on the day k and day j. In other words, Polycarp wants equality a<sub>j</sub> &minus; a<sub>i</sub> = a<sub>k</sub> &minus; a<sub>j</sub> to be true.</p>

<p>Determine the number of possible ways for Polycarp to choose the three days in the desired way.</p>

### 입력

<p>The first line contains an integer t &mdash; the number of test cases in the input (1 &le; t &le; 10). Then t test case descriptions follow.</p>

<p>The first line of a test case contains an integer n &mdash; the number of the days (3 &le; n &le; 2000). The second line of the test case contains n integers a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub>, where a<sub>i</sub> is the difficulty of the problem on the i-th day (1 &le; a<sub>i</sub> &le; 10<sup>9</sup>).</p>

### 출력

<p>Output t integers &mdash; the answers for each of the test cases in the input, in the order they are given. The answer to a test case is the number of triples of indices i, j, and k such that 1 &le; i &lt; j &lt; k &le; n and a<sub>k</sub> &minus; a<sub>j</sub> = a<sub>j</sub> &minus; a<sub>i</sub>.</p>