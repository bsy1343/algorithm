# [Gold II] Circle of Friends - 5241

[문제 링크](https://www.acmicpc.net/problem/5241)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>After measuring the strength of friendships between different Navi, Grace wants to find groups of Navi who form close-knit friendships. A group of friends has strength k if each Navi in the group has at least k friends within the group. Your goal is to help Grace find the strongest, largest circle of friends for individual Navi.</p>

### 입력

<p>Connections between Navi are described beginning with the line &ldquo;GRAPH BEGIN&rdquo;. Additional lines lists individual Navi, followed (on the same line) by their friends. The line &rdquo;GRAPH END&rdquo; ends the list of connection descriptions. The next lines describe individual Navi to be analyzed, each on a single line. Following these lines, a completely new instance of the problem can be given, starting from scratch.</p>

<p>Some Navi may be only be listed as friends of other Navi (i.e., not all Navi will have their connections listed on a separate line).</p>

### 출력

<p>Your output should consist of one line for each Navi analyzed, in the same order they were listed in the input. Each line should contain the name of the Navi, the largest k for which the Navi is a member of some group of friends of strength k, and all the friends in that group (in alphabetical order), including themselves. Every Navi in the group must know the initial Navi either directly or indirectly through some sequence of common friends (i.e., the friendship graph must be connected).</p>

<p>In the example below, Navi c is a member of a group of friends of strength 3: bcde. She is also a member of several groups of friends of strength 2 (bcd, bce, cde, . . . ) but because 3 &gt; 2, the group of strength 3 is the one that should be output.</p>

<p>Navi f is a member of several groups of strength 1 (ef, bef, def, . . . ) but the largest one is abcdef, so that is the one that should be output.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5241.%E2%80%85Circle%E2%80%85of%E2%80%85Friends/07f1d674.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/5241.%E2%80%85Circle%E2%80%85of%E2%80%85Friends/07f1d674.png" data-original-src="https://upload.acmicpc.net/81f0f8f5-275f-45d0-a57f-cbc06b0a46e5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 187px; height: 232px;" /></p>