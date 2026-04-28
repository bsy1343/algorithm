# [Gold IV] Passport Stamps - 31958

[문제 링크](https://www.acmicpc.net/problem/31958)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB (추가 메모리 없음)

### 통계

제출: 138, 정답: 50, 맞힌 사람: 48, 정답 비율: 42.105%

### 분류

수학, 그리디 알고리즘

### 문제 설명

<p>You just got your new passport, fresh with pages ready to be stamped by immigration officers. Sadly, because your passport has so many pages, immigration officers are too lazy to try to use your pages efficiently, so you may need to get a new passport sooner than you think...</p>

<p>You have some trips prepared. For each trip, when you go through passport control, the immigration officer will look for  some contiguous pages, none of which are stamped, and then stamp all of them. Because the officer is lazy, there is no guarantee which contiguous pages get stamped.</p>

<p>You will start making these trips in order until your passport no longer has enough contiguous empty pages to satisfy the next trip, at which point you will apply for a new passport. Your plans are fixed - you will not skip a trip in the middle even if it means you could make more future trips.</p>

<p>If the immigration officers conspire against you, find the first trip where it is possible you cannot travel because your passport does not have enough consecutive blank pages (or if you can always make all trips without running out of blank pages).</p>

### 입력

<p>The first line of input contains two integers $n$ ($1 \le n \le 10^5$) and $p$ ($1 \le p \le 10^{18}$), where $n$ is the number of trips you have planned, and $p$ is the number of pages in your new passport.</p>

<p>Each of the next $n$ lines contains a single integer $c$ ($1 \le c \le 10^{18}$), which is the number of contiguous pages which will need to be stamped for that trip.</p>

### 출력

<p>Output a single integer, which is the minimum number of trips you could possibly take before you would need a new passport because there aren&#39;t enough consecutive blank pages for your next trip. Output $n$ if you can take all trips, even in the worst case.</p>