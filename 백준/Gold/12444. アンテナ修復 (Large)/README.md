# [Gold I] アンテナ修復 (Large) - 12444

[문제 링크](https://www.acmicpc.net/problem/12444)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 15, 맞힌 사람: 14, 정답 비율: 56.000%

### 분류

수학, 그리디 알고리즘, 정렬, 애드 혹, 기하학, 다각형의 넓이

### 문제 설명

<p>冒険家のパスカルは古代文明が残した宇宙人との通信装置を発見し使用方法を解明した。装置のアンテナは&nbsp;<strong>K</strong>&nbsp;本のエレメントと呼ばれる特殊物質でできた直線状の棒で構成される。各エレメントの一端は + 極と呼ばれ、もう一端は - 極と呼ばれる。エレメントには 1 から&nbsp;<strong>K</strong>&nbsp;までの番号が振られている。</p>

<p>アンテナを動作させるには以下の4つの条件を満たすように組み立てなければならない。</p>

<ul>
	<li>すべてのエレメントが同一平面上にある</li>
	<li>すべてのエレメントの + 極が同じ位置にある。これを接続点と呼ぶ</li>
	<li>エレメント同士が重なるのは接続点のみ</li>
	<li>隣り合うエレメントがなす角度はすべて 360/<strong>K</strong>&nbsp;度である</li>
</ul>

<p>&nbsp;</p>

<p>隣り合うエレメントの - 極の位置 2 点と接続点で作られる三角形の面積を隣り合うエレメントの組み合わせすべてについて足しあわせた値がアンテナの強度となる。</p>

<p>アンテナの強度を最大化する並べ方を計算し、その強度を出力せよ。</p>

<p>エレメントの太さは無視できるほど細いものとする。エレメントを切断したり、複数のエレメントをつなぎあわせて1本のエレメントとして使うことはできない。</p>

### 입력

<p>最初の行はテストケースの個数&nbsp;<strong>T</strong>&nbsp;を表す正の整数である。各テストケースは以下のようなフォーマットで表される。</p>

<pre>
<strong>K</strong>
<strong>E<sub>1</sub></strong> <strong>E<sub>2</sub></strong> ... <strong>E<sub>K</sub></strong>
</pre>

<p>ここで&nbsp;<strong>K</strong>&nbsp;はエレメントの数である。<strong>E<sub>i</sub></strong>&nbsp;は正の整数で、i 番目のエレメントの長さを表している。</p>

<h3>制約</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100&nbsp;</li>
	<li>1 &le;&nbsp;<strong>E<sub>i</sub></strong>&nbsp;&le; 1000</li>
	<li>3 &le;&nbsp;<strong>K</strong>&nbsp;&le; 1000</li>
</ul>

### 출력

<p>各テストケースに対し、</p>

<pre>
Case #<strong>X</strong>: <strong>P</strong>
</pre>

<p>という内容を1行出力せよ。<strong>X</strong>&nbsp;は 1 から始まるテストケース番号、<strong>P</strong>&nbsp;は最大化された強度を表す。</p>