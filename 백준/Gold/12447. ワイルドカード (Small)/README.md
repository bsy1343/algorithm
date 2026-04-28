# [Gold II] ワイルドカード (Small) - 12447

[문제 링크](https://www.acmicpc.net/problem/12447)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 156, 정답: 17, 맞힌 사람: 12, 정답 비율: 20.339%

### 분류

브루트포스 알고리즘, 조합론, 수학, 정규 표현식, 문자열

### 문제 설명

<p>多くのオペレーティングシステムでは、ファイル名を指定するとき、「*」（アスタリスク）を任意の文字列（空文字列を含む）にマッチするワイルドカードとして利用できる。</p>

<p>ワイルドカードは複数のファイルをまとめて指定するときによく使われるが、単一のファイルをより楽に指定する目的にも使うことができる。たとえば、&quot;pascalisamazing&quot; というファイルを指定するとき、&quot;pascal*&quot; というパターンにマッチするファイルが他になければ、このパターンによって &quot;pascalisamazing&quot; を指定することができる。そして、&quot;pascal*&quot; は&quot;pascalisamazing&quot; よりずっと短いので、楽に入力することができる。</p>

<p>あなたの挑戦は、二つのファイル名が与えられたとき、片方だけにマッチする最短のパターンを求めることである。</p>

### 입력

<p>入力の一行目には、テストケース数&nbsp;<strong>T</strong>&nbsp;が与えられる。続いて、各二行からなる&nbsp;<strong>T</strong>&nbsp;個のテストケースが与えられる。各テストケースでは、一行目に一番目のファイルの名前&nbsp;<strong>A</strong>、二行目に二番目のファイルの名前&nbsp;<strong>B</strong>&nbsp;が与えられる。ファイル名はアルファベットの小文字のみからなる。</p>

<h3>制約</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100</li>
	<li><strong>A</strong>&nbsp;と&nbsp;<strong>B</strong>&nbsp;は異なる文字列</li>
	<li><strong>A</strong>&nbsp;と&nbsp;<strong>B</strong>&nbsp;はともに最小で1文字、最大で10文字からなる</li>
</ul>

### 출력

<p>各テストケースに対し、次のフォーマットの一行を出力せよ。</p>

<pre>
Case #<strong>X</strong>: <strong>Y</strong>
</pre>

<p>ただし&nbsp;<strong>X</strong>&nbsp;はテストケースの番号、<strong>Y</strong>&nbsp;は&nbsp;<strong>A</strong>&nbsp;にマッチするが&nbsp;<strong>B</strong>&nbsp;にマッチしない最短のパターンである。なお、最短のパターンが複数ある場合は、最もアスタリスクの個数が少ないパターンを出力せよ。それでもなお候補が複数ある場合は、辞書式順序で最も小さいものを出力せよ。なお、文字の比較は、ASCII コードの大小によって行うこと。</p>