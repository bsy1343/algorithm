# [Platinum II] Digital Addition - 13476

[문제 링크](https://www.acmicpc.net/problem/13476)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 26, 정답: 15, 맞힌 사람: 14, 정답 비율: 56.000%

### 분류

백트래킹, 비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 구현

### 문제 설명

<p>Deidra is doing a columnar addition. She writes down two non-negative integer summands one below&nbsp;the other, left-pads them with zeroes so that they have equal length, and calculates the sum (e. g.&nbsp;77 + 05 = 82). If the sum is longer than each of the summands (because of a carry, as in 96 + 07 = 103)&nbsp;she appends a zero at the beginning of each summand (096 + 007 = 103). She allows herself to use&nbsp;unnecessary leading zeroes (007 + 004 = 011) as soon as the length of all three numbers is the same.</p>

<p>Also Deidra has a homemade printing press. She decided to print her addition without a plus or a&nbsp;horizontal line, using the following standard font:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13476.%E2%80%85Digital%E2%80%85Addition/0ac96e53.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13476/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-01%20%EC%98%A4%ED%9B%84%202.41.11.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:55px; width:375px" /></p>

<p>Unfortunately, she messed up with spacing, and all the digits were printed over each other in the following&nbsp;way. Digits that were supposed to be horizontally adjacent were printed so that the right two segments&nbsp;of the left digit coincide with the left two segments of the right digit. Digits that were supposed to be&nbsp;vertically adjacent were printed so that the bottom half (a square with 4 segments) of the upper digit&nbsp;coincides with the top half of the lower digit.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13476.%E2%80%85Digital%E2%80%85Addition/da84140c.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13476/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-01%20%EC%98%A4%ED%9B%84%202.41.17.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:151px; width:170px" /></p>

<p>When one or more black segments are printed at the same position, the result looks black. When only&nbsp;empty segments are printed at the position, the result looks white.</p>

<p>Given the resulting picture, find a correct addition that could produce it or detect that there is none.</p>

### 입력

<p>The first line of the input contains an integer w (1 &le; w &le; 100) &mdash; the width of Deidra&rsquo;s addition (number&nbsp;of digits in each line).</p>

<p>The following 9 lines contain the description of the picture printed with the bad spacing. Each line&nbsp;contains w or w + 1 digits. &lsquo;1&rsquo; denotes a black segment, &lsquo;0&rsquo; denotes a white one. Even lines start with a&nbsp;space. See the examples for clarification.</p>

### 출력

<p>If there is no valid addition, output &ldquo;NO&rdquo;.</p>

<p>Otherwise output a valid addition that produces the given figure. The output should consist of three&nbsp;lines, each containing w digits.</p>

<p>If there are several solutions, output any of them.</p>