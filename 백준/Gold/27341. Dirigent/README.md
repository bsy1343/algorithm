# [Gold II] Dirigent - 27341

[문제 링크](https://www.acmicpc.net/problem/27341)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 42, 정답: 29, 맞힌 사람: 27, 정답 비율: 67.500%

### 분류

구현, 자료 구조, 집합과 맵

### 문제 설명

<p>Winter school of informatics ends with a traditional dance. There are $n$ students who participate. Each of them has a unique label between $1$ and $n$.</p>

<p>First, conductor Kre&scaron;o orders the students to form a circle such that each student holds hands with two other students.</p>

<p>Alenka is wondering if it is possible to break the circle by making exactly one pair of neighbouring students stop holding hands and that the newly formed sequence of students is sorted by their labels. For example, if their order is 3 4 1 2, than the circle can be broken between students with labels 4 and 1, but if their order is 2 1 4 3, than there is no way to break the circle in such way.</p>

<p>During the night Kre&scaron;o is going to give $q$ instructions. In each of them, he is going to order two students to swap places. After each swap you need to help Alenka answer her question.</p>

### 입력

<p>The first line contains two integers $n$ and $q$ ($1 &le; n, q &le; 300\,000$), the number of students and the number of swaps.</p>

<p>The second line contains $n$ integers $a_i$ ($1 &le; a_i &le; n$), describing the initial placement of students in the circle.</p>

<p>In each of the next $q$ lines there are two integers $x_i$, $y_i$ ($1 &le; x_i , y_i &le; n$, $x_i \ne y_i$), that describe Kre&scaron;o&rsquo;s $i$-th instruction in which students with labels $x_i$ and $y_i$ swap places.</p>

### 출력

<p>In the $i$-th of the $q$ lines outs put the answer to Alenka&rsquo;s question after $i$ swaps have been carried out. If the answer is affirmative output DA, otherwise <code>NE</code>.</p>

### 힌트

<p>Clarification of the second example: Students in the beginning, after the first and after the second swap.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/27341.%E2%80%85Dirigent/25b193c2.png" data-original-src="https://upload.acmicpc.net/30ca168d-b12c-48dc-9505-885aaa311b69/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 409px; height: 113px;" /></p>