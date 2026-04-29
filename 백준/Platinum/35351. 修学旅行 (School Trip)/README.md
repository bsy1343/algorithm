# [Platinum V] 修学旅行 (School Trip) - 35351

[문제 링크](https://www.acmicpc.net/problem/35351)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 18, 정답: 14, 맞힌 사람: 14, 정답 비율: 82.353%

### 분류

문자열, 세그먼트 트리, 자료 구조, 트리

### 문제 설명

<p>JOIG 高校には <var>1</var> から <var>3<sup>N</sup></var> までの番号がつけられた <var>3<sup>N</sup></var> 人の生徒がいる．</p>

<p>JOIG 高校の修学旅行の行き先として，アラスカに行く案 A とボリビアに行く案 B があり，どちらにするかを以下のように決定することにした．</p>

<ul>
<li>長さ <var>3<sup>N</sup></var> の文字列 <var>S</var> を生徒 <var>i</var> (<var>1 ≦ i ≦ 3<sup>N</sup></var>) が案 A を希望するなら <var>i</var> 文字目は <code>A</code> に，案 B を希望するなら <var>i</var> 文字目は <code>B</code> にすることで定める．</li>
<li>次の操作を <var>N</var> 回行う．
<ul>
<li>（操作）：現在の <var>S</var> の長さを <var>X</var> として，長さ <var>X ÷ 3</var> の文字列 <var>S'</var> を， <var>S'</var> の <var>j</var> (<var>1≦ j ≦ X ÷ 3</var>) 文字目を <var>S</var> の <var>3j - 2</var>, <var>3j - 1</var>, <var>3j</var> 文字目のうち多く登場する方とすることで定める．<var>S</var> を <var>S'</var> に置き換える．</li>
</ul>
</li>
<li>操作を <var>N</var> 回行った後の <var>S</var> は <code>A</code> あるいは <code>B</code> のいずれかであり，<code>A</code> ならば案 A として，<code>B</code> ならば案 B として決定する．</li>
</ul>

<p>最初，各生徒がどちらの案を希望するかは長さ <var>3<sup>N</sup></var> の文字列 <var>T</var> として与えられる．<var>T</var> の <var>i</var> 文字目は，生徒 <var>i</var> が案 A を希望するなら <code>A</code>，案 B を希望するなら <code>B</code> である．この後，<var>Q</var> 回のイベントが起こる．<var>k</var> (<var>1 ≦ k ≦ Q</var>) 回目のイベントでは，生徒 <var>p<sub>k</sub></var> の希望する案を変更する．すなわち，<var>k</var> 回目のイベントの直前での生徒 <var>p<sub>k</sub></var> の希望する案が <code>A</code> なら生徒 <var>p<sub>k</sub></var> の希望する案を <code>B</code> に，そうでないなら <code>A</code> に変更する．</p>

<p><var>k=1,2,...,Q</var> について，<var>k</var> 回目のイベントが終わった時点での各生徒の希望をもとに修学旅行の行き先を決定した場合にどちらの案が選ばれるかを求めるプログラムを作成せよ．ただし，希望案の変更は一時的なものではなく，その後のイベントに影響することに注意せよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<blockquote>
<p><var>N</var> <var>Q</var></p>

<p><var>T</var></p>

<p><var>p<sub>1</sub></var></p>

<p><var>p<sub>2</sub></var></p>

<p><var>︙</var></p>

<p><var>p<sub>Q</sub></var></p>
</blockquote>

### 출력

<p><var>Q</var> 行にわたって出力せよ．<var>k (1 ≦ k ≦ Q)</var> 行目には，<var>k</var> 回目のイベントが終わった時点での各生徒の希望をもとに修学旅行の行き先を決定した場合に案 A が選ばれる場合は <code>A</code> を，案 B が選ばれる場合は <code>B</code> を出力せよ．</p>

### 제한

<ul>
<li><var>1 ≦ N ≦ 12</var>．</li>
<li><var>1 ≦ Q ≦ 200 000</var>．</li>
<li><var>T</var> は長さ <var>3<sup>N</sup></var> の文字列である．</li>
<li><var>T</var> の各文字は <code>A</code> または <code>B</code> のいずれかである．</li>
<li><var>1 ≦ p<sub>k</sub> ≦ 3<sup>N</sup></var> (<var>1 ≦ k ≦ Q</var>)．</li>
<li><var>N, Q, p<sub>k</sub></var> は整数である．</li>
</ul>