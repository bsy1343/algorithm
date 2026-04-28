# [Platinum V] 상자 빌리기 - 21982

[문제 링크](https://www.acmicpc.net/problem/21982)

### 성능 요약

시간 제한: 3 초  (하단 참고), 메모리 제한: 512 MB

### 통계

제출: 148, 정답: 70, 맞힌 사람: 45, 정답 비율: 42.056%

### 분류

자료 구조, 덱, 덱을 이용한 구간 최댓값 트릭, 그리디 알고리즘

### 문제 설명

<p>Albert는 높이가 서로 다른&nbsp;n개의 상자를 갖고 있는데 각 상자는&nbsp;직육면체 모양이다. 편의상 0번부터 n-1번까지 번호가 붙어있다. i번째 상자의 높이는 H[i]이고 밑면의 넓이는 W[i]&nbsp;이다. 이 때, i번째 상자의 부피는 H[i] &times; W[i] 이다 (여기서 W[i]는 밑면의 &quot;넓이&quot;를 나타낸다). Albert는 언제나 상자를 높이 순으로 정렬해두기 때문에 H[0] &lt; H[1] &lt; ... &lt; H[n-1]을 만족한다.</p>

<p>Alice는 Albert에게 상자 두 개를 빌리기로 했는데 Albert는 왠지 순순히&nbsp;빌려주고 싶지 않아서 아래와 같은 조건을 달았다.</p>

<ul>
	<li>조건:&nbsp;Alice가 빌리는&nbsp;상자 두 개의 높이 차이는 X를 넘을 수 없다 (즉, i번째 상자와 j번째 상자를 고른다면 | H[i] - H[j] | &le; X 를 만족해야한다).</li>
</ul>

<p>Alice는 흔쾌히 승낙했고, 물건을 옮길 때 사용해야 하기 때문에 두 상자의 부피의 합이 최대가 되는 한 쌍의 상자를 고르기로 했다.</p>

<p>예를 들어 n = 3, H = [3, 5, 8], W = [8, 16, 6], X = 3이라 하자.</p>

<ul>
	<li>각 상자의 부피는 순서대로 24, 80, 48이다.</li>
	<li>Albert가 제시한 조건을 만족하는 (i, j)쌍은 (0, 1)과 (1, 2)가 있다.</li>
	<li>두 가지 방법 중 1번 상자와 2번 상자를 빌리면 부피의 합이 80 + 48 = 128이 된다.</li>
	<li>같은 예에서 만약 X = 1이라면 Albert가 제시한 조건을 만족하는 쌍이 존재하지 않는다 (출력 항목 참고).</li>
</ul>

<p>다른 예로, n = 4, H = [3, 10, 18, 20], W = [8, 11, 9, 3], X = 7이라 하자.</p>

<ul>
	<li>각 상자의 부피는 순서대로 24, 110, 162, 60이다.</li>
	<li>Albert가 제시한 조건을 만족하는 (i, j)쌍은 (0, 1)과 (2, 3)이 있다.</li>
	<li>두 가지 방법 중 2번 상자와 3번 상자를 빌리면 부피의 합이 162 + 60 = 222이 된다.</li>
	<li>같은 예에서 만약 X = 8이라면 1번과 2번 상자를 빌려 부피의 합이 272가 되도록 할 수 있다.</li>
</ul>

<p>입력으로 n, X, 그리고 H[0] ... H[n-1], W[0] ... W[n-1] 이 주어졌을 때,&nbsp; Alice를 도와 Albert가 제시한 조건을 어기지 않으면서 부피의 합이 최대가 되는 한 쌍의 상자를 골라보자. 단, 이 문제의 경우 n이 크기 때문에 상자의 높이와 밑면&nbsp;넓이가 직접 주어지지 않고, 이를 생성하는 방법이 입력으로 주어진다 (입력 항목 참고).</p>

### 입력

<p>첫 줄에 테스트 케이스의 수 T가 주어진다.</p>

<p>각 테스트 케이스는 세&nbsp;줄에 걸쳐 주어진다.</p>

<p>첫 줄에 n과 X가 공백으로 구분되어 주어진다. 두 번째 줄에 네 개의 정수 h<sub>s</sub>, h<sub>a</sub>, h<sub>b</sub>, h<sub>c</sub> 가 공백으로 구분되어 주어진다. 세 번째 줄에 네 개의 정수 w<sub>s</sub>, w<sub>a</sub>, w<sub>b</sub>, w<sub>c</sub> 가 공백으로 구분되어 주어진다.</p>

<p>이를 이용해 H[i]와 W[i]를 구하기 위해 아래 공식을 이용한다 (0 &le; i &le; n-1 임에 유의하자): (&quot;%&quot;는 통상 프로그래밍 언어에서 쓰이는 정수 나눗셈 연산의 나머지를 구하는 연산이다 (modulo))</p>

<ul>
	<li>i = 0 일 때:
	<ul>
		<li>H[i] = (h<sub>s</sub> % h<sub>c</sub>) + 1</li>
		<li>W[i] = (w<sub>s</sub> % w<sub>c</sub>) + 1</li>
	</ul>
	</li>
	<li>1 &le;&nbsp;i &le;&nbsp;n-1&nbsp;인 i에 대하여:
	<ul>
		<li>H[i] = H[i-1] + 1 + ( (H[i-1] * h<sub>a</sub>&nbsp; + h<sub>b</sub>) % h<sub>c</sub>)</li>
		<li>W[i] = (W[i-1] * w<sub>a</sub> + w<sub>b</sub>) % w<sub>c</sub> + 1</li>
	</ul>
	</li>
</ul>

<p>위의 연산시 integer overflow를 피하기 위해 64-bit 정수 타입을 사용하는 것을 권장한다.</p>

### 출력

<p>각 테스트 케이스에 대하여 Alice가 상자 한 쌍을 빌릴 수 없다면 -1을 출력한다. 빌릴 수 있다면, 가능한 모든 쌍 중 부피의 합의 최대값을 출력한다.</p>

### 제한

<ul>
	<li>1 &le; T &le; 10</li>
	<li>2 &le; n &le; 5,000,000</li>
	<li>1 &le; X, h<sub>s</sub>, h<sub>a</sub>, h<sub>b</sub>, h<sub>c</sub>, w<sub>s</sub>, w<sub>a</sub>, w<sub>b</sub>, w<sub>c</sub>&nbsp;&le; 10<sup>9</sup></li>
	<li>각 테스트 케이스의 모든 0 &le; i &le; n-1 인 i에 대하여 1 &le; H[i], W[i]&nbsp;&le; 10<sup>9</sup></li>
</ul>

### 힌트

<p>아래 표에 제공된 각 언어별 예제 코드는&nbsp;H[0 ... n-1]과 W[0 ... n-1]를&nbsp;생성하는 코드이다.&nbsp;아래 코드를 그대로 사용하여도 되고, 이를 직접 구현해도 된다. 출제진이&nbsp;의도한 해법은&nbsp;아래 코드를 사용하며&nbsp;제한 시간 내에 정답을 구한다.</p>

<table border="1" cellpadding="1" cellspacing="1" class="table table-bordered">
	<tbody>
		<tr>
			<td>C/C++</td>
			<td>Java</td>
			<td>Pypy3</td>
		</tr>
		<tr>
			<td>
			<pre>
int n, x;
long long hs, ha, hb, hc, 
&nbsp;         ws, wa, wb, wc;
// stdin에서 입력을 받는다.

long long H[n], W[n];

H[0] = hs % hc + 1;
W[0] = ws % wc + 1;
for(int i = 1; i &lt;= n-1; i++) {
&nbsp; H[i] = H[i-1] + 1 
&nbsp;      + (H[i-1] * ha + hb) % hc;
&nbsp; W[i] = (W[i-1] * wa + wb) % wc + 1;
}
</pre>
			</td>
			<td>
			<pre>
int n, x;
long hs, ha, hb, hc,
&nbsp; &nbsp;  ws, wa, wb, wc;
// stdin에서 입력을 받는다.

long[] H = new long[n], W = new long[n];

H[0] = hs % hc + 1;
W[0] = ws % wc + 1;
for(int i = 1; i &lt;= n-1; i++) {
&nbsp; H[i] = H[i-1] + 1 
&nbsp;      + (H[i-1] * ha + hb) % hc;
&nbsp; W[i] = (W[i-1] * wa + wb) % wc + 1;
}
</pre>
			</td>
			<td>
			<pre>
n,x = # stdin에서 입력을 받는다.
hs,ha,hb,hc = # stdin에서 입력을 받는다.
ws,wa,wb,wc = # stdin에서 입력을 받는다.

H, W = [0 for i in range(n)], [0 for i in range(n)]

H[0] = hs % hc + 1
W[0] = ws % wc + 1
for i in range(1, n):
&nbsp; H[i] = H[i-1] + 1 + (H[i-1] * ha + hb) % hc
&nbsp; W[i] = (W[i-1] * wa + wb) % wc + 1
</pre>
			</td>
		</tr>
	</tbody>
</table>