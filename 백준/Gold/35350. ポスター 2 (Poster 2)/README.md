# [Gold IV] ポスター 2 (Poster 2) - 35350

[문제 링크](https://www.acmicpc.net/problem/35350)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 8, 정답: 8, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

구현, 브루트포스 알고리즘, 애드 혹

### 문제 설명

<p>JOI 学園の理恵さんは，今年 <var>3</var> 月に実施される文化祭のポスターを作った． このポスターは <var>N</var> 行 <var>N</var> 列のマス目の形をしており，各マスは <var>1</var> から <var>K</var> までの番号が付けられた <var>K</var> 種類の色のいずれかで塗られている． 具体的には，ポスターの上から <var>i</var> 行目，左から <var>j</var> 列目 (<var>1 ≦ i ≦ N</var>，<var>1 ≦ j ≦ N</var>) は色 <var>A<sub>i,j</sub></var> で塗られている．</p>

<p>しかし，このポスターについて生徒間で話し合いを行ったところ，もう少しカラフルにした方が良いのではないかという意見が出た． 具体的には，以下で定義される<strong>カラフル度</strong>を上げた方が良いのではないかという意見が出た．</p>

<ul>
<li>連続する <var>2</var> 行 <var>2</var> 列の正方形領域のうち，<var>3</var> 種類以上の色を含むものの個数．</li>
</ul>

<p>たとえば，下図左のようなポスターを作った場合，下図右に示す <var>2</var> つの長方形領域について <var>3</var> 種類以上の色を含むため，カラフル度は <var>2</var> である．</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35350.%E2%80%85%E3%83%9D%E3%82%B9%E3%82%BF%E3%83%BC%E2%80%852%E2%80%85(Poster%E2%80%852)/7a2b3ff1.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35350-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p>ポスターの提出期限まであと数分しかないので，以下の操作を <var>0</var> 回または <var>1</var> 回行うことで，カラフル度を最大化したい．</p>

<ul>
<li>好きなマスを <var>1</var> つ選び，そのマスの色を <var>K</var> 種類の色のいずれかで塗り替える．</li>
</ul>

<p>理恵さんが最初に作ったポスターの情報が与えられるので，達成できるカラフル度の最大値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<blockquote>
<p><var>N</var> <var>K</var></p>

<p><var>A<sub>1,1</sub></var> <var>A<sub>1,2</sub></var> <var>…</var> <var>A<sub>1,N</sub></var></p>

<p><var>A<sub>2,1</sub></var> <var>A<sub>2,2</sub></var> <var>…</var> <var>A<sub>2,N</sub></var></p>

<p><var>︙</var></p>

<p><var>A<sub>N,1</sub></var> <var>A<sub>N,2</sub></var> <var>…</var> <var>A<sub>N,N</sub></var></p>
</blockquote>

### 출력

<p>達成できるカラフル度の最大値を <var>1</var> 行で出力せよ．</p>

### 제한

<ul>
<li><var>2 ≦ N ≦ 270</var>．</li>
<li><var>3 ≦ K ≦ 10<sup>9</sup></var>．</li>
<li><var>1 ≦ A<sub>i,j</sub> ≦ K</var> (<var>1 ≦ i ≦ N</var>，<var>1 ≦ j ≦ N</var>)．</li>
<li>入力される値はすべて整数である．</li>
</ul>