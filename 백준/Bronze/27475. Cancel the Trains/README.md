# [Bronze III] Cancel the Trains - 27475

[문제 링크](https://www.acmicpc.net/problem/27475)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 345, 정답: 312, 맞힌 사람: 288, 정답 비율: 90.852%

### 분류

수학, 구현

### 문제 설명

<p>Gildong&rsquo;s town has a train system that has $100$ trains that travel from the bottom end to the top end and $100$ trains that travel from the left end to the right end. The trains starting from each side are numbered from $1$ to $100$, respectively, and all trains have the same speed. Let&rsquo;s take a look at the picture below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/27475.%E2%80%85Cancel%E2%80%85the%E2%80%85Trains/b80520fb.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/27475.%E2%80%85Cancel%E2%80%85the%E2%80%85Trains/b80520fb.png" data-original-src="https://upload.acmicpc.net/e66d8b5c-1c9d-46f0-ba78-563e9d4ea7e8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 447px; height: 423px;" /></p>

<p>The train system can be represented as coordinates on a 2D plane. The $i$-th train starting at the bottom end is initially at $(i,0)$ and will be at $(i,T)$ after $T$ minutes, and the $i$-th train starting at the left end is initially at $(0,i)$ and will be at $(T,i)$ after $T$ minutes. All trains arrive at their destinations after $101$ minutes.</p>

<p>However, Gildong found that some trains scheduled to depart at a specific time, simultaneously, are very dangerous. At this time, $n$ trains are scheduled to depart from the bottom end and $m$ trains are scheduled to depart from the left end. If two trains are both at $(x,y)$ at the same time for some $x$ and $y$, they will crash into each other. Therefore, he is asking you to find the <strong>minimum</strong> number of trains that should be cancelled to prevent all such crashes.</p>

### 입력

<p>Each test contains one or more test cases. The first line contains the number of test cases $t$ ($1\le t\le 100$).</p>

<p>Each test case contains three lines. The first line of each test case consists of two integers $n$ and $m$ ($1\le n,m\le 100$) --- the number of trains scheduled to depart from the bottom end, and the number of trains scheduled to depart from the left end, respectively.</p>

<p>The second line of each test case contains $n$ integers. Each integer is a train number that is scheduled to start from the <strong>bottom</strong> end. The numbers are given in strictly increasing order, and are between $1$ and $100$, inclusive.</p>

<p>The third line of each test case contains $m$ integers. Each integer is a train number that is scheduled to start from the <strong>left</strong> end. The numbers are given in strictly increasing order, and are between $1$ and $100$, inclusive.</p>

### 출력

<p>For each test case, print a single integer: the minimum number of trains that should be canceled in order to prevent all crashes.</p>

### 힌트

<p>In the first case, we can show that there will be no crashes if the current schedule is followed. Therefore, the answer is zero.</p>

<p>In the second case, at $T=4$, there will be a crash, as can be seen in the picture below. We can prove that after canceling one of these trains, the remaining trains will not crash. Therefore, the answer is one.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/27475.%E2%80%85Cancel%E2%80%85the%E2%80%85Trains/a8e65108.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/27475.%E2%80%85Cancel%E2%80%85the%E2%80%85Trains/a8e65108.png" data-original-src="https://upload.acmicpc.net/e318360d-33d0-4616-988f-4a3c4660241a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>