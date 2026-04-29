# [Platinum II] Latin Squares - 33146

[문제 링크](https://www.acmicpc.net/problem/33146)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 23, 정답: 13, 맞힌 사람: 13, 정답 비율: 59.091%

### 분류

수학, 순열 사이클 분할, 애드 혹, 해 구성하기

### 문제 설명

<p>A Latin square of size $N$ is an $N \times N$ matrix where each entry is an integer between $1$ and $N$, and no two entries in the same row or column are equal.</p>

<p>Alice has a Latin square of size $N$, and she applied a list of transformations to it. Each transformation swaps either two distinct rows or two distinct columns of the matrix. The transformations are applied sequentially: the first transformation is applied to the original matrix, the second to the result of the first transformation, and so on. The final result is, of course, an $N \times N$ matrix.</p>

<p>Alice will not reveal any matrix to you, only the list of transformations. Your task is to determine whether there exists an original matrix that, after applying all transformations, is identical to the final matrix. If such a matrix exists, you must also provide a possible content for this original matrix.</p>

### 입력

<p>The first line contains two integers $N$ ($2 ≤ N ≤ 500$) and $T$ ($1 ≤ T ≤ 10^5$), indicating respectively the size of the Latin square and the number of transformations.</p>

<p>The next $T$ lines describe the transformations, in the order they are applied, one transformation per line. Each of these lines contains a character $X$ and two integers $I$ and $J$ ($1 ≤ I, J ≤ N$ and $I \ne J$). The character $X$ is either the uppercase letter “<code>R</code>” or the uppercase letter “<code>C</code>” indicating respectively that rows $I$ and $J$, or columns $I$ and $J$ are swapped.</p>

### 출력

<p>If there exists an original matrix that, after applying all transformations, is identical to the final matrix, output $N$ lines with $N$ integers each, representing any such matrix.</p>

<p>If no such matrix exists, output a line with the character “<code>*</code>” (asterisk) instead.</p>