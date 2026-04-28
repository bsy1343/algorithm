# [Gold V] Round Corridor - 27483

[문제 링크](https://www.acmicpc.net/problem/27483)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 64, 정답: 52, 맞힌 사람: 46, 정답 비율: 79.310%

### 분류

수학, 정수론

### 문제 설명

<p>Amugae is in a very large round corridor. The corridor consists of two areas. The inner area is equally divided by $n$ sectors, and the outer area is equally divided by $m$ sectors. A wall exists between each pair of sectors of same area (inner or outer), but there is no wall between the inner area and the outer area. A wall always exists at the 12 o&rsquo;clock position.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/27483.%E2%80%85Round%E2%80%85Corridor/8544b62b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/27483.%E2%80%85Round%E2%80%85Corridor/8544b62b.png" data-original-src="https://upload.acmicpc.net/7d7319f0-d94a-4313-bf38-73914823dca3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>The inner area&rsquo;s sectors are denoted as $(1,1) ,(1,2) ,\dots ,(1,n)$ in clockwise direction. The outer area&rsquo;s sectors are denoted as $(2,1) ,(2,2) ,\dots ,(2,m)$ in the same manner. For a clear understanding, see the example image above.</p>

<p>Amugae wants to know if he can move from one sector to another sector. He has $q$ questions.</p>

<p>For each question, check if he can move between two given sectors.</p>

### 입력

<p>The first line contains three integers $n$, $m$ and $q$ ($1\le n,m\le 10^{18}$, $1\le q\le 10^4$) --- the number of sectors in the inner area, the number of sectors in the outer area and the number of questions.</p>

<p>Each of the next $q$ lines contains four integers $s_x$, $s_y$, $e_x$, $e_y$ ($1\le s_x,e_x\le 2$; if $s_x=1$, then $1\le s_y\le n$, otherwise $1\le s_y\le m$; constraints on $e_y$ are similar). Amague wants to know if it is possible to move from sector $(s_x,s_y)$ to sector $(e_x,e_y)$.</p>

### 출력

<p>For each question, print &ldquo;<code>YES</code>&rdquo; if Amugae can move from $(s_x,s_y)$ to $(e_x,e_y)$, and &ldquo;<code>NO</code>&rdquo; otherwise.</p>

<p>You can print each letter in any case (upper or lower).</p>

### 힌트

<p>Example is shown on the picture in the statement.</p>