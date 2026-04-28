# [Silver III] Weighted Window Sums - 30218

[문제 링크](https://www.acmicpc.net/problem/30218)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 111, 정답: 58, 맞힌 사람: 46, 정답 비율: 58.228%

### 분류

수학, 정렬, 누적 합, 슬라이딩 윈도우

### 문제 설명

<p>Given a sequence of numbers, we define a window within the sequence to be a contiguous subsequence of those numbers. For example, in the sequence [3, 6, 2, 3, 5, 4], there are four windows of size 3: [3, 6, 2], [6, 2, 3], [2, 3, 5] and [3, 5, 4]. We call window i of size k the window which starts with the i<sup>th</sup> value in the list and includes exactly k consecutive values, ending with the (i+k-1)<sup>th</sup> value in the list.</p>

<p>For a window with values a<sub>1</sub>, a<sub>2</sub>, &hellip;, a<sub>k</sub>, define its weighted window sum to be:</p>

<p style="text-align: center;">1a<sub>1</sub> + 2a<sub>2</sub> + 3a<sub>3</sub> + &hellip; + ka<sub>k</sub></p>

<p>For the four window sums described above, the corresponding weighted window sums are:</p>

<p style="text-align: center;">[3, 6, 2] &rarr; 1 &times; 3 + 2 &times; 6 + 3 &times; 2 = 21 (Rank 2)</p>

<p style="text-align: center;">[6, 2, 3] &rarr; 1 &times; 6 + 2 &times; 2 + 3 &times; 3 = 19 (Rank 1)</p>

<p style="text-align: center;">[2, 3, 5] &rarr; 1 &times; 2 + 2 &times; 3 + 3 &times; 5 = 23 (Rank 3)</p>

<p style="text-align: center;">[3, 5, 4] &rarr; 1 &times; 3 + 2 &times; 5 + 3 &times; 4 = 25 (Rank 4)</p>

<p>For each window of a given size within a sequence of numbers, we sort those windows in increasing order of weighted window sum, breaking ties by the starting index of the window, from smallest index to largest index.</p>

<p>Given a sequence of integers and the size of a window, sort each window of the given size in the sequence by weighted window sum in increasing order, breaking ties by the starting index of the window.</p>

### 입력

<p>The first input line contains two integers: n (1 &le; n &le; 2 &times; 10<sup>5</sup>) and k (1 &le; k &le; n), representing the length of the sequence and the size of the window. Each of the next n input lines will contain one number of the sequence, in order. Each of these values will be in between 1 and 10<sup>8</sup>, inclusive.</p>

### 출력

<p>Print a sorted list of the windows, with one window per line. For each window, output its starting index, followed by the weighted window sum of that window.</p>