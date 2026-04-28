# [Silver II] Orienteering - 8296

[문제 링크](https://www.acmicpc.net/problem/8296)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 45, 정답: 26, 맞힌 사람: 23, 정답 비율: 54.762%

### 분류

구현

### 문제 설명

<p>Byteman is organizing an orienteering competition. Participants will be given a map that indicates checkpoints, and they are to visit each one of them in a given order. By the traditions of Byteland, the route has to be a closed loop. An appropriate area has been found and the route planned accordingly. However, the starting point, which will be the first and the last to visit, and the race direction are yet to be chosen.</p>

<p>Byteman decided that every part of the race should not be more difficult than a previous one. He walked the entire way noting stage difficulty between every two consecutive checkpoints as positive integer numbers. The higher the number is, the more difficult the corresponding part of the route. Your task is to check whether there exist such starting point and race direction, that Byteman&#39;s constraint is satisfied.</p>

### 입력

<p>The first line of the standard input contains an integer <em>n</em>&nbsp;(2 &le; <em>n</em> &le; 100 000) denoting the number of all checkpoints on the route. The checkpoints are numbered from 1&nbsp;to&nbsp;<em>n</em>. In the second line, there is a sequence of&nbsp;<em>n</em>&nbsp;integers <em>t<sub>i</sub></em>&nbsp;(1 &le; <em>t<sub>i</sub></em> &le; 1 000 000 000), in which <em>i</em>-th number describes difficulty of the stage between checkpoints <em>i</em>&nbsp;and <em>i</em> + 1, except for <em>t<sub>n</sub></em>, which denotes the difficulty of the stage between checkpoints <em>n</em>&nbsp;and 1.</p>

### 출력

<p>In the first line of the standard output your program should output &quot;<code>TAK</code>&quot; (meaning yes, without the quotes), if there is a starting point and race direction satisfying Byteman&#39;s condition, and &quot;<code>NIE</code>&quot; (meaning no) otherwise.</p>

### 힌트

<p>In the first example Byteman may set the starting point in the fourth checkpoint (i.e., at the end of the stage with difficulty 10) and the competitors can start the race going towards the third checkpoint. The consecutive stages on their way will have difficulties equal to 10, 8, 3, 3 and 1. In the second example no solution exists.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/5d63a192-2b90-4483-852a-fc91edd7f537/-/preview/" style="width: 160px; height: 108px;" /></p>

<p style="text-align: center;">The route of the orienteering competition in the first example. The circles contain the numbers of checkpoints, and the numbers next to the edges represent the difficulties of the stages in the route. The arrows in the picture show valid starting point and race direction.</p>