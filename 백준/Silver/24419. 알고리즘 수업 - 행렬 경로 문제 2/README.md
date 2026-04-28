# [Silver II] 알고리즘 수업 - 행렬 경로 문제 2 - 24419

[문제 링크](https://www.acmicpc.net/problem/24419)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 1108, 정답: 621, 맞힌 사람: 401, 정답 비율: 55.463%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>오늘도 서준이는 동적 프로그래밍&nbsp;수업 조교를 하고 있다.&nbsp;아빠가 수업한&nbsp;내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.</p>

<p>양의 정수로 이루어진&nbsp;<em>n</em>&nbsp;&times;&nbsp;<em>n</em>&nbsp;행렬&nbsp;<em>m</em>이 주어진다. 행렬의 왼쪽 위에서 시작해 한 칸씩 이동해 오른쪽 아래까지 도달한다. 이 과정에서 방문한 칸에 있는 수들을 더한 값이 이 경로의 합이다. 이동 규칙은 다음과 같다.</p>

<ul>
	<li>오른쪽이나 아래쪽으로만 이동할 수 있다.</li>
	<li>왼쪽, 위쪽, 대각선 이동은 허용하지 않는다.</li>
</ul>

<p>행렬의 원소 (1, 1)에서 (n, n)으로 이동하는 모든 경로의 점수 중 가장 높은 점수를 구하는 행렬 경로 문제 의사코드는 아래와 같다. 재귀호출에 비해 동적 프로그래밍이 얼마나 빠른지 확인해 보자. 행렬의 크기&nbsp;<em>n</em>과<em>&nbsp;</em>행렬&nbsp;<em>m</em>이 주어진 경우&nbsp;코드1&nbsp;코드2 실행&nbsp;횟수를 출력하자.</p>

<p>행렬 경로 문제 재귀호출 의사 코드는&nbsp;다음과 같다.</p>

<pre>
matrix_path(m[][], n) {  # (1, 1)에서 (n, n)에 이르는 최고 점수를 구한다.
&nbsp;   return matrix_path_rec(m, n, n);
}
matrix_path_rec(m[][], i, j) {  # (1, 1)에서 (i, j)에 이르는 최고 점수를 구한다.
    if (i == 0 or j == 0) then
&nbsp;       return 0; # 코드1
&nbsp;   else
        return (m<sub>ij</sub> + (max(matrix_path(m, i-1, j), matrix_path(m, i, j-1))));
}</pre>

<p>행렬 경로 문제&nbsp;동적 프로그래밍 의사 코드는&nbsp;다음과 같다.</p>

<pre>
matrix_path(m[][], n) {  # (1, 1)에서 (n, n)에 이르는 최고 점수를 구한다.
    for i &lt;- 0 to n
&nbsp;       d[i, 0] &lt;- 0;
&nbsp;   for j &lt;- 1 to n
&nbsp;       d[0, j] &lt;- 0;
&nbsp;   for i &lt;- 1 to n
&nbsp;       for j &lt;- 1 to n
&nbsp;           d[i, j] &lt;- m<sub>ij</sub> + max(d[i - 1, j], d[i, j - 1]);  # 코드2
&nbsp;   return d[n, n];
}</pre>

### 입력

<p>첫째 줄에 행렬의 크기&nbsp;<i>n</i>(5&nbsp;&le;&nbsp;<em>n</em>&nbsp;&le; 1,000)이&nbsp;주어진다.</p>

<p>그 다음&nbsp;<em>n</em>개의 줄에는 각 줄마다 행렬의 각 행을 나타내는&nbsp;<em>n</em>개의 정수가 한 개의 빈 칸을 사이에 두고 주어진다.&nbsp;각 칸에 들어가는 값은 1 이상 100,000 이하이다.</p>

### 출력

<p>코드1 코드2 실행 횟수를 1,000,000,007로 나눈 나머지를 한 줄에&nbsp;출력한다.</p>