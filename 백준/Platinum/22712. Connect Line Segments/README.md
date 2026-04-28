# [Platinum V] Connect Line Segments - 22712

[문제 링크](https://www.acmicpc.net/problem/22712)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 2, 맞힌 사람: 2, 정답 비율: 33.333%

### 분류

다이나믹 프로그래밍, 기하학, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 피타고라스 정리, 외판원 순회 문제

### 문제 설명

<p>Your dear son Arnie is addicted to a puzzle named&nbsp;<i>Connect Line Segments</i>.</p>

<p>In this puzzle, you are given several line segments placed on a two-dimensional area. You are allowed to add some new line segments each connecting the end points of two existing line segments. The objective is to form a single polyline, by connecting all given line segments, as short as possible. The resulting polyline is allowed to intersect itself.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22712.%E2%80%85Connect%E2%80%85Line%E2%80%85Segments/8c1cb21f.png" data-original-src="https://upload.acmicpc.net/d493c7bf-6388-4502-9aae-494b45388e12/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 464px; height: 251px;" /></p>

<p>Arnie has solved many instances by his own way, but he is wondering if his solutions are the best one. He knows you are a good programmer, so he asked you to write a computer program with which he can verify his solutions.</p>

<p>Please respond to your dear Arnie&rsquo;s request.</p>

### 입력

<p>The input consists of multiple test cases.</p>

<p>Each test case begins with a line containing a single integer&nbsp;<i>n</i>&nbsp;(2 &le;&nbsp;<i>n</i>&nbsp;&le; 14), which is the number of the initial line segments. The following&nbsp;<i>n</i>&nbsp;lines are the description of the line segments. The&nbsp;<i>i</i>-th line consists of four real numbers:&nbsp;<i>x</i><sub><i>i</i>,1</sub>,&nbsp;<i>y</i><sub><i>i</i>,1</sub>,&nbsp;<i>x</i><sub><i>i</i>,2</sub>, and&nbsp;<i>y</i><sub><i>i</i>,2</sub>&nbsp;(-100 &le;&nbsp;<i>x</i><sub><i>i</i>,1</sub>,&nbsp;<i>y</i><sub><i>i</i>,1</sub>,&nbsp;<i>x</i><sub><i>i</i>,2</sub>,&nbsp;<i>y</i><sub><i>i</i>,2</sub>&nbsp;&le; 100). (<i>x</i><sub><i>i</i>,1</sub>,&nbsp;<i>y</i><sub><i>i</i>,1</sub>) and (<i>x</i><sub><i>i</i>,2</sub>,&nbsp;<i>y</i><sub><i>i</i>,2</sub>) are the coordinates of the end points of the&nbsp;<i>i</i>-th line segment.</p>

<p>The end of the input is indicated by a line with single &ldquo;0&rdquo;.</p>

### 출력

<p>For each test case, output the case number followed by the minimum length in a line.</p>

<p>The output value should be printed with five digits after the decimal point, and should not contain an error greater than 0.00001.</p>