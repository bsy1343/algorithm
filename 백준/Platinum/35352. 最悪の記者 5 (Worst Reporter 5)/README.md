# [Platinum IV] 最悪の記者 5 (Worst Reporter 5) - 35352

[문제 링크](https://www.acmicpc.net/problem/35352)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 4, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

구현, 그리디 알고리즘, 덱, 분리 집합, 시뮬레이션, 연결 리스트, 자료 구조, 작은 집합에서 큰 집합으로 합치는 테크닉, 정렬

### 문제 설명

<p>カワウソのウソ太郎は新聞記者であり，近くで開かれる大規模なマラソン大会を取材している．</p>

<p>大会には <var>N</var> 人の選手が参加しており，選手には <var>1</var> から <var>N</var> までの番号が付けられている．ウソ太郎はこの大会の取材で，以下の情報をメモに記録した．</p>

<ul>
<li>大会の開始時点において，<var>N</var> 人の選手は <var>1</var> 位から <var>N</var> 位までのいずれかの順位であり，それらは互いに相異なっていた．</li>
<li>順位変動はちょうど <var>M</var> 回発生した．<var>i</var> 回目 (<var>1 ≦ i ≦ M</var>) の順位変動では，選手 <var>A<sub>i</sub></var> と選手 <var>B<sub>i</sub></var> の順位が入れ替わった．いずれの順位変動においても，入れ替わる <var>2</var> 人の順位の差の絶対値は <var>1</var> であった．</li>
<li>複数の順位変動が同時に発生することはなかった．</li>
</ul>

<p>ウソ太郎は，各選手の最終的な順位を表す<strong>順位表</strong>を新聞に載せたい．順位表は長さ <var>N</var> の数列であり，<var>j</var> 番目 (<var>1 ≦ j ≦ N</var>) の値は最終的に <var>j</var> 位になった選手の番号である．</p>

<p>しかしウソ太郎は，順位表を記録していなかったどころか，各順位変動でどちらが順位を上げた側であったかも記録していなかった．そこでウソ太郎は，メモの情報に矛盾しないような順位表のうち，辞書順で最小のものを選んで報告することにした．</p>

<p>数列 <var>(a<sub>1</sub>, a<sub>2</sub>, …, a<sub>N</sub>)</var> が数列 <var>(b<sub>1</sub>, b<sub>2</sub>, …, b<sub>N</sub>)</var> よりも<strong>辞書順で小さい</strong>とは，ある整数 <var>k</var> (<var>1 ≦ k ≦ N</var>) が存在し，以下の条件をともに満たすことをいう．</p>

<ul>
<li>整数 <var>l</var> (<var>1 ≦ l ≦ k-1</var>) に対し <var>a<sub>l</sub> = b<sub>l</sub></var>．</li>
<li><var>a<sub>k</sub> ＜ b<sub>k</sub></var>．</li>
</ul>

<p>選手の人数 <var>N</var>，およびメモに記録された各順位変動の情報が与えられたとき，メモの情報に矛盾しないような順位表が存在するか判定し，もし存在する場合はそのうち辞書順で最小のものを出力するプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<blockquote>
<p><var>N</var> <var>M</var></p>

<p><var>A<sub>1</sub></var> <var>B<sub>1</sub></var></p>

<p><var>A<sub>2</sub></var> <var>B<sub>2</sub></var></p>

<p><var>︙</var></p>

<p><var>A<sub>M</sub></var> <var>B<sub>M</sub></var></p>
</blockquote>

### 출력

<p>メモの情報に矛盾しないような順位表が存在しない場合，<var>1</var> 行で <code>No</code> と出力せよ．</p>

<p>メモの情報に矛盾しないような順位表が存在する場合，そのうち辞書順で最小のものを以下の形式で <var>N+1</var> 行で出力せよ．</p>

<ul>
<li><var>1</var> 行目には <code>Yes</code> を出力せよ．</li>
<li><var>1+j</var> 行目 (<var>1 ≦ j ≦ N</var>) には，最終的に <var>j</var> 位になった選手の番号を出力せよ．</li>
</ul>

### 제한

<ul>
<li><var>2 ≦ N ≦ 500 000</var>．</li>
<li><var>1 ≦ M ≦ 500 000</var>．</li>
<li><var>1 ≦ A<sub>i</sub> ＜ B<sub>i</sub> ≦ N</var> (<var>1 ≦ i ≦ M</var>)．</li>
<li>入力される値はすべて整数である．</li>
</ul>