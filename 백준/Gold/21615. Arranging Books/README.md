# [Gold II] Arranging Books - 21615

[문제 링크](https://www.acmicpc.net/problem/21615)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 89, 정답: 48, 맞힌 사람: 39, 정답 비율: 57.353%

### 분류

그리디 알고리즘

### 문제 설명

<p>Valentina wants books on a shelf to be arranged in a particular way. Every time she sees a shelf of books, she rearranges the books so that all the large books appear on the left, followed by all the medium-sized books, and then all the small books on the right. She does this by repeatedly choosing any two books and exchanging their locations. Exchanging the locations of two books is called a <em>swap</em>.</p>

<p>Help Valentina determine the fewest number of swaps needed to arrange a shelf of books as she wishes.</p>

### 입력

<p>The input will consist of exactly one line containing at most 500 000 characters. Each character will be <code>L</code>, <code>M</code>, or <code>S</code>.</p>

### 출력

<p>Output a single integer which is equal to the minimum possible number of swaps needed to arrange the books so that all occurrences of <code>L</code> come first, followed by all occurrences of <code>M</code>, and then all occurrences of <code>S</code>.</p>