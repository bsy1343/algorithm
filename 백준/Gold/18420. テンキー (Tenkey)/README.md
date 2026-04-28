# [Gold I] テンキー (Tenkey) - 18420

[문제 링크](https://www.acmicpc.net/problem/18420)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 134, 정답: 44, 맞힌 사람: 41, 정답 비율: 46.067%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>JOI 君はテンキーを&nbsp;<var>1</var>&nbsp;つ持っている．このテンキーには&nbsp;<var>0</var>&nbsp;から&nbsp;<var>9</var>&nbsp;までの数字が印字されているキーが以下の図のように配置されている．&nbsp;<var>2</var>&nbsp;が印字されたキーの下，および&nbsp;<var>3</var>&nbsp;が印字されたキーの下にはキーは存在しないことに注意せよ．</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18420.%E2%80%85%E3%83%86%E3%83%B3%E3%82%AD%E3%83%BC%E2%80%85(Tenkey)/38afaa43.png" data-original-src="https://upload.acmicpc.net/362ffde3-cb34-461b-882d-e7e2e413c878/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 153px; height: 186px;" /></p>

<p>またこのテンキーには，テンキーに配置されているキーのうち&nbsp;<var>1</var>&nbsp;つのキーを指し示すカーソルが存在している．カーソルは最初&nbsp;<var>0</var>&nbsp;が印字されているキーを指し示している．</p>

<p>JOI 君は&nbsp;<var>1</var>&nbsp;回の操作で次のうちのいずれかを選んで行うことができる．</p>

<ul>
	<li>カーソルを，現在カーソルが指し示しているキーと上下左右に隣接しているキーに移動させる．ただし，キーが存在しない場所にカーソルを移動させることはできない．</li>
	<li>キーを押す．すなわち，カーソルが指し示しているキーに印字されている数字を入力する．この際，以前の操作によってすでに数字が入力されていた場合，すでに入力されていた数字のすぐ右に新たな数字が入力される．</li>
</ul>

<p>いま，JOI 君はこのテンキーを使って，&nbsp;<var>M</var>&nbsp;で割った余りが&nbsp;<var>R</var>&nbsp;であるような正の整数を入力したいと考えている．テンキーの操作には時間がかかるので，なるべく少ない操作回数で入力したい．</p>

<p><var>M</var>&nbsp;と&nbsp;<var>R</var>&nbsp;が与えられるので，JOI 君が行う必要のある操作の回数の最小値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>M</var> <var>R</var></pre>

### 출력

<p><var>M</var>&nbsp;で割った余りが&nbsp;<var>R</var>&nbsp;であるような正の整数を入力するために必要な操作の回数の最小値を&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>2 ≦ M ≦ 100 000</var>．</li>
	<li><var>1 ≦ R ＜ M</var>．</li>
	<li>入力される値はすべて整数である．</li>
</ul>