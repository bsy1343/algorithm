# [Silver III] Auxiliary Project - 15131

[문제 링크](https://www.acmicpc.net/problem/15131)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 301, 정답: 202, 맞힌 사람: 174, 정답 비율: 68.775%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Anna has just finished her course project. She has a lot of seven-segment LED displays as leftovers and a small power source. Each display consumes power proportionally to the number of lit segments, e.g. &lsquo;9&rsquo; consumes twice more power than &lsquo;7&rsquo;.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15131/1.png" style="height:58px; width:375px" /></p>

<p>Anna wonders what is the maximum possible sum of digits she is able to achieve, if her power source is able to light n segments, and she wants to light exactly n segments.</p>

### 입력

<p>The single line of the input contains one integer n &mdash; the number of segments that should be lit (2 &le; n &le; 10<sup>6</sup>).</p>

### 출력

<p>Output a single integer &mdash; the maximum possible sum of digits that can be displayed simultaneously.</p>

### 힌트

<p>In the first example, a single &lsquo;4&rsquo; should be displayed (&lsquo;7&rsquo; has greater value, but has only three segments). In the second example &lsquo;4&rsquo; and &lsquo;7&rsquo; should be displayed, in the third one &mdash; two &lsquo;7&rsquo;s.</p>