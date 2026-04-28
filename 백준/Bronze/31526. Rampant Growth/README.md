# [Bronze II] Rampant Growth - 31526

[문제 링크](https://www.acmicpc.net/problem/31526)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 164, 정답: 128, 맞힌 사람: 108, 정답 비율: 78.832%

### 분류

수학, 조합론

### 문제 설명

<p>Eddy is planning his garden, which can be represented as a grid. He wants his garden to have exactly one plant in each column. To make sure that plants do not compete for resources, if two plants are in adjacent columns, they must be in different rows.</p>

<p>Compute the number of different ways he can place plants in his garden to respect the above conditions. Two ways are different if one square has a plant in one arrangement but does not have a plant in the other. Because the number of ways may be large, output the number of ways modulo $998\,244\,353$.</p>

### 입력

<p>The single line of input contains two space-separated integers $r$ and $c$ $(1 \leq r,c\leq 50)$, where $r$ is the number of rows in Eddy&#39;s garden grid, and $c$ is the number of columns.</p>

### 출력

<p>Output a single integer, which is the number of ways Eddy can place plants in his garden, modulo $998\,244\,353$.</p>