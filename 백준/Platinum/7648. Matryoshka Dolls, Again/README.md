# [Platinum II] Matryoshka Dolls, Again - 7648

[문제 링크](https://www.acmicpc.net/problem/7648)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 15, 맞힌 사람: 14, 정답 비율: 100.000%

### 분류

이분 매칭, 최대 유량, 그래프 이론

### 문제 설명

<p>Do you remember the box of Matryoshka dolls last week? Adam just got another box of dolls from Matryona. This time, the dolls have different shapes and sizes: some are skinny, some are fat, and some look as though they were flattened. Specifically, doll i can be represented by three numbers wi , li , and hi , denoting its width, length, and height. Doll i can fit inside another doll j if and only if wi &lt; wj , li &lt; lj , and hi &lt; hj . That is, the dolls cannot be rotated when fitting one inside another. Of course, each doll may contain at most one doll right inside it. Your goal is to fit dolls inside each other so that you minimize the number of outermost dolls.</p>

### 입력

<p>The input consists of multiple test cases. Each test case begins with a line with a single integer N, 1 &le; N &le; 500, denoting the number of Matryoshka dolls. Then follow N lines, each with three space-separated integers w<sub>i</sub>, l<sub>i</sub>, and h<sub>i</sub> (1 &le; w<sub>i</sub>, l<sub>i</sub>, h<sub>i</sub> &le; 10,000) denoting the size of the ith doll. Input is followed by a single line with N = 0, which should not be processed.</p>

### 출력

<p>For each test case, print out a single line with an integer denoting the minimum number of outermost dolls that can be obtained by optimally nesting the given dolls.</p>