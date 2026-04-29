# [Silver II] Memories of Passport Stamps - 32857

[문제 링크](https://www.acmicpc.net/problem/32857)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 47, 정답: 28, 맞힌 사람: 21, 정답 비율: 56.757%

### 분류

매개 변수 탐색, 이분 탐색

### 문제 설명

<p>You just got your new passport, fresh with pages ready to be stamped by immigration officers. Sadly, because your passport has so many pages, immigration officers are too lazy to try to use your pages efficiently, so you may need to get a new passport sooner than you think.</p>

<p>You have some trips prepared. For each trip, when you go through passport control, the immigration officer will look for some contiguous pages, none of which are stamped, and then stamp all of them. Because the officer is lazy, there is no guarantee which contiguous pages get stamped.</p>

<p>Now, your passport no longer has enough contiguous empty pages to satisfy your next trip, so you’re in the process of applying for a new passport. Before you do that, you decide to scan through your passport and reminisce about all the fun trips you had. Your least favorite part of these trips was waiting for immigration officers to stamp your passport.</p>

<p>Leafing through your passport, you remember that you took $k$ trips. There are $n$ contiguous sections of stamped pages. What is the minimum value $s$ such that it is possible for each officer to stamp somewhere between $0$ and $s$ pages (both inclusive), so that you can get exactly the sections of stamped pages that you have in your passport now? Different officers may stamp different numbers of pages, and an officer is allowed to stamp zero pages.</p>

### 입력

<p>The first line of input contains two integers $n$ ($1 ≤ n ≤ 10^5$) and $k$ ($n ≤ k ≤ 10^{18}$), where $n$ is the number of contiguous sections of stamped pages, and $k$ is the number of trips you took.</p>

<p>The next $n$ lines each contain a single integer $p$ ($1 ≤ p ≤ 10^{18}$), the number of contiguous stamped pages in a section of your passport. It is guaranteed your passport will have at most $10^{18}$ stamped pages in total.</p>

### 출력

<p>Output a single integer, the minimum value $s$ such that it is possible for each officer to stamp somewhere between $0$ and $s$ pages so that you can get exactly the sections of stamped pages that you have in your passport now.</p>