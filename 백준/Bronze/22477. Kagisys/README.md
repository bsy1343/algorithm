# [Bronze I] Kagisys - 22477

[문제 링크](https://www.acmicpc.net/problem/22477)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 137, 정답: 114, 맞힌 사람: 91, 정답 비율: 85.849%

### 분류

구현, 자료 구조, 문자열, 브루트포스 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>ある部屋ではICカードを用いて鍵を開け閉めする電子錠システムを用いている。 このシステムは以下のように動作する。</p>

<p>各ユーザーが持つICカードを扉にかざすと、そのICカードのIDがシステムに渡される。 システムはIDが登録されている時、施錠されているなら開錠し、そうでないのなら施錠し、それぞれメッセージが出力される。 IDが登録されていない場合は、登録されていないというメッセージを出力し、開錠及び施錠はおこなわれない。</p>

<p>さて、現在システムにはN個のID(U<sub>1</sub>, U<sub>2</sub>, &hellip;&hellip;, U<sub>N</sub>)が登録されており、施錠されている。 M回ICカードが扉にかざされ、そのIDはそれぞれ順番にT<sub>1</sub>, T<sub>2</sub>, &hellip;&hellip;, T<sub>M</sub>であるとする。 この時のシステムがどのようなメッセージを出力するか求めよ。</p>

### 입력

<p>入力は以下の形式で与えられる。</p>

<pre>
N
U<sub>1</sub>
U<sub>2</sub>
&hellip;&hellip;
U<sub>N</sub>
M
T<sub>1</sub>
T<sub>2</sub>
&hellip;&hellip;
T<sub>M</sub>
</pre>

### 출력

<p>各T<sub>1</sub>, T<sub>2</sub>, &hellip;&hellip;, T<sub>M</sub>について、</p>

<ul>
	<li>
	<p>開錠された時は、&quot;Opened by &quot;の後に続けてIDを、</p>
	</li>
	<li>
	<p>施錠された時は、&quot;Closed by &quot;の後に続けてIDを、</p>
	</li>
	<li>
	<p>IDが登録されていないものだった場合は&quot;Unknown &quot;の後に続けてIDを それぞれ1行に出力せよ。</p>
	</li>
</ul>

<p>初期状態では施錠された状態である。</p>

### 제한

<ul>
	<li>
	<p>N, Mは整数である</p>
	</li>
	<li>
	<p>1 &le; N &le; 256</p>
	</li>
	<li>
	<p>U<sub>i</sub>は1文字以上10文字以下の小文字英字のみからなる文字列である</p>
	</li>
	<li>
	<p>U<sub>i</sub>はユニークである(i &ne; jならばU<sub>i</sub> &ne; U<sub>j</sub>)</p>
	</li>
	<li>
	<p>1 &le; M &le; 256</p>
	</li>
	<li>
	<p>T<sub>i</sub>は1文字以上10文字以下の小文字英字のみからなる文字列である</p>
	</li>
</ul>