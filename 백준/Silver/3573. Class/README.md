# [Silver I] Class - 3573

[문제 링크](https://www.acmicpc.net/problem/3573)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 59, 정답: 25, 맞힌 사람: 20, 정답 비율: 38.462%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>Dr. Strange is a really strange lecturer. Each lecture he calculates class fullness and if it is small, he decreases all semester grades by one. So the students want to maximize the class fullness.</p>

<p>The class fullness is the minimum of row fullness and column fullness. The column fullness is the maximum number of students in a single column and the row fullness is the maximum number of students in a single row.</p>

<p>For example there are 16 students shown on the left picture (occupied desks are darkened). The row fullness of this arrangement is 5 (the 4-th row) and the column fullness is 3 (the 1-st, the 3-rd, the 5-th or the 6-th columns). So, the class fullness is 3. But if the students rearrange as shown on the right picture then the column fullness will become 4 (the 5-th column), and so the class fullness will also become 4.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/3573.%E2%80%85Class/28e25387.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/3573.%E2%80%85Class/28e25387.png" data-original-src="https://upload.acmicpc.net/194eff85-4351-4b8e-ad5a-614bee0b1fa3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 646px; height: 197px;" /></p>

<p>The students of Dr. Strange need to know the arrangement that maximizes class fullness so they ask you to write a program that calculates it for them.</p>

### 입력

<p>The first line of the input file contains three integer numbers: n, r and c &mdash; number of students, rows and columns in the class (1&le;r,c&le;100, 1&le;n&le;r&times;c).</p>

### 출력

<p>The first line of the output file must contain a single integer number &mdash; the maximum possible class ful lness.</p>

<p>The following r lines must contain the optimal student arrangement. Each line must contain a description of a single row. Row description is a line of c characters either &lsquo;&lsquo;<code>.</code>&rsquo;&rsquo; or &lsquo;&lsquo;<code>#</code>&rsquo;&rsquo;, where &lsquo;&lsquo;<code>.</code>&rsquo;&rsquo; denotes an empty desk, and &lsquo;&lsquo;<code>#</code>&rsquo;&rsquo; denotes an occupied one. If there are multiple optimal arrangements, output any one.</p>