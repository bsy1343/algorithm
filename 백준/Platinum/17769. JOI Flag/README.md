# [Platinum III] JOI Flag - 17769

[문제 링크](https://www.acmicpc.net/problem/17769)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 38, 맞힌 사람: 31, 정답 비율: 60.784%

### 분류

다이나믹 프로그래밍, 재귀

### 문제 설명

<p>あなたは，日本情報オリンピックの新しい旗として，レベル K の JOI Flag を作ることにした． ただし，</p>

<ul>
	<li>レベル 0 の JOI Flag とは，1 &times; 1 のマス目からなる旗で，J, O, I のいずれかの文字が書かれたもので ある．</li>
	<li>整数 m &gt; 0 に対し，レベル m の JOI Flag とは，2<sup>m</sup> &times; 2<sup>m</sup> のマス目からなる旗で，各マスに J, O, I の いずれかの文字が書かれたもののうち，次の条件を満たすものである：マス目全体を 2<sup>m&minus;1</sup> &times; 2<sup>m&minus;1</sup> の 正方形 4 つに分けたとき，レベル m &minus; 1 の JOI Flag ，J の書かれたマスのみからなる部分，O の書 かれたマスのみからなる部分，I の書かれたマスのみからなる部分の 4 つの部分に分かれる．</li>
</ul>

<p>例えば，</p>

<pre>
OIJJ
JJJJ
OOII
OOII</pre>

<p>は，レベル 2 の JOI Flag である．また，</p>

<pre>
IIIIIIOO
IIIIIIOO
IIIIJOJJ
IIIIOIJJ
JJJJOOOO
JJJJOOOO
JJJJOOOO
JJJJOOOO</pre>

<p>は，レベル 3 の JOI Flag である．</p>

<p>あなたの手元には，いくつかのマス目に J, O, I のいずれかの文字が書きこまれた 2<sup>K</sup> &times; 2<sup>K</sup> の旗がある．</p>

<p>あなたは，この旗にいくつかの文字を書き加えたり，既に旗に書かれているいくつかの文字を修正した りして，レベル K の JOI Flag を完成させることにした．文字が書かれていないマスにはコスト 0 で文字 を書けるが，文字が書かれたマスの文字を書き換えるにはコスト 1 がかかる．</p>

<p>レベル K の JOI Flag を完成させるのに必要なコストの最小値を求めたい．</p>

<p>あなたの手元にある旗の情報が与えられたとき，レベル K の JOI Flag を完成させるのに必要なコスト の最小値を求めるプログラムを作成せよ．</p>

### 입력

<p>標準入力から以下の入力を読み込め．</p>

<ul>
	<li>1 行目には整数 K, N が空白を区切りとして書かれている．K は JOI Flag のレベルを，N は文字の書 かれたマス目の個数をそれぞれ表す．文字には 1, 2, &middot;&middot;&middot; , N の番号がつけられている．</li>
	<li>続く N 行には文字の情報が書かれている．i + 1 行目には Xi, Yi,Ci が空白を区切りとして書かれてい る．これは，文字 C<sub>i</sub> が左から X<sub>i</sub> 列目，上から Y<sub>i</sub> 行目に書かれていることを表す．</li>
</ul>

### 출력

<p>標準出力に，レベル K の JOI Flag を作るのに必要なコストの最小値を表す整数を 1 行で出力せよ．</p>

### 제한

<ul>
	<li>1 &le; K &le; 30 JOI Flag のレベル</li>
	<li>1 &le; N &le; 1 000 JOI Flag に書き込まれている文字の個数</li>
	<li>1 &le; X<sub>i</sub> &le; 2<sup>K</sup> i 番目の文字の書かれている列番号</li>
	<li>1 &le; Y<sub>i</sub> &le; 2<sup>K</sup> i 番目の文字の書かれている行番号</li>
	<li>C<sub>i</sub> は J, O, I のいずれかである．</li>
	<li>組 (X<sub>i</sub>, Y<sub>i</sub>) はすべて異なる．</li>
</ul>