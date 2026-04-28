# [Gold III] K-문자열 - 30463

[문제 링크](https://www.acmicpc.net/problem/30463)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 649, 정답: 314, 맞힌 사람: 182, 정답 비율: 45.844%

### 분류

수학, 조합론, 비트마스킹

### 문제 설명

<p>서로 다른 문자의 개수가 $K$개인 문자열을 <strong>K-문자열</strong>이라고 하자.</p>

<p>길이가 $10$이고 숫자로만 이루어진 문자열 $N$개가 주어진다. 두 문자열 $s_i,s_j\left(1 \le i&lt;j \le N \right)$을 이어 붙였을 때 K-문자열이 될 수 있는 순서쌍 $\left( i,j \right)$의 개수를 구해보자. 입력으로 주어지는 문자열과 이어 붙인 문자열은 $0$으로 시작할 수 있다.</p>

### 입력

<p>첫째 줄에 문자열의 개수 $N$과 $K$가 공백으로 구분되어 주어진다. $\left( 2\le N\le 1\, 000\, 000;\ 1\le K\le 10 \right)$</p>

<p>둘째 줄부터 $N$개의 줄에 걸쳐 $i+1$번째 줄에 길이가 $10$인 문자열 $s_i$가 주어진다.</p>

### 출력

<p>K-문자열이 되는 $i&lt;j$를 만족하는 순서쌍 $\left( i,j \right)$의 개수를 출력한다.</p>

### 힌트

<p>입출력의 양이 많으므로, 빠른 입출력을 사용하는 것을 권장합니다. 대표적인 언어에 따른 빠른 입출력은 아래를 참고하세요.</p>

<ul>
	<li>C++: <code>cin</code>, <code>cout</code>을 사용하는 경우 입출력 전에 <code>cin.tie(nullptr); ios::sync_with_stdio(false);</code>를 한 번 적용해야 합니다. 줄 바꿈할 때는 <code>endl</code> 대신 <code>&#39;\n&#39;</code>을 사용해야 합니다.</li>
	<li>Java: <code>BufferedReader</code>와 <code>BufferedWriter</code>를 사용해야 합니다.</li>
	<li>Python3, PyPy3: <code>input()</code> 대신 <code>sys.stdin.readline().rstrip()</code>을 사용해야 합니다.</li>
</ul>