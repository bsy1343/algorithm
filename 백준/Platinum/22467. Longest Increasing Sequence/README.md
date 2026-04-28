# [Platinum IV] Longest Increasing Sequence - 22467

[문제 링크](https://www.acmicpc.net/problem/22467)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 4, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 정렬, 매개 변수 탐색, 역추적

### 문제 설명

<p>時は過ぎて太郎君は高校生になりました。 大学生だったお兄さんの影響も受け、コンピューターサイエンスに興味を持ち始めました。 太郎君はコンピューターサイエンスの教科書を読み進め、「最長増加部分列問題」という有名問題があることを知りました。太郎君はこの問題のことを理解しましたが、自分でも類似問題が作れないものかと気になりました。 そこで太郎君は試行錯誤の結果に次のような問題を作りました。</p>

<ul>
	<li><var>n</var>個の整数で構成される数列Aがある</li>
	<li><var>m-1</var>個の区切りを入れて、数列Aを<var>m</var>個の数列に分解する。なお、分解後のそれぞれの数列は1つ以上の数を必ず含まなければならない。</li>
	<li>この<var>m</var>個それぞれの数列内の整数をすべて足し合わせた結果出来上がる<var>m</var>個の数を、元の数列の順に配置すると厳密な増加列になっている(つまり、出来上がる数列は<var>B<sub>i</sub> &lt; B<sub>i+1</sub></var>をみたす)ようにしたい。</li>
	<li>目標は最終的にできる数列<var>B</var>の長さ<var>m</var>を最大化することである。</li>
</ul>

<p>例えば、数列<var>A</var>が{5,-4,10,-3,8}の場合を考えてみる。 区切りの位置を表す数列<var>C</var>を用意し、<var>C={2,4}</var>とする。 このとき、数列<var>A</var>は(5,-4),(10,-3),(8)の部分に分かれ、これらの内部を足し合わせるとそれぞれ1,7,8となり、出来上がる数列<var>B</var>は{1,7,8}となる。</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22467.%E2%80%85Longest%E2%80%85Increasing%E2%80%85Sequence/ffc45b24.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22467.%E2%80%85Longest%E2%80%85Increasing%E2%80%85Sequence/ffc45b24.png" data-original-src="https://upload.acmicpc.net/ca6f25d6-6009-46da-8ab8-550003f2b3fa/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 555px; height: 389px;" /></p>

<p>太郎君はこの問題について&quot;最長増加列問題&quot;と名付け、これを解くアルゴリズムも考えました。 そして社会人になったあなたにチェックをしてほしいと連絡をしました。 あなたの仕事は、成長した太郎君の作った問題を解くプログラムを作ることです。 チェックするのが仕事なので、<var>m-1</var>個の区切りの位置も出力します。 なお、最適な<var>m</var>に対してこのような区切り方が複数考えられる場合もありますが、この<var>m</var>が正しく出力されていれば、考えられるもののうち一つを出力すればよいです。</p>

### 입력

<p>改行区切りで<var>n+1</var>個の整数が与えられる。</p>

<pre>
<var>n</var> 
<var>A<sub>1</sub></var>
<var>A<sub>2</sub></var>
...
<var>A<sub>n</sub></var>
</pre>

<ul>
	<li><var>n</var>は与えられる数列<var>A</var>の長さを表す</li>
	<li><var>A<sub>i</sub></var>は数列<var>A</var>のi番目の要素を表す。</li>
</ul>

### 출력

<pre>
<var>m</var>
<var>C<sub>1</sub></var> <var>C<sub>2</sub></var> .. <var>C<sub>m-1</sub></var>
</pre>

<ul>
	<li>1行目は一つの整数<var>m</var>を出力する。 <var>m</var>は最終的にできる数列<var>B</var>の長さを表す。 2行目は<var>m-1</var>個の整数<var>C<sub>i</sub></var>を空白区切りで出力する。 <var>C<sub>i</sub></var>は、数列<var>A</var>を<var>m</var>個の部分に適切に区切った時の<var>i</var>番目の区切り場所を表す。 区切り場所の定義は図を参照せよ。なお、<var>1&le;C<sub>i</sub>&lt;n</var> を満たす。 2行目の<var>m-1</var>個の整数列Cは昇順に並んでいなければならないしたがって、<var>i &lt; j</var> ならば <var>C<sub>i</sub> &lt; C<sub>j</sub> </var>が成立する。</li>
</ul>

<ul>
	<li><var>m=1</var>の場合2行目は空行になる。</li>
	<li>数列<var>C</var>に従って数列<var>A</var>から数列<var>B</var>を生成したとき、数列<var>B</var>が増加列になっていないとき(すなわち<var>B<sub>i</sub>&ge;B<sub>i+1</sub></var>となる<var>i(1&le;i&lt;m)</var>が存在するとき)、WrongAnswerとなる</li>
</ul>

### 제한

<ul>
	<li><var>1&le;n&le;4000</var></li>
	<li><var>|Ai|&le; 10<sup>8</sup></var>　</li>
	<li>整数<var>k</var>に対して<var>|k|</var>は<var>k</var>の絶対値を表す</li>
</ul>