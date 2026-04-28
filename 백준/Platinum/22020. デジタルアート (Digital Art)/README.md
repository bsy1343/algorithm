# [Platinum II] デジタルアート (Digital Art) - 22020

[문제 링크](https://www.acmicpc.net/problem/22020)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 158, 정답: 56, 맞힌 사람: 41, 정답 비율: 35.345%

### 분류

스위핑, 두 포인터, 값 / 좌표 압축, 슬라이딩 윈도우

### 문제 설명

<p>JOI 高校の生徒である葵はデジタルアート制作が趣味であり，今日も新しい画像を作った．</p>

<p>この画像のサイズは，縦&nbsp;<var>H</var>&nbsp;ピクセル，横&nbsp;<var>W</var>&nbsp;ピクセルであり，<var>H &times; W</var>&nbsp;のマス目のような形で表される．ここで，上から&nbsp;<var>i</var>&nbsp;行目 (<var>1 ≦ i ≦ H</var>)，左から&nbsp;<var>j</var>&nbsp;列目 (<var>1 ≦ j ≦ W</var>) のピクセルを&nbsp;<var>(i, j)</var>&nbsp;で表す．各ピクセルは&nbsp;<var>1</var>&nbsp;つの色で塗られている．各色には&nbsp;<var>1</var>&nbsp;から&nbsp;<var>256</var>&nbsp;までの番号が付けられており，ピクセル&nbsp;<var>(i, j)</var>&nbsp;の色の番号は&nbsp;<var>A<sub>i, j</sub></var>&nbsp;である．</p>

<p>葵はこの画像を同級生である凛に見せたが，凛は「画像に使われている色の種類が多すぎる」という理由で気に入らなかった．そこで葵は，以下のように画像内のある領域を隠して，見える色の種類をできるだけ少なくできないかと考えた．</p>

<ul>
	<li>葵は&nbsp;<var>S</var>&nbsp;個以下のピクセルを選んで隠す．</li>
	<li>ただし，隠すピクセルの領域は&nbsp;<var>1</var>&nbsp;つの長方形で表されなければならない．</li>
</ul>

<p>画像のデータと，隠すピクセルの個数の上限&nbsp;<var>S</var>&nbsp;が与えられたとき，画像内のある領域を隠したときに見える色の種類の数としてありうる最小の値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>H</var> <var>W</var> <var>S</var>
<var>A<sub>1, 1</sub></var>   <var>A<sub>1, 2</sub></var>   <var>&hellip;</var>   <var>A<sub>1, W</sub></var>
<var>A<sub>2, 1</sub></var>   <var>A<sub>2, 2</sub></var>   <var>&hellip;</var>   <var>A<sub>2, W</sub></var>
<var>:</var>
<var>A<sub>H, 1</sub></var>   <var>A<sub>H, 2</sub></var>   <var>&hellip;</var>   <var>A<sub>H, W</sub></var></pre>

### 출력

<p>標準出力に，画像内のある領域を隠したときに見える色の種類の数としてありうる最小の値を&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

<p>特に，見えるピクセルが一つもない状態にできる場合は&nbsp;<var>0</var>&nbsp;と出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ H ≦ 1&nbsp;000</var>．</li>
	<li><var>1 ≦ W ≦ 1&nbsp;000</var>．</li>
	<li><var>1 ≦ S ≦ HW</var>．</li>
	<li><var>1 ≦ A<sub>i, j</sub>&nbsp;≦ 256</var>&nbsp;(<var>1 ≦ i ≦ H</var>，<var>1 ≦ j ≦ W</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>