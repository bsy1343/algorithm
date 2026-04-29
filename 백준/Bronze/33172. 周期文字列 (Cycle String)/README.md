# [Bronze I] 周期文字列 (Cycle String) - 33172

[문제 링크](https://www.acmicpc.net/problem/33172)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 139, 정답: 102, 맞힌 사람: 90, 정답 비율: 78.947%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>長さ <var>N</var> の文字列 <var>S</var> が与えられる．<var>S</var> の各文字は英小文字である．</p>

<p>ある文字列 <var>T</var> および整数 <var>m   (2 ≦ m)</var> が存在して，空文字列に対して <var>T</var> を <var>m</var> 回順に繋げた文字列が <var>S</var> に一致する時，<var>S</var> は<strong>周期的</strong>であるとする．</p>

<p><var>S</var> が周期的であるなら <code>Yes</code> を，そうでないならば <code>No</code> を出力せよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre><var>N</var>
<var>S</var></pre>

### 출력

<p><var>S</var> が周期的であるなら <code>Yes</code> を，そうでないならば <code>No</code> を出力せよ．</p>

<p>答え以外は何も出力しないこと．(入力を促す文章なども出力しないこと．)</p>

### 제한

<ul>
	<li><var>2 ≦ N ≦ 1000</var>．</li>
	<li><var>S</var> は長さ <var>N</var> の文字列である．</li>
	<li><var>S</var> の各文字は英小文字である．</li>
</ul>

<p><var>N</var> は整数である．</p>