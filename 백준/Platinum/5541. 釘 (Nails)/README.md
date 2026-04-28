# [Platinum IV] 釘 (Nails) - 5541

[문제 링크](https://www.acmicpc.net/problem/5541)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 411, 정답: 205, 맞힌 사람: 155, 정답 비율: 49.679%

### 분류

애드 혹, 누적 합, 스위핑, 차분 배열 트릭

### 문제 설명

<p>JOI くんは板に釘を刺して遊んでいる．下図のように，JOI くんは一辺 N 本の正三角形の形に釘を並べて刺した．上から a 行目 (1 &le; a &le; N) には a 本の釘が並んでいる．そのうち左から b 本目 (1 &le; b &le; a) の釘を (a, b) で表す．</p>

<p style="text-align:center"><img alt="" src="/upload/images3/nail1.png" style="height:252px; width:297px" /></p>

<p style="text-align:center">図 1: 釘の並び方（N = 5 の場合）</p>

<p>釘を頂点とする正三角形が，「各辺が全体の正三角形の辺のいずれかと平行で，全体の正三角形と同じ向き」であるとき，この正三角形を「よい正三角形」と呼ぶ．すなわち，「よい正三角形」とは，3 本の釘 (a, b), (a + x, b), (a + x, b + x) を頂点とする正三角形のことである（ただし a, b, x は 1 &le; a &lt; N, 1 &le; b &le; a, 1 &le; x &le; N &minus; a) をみたす）．</p>

<p>JOI くんは，輪ゴムを使って，「よい正三角形」の周りを囲うことにした．</p>

<p style="text-align:center"><img alt="" src="/upload/images3/nail2.png" style="height:237px; width:276px" /></p>

<p style="text-align:center">図 2: 輪ゴムによる「よい正三角形」の囲い方の例</p>

<p>正三角形の一辺に並んでいる釘の本数 N と，JOI くんが持っている輪ゴムの数 M と，M 本の輪ゴムによる「よい正三角形」の囲い方が与えられたとき，1 本以上の輪ゴムで囲われた釘の本数を求めるプログラムを作成せよ．</p>

### 입력

<p>標準入力から以下のデータを読み込め．</p>

<ul>
	<li>1 行目には整数 N, M が空白を区切りとして書かれている．N は正三角形の一辺に並んでいる釘の本数を，M は JOI くんの持っている輪ゴムの数をそれぞれ表す．</li>
	<li>続く M 行は輪ゴムによる「よい正三角形」の囲い方の情報を表す．i + 1 行目 (1 &le; i &le; M) には整数 A<sub>i</sub>, B<sub>i</sub>, X<sub>i</sub> (1 &le; A<sub>i</sub> &lt; N, 1 &le; B<sub>i</sub> &le; A<sub>i</sub>, 1 &le; X<sub>i</sub> &le; N &minus; A<sub>i</sub>) が空白を区切りとして書かれている．これは，i本目の輪ゴムは 3 本の釘 (A<sub>i</sub>, B<sub>i</sub>), (A<sub>i</sub> + X<sub>i</sub>, B<sub>i</sub>), (A<sub>i</sub> + X<sub>i</sub>, B<sub>i</sub> + X<sub>i</sub>) を頂点とする「よい正三角形」を囲っていることを表す．</li>
</ul>

### 출력

<p>標準出力に，1 本以上の輪ゴムに囲われている釘の本数を 1 行で出力せよ．</p>

### 제한

<ul>
	<li>2 &le; N &le; 5000 一辺に並んでいる釘の本数</li>
	<li>1 &le; M &le; 500000 (= 5 &times; 10<sup>5</sup>) 輪ゴムの数</li>
</ul>

### 힌트

<p>この例は図 2 のような「よい正三角形」の囲い方に対応している．この例において，(1, 1), (4, 4), (5, 5)以外の 12 本の釘が 1 本以上の輪ゴムで囲われている．</p>