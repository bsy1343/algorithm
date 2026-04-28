# [Silver III] Milk Measurement - 15465

[문제 링크](https://www.acmicpc.net/problem/15465)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1419, 정답: 559, 맞힌 사람: 497, 정답 비율: 42.661%

### 분류

구현, 정렬, 시뮬레이션

### 문제 설명

<p>Farmer John purchases three cows: Bessie, Elsie, and Mildred, each of whom initially produces 7 gallons of milk per day. Since the milk output of a cow is known to potentially change over time, Farmer John takes periodic measurements over the next 100 days and scribbles them down in a log book. Entries in his log look like this:</p>

<pre>
35 Bessie -2
14 Mildred +3
</pre>

<p>The first entry indicates that on day 35, Bessie&#39;s milk output was 2 gallons lower than it was when last measured. The next entry indicates that on day 14, Mildred&#39;s milk output increased by 3 gallons from when it was last measured. Farmer John has only enough time to make at most one measurement on any given day. Unfortunately, he is a bit disorganized, and doesn&#39;t necessarily write down his measurements in chronological order.</p>

<p>To keep his cows motivated, Farmer John proudly displays on the wall of his barn the picture of whichever cow currently has the highest milk output (if several cows tie for the highest milk output, he displays all of their pictures). Please determine the number of days on which Farmer John would have needed to change this display.</p>

### 입력

<p>The first line of input contains $N$, the number of measurements Farmer John makes. Each of the next $N$ lines contains one measurement, in the format above, specifying a day (an integer in the range 1..100), the name of a cow, and the change in her milk output since it was last measured (a nonzero integer). Each cow&#39;s milk output will always be in the range 0..1000.</p>

### 출력

<p>Please output the number of days (an integer in the range 0..100) on which Farmer John needs to adjust his motivational display.</p>

### 힌트

<p>Initially, all cows have milk output 7. On day 1, Bessie&#39;s milk output increases to 9, making her the unique cow with highest milk output and causing Farmer John to change his display. On day 4, Elsie&#39;s milk output decreases to 6, but this does not change the fact that Bessie is the sole cow in the lead. On day 7, Mildred jumps into the lead, changing the display, and on day 9, Mildred drops in production to be tied with Bessie, again changing the display.</p>