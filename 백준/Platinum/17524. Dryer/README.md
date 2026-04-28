# [Platinum I] Dryer - 17524

[문제 링크](https://www.acmicpc.net/problem/17524)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 433, 정답: 137, 맞힌 사람: 106, 정답 비율: 34.983%

### 분류

애드 혹, 브루트포스 알고리즘, 그리디 알고리즘, 정렬

### 문제 설명

<p>You have <em>n</em> wet clothes you just pulled off the washer. You also have an electronic dryer. The dryer is large enough to dry all the clothes in one run. You can control the temperature of the drying air. However, if you dry all the clothes at a high temperature, some clothes will be damaged. Precisely, let <em>t<sub>i</sub></em>&nbsp;denote the highest temperature at which the <em>i</em>-th cloth can be dried without damage and let <em>w<sub>i</sub></em>&nbsp;denote the wetness of the <em>i</em>-th cloth. If you dry this cloth at the temperature <em>T</em> (of course, <em>T</em> &le; <em>t<sub>i</sub></em>), it will take <em>m<sub>i</sub></em> = 30 + (<em>t<sub>i</sub></em> &minus; <em>T</em>) <em>w<sub>i</sub></em> minutes. If you dry two or more clothes at once, the time the dryer takes is the longest <em>m<sub>i</sub></em> of these clothes. You should dry all the clothes without damage.</p>

<p>Because the dryer uses a lot of electricity, you are going to partition <em>n</em> clothes into at most <em>k</em> groups and runs the dryer for each group. Given <em>n</em> clothes with <em>t<sub>i</sub></em>&rsquo;s and <em>w<sub>i</sub></em>&rsquo;s, write a program to find the minimum total time to dry all the clothes without damage.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/aaca7bb4-c93b-45d9-9efd-9d458a132212/-/preview/" style="width: 405px; height: 177px;" /></p>

<p>This figure illustrates an example of <em>n</em> = 4, <em>k</em> = 2. In this case, the total time is 90 + 30 = 120 minutes.</p>

### 입력

<p>Your program is to read from standard input. The first line contains two integers <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 1,000) and <em>k</em> (1 &le; <em>k</em>&nbsp;&le; 3). In the following <em>n</em> lines, the <em>i</em>-th line has two integers <em>t<sub>i</sub></em>&nbsp;(40 &le; <em>t<sub>i</sub></em>&nbsp;&le; 100) and <em>w<sub>i</sub></em>&nbsp;(0 &le; <em>w<sub>i</sub></em> &le; 100).</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line containing the minimum total time as an integer.</p>