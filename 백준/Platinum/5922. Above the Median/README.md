# [Platinum IV] Above the Median - 5922

[문제 링크](https://www.acmicpc.net/problem/5922)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 348, 정답: 178, 맞힌 사람: 143, 정답 비율: 53.358%

### 분류

자료 구조, 세그먼트 트리, 누적 합

### 문제 설명

<p>Farmer John has lined up his N (1 &lt;= N &lt;= 100,000) cows in a row to measure their heights; cow i has height H_i (1 &lt;= H_i &lt;= 1,000,000,000) nanometers--FJ believes in precise measurements! He wants to take a picture of some contiguous subsequence of the cows to submit to a bovine photography contest at the county fair.</p><p>The fair has a very strange rule about all submitted photos: a photograph is only valid to submit if it depicts a group of cows whose median height is at least a certain threshold X (1 &lt;= X &lt;= 1,000,000,000).</p><p>For purposes of this problem, we define the median of an array A[0...K] to be A[ceiling(K/2)] after A is sorted, where ceiling(K/2) gives K/2 rounded up to the nearest integer (or K/2 itself, it K/2 is an integer to begin with). For example the median of {7, 3, 2, 6} is 6, and the median of {5, 4, 8} is 5.</p><p>Please help FJ count the number of different contiguous subsequences of his cows that he could potentially submit to the photography contest.</p>

### 입력

<ul><li>Line 1: Two space-separated integers: N and X.</li><li>Lines 2..N+1: Line i+1 contains the single integer H_i.</li></ul>

### 출력

<ul><li>Line 1: The number of subsequences of FJ&apos;s cows that have median at least X. Note this may not fit into a 32-bit integer.</li></ul>

### 힌트

<h4>Input Details</h4><p>FJ&apos;s four cows have heights 10, 5, 6, 2. We want to know how many contiguous subsequences have median at least 6.</p><h4>Output Details</h4><p>There are 10 possible contiguous subsequences to consider. Of these, only 7 have median at least 6. They are {10}, {6}, {10, 5}, {5, 6}, {6, 2}, {10, 5, 6}, {10, 5, 6, 2}.</p>