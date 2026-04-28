# [Bronze I] Sunflowers - 16020

[문제 링크](https://www.acmicpc.net/problem/16020)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 248, 정답: 173, 맞힌 사람: 157, 정답 비율: 73.364%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>Barbara plants N different sunflowers, each with a unique height, ordered from smallest to largest, and records their heights for N consecutive days. Each day, all of her flowers grow taller than they were the day before.</p>

<p>She records each of these measurements in a table, with one row for each plant, with the first row recording the shortest sunflower&rsquo;s growth and the last row recording the tallest sunflower&rsquo;s growth. The leftmost column is the first measurement for each sunflower, and the rightmost column is the last measurement for each sunflower.</p>

<p>If a sunflower was smaller than another when initially planted, it remains smaller for every measurement.</p>

<p>Unfortunately, her children may have altered her measurements by rotating her table by a multiple of 90 degrees.</p>

<p>Your job is to help Barbara determine her original data.</p>

### 입력

<p>The first line of input contains the number N (2 &le; N &le; 100). The next N lines each contain N positive integers, each of which is at most 10<sup>9</sup>. It is guaranteed that the input grid represents a rotated version of Barbara&rsquo;s grid.</p>

### 출력

<p>Output Barbara&rsquo;s original data, consisting of N lines, each of which contain N positive integers.</p>