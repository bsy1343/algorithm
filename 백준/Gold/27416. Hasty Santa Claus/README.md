# [Gold IV] Hasty Santa Claus - 27416

[문제 링크](https://www.acmicpc.net/problem/27416)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 249, 정답: 138, 맞힌 사람: 124, 정답 비율: 57.407%

### 분류

그리디 알고리즘

### 문제 설명

<p>Hasty Santa Claus has arrived at the town on December 1st. Realizing that it is a little bit too early for Christmas, he plans to leave the presents before (or even after) Christmas while families are out on vacation trips.</p>

<p>Santa knows which families depart and return on which days, but he can visit only a limited number of houses a day. He is stuck with finding which houses are to be visited on which days to distribute the presents to every family. Please help him solving the problem, not only for Santa but also for kids anxiously awaiting for the presents!</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$n$ $k$</p>

<p>$a_1$ $b_1$</p>

<p>$\vdots$</p>

<p>$a_n$ $b_n$</p>
</blockquote>

<p>The first line has two positive integers, $n$ and $k$, the number of houses to leave the presents and the maximum number of houses that Santa Claus can visit a day, respectively.</p>

<p>The $i$-th line of the following $n$ lines has two positive integers $a_i$ and $b_i$. They indicate that he can visit the $i$-th house between the $a_i$-th and $b_i$-th days, inclusive.</p>

<p>$n$ and $k$ satisfy $1 &le; k &le; n &le; 1000$. For each $i$, $a_i$ and $b_i$ satisfy $1 &le; a_i &le; 25 &le; b_i &le; 31$.</p>

### 출력

<p>Print $n$ lines of one integer describing a plan for Santa to complete his task. The integer on the i-th line means the date on which Santa should visit the $i$-th house.</p>

<p>At least one solution is guaranteed to exist. If there are two or more solutions, any of them is accepted.</p>

### 힌트

<p>The first sample is depicted in the figure below. Santa can leave the presents during the periods shown as horizontal lines with short vertical markers at both ends. For the House 4, Santa can visit only on a specific day. The triangles show the days on which Santa should visit each house.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/27416.%E2%80%85Hasty%E2%80%85Santa%E2%80%85Claus/ce54a791.png" data-original-src="https://upload.acmicpc.net/78f42f02-c70e-43b6-8cb5-542cb70daeda/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 507px; height: 188px;" /></p>

<p style="text-align: center;">Figure A.1. Sample 1</p>