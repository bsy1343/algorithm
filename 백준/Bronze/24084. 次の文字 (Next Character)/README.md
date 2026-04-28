# [Bronze IV] 次の文字 (Next Character) - 24084

[문제 링크](https://www.acmicpc.net/problem/24084)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 935, 정답: 810, 맞힌 사람: 762, 정답 비율: 87.889%

### 분류

구현, 문자열

### 문제 설명

<p>長さ&nbsp;<var>N</var>&nbsp;の文字列&nbsp;<var>S</var>&nbsp;が与えられる．<var>S</var>&nbsp;の各文字は&nbsp;<code>J</code>，<code>O</code>，<code>I</code>&nbsp;のいずれかである．</p>

<p>ビーバーのビ太郎は，<var>N - 1</var>&nbsp;回の動作を行った．<var>i</var>&nbsp;回目 (<var>1 ≦ i ≦ N - 1</var>) の動作は，次のように行われた．</p>

<ul>
	<li><var>S</var>&nbsp;の&nbsp;<var>i + 1</var>&nbsp;文字目を確認する．さらに，<var>S</var>&nbsp;の&nbsp;<var>i + 1</var>&nbsp;文字目が&nbsp;<code>J</code>&nbsp;であったならば，<var>S</var>&nbsp;の&nbsp;<var>i</var>&nbsp;文字目を黒板に書く．</li>
</ul>

<p><var>N - 1</var>&nbsp;回の動作においてビ太郎が黒板に書いたすべての文字を，ビ太郎が書いた順に改行区切りで出力せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var>
<var>S</var></pre>

### 출력

<p><var>N - 1</var>&nbsp;回の動作においてビ太郎が黒板に書いたすべての文字を，ビ太郎が書いた順に改行区切りで出力せよ．</p>

### 제한

<ul>
	<li><var>2 ≦ N ≦ 100</var>．</li>
	<li><var>S</var>&nbsp;は長さ&nbsp;<var>N</var>&nbsp;の文字列である．</li>
	<li><var>S</var>&nbsp;の各文字は&nbsp;<code>J</code>，<code>O</code>，<code>I</code>&nbsp;のいずれかである．</li>
	<li><var>N</var>&nbsp;は整数である．</li>
	<li>黒板に書かれた文字が&nbsp;<var>1</var>&nbsp;つ以上存在する．</li>
</ul>