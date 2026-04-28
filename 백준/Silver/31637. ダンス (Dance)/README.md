# [Silver IV] ダンス (Dance) - 31637

[문제 링크](https://www.acmicpc.net/problem/31637)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 106, 정답: 85, 맞힌 사람: 77, 정답 비율: 82.796%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>JOI 中学校のあるクラスには <var>2N</var> 人の生徒がいる．各生徒の身長は <var>A<sub>1</sub>, A<sub>2</sub>, &hellip;, A<sub>2N</sub></var> である．</p>

<p>今度の体育の授業で，生徒は <var>N</var> 組の <var>2</var> 人組に分かれてダンスを踊る．</p>

<p>このクラスでは，<var>2</var> 人組の作り方を工夫して美しいダンスを実現しようとしている．美しいダンスを実現するには，すべての <var>2</var> 人組の身長の差が <var>D</var> 以下である必要がある．</p>

<p>各生徒の身長が与えられたとき，美しいダンスが実現可能かどうかを判定するプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var>N</var>   <var>D</var>
<var>A<sub>1</sub></var>   <var>A<sub>2</sub></var>   <var>&hellip;</var>   <var>A<sub>2N</sub></var></pre>

### 출력

<p>美しいダンスが実現可能な場合 <code>Yes</code> を，そうでない場合 <code>No</code> を <var>1</var> 行で出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 100</var>．</li>
	<li><var>0 ≦ D ≦ 100</var>．</li>
	<li><var>1 ≦ A<sub>i</sub> ≦ 100</var> (<var>1 ≦ i ≦ 2N</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>