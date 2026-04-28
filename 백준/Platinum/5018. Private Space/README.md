# [Platinum IV] Private Space - 5018

[문제 링크](https://www.acmicpc.net/problem/5018)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 7, 맞힌 사람: 5, 정답 비율: 33.333%

### 분류

다이나믹 프로그래밍, 비트마스킹, 백트래킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5018.%E2%80%85Private%E2%80%85Space/b4f9c27f.png" data-original-src="https://www.acmicpc.net/upload/images2/privatespace.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:328px; width:272px" />People are going to the movies in groups (or alone), but normally only care to socialize within that group. Being Scandinavian, each group of people would like to sit at least one space apart from any other group of people to ensure their privacy, unless of course they sit at the end of a row. The number of seats per row in the cinema starts at X and decreases with one seat per row (down to a number of 1 seat per row). The number of groups of varying sizes is given as a vector (N1, . . . , Nn), where N1 is the number of people going alone, N2 is the number of people going as a pair etc. Calculate the seat-width, X, of the widest row, which will create a solution that seats all (groups of) visitors using as few rows of seats as possible. The cinema also has a limited capacity, so the widest row may not exceed 12 seats.</p>

### 입력

<p>The first line of input contains a single integer n (1 &le; n &le; 12), giving the size of the largest group in the test case.</p>

<p>Then follows a line with n integers, the i-th integer (1-indexed) denoting the number of groups of i persons who need to be seated.</p>

### 출력

<p>A single number; the size of the smallest widest row that will accommodate all the guests. If this number is greater than 12, output impossible instead.</p>