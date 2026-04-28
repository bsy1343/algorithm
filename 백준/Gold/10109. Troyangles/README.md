# [Gold IV] Troyangles - 10109

[문제 링크](https://www.acmicpc.net/problem/10109)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 110, 정답: 63, 맞힌 사람: 45, 정답 비율: 52.326%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Troy loves triangles. He especially likes counting triangles. He has an N-by-N grid consisting of either &ldquo;<code>.</code>&rdquo; or &ldquo;<code>#</code>&rdquo; characters. Help him count the number of triangles formed only by &ldquo;<code>#</code>&rdquo; characters in the grid. Triangles are of the form</p>

<pre>
          #
    #    ### 
#, ###, #####, etc.</pre>

<p>More formally, a triangle of height h consists of h rows for some positive integer h. The ith row contains 2i &minus; 1 &ldquo;<code>#</code>&rdquo; characters for i = 1, . . . , h. The rows are centred above each other so that they are symmetrical about a vertical line down their middle.</p>

### 입력

<p>The first line contains the number N (1 &le; N &le; 2000) representing the size of the grid. The next N lines each contain N characters as described above.</p>

### 출력

<p>Output the number of triangles in the grid.</p>