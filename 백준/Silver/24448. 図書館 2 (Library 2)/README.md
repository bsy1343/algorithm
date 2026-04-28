# [Silver IV] 図書館 2 (Library 2) - 24448

[문제 링크](https://www.acmicpc.net/problem/24448)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 232, 정답: 188, 맞힌 사람: 147, 정답 비율: 84.000%

### 분류

자료 구조, 문자열, 스택

### 문제 설명

<p>読書好きのビ太郎は図書館で本を借りて読むことにした．ビ太郎の家は狭いため，床には本&nbsp;<var>1</var>&nbsp;冊分の広さのスペースしかない．ただし高さは十分にあるため，ビ太郎はこのスペースに本を積んで管理することにした．</p>

<p>ビ太郎はこれから&nbsp;<var>Q</var>&nbsp;回の行動を取る．<var>i</var>&nbsp;(<var>1</var>&nbsp;≦&nbsp;<var>i</var>&nbsp;≦&nbsp;<var>Q</var>) 回目の行動は文字列&nbsp;<var>S<sub>i</sub></var>&nbsp;で表される．<var>S<sub>i</sub></var>&nbsp;は 英小文字からなる文字列か&nbsp;<code>READ</code>&nbsp;のいずれかであり，その意味は次の通りである．</p>

<ul>
	<li>英小文字からなる文字列の場合，ビ太郎は書名が&nbsp;<var>S<sub>i</sub></var>&nbsp;である本を図書館から借り，スペースの一番上に積む．</li>
	<li><code>READ</code>&nbsp;の場合，ビ太郎はスペースの一番上に積まれている本を読み，図書館に返却する．</li>
</ul>

<p>あなたはビ太郎がどの本をどのような順番で読んだのかを調べたい．</p>

<p><var>Q</var>&nbsp;回の行動の内容が与えられたとき，ビ太郎が読んだ本の書名を読んだ順に出力するプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>Q</var>
<var>S<sub>1</sub></var>
<var>S<sub>2</sub></var>
<var>:</var>
<var>S<sub>Q</sub></var></pre>

### 출력

<p>標準出力に，<var>S<sub>i</sub></var>&nbsp;が&nbsp;<code>READ</code>&nbsp;である行動のそれぞれに対して，ビ太郎が読んだ本の書名を順に改行区切りで出力せよ．</p>

### 제한

<ul>
	<li><var>2 ≦ Q ≦ 200&nbsp;000</var>．</li>
	<li><var>Q</var>&nbsp;は整数である．</li>
	<li><var>S<sub>i</sub></var>&nbsp;は長さ&nbsp;<var>1</var>&nbsp;以上&nbsp;<var>10</var>&nbsp;以下の文字列である (<var>1 ≦ i ≦ Q</var>)．</li>
	<li><var>S<sub>i</sub></var>&nbsp;は英小文字からなる文字列または&nbsp;<code>READ</code>&nbsp;である (<var>1 ≦ i ≦ Q</var>)．</li>
	<li><var>S<sub>i</sub></var>&nbsp;が&nbsp;<code>READ</code>&nbsp;であるような&nbsp;<var>i</var>&nbsp;(<var>1 ≦ i ≦ Q</var>) は&nbsp;<var>1</var>&nbsp;つ以上存在する．</li>
	<li><var>S<sub>i</sub></var>&nbsp;が&nbsp;<code>READ</code>&nbsp;のとき，必ずスペースに&nbsp;<var>1</var>&nbsp;冊以上の本が存在する (<var>1 ≦ i ≦ Q</var>) ．</li>
</ul>