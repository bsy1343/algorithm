# [Gold V] Climbing - 8273

[문제 링크](https://www.acmicpc.net/problem/8273)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 74, 정답: 25, 맞힌 사람: 21, 정답 비율: 55.263%

### 분류

그리디 알고리즘

### 문제 설명

<p>The Byteburg University holds a climbing course. 2<em>n</em>&nbsp;students can attend the course simultaneously. Each of the climbers has their own separate climbing route along which they can go either upwards or downwards. The climbers are divided into&nbsp;<em>n</em>&nbsp;pairs, with the climbers in each pair climbing on adjacent routes and attached to the same belay rope. Each rope is attached at the top of the wall in a point lying between two routes and should be tense at all times.</p>

<p>The length of each rope is not greater than the height of the climbing wall. When one climber in a pair has reached the top of the wall, the other climber from the pair cannot go downwards.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8273.%E2%80%85Climbing/d238ea38.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8273.%E2%80%85Climbing/d238ea38.png" data-original-src="https://upload.acmicpc.net/20c02c5a-4df1-4c93-84df-09b1753dea98/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 100px; width: 24px;" /></p>

<p align="center">Figure: A pair of climbers attached to a single rope.</p>

<p>Every climber has exactly one adjacent climber to the left and to the right apart from the leftmost and the rightmost climbers who have just one adjacent climber. The climbing instructor has given an exercise to his students: they are to adjust their heights in such a way that there are as many pairs of&nbsp;<b>adjacent</b>&nbsp;climbers from&nbsp;<b>different</b>&nbsp;ropes hanging at the same heights as possible. Help the climbers and find the maximum number of such adjacent climbers.</p>

### 입력

<p>The first line of the standard input contains one integer <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 500 00) that denotes the number of pairs of climbers. The following <em>n</em>&nbsp;lines contain descriptions of climbers from the respective pairs, given from left to right. Each line contains two integers <em>a</em>, <em>b</em>&nbsp;(0 &le; <em>a</em>, <em>b</em> &le; 10<sup>9</sup>) that denote the distances of the climbers in the pair from the point where their rope is attached.</p>

### 출력

<p>The first and only line of the standard output should contain one integer equal to the maximum number of adjacent pairs of climbers from different ropes that can align at the same height.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8273.%E2%80%85Climbing/37964e49.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8273.%E2%80%85Climbing/37964e49.png" data-original-src="https://upload.acmicpc.net/72d0863b-87a0-4348-96bb-e46040a88e28/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 96px;" /></p>