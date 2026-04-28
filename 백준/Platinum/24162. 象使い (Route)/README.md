# [Platinum V] 象使い (Route) - 24162

[문제 링크](https://www.acmicpc.net/problem/24162)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 78, 정답: 47, 맞힌 사람: 40, 정답 비율: 60.606%

### 분류

그래프 이론, 기하학, 최단 경로, 데이크스트라

### 문제 설명

<p>あなたの友人の象使いは王宮まで象をつれて行くことを命ぜられた．道路図が与えられるが, 王宮までの道路はそれぞれ有料で，さらにその費用は自前で用意しなければならない．</p>

<p>彼のために最も安い道程を探し出して欲しい．</p>

<p>ただし，以下のことに注意すること．</p>

<ul>
	<li>道路は２つの料金所の間を結ぶ線分である．２つの料金所 p, q の組に対して，p と q を 結ぶ道路は高々1 本しか存在しない．</li>
	<li>道路は必ず端点から端点までたどらなければならず，途中でほかの道路に乗り換えること はできない．</li>
	<li>象は鋭角には曲れないため，料金所では，それまでたどった道路とのなす角が鋭角になる 道路には乗り換えられない. 例えば，下の図では，p &rarr; q &rarr; r はたどれず，u &rarr; v &rarr; w や x &rarr; y &rarr; z はたどれる．</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24162.%E2%80%85%E8%B1%A1%E4%BD%BF%E3%81%84%E2%80%85(Route)/5e8fd68e.png" data-original-src="https://upload.acmicpc.net/b0f2ed6b-079d-41e7-868a-fc78aa13012a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 496px; height: 243px;" /></p>

### 입력

<p>入力の 1 行目には，料金所の数 n (2 &le; n &le; 100) と道路の数 m が空白 で区切られて書かれている．i + 1 行目 (1 &le; i &le; n) には，２つの整数 x<sub>i</sub>, y<sub>i</sub> (&minus;10000 &le; x<sub>i</sub> &le; 10000, &minus;10000 &le; y<sub>i</sub> &le; 10000) が空白で区切られて書かれている．これは，i 番目の料金所の座 標が (x<sub>i</sub>, y<sub>i</sub>) であることを表わしている．j + n + 1 行目 (1 &le; j &le; m) には，３つの整数 a<sub>j</sub>, b<sub>j</sub>, c<sub>j</sub> (1 &le; a<sub>j</sub> &lt; b<sub>j</sub> &le; n, 0 &le; c<sub>j</sub> &le; 10000) が空白で区切られて書かれている. これは，a<sub>j</sub> 番目の料金 所と b<sub>j</sub> 番目の料金所で結ばれる道路の通行料金が cj であることを表わしている．</p>

<p>現在の象の居場所は 1 番目の料金所である．王宮は 2 番目の料金所のすぐ近くにある．</p>

### 출력

<p>1 番目の料金所から 2 番目の料金所へ到達できる，最も安い料金を出力せよ．もし到 達不可能な場合は，&minus;1 を出力せよ．</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24162.%E2%80%85%E8%B1%A1%E4%BD%BF%E3%81%84%E2%80%85(Route)/b50ffa51.png" data-original-src="https://upload.acmicpc.net/843d738b-57de-4ae5-bef2-d5e1e51efca1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 193px; height: 266px;" /></p>

<p style="text-align: center;">入力例の図示</p>

<p>1 番目の料金所から 2 番目の料金所への道程は，1 &rarr; 2 と 1 &rarr; 4 &rarr; 2 の２つがあり，そのう ち料金が安い 1 &rarr; 4 &rarr; 2 の料金 8 を出力する．1 &rarr; 5 &rarr; 2 は，料金 2 だが，道路 1 &harr; 5 と道 路 5 &harr; 2 が 5 番目の料金所で鋭角をなすので，象は 1 &rarr; 5 &rarr; 2 とたどることはできない．</p>