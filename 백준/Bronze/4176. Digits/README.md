# [Bronze II] Digits - 4176

[문제 링크](https://www.acmicpc.net/problem/4176)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 487, 정답: 228, 맞힌 사람: 185, 정답 비율: 47.074%

### 분류

구현, 문자열, 시뮬레이션

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/4176.%E2%80%85Digits/9c113c85.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/4176.%E2%80%85Digits/9c113c85.png" data-original-src="https://www.acmicpc.net/upload/images2/D.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:164px; width:270px" />A googol written out in decimal has 101 digits. A googolplex has one plus a googol digits. That&#39;s a lot of digits!</p>

<p>Given any number x<sub>0</sub>, define a sequence using the following recurrence:</p>

<blockquote>
<p>x<sub>i+1</sub> = the number of digits in the decimal representation of x<sub>i</sub></p>
</blockquote>

<p>Your task is to determine the smallest positive i such that x<sub>i</sub> = x<sub>i-1</sub>.</p>

### 입력

<p>Input consists of several lines. Each line contains a value of x<sub>0</sub>. Every value of x<sub>0</sub> is non-negative and has no more than one million digits. The last line of input contains the word END.</p>

### 출력

<p>For each value of x<sub>0</sub> given in the input, output one line containing the smallest positive i such that x<sub>i</sub> = x<sub>i-1</sub>.</p>