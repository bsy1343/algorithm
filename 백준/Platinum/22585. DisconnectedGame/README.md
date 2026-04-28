# [Platinum IV] DisconnectedGame - 22585

[문제 링크](https://www.acmicpc.net/problem/22585)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 10, 정답: 4, 맞힌 사람: 3, 정답 비율: 33.333%

### 분류

많은 조건 분기, 자료 구조, 깊이 우선 탐색, 분리 집합, 다이나믹 프로그래밍, 게임 이론, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Taro と Hanako がゲームをしている.</p>

<p>最初に, 非連結な無向グラフ(二重辺や self loop を含まない) が与えられる. Taro と Hanako は交互に操作を行う. 操作では, 辺で直接つながれていない異なる2 頂点を選び, その間に辺を加える. グラフを連結にしたほうが負けである.</p>

<p>グラフには $V$ 個の頂点がある. $V \times V$ の行列が与えられる. 行列の $(i, j)$-成分が&#39;Y&#39; であるとき $i$ と $j$ の間には辺があり, &#39;N&#39; であるときは辺が無い.</p>

<p>両者が最善に操作をしたとき, どちらが勝つかを出力せよ.</p>

### 입력

<p>入力は以下の形式で与えられる:</p>

<blockquote>
<p>$V$</p>

<p>$a_{1,1}$ ... $a_{1,V}$</p>

<p>...</p>

<p>$a_{V,1}$ ... $a_{V,V}$</p>
</blockquote>

### 출력

<p>Taro が勝つ場合には &quot;Taro&quot; (quotes for clarity), Hanako が勝つ場合には &quot;Hanako&quot; (quotes for clarity) と 1 行に出力せよ.</p>

### 제한

<ul>
	<li>$V$ will be between 2 and 1,000, inclusive.</li>
	<li>$a_{i,i}$ will be &#39;N&#39;.</li>
	<li>$a_{i,j}$ will be &#39;Y&#39; or &#39;N&#39;.</li>
	<li>$a_{i,j}$ will be equal to $a_{j,i}$.</li>
	<li>The graph will not be connected.</li>
</ul>