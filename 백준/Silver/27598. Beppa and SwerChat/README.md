# [Silver I] Beppa and SwerChat - 27598

[문제 링크](https://www.acmicpc.net/problem/27598)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 114, 정답: 71, 맞힌 사람: 64, 정답 비율: 60.952%

### 분류

애드 혹, 두 포인터

### 문제 설명

<p>Beppa and her circle of geek friends keep up to date on a group chat in the instant messaging app SwerChat<sup>TM</sup>.</p>

<p>The group has $n$ members, excluding Beppa. Each of those members has a unique ID between $1$ and $n$. When a user opens a group chat, SwerChat<sup>TM</sup> displays the list of other members of that group, sorted by <strong>decreasing</strong> times of last seen online (so the member who opened the chat most recently is the first of the list). However, the times of last seen are not displayed.</p>

<p>Today, Beppa has been busy all day: she has only opened the group chat twice, once at 9:00 and once at 22:00. Both times, she wrote down the list of members in the order they appeared at that time. Now she wonders: what is the minimum number of other members that must have been online at least once between 9:00 and 22:00?</p>

<p>Beppa is sure that no two members are ever online at the same time and no members are online when Beppa opens the group chat at 9:00 and 22:00.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains an integer $t$ ($1 &le; t &le; 10\,000$) &mdash; the number of test cases. The descriptions of the $t$ test cases follow.</p>

<p>The first line of each test case contains an integer $n$ ($1 &le; n &le; 10^5$) &mdash; the number of members of the group excluding Beppa.</p>

<p>The second line contains $n$ integers $a_1, a_2, \dots , a_n$ ($1 &le; a_i &le; n$) &mdash; the list of IDs of the members, sorted by decreasing times of last seen online at 9:00.</p>

<p>The third line contains $n$ integers $b_1, b_2, \dots , b_n$ ($1 &le; b_i &le; n$) &mdash; the list of IDs of the members, sorted by decreasing times of last seen online at 22:00.</p>

<p>For all $1 &le; i &lt; j &le; n$, it is guaranteed that $a_i \ne a_j$ and $b_i \ne b_j$.</p>

<p>It is also guaranteed that the sum of the values of $n$ over all test cases does not exceed $10^5$.</p>

### 출력

<p>For each test case, print the minimum number of members that must have been online between 9:00 and 22:00.</p>

### 힌트

<p>In the <strong>first test case</strong>, members $4$, $5$ must have been online between 9:00 and 22:00.</p>

<p>In the <strong>second test case</strong>, it is possible that nobody has been online between 9:00 and 22:00.</p>