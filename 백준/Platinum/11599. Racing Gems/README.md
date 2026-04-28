# [Platinum III] Racing Gems - 11599

[문제 링크](https://www.acmicpc.net/problem/11599)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 91, 정답: 49, 맞힌 사람: 48, 정답 비율: 53.933%

### 분류

기하학, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>You are playing a racing game. Your character starts at the x axis (y = 0) and proceeds up the race track, which has a boundary at the line x = 0 and another at x = w. You may start the race at any horizontal position you want, as long as it is within the track boundary. The finish line is at y = h, and the game ends when you reach that line. You proceed at a fixed vertical velocity v, but you can control your horizontal velocity to be any value between &minus;v/r and v/r, and change it at any time.</p>

<p>There are n gems at specific points on the race track. Your job is to collect as many gems as possible. How many gems can you collect?</p>

### 입력

<p>The first line of input contains four space-separated integers n, r, w, and h (1 &le; n &le; 10<sup>5</sup>, 1 &le; r &le; 10, 1 &le; w, h &le; 10<sup>9</sup>). Each of the following n lines contains two space-separated integers x<sub>i</sub> and y<sub>i</sub>, denoting the coordinate of the ith gem (0 &le; x<sub>i</sub> &le; w, 0 &lt; y<sub>i</sub> &le; h). There will be at most one gem per location.</p>

<p>The input does not include a value for v.</p>

### 출력

<p>Print, on a single line, the maximum number of gems that can be collected during the race.</p>