# [Bronze I] Triangle on the Axis - 32906

[문제 링크](https://www.acmicpc.net/problem/32906)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 116, 정답: 66, 맞힌 사람: 53, 정답 비율: 55.789%

### 분류

구현, 기하학

### 문제 설명

<p>You are given a set of points on a plane with integer coordinates. Find a triangle with the largest area whose vertices belong to this set of points, with one of its sides lying on the $Ox$ axis.</p>

### 입력

<p>The first line contains an integer $n$: the number of points ($1 \le n \le 1000$). Each of the following $n$ lines contains two integers $x$ and $y$: the coordinates of the points. All coordinates do not exceed $1000$ by absolute value.</p>

### 출력

<p>Output a single real number: the maximum area of the triangle that satisfies the problem's conditions. If there is no such triangle or it is degenerate, output $0$.</p>

<p>Your answer will be considered correct if it differs from the exact value by no more than $10^{-9}$.</p>

### 힌트

<p>Pictures for the examples:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/32906.%E2%80%85Triangle%E2%80%85on%E2%80%85the%E2%80%85Axis/0011ca2e.png" data-original-src="https://boja.mercury.kr/assets/problem/32906-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 288px; height: 150px;"></p>