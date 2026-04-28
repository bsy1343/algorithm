# [Bronze IV] Quick Estimates - 13297

[문제 링크](https://www.acmicpc.net/problem/13297)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1757, 정답: 1399, 맞힌 사람: 1327, 정답 비율: 79.844%

### 분류

문자열

### 문제 설명

<p>Let&rsquo;s face it... you are not that handy. When you need to make a major home repair, you often need to hire someone to help. When they come for the first visit, they make an estimate of the cost. Here they must be careful: if they overestimate the cost, it might scare you off, but if they underestimate, the work might not be worth their time.</p>

<p>Because the worker is so careful, it can take a long time for them to produce the estimate. But that&rsquo;s frustrating &mdash; when you ask for an estimate, you really are asking for the magnitude of the cost. Will this be \$10 or \$100 or \$1 000? That&rsquo;s all you really want to know on a first visit.</p>

<p>Please help the worker make the type of estimate you desire. Write a program that, given the worker&rsquo;s estimate, reports just the magnitude of the cost &mdash; the number of digits needed to represent the estimate.</p>

### 입력

<p>Input begins with a line containing an integer N (1 &le; N &le; 100). The next N lines each contain one estimated cost, which is an integer between 0 and 10<sup>100</sup>. (Some of the workmen overcharge quite a bit.)</p>

### 출력

<p>For each estimated cost, output the number of digits required to represent it.</p>