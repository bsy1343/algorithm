# [Platinum III] marukaite - 22466

[문제 링크](https://www.acmicpc.net/problem/22466)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 16, 맞힌 사람: 11, 정답 비율: 64.706%

### 분류

그래프 이론, 최대 유량, 최소 비용 최대 유량

### 문제 설명

<p>太郎君は小学生で、チラシの裏に落書きをしています。 ある時、太郎君は次のゲームを思いつきました。</p>

<ul>
	<li><var>n&times;n</var>の格子状のマス目を書いておきます。</li>
	<li>それぞれのマス目の初期状態は、丸印が書かれているか、書かれていないかのどちらか一方です。</li>
	<li>これらの丸印を消したり書いたりして最終的にどの一列を見ても必ずちょうど1つのみの丸印が、どの一行を見ても必ず1つのみの丸印が存在するようにすることが目標であり、この状態にすればゲームをクリアしたことになります。</li>
</ul>

<p>太郎君はこのゲームを思いつきましたが、太郎君はこのゲームをクリアするのに大変時間がかかってしまいます。そこで、大学生であるあなたに助けを求めました。 太郎君の兄であり大学生であるあなたの仕事は以下の通りです。 厳密な状況を考えるために、あるマス目に丸印を書き込むコスト、あるマス目にある丸印を消すコストをあなたは導き出しました。このコストを用いてこのゲームをクリアするためにかかる操作のコストを最小化するような手順を考える。 このとき、最小のコストおよびそのコストを達成するような手順を出力するプログラムを書いてください。 出力については、最小コストを達成する手順なら、どのような操作、順番でも出力してもよいものとする。</p>

### 입력

<pre>
<var>n</var>
<var>W<sub>11</sub></var> <var>W<sub>12</sub></var> .. <var>W<sub>1n</sub></var>
<var>W<sub>21</sub></var> <var>W<sub>22</sub></var> .. <var>W<sub>2n</sub></var>
..
<var>W<sub>n1</sub></var> <var>W<sub>n2</sub></var> .. <var>W<sub>nn</sub></var>
<var>E<sub>11</sub></var> <var>E<sub>12</sub></var> .. <var>E<sub>1n</sub></var>
<var>E<sub>21</sub></var> <var>E<sub>22</sub></var> .. <var>E<sub>2n</sub></var>
..
<var>E<sub>n1</sub></var> <var>E<sub>n2</sub></var> .. <var>E<sub>nn</sub></var>
<var>F<sub>1</sub></var>(<var>n</var>文字)
<var>F<sub>2</sub></var>(<var>n</var>文字)
..
<var>F<sub>n</sub></var>(<var>n</var>文字)
</pre>

<ul>
	<li><var>n</var>は太郎君の作ったマス目が一辺にいくつあるかを表す</li>
	<li><var>W<sub>ij</sub></var>は上から<var>i</var>番目、左から<var>j</var>番目のマス目に丸印を書き込むコストを表す</li>
	<li><var>E<sub>ij</sub></var>は上から<var>i</var>番目、左から<var>j</var>番目のマス目に書かれてある丸印を消すコストを表す</li>
	<li><var>F<sub>i</sub></var>は上から<var>i</var>番目の行のマス目の初期状態を表す</li>
	<li><var>F<sub>i</sub></var>の左から<var>j</var>文字目について
	<ul>
		<li>&#39;o&#39;のとき、上から<var>i</var>番目、左から<var>j</var>番目のマス目に丸印が書かれてあることを表す。</li>
		<li>&#39;.&#39;のとき、上から<var>i</var>番目、左から<var>j</var>番目のマス目が空白であることを表す。</li>
	</ul>
	</li>
</ul>

### 출력

<pre>
<var>mincost</var>
<var>cnt</var>
<var>R<sub>1</sub></var> <var>C<sub>1</sub></var> <var>operate<sub>1</sub></var>
<var>R<sub>2</sub></var> <var>C<sub>2</sub></var> <var>operate<sub>2</sub></var>
..
<var>R<sub>cnt</sub></var> <var>C<sub>cnt</sub></var> <var>operate<sub>cnt</sub></var>
</pre>

<ul>
	<li><var>mincost</var>は、太郎君のゲームをクリアするために必要な最小コストを表す。</li>
	<li><var>mincost</var>は書き込み操作、消去操作で発生するコストの総和で計算される。</li>
	<li><var>cnt</var> : <var>mincost</var>のコストを達成する操作を行った回数を表す</li>
	<li><var>k</var>回目<var>(1&le;k&le;cnt)</var>に実行する操作は<var>k+2</var>行目に記述する</li>
	<li><var>k</var>回目<var>(1&le;k&le;cnt)</var>の操作に対して
	<ul>
		<li>上から<var>i</var>番目のマス目、左から<var>j</var>番目のマス目に対して行ったものとすると</li>
		<li><var>R<sub>kkである。 </sub></var></li>
		<li>この操作が丸印を消す操作であるならば<var>operate<sub>k</sub></var> = &quot;erase&quot;とせよ</li>
		<li>この操作が丸印を書き込む操作であるならば<var>operate<sub>k</sub></var> = &quot;write&quot;とせよ</li>
		<li><var>R<sub>k</sub>,C<sub>k</sub>,operate<sub>k</sub></var>は一行に空白区切りで出力しなければならない</li>
	</ul>
	</li>
	<li>丸印の書かれてあるマス目に対して丸印を記述する操作、および丸印が書かれていないマス目に対して丸印を消去する操作をした場合はWrongAnswerである</li>
	<li><var>cnt</var>個の操作にかかるコストの総和が<var>mincost</var>に一致しないときはWrongAnswerである</li>
</ul>

### 제한

<ul>
	<li><var>1&le; n &le; 100</var></li>
	<li><var>1&le; W<sub>ij</sub> &le; 1000</var></li>
	<li><var>1&le; E<sub>ij</sub> &le; 1000 </var></li>
	<li><var>F<sub>i</sub></var>は文字列であり、その長さは<var>n</var>である</li>
	<li><var>F<sub>i</sub></var>は&#39;o&#39;と&#39;.&#39;のみで構成されている</li>
</ul>