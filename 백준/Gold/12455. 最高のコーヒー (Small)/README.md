# [Gold IV] 最高のコーヒー (Small) - 12455

[문제 링크](https://www.acmicpc.net/problem/12455)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 108, 정답: 70, 맞힌 사람: 63, 정답 비율: 64.286%

### 분류

그리디 알고리즘, 브루트포스 알고리즘

### 문제 설명

<p>ヘインの一日は朝のコーヒーを飲むことから始まります。</p>

<p>彼の手元には&nbsp;<strong>N</strong>&nbsp;種類のコーヒーがあります。<strong>i</strong>&nbsp;番目の種類のコーヒーは&nbsp;<strong>c<sub>i</sub></strong>&nbsp;杯分残っていて、今日から数えて&nbsp;<strong>t<sub>i</sub></strong>&nbsp;日目に消費期限を迎えます。彼は&nbsp;<strong>i</strong>&nbsp;番目（1 &le;&nbsp;<strong>i</strong>&nbsp;&le;&nbsp;<strong>N</strong>）の種類のコーヒーを一杯飲むごとに&nbsp;<strong>s<sub>i</sub></strong>の満足度が得られます。消費期限の切れたコーヒーを飲むことはできません（ちょうど&nbsp;<strong>t<sub>i</sub></strong>&nbsp;日目であればそのコーヒーは飲むことができます）。たとえば&nbsp;<strong>t<sub>i</sub></strong>&nbsp;= 1 であれば、今日中に飲んでしまうか、そのコーヒーをあきらめるかのどちらかにしなければなりません。</p>

<p>彼はコーヒーを一日に一杯だけ、朝だけにしか飲まないことにしています。もし手元に飲めるコーヒーがない日は、満足度を得ることはできません。</p>

<p>これらのコーヒーを飲むことで、今日から始めて&nbsp;<strong>K</strong>&nbsp;日目までに彼は合計して最大でどれだけの満足度を得られるでしょうか。</p>

### 입력

<p>入力の最初の行はテストケースの個数&nbsp;<strong>T</strong>&nbsp;です。そのあとに&nbsp;<strong>T</strong>&nbsp;個のテストケースが続きます。 それぞれのテストケースは 1 つのスペースで区切られた 2 つの正の整数が含まれる行から始まります。 最初の整数はコーヒーの種類数&nbsp;<strong>N</strong>&nbsp;を表し、次の整数は日数&nbsp;<strong>K</strong>&nbsp;を表します。 そのあとにそれぞれの種類のコーヒーの残数、消費期限、満足度を表す以下の形式の行が&nbsp;<strong>N</strong>&nbsp;行続きます。</p>

<pre>
c<sub>i</sub> t<sub>i</sub> s<sub>i</sub></pre>

<h3>制約</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100</li>
	<li>1 &le;&nbsp;<strong>c<sub>i</sub></strong>&nbsp;&le; K</li>
	<li>1 &le;&nbsp;<strong>t<sub>i</sub></strong>&nbsp;&le; K</li>
	<li>1 &le;&nbsp;<strong>s<sub>i</sub></strong>&nbsp;&le; 1000</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 8</li>
	<li>1 &le;&nbsp;<strong>K</strong>&nbsp;&le; 8</li>
</ul>

### 출력

<p>各テストケースごとに、</p>

<pre>
Case #X: Y
</pre>

<p>と一行出力してください。ここで&nbsp;<strong>X</strong>&nbsp;は 1 から始まるテストケースの番号、<strong>Y</strong>&nbsp;はヘインの満足度の合計の最大値です。</p>