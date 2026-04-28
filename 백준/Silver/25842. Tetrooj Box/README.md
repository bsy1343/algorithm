# [Silver IV] Tetrooj Box - 25842

[문제 링크](https://www.acmicpc.net/problem/25842)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 51, 정답: 48, 맞힌 사람: 43, 정답 비율: 93.478%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Dr. Orooji&rsquo;s children have played Tetris but are not willing to help Dr. O with a related problem. Dr. O&rsquo;s children don&rsquo;t realize that Dr. O is lucky to have access to 100+ great problem solvers and great programmers today!</p>

<p>Dr. O knows the length of the base for a 2D box and wants to figure out the needed height for the box. Dr. O will drop some 2D blocks (rectangles) on the base. A block will go down until it lands on the base or is stopped by an already-dropped block (i.e., it lands on that block). After all the blocks have been dropped, we can determine the needed height for the box &ndash; the tallest column is the needed height (please see pictures on the next page corresponding to Sample Input/Output).</p>

### 입력

<p>The first input line contains two integers: b (1 &le; b &le; 100), indicating the length of the base and r (1 &le; r &le; 50), indicating the number of blocks (rectangular pieces) to be dropped. Each of the next r input lines contains three integers: a block&rsquo;s horizontal length h (1 &le; h &le; 100), the block&rsquo;s vertical length v (1 &le; v &le; 100), and c (c &ge; 1), the leftmost column the block is dropped into. Assume that the h and c values will be such that the block will not go beyond the box base, i.e., (c + h &ndash; 1) &le; b.</p>

### 출력

<p>Print the needed height for the box (the tallest column is the height).</p>

### 힌트

<p>First Sample Input/Output:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/25842.%E2%80%85Tetrooj%E2%80%85Box/7f695e01.png" data-original-src="https://upload.acmicpc.net/31223340-58cb-477d-8ce7-a85d2913b242/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 248px;" /></p>

<p>Second Sample Input/Output:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/25842.%E2%80%85Tetrooj%E2%80%85Box/68dc5b2e.png" data-original-src="https://upload.acmicpc.net/031b5242-2536-4b28-8345-f2e02c652063/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 210px;" /></p>