# [Bronze I] Alarm Clock - 10372

[문제 링크](https://www.acmicpc.net/problem/10372)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 342, 정답: 236, 맞힌 사람: 203, 정답 비율: 69.283%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Alice likes her digital alarm clock. She sets them up every evening. Last night Alice had a dream about her clock. Unfortunately, the only thing she is able to remember is the number of highlighted segments of the clock. Alice wonders what time was set on the clock in her dream.</p>

<p>Alice&rsquo;s clock have four digits: two for hours and two for minutes. For example, the clock below shows 9:30 (note the leading zero).</p>

<p style="text-align:center"><img alt="" src="/upload/images2/alarm1.png" style="height:69px; width:149px" /></p>

<p>The clock uses following digit representation.</p>

<p style="text-align:center"><img alt="" src="/upload/images2/alarm2.png" style="height:69px; width:395px" /></p>

### 입력

<p>The only line of the input file contains single integer n &mdash; the number of highlighted segments of the clock in Alice&rsquo;s dream (0 &le; n &le; 30).</p>

### 출력

<p>Output five characters in &ldquo;hh:mm&rdquo; format &mdash; the time shown on the clock in Alice&rsquo;s dream. The time must be correct: 0 &le; hh &lt; 24 and 0 &le; mm &lt; 60. If there are many possible correct times, output any of them. If there is none, output &ldquo;Impossible&rdquo;.</p>