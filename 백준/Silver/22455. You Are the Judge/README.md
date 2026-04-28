# [Silver III] You Are the Judge - 22455

[문제 링크](https://www.acmicpc.net/problem/22455)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 19, 맞힌 사람: 18, 정답 비율: 94.737%

### 분류

구현, 시뮬레이션, 정렬

### 문제 설명

<p>あなたはプログラミングコンテスト iCPC の審判だ。今日も何事もなく試合が終わり、後は結果を出力するだけだと思いきや、突然システムが停止してしまった！　</p>

<p>これでは結果が出力できない！　でも、大丈夫。我々にはログがある。</p>

<p>あなたは優れたプログラマーであり、かつて iCPC で輝かしい成績を残したこともある。</p>

<p>そこであなたはシステムログから各チームの成績を割り出し、チームの順位表を出力するプログラムを作成することにした。</p>

<p>入力としてチームの数、問題の数、システムログが与えられる。</p>

<p>シムテムログは以下の 2 種類のレコードからなる。</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>レコード</th>
			<th>内容</th>
			<th>効果</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>tID pID time CORRECT</td>
			<td>時刻 time に、チーム tID が 問題 pID に正解するプログラムを送信。</td>
			<td>チーム tID の正解数に1が加算される。 			チーム tID のペナルティに、(チーム tID の問題 pID に対する誤答数*1200+time)が加算される。 			以後, チーム tID の問題 pID に対する解答は棄却され、システムログにも送信履歴が残らない。</td>
		</tr>
	</tbody>
	<tbody>
		<tr>
			<td>tID pID time WRONG</td>
			<td>時刻 time に、チーム tID が 問題 pID に誤答するプログラムを送信。</td>
			<td>チーム tID の 問題 pID に対する誤答数に1が加算される。</td>
		</tr>
	</tbody>
</table>

<p>※上記のシステムログはこの問題のために簡略化されたものであり、本番のICPCで見られるシステムログと異なることに留意せよ</p>

<p>iCPCにおける順位付けのルールは以下の通りである。</p>

<ul>
	<li>より多くの問題を解いたチームは順位が上になる</li>
	<li>解いた問題が同じ場合、ペナルティの少ないチームのほうが順位が上になる</li>
	<li>解いた問題もペナルティも同じ場合、チーム番号が小さいほうのチームが順位が上になる</li>
</ul>

<p>入力より与えられるコンテストの情報・システムログから各チームの成績を割り出し、チームの順位表を出力せよ。</p>

### 입력

<p>入力は複数のデータセットからなる。各データセットは以下の形式で与えられる。</p>

<pre>
<var>T</var>&nbsp;<var>P</var>&nbsp;<var>R</var>
<var>tID<sub>1</sub></var>&nbsp;<var>pID<sub>1</sub></var>&nbsp;<var>time<sub>1</sub></var>&nbsp;<var>message<sub>1</sub></var>
<var>tID<sub>2</sub></var>&nbsp;<var>pID<sub>2</sub></var>&nbsp;<var>time<sub>2</sub></var>&nbsp;<var>message<sub>2</sub></var>
<var>...</var>
<var>tID<sub>R</sub></var>&nbsp;<var>pID<sub>R</sub></var>&nbsp;<var>time<sub>R</sub></var>&nbsp;<var>message<sub>R</sub></var>
</pre>

<p>データセットの1行目には 参加チーム数 T 、問題数 P、システムログのレコード数 R が含まれる。</p>

<p>続くR行にはシステムログの各レコードが含まれる。</p>

<p>システムログのレコードとして、チーム番号 tID<sub>i</sub>、問題番号 pID<sub>i</sub>、試合開始からの経過時間 time<sub>i</sub>、メッセージの種類 message<sub>i</sub>&nbsp;が含まれる。</p>

<p>入力は以下の制約を満たす。</p>

<ul>
	<li>1 &le; T &le; 50</li>
	<li>1 &le; P &le; 10</li>
	<li>1 &le; R &le; 500</li>
	<li>1 &le; tID<sub>i</sub>&nbsp;&le; T</li>
	<li>1 &le; pID<sub>i</sub>&nbsp;&le; P</li>
	<li>1 &le; time<sub>i</sub>&nbsp;&le; 10800</li>
	<li>message<sub>i</sub>&nbsp;は CORRECT, WRONGのいずれか</li>
	<li>システムログのレコードは、時刻の小さいものから順に与えられ、複数のレコードの時刻が同じになることはない</li>
</ul>

<p>入力の終わりはスペースで区切られた3個の0で与えられる。</p>

### 출력

<p>与えられたシステムログより各チームの成績・順位を割り出し、順位が上のチームから順に、チーム番号、正解数、ペナルティ を出力せよ。</p>