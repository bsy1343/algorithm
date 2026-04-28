# [Gold IV] 습격받은 도시 - 20947

[문제 링크](https://www.acmicpc.net/problem/20947)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 951, 정답: 357, 맞힌 사람: 299, 정답 비율: 43.523%

### 분류

구현, 애드 혹

### 문제 설명

<p>극악무도한 테러리스트&nbsp;주현이가 도시를 습격했다. 습격받은 도시는 세로&nbsp;$N$칸, 가로&nbsp;$N$칸으로 이뤄진 격자 모양이며, 각 칸은 빈칸이거나 건물이 존재한다. 주현이는 자신이 만든 수제 폭탄을 건물이 없는 곳에 설치한다. 폭탄은 터질 때 상하좌우 각 방향에 대해 충격파가 퍼져나가는데,&nbsp;충격파가 닿은 건물은 파괴되어 건물 잔해가 된다. 충격파는 건물 또는 건물 잔해에 닿고 난 뒤 소멸한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20947.%E2%80%85%EC%8A%B5%EA%B2%A9%EB%B0%9B%EC%9D%80%E2%80%85%EB%8F%84%EC%8B%9C/8b6a700f.png" data-original-src="https://upload.acmicpc.net/497021c4-a031-4ab6-ab73-6b3d546a7863/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; height: 222px;" /></p>

<p>이번 테러 사건 수사를 맡은 향빈이는 현장을 재구성하는 중이다. 건물 잔해의 위치를 통해 어떤 위치에서 폭탄이 터졌는지 알아내고자 한다. 아무리 생각해도 폭탄의 위치를 알아낼 수 없는 향빈이는 문제 해결의 대가인 당신을 찾아왔다. 습격받은 도시의 정보가 주어졌을 때, 주현이가 설치한 폭탄의 위치를 구해주자.</p>

### 입력

<p>다음과 같이 입력이 주어진다.</p>

<div style="background:#eeeeee;border:1px solid #cccccc;padding:5px 10px;">
<p>$N$</p>

<p>$\begin{matrix} a_{1,1} &amp;&nbsp;a_{1,2} &amp; \cdots &amp;&nbsp;a_{1,N} \\ a_{2,1} &amp;&nbsp;a_{2,2} &amp; \cdots &amp;&nbsp;a_{2,N} \\ \vdots &amp; \vdots &amp; \ddots &amp; \vdots \\ a_{N,1} &amp;&nbsp;a_{N,2} &amp;&nbsp;\cdots &amp; a_{N,N} \end{matrix}$</p>
</div>

### 출력

<p>$N$개의 줄에 도시의 정보를 출력한다. 각 줄은 $N$개의 문자를 포함하며 $i$번째 줄 $j$번째 문자는 도시의 세로 $i$번째 가로 $j$번째 칸에 대한 정보이다.&nbsp;빈칸일 경우 <span style="color:#e74c3c;"><code>.</code></span>, 건물일 경우 <span style="color:#e74c3c;"><code>O</code></span>, 건물 잔해일 경우 <span style="color:#e74c3c;"><code>X</code></span>, 폭탄이 설치된 칸인 경우 <span style="color:#e74c3c;"><code>B</code></span>이다. 답이 여러 가지인 경우, 아무거나 출력한다.</p>

### 제한

<ul>
	<li>$N$은 도시의 크기이다.&nbsp;$(1 \le N \le 2\,000)$</li>
	<li>$a_{i,j} = $&nbsp;<span style="color:#e74c3c;"><code>.</code></span> 또는 $a_{i,j} = $&nbsp;<span style="color:#e74c3c;"><code>O</code></span> 또는 $a_{i,j} = $&nbsp;<span style="color:#e74c3c;"><code>X</code></span>&nbsp;
	<ul>
		<li>$a_{i,j} = $ <span style="color:#e74c3c;"><code>.</code></span> 면,&nbsp;도시의 세로 $i$번째&nbsp;가로 $j$번째&nbsp;칸은 빈칸이다.</li>
		<li>$a_{i,j} = $ <span style="color:#e74c3c;"><code>O</code></span>&nbsp;면,&nbsp;도시의 세로 $i$번째&nbsp;가로 $j$번째&nbsp;칸은 건물이다.</li>
		<li>$a_{i,j} = $ <span style="color:#e74c3c;"><code>X</code></span> 면,&nbsp;도시의 세로 $i$번째&nbsp;가로 $j$번째&nbsp;칸은 건물 잔해이다.</li>
	</ul>
	</li>
	<li>항상 답이 존재하는 경우만 주어진다.</li>
</ul>