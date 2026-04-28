# [Silver III] Dancers - 7494

[문제 링크](https://www.acmicpc.net/problem/7494)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 22, 맞힌 사람: 20, 정답 비율: 90.909%

### 분류

구현, 정렬, 기하학, 시뮬레이션

### 문제 설명

<p>Alex missed the ballroom dance competition that he wanted to attend. So now he wants to know the pairs of dancers whose dancing he missed. He had several photos from the competition, so he chose one where all dancers are clearly visible and wrote down the coordinates of all&nbsp;<strong>N</strong>&nbsp;dancers (<strong>N</strong>&nbsp;is even).</p>

<p>Then Alex determined the pairs of dancers by the following algorithm: from not yet paired dancers he chooses two closest (to each other) dancers and assumes that they dance together as a pair. Should he find several pairs of dancers with the same minimum distance between dancers, he chooses lexicographically smallest pair (Alex enumerated dancers by integer numbers from&nbsp;<strong>1</strong>&nbsp;to&nbsp;<strong>N</strong>, dancers are ordered inside a pair, one with lower number goes first). You are asked to help Alex to determine pairs of dancers.</p>

### 입력

<p>The first line of input contains even integer&nbsp;<strong>N</strong>&nbsp;(<strong>2</strong>&nbsp;&le;&nbsp;<strong>N</strong>&nbsp;&le;&nbsp;<strong>300</strong>). Each&nbsp;<strong>i</strong>-th line of the next&nbsp;<strong>N</strong>&nbsp;lines contains two integers &mdash;&nbsp;<strong>x</strong>&nbsp;and&nbsp;<strong>y</strong>&nbsp;coordinates of&nbsp;<strong>i</strong>-th dancer. All coordinates are less than&nbsp;<strong>10</strong><sup><strong>8</strong>&nbsp;</sup>by absolute value.</p>

### 출력

<p>You should output&nbsp;<strong>N</strong>/<strong>2</strong>&nbsp;lines. Each line must contain numbers of dancers in the corresponding pair. The first number in a line should be less than the second. Lines must be sorted in the lexicographically ascending order.</p>