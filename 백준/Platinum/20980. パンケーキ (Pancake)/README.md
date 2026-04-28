# [Platinum V] パンケーキ (Pancake) - 20980

[문제 링크](https://www.acmicpc.net/problem/20980)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 1024 MB

### 통계

제출: 133, 정답: 52, 맞힌 사람: 40, 정답 비율: 39.604%

### 분류

그래프 이론, 문자열, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>ビ太郎はパンケーキ店で働いている．</p>

<p>この店で最も人気のあるメニューは&nbsp;<var>N</var>&nbsp;枚のパンケーキが積み重なったパンケーキタワーである．店で作られているパンケーキには&nbsp;<var>3</var>&nbsp;種類の味があり，それぞれ&nbsp;<code>A</code>，<code>B</code>，<code>C</code>&nbsp;と呼ぶことにする．</p>

<p>ここで，パンケーキの並び方が次の条件を満たすようになっているパンケーキタワーを<strong>良いパンケーキタワー</strong>と呼ぶことにする．</p>

<ul>
	<li>すべての味&nbsp;<code>A</code>&nbsp;のパンケーキと味&nbsp;<code>B</code>&nbsp;のパンケーキの組において，味&nbsp;<code>A</code>&nbsp;のパンケーキが味&nbsp;<code>B</code>&nbsp;のパンケーキより上にある．</li>
	<li>すべての味&nbsp;<code>A</code>&nbsp;のパンケーキと味&nbsp;<code>C</code>&nbsp;のパンケーキの組において，味&nbsp;<code>A</code>&nbsp;のパンケーキが味&nbsp;<code>C</code>&nbsp;のパンケーキより上にある．</li>
	<li>すべての味&nbsp;<code>B</code>&nbsp;のパンケーキと味&nbsp;<code>C</code>&nbsp;のパンケーキの組において，味&nbsp;<code>B</code>&nbsp;のパンケーキが味&nbsp;<code>C</code>&nbsp;のパンケーキより上にある．</li>
</ul>

<p>例えば，パンケーキの味がそれぞれ上から順に&nbsp;<code>AABBBC</code>，<code>ACC</code>，<code>BBBB</code>&nbsp;となっているパンケーキタワーはどれも良いパンケーキタワーであるが，<code>AABABCC</code>，<code>CA</code>&nbsp;となっているパンケーキタワーはどれも良いパンケーキタワーではない．</p>

<p>盛り付け担当のビ太郎はパンケーキタワーに対して次の操作を行うことができる．</p>

<ul>
	<li>操作&nbsp;<var>k</var>&nbsp;(<var>2 ≦ k ≦ N</var>)：上から&nbsp;<var>k</var>&nbsp;枚目のパンケーキの下側にフライ返しを差し込み，そこから上のパンケーキをひっくり返す．すなわち，上から&nbsp;<var>k</var>&nbsp;枚のパンケーキの並び方を反転させる．</li>
</ul>

<p>例えば，パンケーキの味が上から順に&nbsp;<code>ABCB</code>&nbsp;となっているパンケーキタワーに操作&nbsp;<var>2</var>，操作&nbsp;<var>3</var>，操作&nbsp;<var>4</var>&nbsp;をそれぞれ行った場合，パンケーキの並び方は&nbsp;<code>BACB</code>，<code>CBAB</code>，<code>BCBA</code>&nbsp;となる．</p>

<p>今，<var>Q</var>&nbsp;皿のパンケーキタワーがあり，<var>i</var>&nbsp;皿目 (<var>1 ≦ i ≦ Q</var>) のパンケーキタワーはパンケーキの味が上から順に&nbsp;<var>S<sub>i,1</sub>&nbsp;S<sub>i,2</sub>&nbsp;&hellip; S<sub>i,N</sub></var>&nbsp;となっている．ビ太郎はそれぞれのパンケーキタワーについて，できる限り少ない回数の操作で良いパンケーキタワーにしたい．</p>

<p><var>Q</var>&nbsp;皿のパンケーキタワーの並び方の情報が与えられるので，それぞれのパンケーキタワーについて，良いパンケーキタワーにするのに必要な操作の回数の最小値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<p><var>N</var>&nbsp;<var>Q</var><br />
<var>S<sub>1</sub></var><br />
<var>S<sub>2</sub></var><br />
<var>:</var><br />
<var>S<sub>Q</sub></var></p>

<p>ただし，<var>S<sub>i</sub></var>&nbsp;(<var>1 ≦ i ≦ Q</var>) は長さ&nbsp;<var>N</var>&nbsp;の文字列で，その&nbsp;<var>j</var>&nbsp;文字目 (<var>1 ≦ j ≦ N</var>) は&nbsp;<var>S<sub>i,j</sub></var>&nbsp;である．</p>

### 출력

<p>標準出力に&nbsp;<var>Q</var>&nbsp;行出力せよ．<var>i</var>&nbsp;行目 (<var>1 ≦ i ≦ Q</var>) には，<var>i</var>&nbsp;皿目のパンケーキタワーについて，良いパンケーキタワーにするのに必要な操作の回数の最小値を出力せよ．</p>

### 제한

<ul>
	<li><var>2 ≦ N ≦ 13</var>．</li>
	<li><var>1 ≦ Q ≦ 100&nbsp;000</var>．</li>
	<li><var>S<sub>i,j</sub></var>&nbsp;は&nbsp;<code>A</code>，<code>B</code>，<code>C</code>&nbsp;のいずれかである (<var>1 ≦ i ≦ Q</var>，<var>1 ≦ j ≦ N</var>)．</li>
</ul>