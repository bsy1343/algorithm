# [Platinum II] スパイ 2 (Spy 2) - 20983

[문제 링크](https://www.acmicpc.net/problem/20983)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 17, 맞힌 사람: 14, 정답 비율: 53.846%

### 분류

방향 비순환 그래프, 그래프 이론, 그리디 알고리즘, 위상 정렬

### 문제 설명

<p>JOI 国には&nbsp;<var>N</var>&nbsp;人の議員がおり，<var>1</var>&nbsp;から&nbsp;<var>N</var>&nbsp;までの番号がつけられている．JOI 国の大臣であるあなたは，議員の中にいるスパイを探し出そうとしている．あなたは各議員&nbsp;<var>i</var>&nbsp;(<var>1 ≦ i ≦ N</var>) について次のような情報を得た．</p>

<ul>
	<li><var>T<sub>i</sub>&nbsp;= 1</var>&nbsp;のとき，議員&nbsp;<var>i</var>&nbsp;はスパイである．</li>
	<li><var>T<sub>i</sub>&nbsp;= 2</var>&nbsp;のとき，議員&nbsp;<var>i</var>&nbsp;はスパイではない．</li>
	<li><var>T<sub>i</sub>&nbsp;= 3</var>&nbsp;のとき，議員&nbsp;<var>i</var>&nbsp;がスパイであるかどうかは不明である．</li>
</ul>

<p>更に聞き取り調査を行った結果，新たに&nbsp;<var>M</var>&nbsp;個の情報を得ることができた．<var>j</var>&nbsp;番目の聞き取り調査の情報 (<var>1 ≦ j ≦ M</var>) は，議員&nbsp;<var>A<sub>j</sub></var>&nbsp;(<var>1 ≦ A<sub>j</sub>&nbsp;≦ N</var>) が「議員&nbsp;<var>B<sub>j</sub></var>&nbsp;(<var>1 ≦ B<sub>j</sub>&nbsp;≦ N</var>) はスパイであり，かつ議員&nbsp;<var>C<sub>j</sub></var>&nbsp;(<var>1 ≦ C<sub>j</sub>&nbsp;≦ N</var>) はスパイでない」と証言したというものである．</p>

<p>ただし，議員&nbsp;<var>A<sub>j</sub></var>&nbsp;がスパイであれば，<var>j</var>&nbsp;番目の聞き取り調査の情報における証言は事実とは異なる．すなわち，もし議員&nbsp;<var>A<sub>j</sub></var>&nbsp;がスパイであれば，「議員&nbsp;<var>B<sub>j</sub></var>&nbsp;はスパイである」「議員&nbsp;<var>C<sub>j</sub></var>&nbsp;はスパイでない」のうち，少なくとも一方は事実ではない．一方で，議員&nbsp;<var>A<sub>j</sub></var>&nbsp;がスパイでないとき，<var>j</var>&nbsp;番目の聞き取り調査の情報における証言は事実かもしれないし，そうでないかもしれない．</p>

<p>各議員の情報と，聞き取り調査の結果が与えられるので，それら&nbsp;<var>N + M</var>&nbsp;個の情報が矛盾しているかを判定し，矛盾していないなら，それぞれの議員がスパイかどうかを求めるプログラムを作成せよ．<var>N + M</var>&nbsp;個の情報と合致する答えが複数存在する場合は，そのうちどれを出力してもよい．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<p><var>N</var>&nbsp;<var>M</var><br />
<var>T<sub>1</sub></var>&nbsp;<var>T<sub>2</sub></var>&nbsp;<var>&hellip;</var>&nbsp;<var>T<sub>N</sub></var><br />
<var>A<sub>1</sub></var>&nbsp;<var>B<sub>1</sub></var>&nbsp;<var>C<sub>1</sub></var><br />
<var>A<sub>2</sub></var>&nbsp;<var>B<sub>2</sub></var>&nbsp;<var>C<sub>2</sub></var><br />
<var>:</var><br />
<var>A<sub>M</sub></var>&nbsp;<var>B<sub>M</sub></var>&nbsp;<var>C<sub>M</sub></var></p>

### 출력

<p>標準出力に出力せよ．</p>

<p>与えられた情報が矛盾している場合，<code>-1</code>&nbsp;を&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

<p>そうでない場合，出力は&nbsp;<var>N</var>&nbsp;行からなる．<var>i</var>&nbsp;行目 (<var>1 ≦ i ≦ N</var>) には議員&nbsp;<var>i</var>&nbsp;がスパイである場合&nbsp;<var>1</var>&nbsp;を，議員&nbsp;<var>i</var>&nbsp;がスパイでない場合&nbsp;<var>2</var>&nbsp;を出力せよ．<var>N + M</var>&nbsp;個の情報と合致する答えが複数存在する場合，そのうちどれを出力してもよい．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 300&nbsp;000</var>．</li>
	<li><var>1 ≦ M ≦ 300&nbsp;000</var>．</li>
	<li><var>1 ≦ T<sub>i</sub>&nbsp;≦ 3</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>1 ≦ A<sub>j</sub>&nbsp;≦ N</var>&nbsp;(<var>1 ≦ j ≦ M</var>)．</li>
	<li><var>1 ≦ B<sub>j</sub>&nbsp;≦ N</var>&nbsp;(<var>1 ≦ j ≦ M</var>)．</li>
	<li><var>1 ≦ C<sub>j</sub>&nbsp;≦ N</var>&nbsp;(<var>1 ≦ j ≦ M</var>)．</li>
	<li><var>A<sub>j</sub>&nbsp;&ne; B<sub>j</sub></var>&nbsp;(<var>1 ≦ j ≦ M</var>)．</li>
	<li><var>A<sub>j</sub>&nbsp;&ne; C<sub>j</sub></var>&nbsp;(<var>1 ≦ j ≦ M</var>)．</li>
	<li><var>B<sub>j</sub>&nbsp;&ne; C<sub>j</sub></var>&nbsp;(<var>1 ≦ j ≦ M</var>)．</li>
</ul>