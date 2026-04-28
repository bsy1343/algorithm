# [Platinum III] The Catcher in the Rye - 19347

[문제 링크](https://www.acmicpc.net/problem/19347)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 209, 정답: 42, 맞힌 사람: 26, 정답 비율: 19.403%

### 분류

수학, 이분 탐색, 물리학

### 문제 설명

<p>Being an experienced jogger, you decided to take a shortcut through a rectangular grain field, divided into three vertical patches full of rye, wheat and barley, respectively. You want to travel from its bottom left corner to the top right corner.</p>

<p>The proper jogging technique varies depending on which sort of grain you are trodding. Therefore, you will be going through the patches with three possibly different velocities. You may plan your route any way you wish (but without leaving the field).</p>

<p>Find the minimal time needed to get to the top right corner of the field from the bottom left corner.</p>

### 입력

<p>The first line of input contains the number of test cases $z$ ($1 \leq z \leq 10\,000$). The descriptions of the test cases follow.</p>

<p>Each test case is given on a single line containing seven integers $h, a, b, c, v_a, v_b, v_c$ ($1 \leq h, a, b, c, v_a, v_b, v_c \leq 10^5$): the height of the rectangular field, the widths of the patches, and the allowed velocities in these patches.&nbsp;Velocity $v$ means that you travel exactly $v$ units of distance per time unit.</p>

### 출력

<p>For each test case, output the total time needed to get from the bottom left corner to the top right one.</p>

<p>Your answer will be accepted if it differs from the correct one by no more than $10^{-3}$.</p>