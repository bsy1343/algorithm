# [Gold IV] Multiple Subject Lessons - 21636

[문제 링크](https://www.acmicpc.net/problem/21636)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 26, 맞힌 사람: 22, 정답 비율: 57.895%

### 분류

백트래킹, 조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>Kate&#39;s school has introduced multiple subject lessons.</p>

<p>The students have the following task for the lesson of Math, Art and Sociology in the seventh grade. They are given an integer $n$. Each student has a set of $k$ colored pencils, let the colors be numbered from $1$ to $k$. Each students takes a sheet of paper and writes down one or several integers at it, so that their sum was equal to $n$. Each integer is written using one of the pencils, so it has one of the $k$ possible colors.</p>

<p>The students must agree to do the task in such way that no two students have the same solution. Two solutions are the same if for each integer $a$ and each color $i$ the number of integers $a$ of color $i$ at students&#39; sheets is the same.</p>

<p>The teacher of Math is sure that the students will be able to complete the task. However, she wants to know how many solutions are there, maybe there are not enough for all the students to have different solutions. Help her to find that out!</p>

### 입력

<p>The input contains two integers $n$ and $k$ ($1 \le n, k \le 15$).</p>

### 출력

<p>Print one integer  --- the number of solutions to the task.</p>

### 힌트

<p>The following picture shows all possible ways to solve the task in the first sample test. Note that the order of integers written doesn&#39;t matter, only the number of integers written with each color.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21636.%E2%80%85Multiple%E2%80%85Subject%E2%80%85Lessons/dc7ba0db.png" data-original-src="https://upload.acmicpc.net/29a2d73e-35ff-485c-9110-d1f2a0487829/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 492px; height: 511px;" /></p>