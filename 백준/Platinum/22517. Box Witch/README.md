# [Platinum I] Box Witch - 22517

[문제 링크](https://www.acmicpc.net/problem/22517)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 5, 맞힌 사람: 5, 정답 비율: 45.455%

### 분류

최대 유량, 그래프 이론

### 문제 설명

<p>ハコの魔女 H.N.ELLY はとある動画サイトの熱狂的なファンである．ハコの魔女の強さはその時々のその動画サイトからの転送速度に応じて変化するのではないかと<i>美樹さやか</i>は考えた．そこで動画サイトからハコの魔女の持つコンピュータまでの過去の転送速度 (=単位時間あたりのデータの転送量) を調べたい．</p>

<p>初期のインターネットのネットワークの構造とそれ以降のネットワークの構造の変化を表すクエリが与えられるので，各変化について変化した直後の動画サイトからハコの魔女の持つコンピュータまでの転送速度を求めよ．</p>

<p>インターネットは複数の転送装置からなるものと見なし，各々をつなぐ回線は双方向に情報を送ることができ，その転送速度の最大は&nbsp;<var>1</var>&nbsp;であるとする．また，ネットワークは常に動画サイトからハコの魔女へ送られるデータの転送速度を最大化するように運ぶものとする．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var><i>N</i>&nbsp;<i>E</i>&nbsp;<i>Q</i>
<i>F</i><sub>1</sub>&nbsp;<i>T</i><sub>1</sub>
<i>F</i><sub>2</sub>&nbsp;<i>T</i><sub>2</sub>
&hellip;
<i>F</i><sub><i>E</i></sub>&nbsp;<i>T</i><sub><i>E</i></sub>
<i>M</i><sub>1</sub>&nbsp;<i>A</i><sub>1</sub>&nbsp;<i>B</i><sub>1</sub>
<i>M</i><sub>2</sub>&nbsp;<i>A</i><sub>2</sub>&nbsp;<i>B</i><sub>2</sub>
&hellip;
<i>M</i><sub><i>Q</i></sub>&nbsp;<i>A</i><sub><i>Q</i></sub>&nbsp;<i>B</i><sub><i>Q</i></sub>
</var></pre>

<p><var><i>N</i></var>&nbsp;は動画サイトとハコの魔女の持つコンピュータを含めた転送装置の数である．番号が&nbsp;<var>1</var>&nbsp;である転送装置は動画サイトであり，番号が&nbsp;<var><i>N</i></var>&nbsp;である転送装置はハコの魔女の持つコンピュータである．<var><i>E</i></var>&nbsp;は初期状態で接続されている転送装置の組み合わせの数であり，<var><i>Q</i></var>&nbsp;はインターネットが変化した回数である．初期のインターネットは&nbsp;<var><i>F</i><sub><i>i</i></sub></var>&nbsp;と&nbsp;<var><i>T</i><sub><i>i</i></sub></var>&nbsp;が転送速度&nbsp;<var>1</var>&nbsp;で双方向に接続されていることを表す．</p>

<p>ネットワークの変化は時系列順に与えられ，<var><i>j</i></var>&nbsp;番目の変化は&nbsp;<var><i>M</i><sub><i>j</i></sub></var>&nbsp;が&nbsp;<var>1</var>&nbsp;であれば&nbsp;<var><i>A</i><sub><i>j</i></sub>,&nbsp;<i>B</i><sub><i>j</i></sub></var>&nbsp;間がつながれたことを表し，<var><i>M</i><sub><i>j</i></sub></var>&nbsp;が&nbsp;<var>2</var>&nbsp;であれば&nbsp;<var><i>A</i><sub><i>j</i></sub>,&nbsp;<i>B</i><sub><i>j</i></sub></var>&nbsp;間の接続が切れたことを表す．</p>

### 출력

<p>各変化の直後における，動画サイトからハコの魔女の持つコンピュータまでの転送速度を出力せよ．</p>

### 제한

<ul>
	<li><var>2&le;<i>N</i>&le;500</var></li>
	<li><var>0&le;<i>E</i>&le;20,000</var></li>
	<li><var>1&le;<i>Q</i>&le;1,000</var></li>
	<li><var>1&le;<i>F</i><sub><i>i</i></sub>&le;<i>N</i>,&nbsp;1&le;<i>T</i><sub><i>i</i></sub>&le;<i>N</i>,&nbsp;<i>F</i><sub><i>i</i></sub>&ne;<i>T</i><sub><i>i</i></sub>&nbsp;(1&le;<i>i</i>&le;<i>E</i>)</var></li>
	<li>すべての&nbsp;<var>{<i>F</i><sub><i>i</i></sub>,<i>T</i><sub><i>i</i></sub>}</var>&nbsp;のペアは異なる．</li>
	<li><var>1&le;<i>M</i><sub><i>j</i></sub>&le;2,&nbsp;1&le;<i>A</i><sub><i>j</i></sub>&le;<i>N</i>&nbsp;,&nbsp;1&le;<i>B</i><sub><i>j</i></sub>&le;<i>N</i>&nbsp;,&nbsp;<i>A</i><sub><i>j</i></sub>&ne;<i>B</i><sub><i>j</i></sub>(1&le;<i>j</i>&le;<i>Q</i>)</var></li>
	<li>ネットワークのどの段階においても次のことが成り立つ : どの&nbsp;<var>2</var>&nbsp;つの転送装置の間も高々&nbsp;<var>1</var>&nbsp;つの回線でしか繋がれていない．</li>
	<li><var>2</var>&nbsp;つの転送装置の間が既に繋がれている状態でそれらの間を接続するようなクエリが来たり，<var>2</var>&nbsp;つの転送装置の間が回線で繋がれていない状態でそれらの間の接続を切るようなクエリが来ることはない．</li>
</ul>