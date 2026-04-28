# [Silver II] Center of symmetry - 1768

[문제 링크](https://www.acmicpc.net/problem/1768)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 258, 정답: 131, 맞힌 사람: 91, 정답 비율: 52.601%

### 분류

수학, 자료 구조, 정렬, 기하학, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Given is a set of&nbsp;<em>n</em>&nbsp;points with integer coordinates. Your task is to decide whether the set has a center of symmetry.</p>

<p>A set of points&nbsp;<em>S</em>&nbsp;has the center of symmetry if there exists a point&nbsp;<em>s</em>&nbsp;(not necessarily in&nbsp;<em>S</em>) such that for every point&nbsp;<em>p</em>&nbsp;in&nbsp;<em>S</em>&nbsp;there exists a point&nbsp;<em>q</em>&nbsp;in&nbsp;<em>S</em>&nbsp;such that&nbsp;<em>p-s</em>&nbsp;=&nbsp;<em>s-q</em>.</p>

### 입력

<p>The first line of input contains a number&nbsp;<em>c</em>&nbsp;giving the number of cases that follow. The first line of data for a single case contains number 1&nbsp;&le;&nbsp;<em>n</em>&nbsp;&le;&nbsp;<em>10000</em>. The subsequent&nbsp;<em>n</em>&nbsp;lines contain two integer numbers each which are the&nbsp;<em>x</em>&nbsp;and&nbsp;<em>y</em>&nbsp;coordinates of a point. Every point is unique and we have that -10000000&nbsp;&le;&nbsp;<em>x</em>,&nbsp;<em>y</em>&nbsp;&le;&nbsp;10000000.</p>

### 출력

<p>For each set of input data print&nbsp;<tt>yes</tt>&nbsp;if the set of points has a center of symmetry and&nbsp;<tt>no</tt>&nbsp;otherwise.</p>