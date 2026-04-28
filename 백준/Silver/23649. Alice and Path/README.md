# [Silver II] Alice and Path - 23649

[문제 링크](https://www.acmicpc.net/problem/23649)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 48, 정답: 28, 맞힌 사람: 23, 정답 비율: 54.762%

### 분류

문자열, 애드 혹, 기하학, 해 구성하기

### 문제 설명

<p>Consider an infinite planar board consisting of equal equilateral triangles. Alice was standing in such a triangle, facing one of its vertices. After that, she made a sequence of steps. There are three kinds of steps. Step &quot;<code>l</code>&quot; is to turn left and move to the neighboring triangle. Step &quot;<code>r</code>&quot; is to turn right and move to the neighboring triangle. Step &quot;<code>b</code>&quot; is to turn around and move to the neighboring triangle. Note that, after every possible step, Alice again faces one of the vertices of her new triangle: the girl looks at the vertex opposite to the side she just stepped over.</p>

<p>So, Alice went along some path consisting of steps &quot;<code>l</code>&quot;, &quot;<code>r</code>&quot;, and &quot;<code>b</code>&quot;. Help her return to the triangle where she started! Compose a sequence of steps which will bring her there. The direction in which Alice will look after completing the steps is irrelevant: the important thing is to finish at the initial triangle.</p>

### 입력

<p>The input consists of a single line denoting the sequence of steps: it can contain the letters &quot;<code>l</code>&quot;, &quot;<code>r</code>&quot;, and &quot;<code>b</code>&quot;, and has length from $1$ to $10\,000$ letters. It is guaranteed that completing this sequence of steps brings Alice to a triangle different from the initial one.</p>

### 출력

<p>Print a line containing a sequence of steps. It must have length from $1$ to $100\,000$ letters and consist of the letters &quot;<code>l</code>&quot;, &quot;<code>r</code>&quot;, and &quot;<code>b</code>&quot;. After completing the input sequence of steps, and then the output sequence, Alice must finish at the initial triangle. If there are several possible answers, print any one of them. Note that the length of the output sequence need not be the minimum possible.</p>