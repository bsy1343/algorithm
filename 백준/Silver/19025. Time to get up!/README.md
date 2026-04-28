# [Silver III] Time to get up! - 19025

[문제 링크](https://www.acmicpc.net/problem/19025)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 45, 맞힌 사람: 37, 정답 비율: 88.095%

### 분류

구현, 문자열

### 문제 설명

<p>Little Q&#39;s alarm is ringing! It&#39;s time to get up now! However, after reading the time on the clock, Little Q lies down and starts sleeping again. Well, he has five alarms, and it&#39;s just the first one, he can continue sleeping for a while.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/19025.%E2%80%85Time%E2%80%85to%E2%80%85get%E2%80%85up!/6b8fad42.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/19025.%E2%80%85Time%E2%80%85to%E2%80%85get%E2%80%85up!/6b8fad42.png" data-original-src="https://upload.acmicpc.net/d9b66f26-5dc6-44dc-8fc0-f50d34972c0c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 320px; height: 48px;" /></p>

<p>Little Q&#39;s clock uses a standard 7-segment LCD display for all digits, plus two small segments for the &quot;<code>:</code>&quot;, and shows all times in 24-hour format. The &quot;<code>:</code>&quot; segments are on at all times.</p>

<p>Your job is to help Little Q read the time shown on his clock.</p>

### 입력

<p>The first line of the input contains an integer $T$: the number of test cases ($1 \leq T \leq 1440$).</p>

<p>Each test case is given on seven lines as a $7 \times 21$ ASCII image of the clock screen.</p>

<p>Each digit segment is represented by two characters, and each colon segment is represented by one character. Character &quot;<code>X</code>&quot;&nbsp;indicates a lit segment, character &quot;<code>.</code>&quot; indicates a dark segment or empty space. See the sample input for details.</p>

### 출력

<p>For each test case, print a single line containing a string $t$ formatted as &quot;<code>HH:MM</code>&quot;: the time shown on the clock ($\texttt{00:00} \leq t \leq \texttt{23:59}$).</p>