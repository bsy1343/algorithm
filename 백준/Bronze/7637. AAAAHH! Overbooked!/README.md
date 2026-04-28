# [Bronze I] AAAAHH! Overbooked! - 7637

[문제 링크](https://www.acmicpc.net/problem/7637)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 224, 정답: 146, 맞힌 사람: 135, 정답 비율: 71.809%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>Elaine is excited to begin the school year&mdash;so excited, in fact, that she signed herself up to attend several events today (This programming contest, sadly, is not one of them). She may have overdone it, though; she didn&rsquo;t bother to check whether the events she signed up for have conflicting times. While you&rsquo;re sitting here in this contest, why not check for her?</p>

### 입력

<p>The input consists of multiple test cases. Each test case begins with an integer N, 1 &le; N &le; 100, on a line by itself denoting the number of events. After that follow N lines giving the start and end times of each event, in hh:mm-hh:mm 24-hour format. The end time is guaranteed to be strictly after the start time. Input is followed by a single line with N = 0, which should not be processed.</p>

### 출력

<p>For each test case, print out a single line that says &ldquo;conflict&rdquo; (no quotes) if Elaine&rsquo;s events have conflicting times, and &ldquo;no conflict&rdquo; (no quotes) otherwise. Assume that Elaine can travel around campus instantaneously, so if an event starts at the same time another event ends, the two events do not conflict.</p>