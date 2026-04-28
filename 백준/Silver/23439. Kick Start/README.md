# [Silver III] Kick Start - 23439

[문제 링크](https://www.acmicpc.net/problem/23439)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 18, 정답: 16, 맞힌 사람: 12, 정답 비율: 85.714%

### 분류

구현, 정렬

### 문제 설명

<p>Kick Start is a global online coding competition brought by Google. Participants can compete in online rounds held throughout the entire year, and will have the opportunity to develop and grow their programming abilities while getting a glimpse into the technical skills needed for a career at Google.</p>

<p>Mr. Panda is a Kick Start enthusiast who doesn&#39;t miss any Kick Start round of any year. He is now reading the 2019 schedule of rounds and wonders what&#39;s the date of the next Kick Start round (<strong>excluding today</strong>). Can you help Mr. Panda determine that date?</p>

<p>Any given date in this problem will be in the format of a month abbreviation followed by a date ordinal number. Recall that month abbreviations are &#39;Jan&#39;, &#39;Feb&#39;, &#39;Mar&#39;, &#39;Apr&#39;, &#39;May&#39;, &#39;Jun&#39;, &#39;Jul&#39;, &#39;Aug&#39;, &#39;Sept&#39;, &#39;Oct&#39;, &#39;Nov&#39;, and &#39;Dec&#39;; and ordinal numbers are &#39;1st&#39;, &#39;2nd&#39;, &#39;3rd&#39;, &#39;4th&#39;, &#39;5th&#39;, etc.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$ ($1 \le T \le 100$). $T$ test cases follow.</p>

<p>For each test case, the first line contains an integer $n$ ($1 \le n \le 20$), the number of scheduled Kick Start rounds for this year.</p>

<p>In the next $n$ lines, each line contains a date in the year 2019, in the format of a month abbreviation followed by a date ordinal number. Note that scheduled dates may <strong>not</strong> be arranged in chronological order, and all scheduled dates are distinct.</p>

<p>The last line contains the date of today, also in the format of a month abbreviation followed by a date ordinal number.</p>

### 출력

<p>For each test case, output one line containing &quot;<code>Case #x: y</code>&quot;, where <code>x</code> is the test case number (starting from $1$), and <code>y</code> is the date of the next Kick Start round or &quot;See you next year&quot; (quotes for clarity) if there is no following Kick Start round of this year.</p>