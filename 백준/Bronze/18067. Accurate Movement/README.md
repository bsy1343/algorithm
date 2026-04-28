# [Bronze I] Accurate Movement - 18067

[문제 링크](https://www.acmicpc.net/problem/18067)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 192, 정답: 132, 맞힌 사람: 113, 정답 비율: 72.436%

### 분류

수학, 구현, 브루트포스 알고리즘, 시뮬레이션

### 문제 설명

<p>Amelia is studying modeling. She is interested in models with moving parts.</p>

<p>As her first task, she made a rectangular box of size 2 &times; n, which contains two parallel rails and a rectangular bar on each of them. The short bar has size 1 &times; a, and the long one has size 1 &times; b. The long bar has a stopper at each end, and the short one is always between these two stoppers.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/fd4de1f0-e5cd-4093-85f8-9d1673a3bbe0/-/preview/" style="width: 424px; height: 105px;" /></p>

<p>The bars can be moved along the rails, one bar at a time, as long as the short bar is between the stoppers. So, on each move Amelia selects one of the bars and moves it, while the other one stays in place.</p>

<p>Initially, both bars are aligned to one side of the box, and Amelia wants them to be aligned to the other side in as few moves as possible. What is the minimal number of moves she should do to achieve her goal?</p>

### 입력

<p>The only input line contains three integers a, b, and n (1 &le; a &lt; b &le; n &le; 10<sup>7</sup>).</p>

### 출력

<p>The only output line should contain a single integer &mdash; the minimal number of moves Amelia needs to do.</p>

### 힌트

<p>A possible solution for the first example is shown below.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/6b776d61-f1d1-46a3-bfa0-cf5876f23c83/-/preview/" style="width: 419px; height: 202px;" /></p>