# [Platinum III] Milking Grid - 27044

[문제 링크](https://www.acmicpc.net/problem/27044)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

문자열, KMP

### 문제 설명

<p>Every morning when they are milked, the Farmer John&#39;s cows form a rectangular grid that is R (1 &le; R &le; 10,000) rows by C (1 &le; C &le; 75) columns. As we all know, Farmer John is quite the expert on cow behavior, and is currently writing a book about feeding behavior in cows.  He notices that if each cow is labeled with an uppercase letter indicating its breed, the two-dimensional pattern formed by his cows during milking sometimes seems to be made from smaller repeating rectangular patterns.</p>

<p>Help FJ find the rectangular unit of smallest area that can be repetitively tiled to make up the entire milking grid.  Note that the dimensions of the small rectangular unit do not necessarily need to divide evenly the dimensions of the entire milking grid, as indicated in the sample input below.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: R and C</li>
	<li>Lines 2..R+1: The grid that the cows form, with an uppercase letter denoting each cow&#39;s  breed. Each of the R input lines has C characters with no space or other  intervening character.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The area of the smallest unit from which the grid is formed.</li>
</ul>

### 힌트

<p>The entire milking grid can be constructed from repetitions of the pattern &#39;AB&#39;. </p>