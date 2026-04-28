# [Platinum II] Zany and Zealous yclock - 30040

[문제 링크](https://www.acmicpc.net/problem/30040)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 14, 맞힌 사람: 14, 정답 비율: 32.558%

### 분류

데이크스트라, 그래프 이론, 런타임 전의 전처리, 최단 경로

### 문제 설명

<p>다음 2022년 3월 기준 수도권 지하철 노선도 정보 <a href="https://upload.acmicpc.net/00c710a0-e8d3-4798-94b0-8fd01eaa64b0/">(PDF)</a>에 의존하여 문제를 해결하라. 이 문제에서는 Seoul Metro의 1호선부터 9호선까지 총 아홉 개의 지하철 호선만 고려한다.</p>

<p>지하철을 타고 한 역을 가는 데에 $T_\text{st}$, 한 번 환승하는 데 $T_\text{c}$의 시간이 걸린다고 하자. 이 문제에서 환승이란, &ldquo;<strong>현재 타고 있는 지하철 호선</strong>을 바꾸는 것&rdquo;을 의미하며, 지하철을 타고 내릴 때 걸리는 시간은 무시한다.</p>

<p>예를 들어, $T_\text{st}=10$, $T_\text{c}=1$일 때, 역 <span style="color:#e74c3c;"><code>Sangwangsimni</code></span>에서 역 <span style="color:#e74c3c;"><code>Jongno 5(o)ga</code></span>로 가는 최소 시간은 $4T_\text{st}+2T_\text{c}=42$다. (역 <span style="color:#e74c3c;"><code>Sindang</code></span>과 역 <span style="color:#e74c3c;"><code>Dongmyo</code></span>에서 환승하라.) 만약, $T_\text{st}=1$, $T_\text{c}=10$이라면, 최소 시간은 $9T_\text{st}+T_\text{c}=19$가 된다. (역 <span style="color:#e74c3c;"><code>City Hall</code></span>에서 환승하라.)</p>

<p>$K$ 개의 역 $S_1,\cdots ,S_K$에서 환승할 수 없을 때, 지하철만을 이용하여 역 $A$에서 역 $B$로 이동하는 데에 걸리는 최소 시간을 구하라. 여러분은 이를 $Q$ 개의 쿼리에 대해 독립적으로 해결해야 한다.</p>

<p>지하철역의 이름 표기는 <a href="https://upload.acmicpc.net/86abb5aa-4418-49fd-af7b-b78094b42783/">이 텍스트 파일</a>을 기준으로 한다.</p>

### 입력

<p>첫 번째 줄에 정수 $Q$가 주어진다.</p>

<p>이후부터 $Q$ 개의 쿼리가 주어진다. 하나의 쿼리는 다음 형식으로 주어진다:</p>

<p>첫 번째 줄에 두 정수 $T_\text{st}$, $T_\text{c}$가 공백으로 구분되어 주어진다. 그다음 줄에 역명 $A$가 주어진다. 그다음 줄에 역명 $B$가 주어진다.</p>

<p>그다음 줄에 정수 $K$가 주어진다. 그다음 줄부터 $K$ 개의 줄에 걸쳐, 역명 $S_i$가 차례대로 주어진다.</p>

### 출력

<p>첫 번째 줄부터 $Q$ 개의 쿼리의 답을 차례대로 출력한다.</p>

<p>하나의 쿼리에 대한 답은 다음 형식으로 출력한다:</p>

<p>만약 역 $A$에서 역 $B$로 이동할 수 없다면, 첫 번째 줄에 <span style="color:#e74c3c;"><code>-1</code></span>을 출력한다.</p>

<p>만약 이동할 수 있다면, 첫 번째 줄에 최소 소요 시간을 출력한다.</p>

<p>최소 시간으로 이동하는 경로에서, 첫 역과 마지막 역을 포함하여 방문해야 하는 역의 수를 $C$라고 하자. 두 번째 줄에 정수 $C$를 출력한다.</p>

<p>그다음 줄부터 $C$ 개의 줄에 걸쳐, 방문해야 하는 역을 다음의 형식으로 차례대로 출력한다.</p>

<ul>
	<li>2호선을 타고 서울대입구역을 방문해야 한다면, &ldquo;<span style="color:#e74c3c;"><code>[2] Seoul Nat&rsquo;l Univ. (Gwanak-gu Office)</code></span>&rdquo;.</li>
	<li>이수역에서 4호선에서 7호선으로 환승해야 한다면, &ldquo;<span style="color:#e74c3c;"><code>&lt;4 -&gt; 7&gt; Chongshin Univ.(Isu)</code></span>&rdquo;.</li>
</ul>

<p>소요 시간이 최소인 경로가 여러 가지라면, 그중 아무거나 하나를 출력해도 정답으로 인정된다.</p>

### 제한

<ul>
	<li>$1\le Q\le 2\, 500$</li>
	<li>$1\le T_\text{st} \le 10\, 000$</li>
	<li>$1\le T_\text{c}\le 10\, 000$</li>
	<li>$A\ne B$</li>
	<li>$0\le K$</li>
	<li>$S_i\ne S_j$ $(1\le i&lt;j\le K)$</li>
	<li>주어지는 역명은 모두 올바르다.</li>
</ul>

### 힌트

<p>다음 세 가지를 유의하라.</p>

<ul>
	<li>6호선의 <span style="color:#e74c3c;"><code>Eungam</code></span>, <span style="color:#e74c3c;"><code>Yeokchon</code></span>, <span style="color:#e74c3c;"><code>Bulgwang</code></span>, <span style="color:#e74c3c;"><code>Dokbawi</code></span>, <span style="color:#e74c3c;"><code>Yeonsinnae</code></span>, <span style="color:#e74c3c;"><code>Gusan</code></span>, <span style="color:#e74c3c;"><code>Eungam</code></span>의 순환로는 <strong>이 문제에서 유일하게 방향성을 갖는다.</strong> 그 외의 경우, 양방향으로 이동이 가능하다.</li>
	<li>지도에 없는 1호선 병점역은 무시하고, <span style="color:#e74c3c;"><code>Seryu</code></span>, <span style="color:#e74c3c;"><code>Seodongtan</code></span>, <span style="color:#e74c3c;"><code>Sema</code></span>의 세 역은 모두 양방향으로 직접 연결되어 있다고 가정하라.</li>
	<li>5호선의 <span style="color:#e74c3c;"><code>Cheonho (Pungnaptoseong)</code></span>, <span style="color:#e74c3c;"><code>Gil-dong</code></span>, <span style="color:#e74c3c;"><code>Dunchon-dong</code></span>의 세 역은 모두 역 <span style="color:#e74c3c;"><code>Gangdong</code></span>과 양방향으로 직접 연결되어 있다. 즉, 역 <span style="color:#e74c3c;"><code>Gangdong</code></span>에 그려진 두 개의 화살표를 무시하라.</li>
</ul>

<p>실제 배차나 역사의 구조 등이 고려되지 않음에 유의하라.</p>