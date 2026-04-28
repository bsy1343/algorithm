# [Platinum V] Nested Dolls - 5058

[문제 링크](https://www.acmicpc.net/problem/5058)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 346, 정답: 100, 맞힌 사람: 72, 정답 비율: 26.866%

### 분류

그리디 알고리즘, 정렬, 이분 탐색, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>Dilworth is the world&rsquo;s most prominent collector of Russian nested dolls: he literally has thousands of them! You know, the wooden hollow dolls of different sizes of which the smallest doll is contained in the second smallest, and this doll is in turn contained in the next one and so forth. One day he wonders if there is another way of nesting them so he will end up with fewer nested dolls? After all, that would make his collection even more magnificent! He unpacks each nested doll and measures the width and height of each contained doll. A doll with width w<sub>1</sub> and height h<sub>1</sub> will fit in another doll of width w<sub>2</sub> and height h<sub>2</sub> if and only if w<sub>1</sub> &lt; w<sub>2</sub> and h<sub>1</sub> &lt; h<sub>2</sub>. Can you help him calculate the smallest number of nested dolls possible to assemble from his massive list of measurements?</p>

### 입력

<p>On the first line of input is a single positive integer 1 &le; t &le; 20 specifying the number of test cases to follow. Each test case begins with a positive integer 1 &le; m &le; 20000 on a line of itself telling the number of dolls in the test case. Next follow 2m positive integers w<sub>1</sub>, h<sub>1</sub>, w<sub>2</sub>, h<sub>2</sub>, . . . , w<sub>m</sub>, h<sub>m</sub>, where w<sub>i</sub> is the width and hi is the height of doll number i. 1 &le; w<sub>i</sub>, h<sub>i</sub> &le; 10000 for all i.</p>

### 출력

<p>For each test case there should be one line of output containing the minimum number of nested dolls possible.</p>