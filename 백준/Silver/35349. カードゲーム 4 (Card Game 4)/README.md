# [Silver V] カードゲーム 4 (Card Game 4) - 35349

[문제 링크](https://www.acmicpc.net/problem/35349)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 56, 정답: 41, 맞힌 사람: 32, 정답 비율: 72.727%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>カード <var>1</var> からカード <var>N</var> までの番号が付けられている <var>N</var> 枚のカードがある．各カードには <var>1</var> つの整数が書かれており，カード <var>i</var> (<var>1 ≦ i ≦ N</var>) に書かれた整数は <var>A<sub>i</sub></var> である．</p>

<p>これからあなたは，<var>N</var> 枚のカードから <var>K</var> 枚のカードを選ぶ．このとき，あなたの<b>得点</b>は以下のようになる．</p>

<ul>
<li>選んだカードに書かれた整数の偶奇がすべて同じ場合，選んだ <var>K</var> 枚のカードに書かれた整数の総和とする．</li>
<li>そうでない場合，<var>0</var> とする．</li>
</ul>

<p>カードの情報が与えられたとき，得点としてありうる最大値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<blockquote>
<p><var>N</var> <var>K</var></p>

<p><var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>…</var> <var>A<sub>N</sub></var></p>
</blockquote>

### 출력

<p>得点としてありうる最大値を <var>1</var> 行に出力せよ．</p>

### 제한

<ul>
<li><var>1 ≦ N ≦ 100 000</var>．</li>
<li><var>1 ≦ K ≦ N</var>．</li>
<li><var>1 ≦ A<sub>i</sub> ≦ 10<sup>9</sup></var> (<var>1 ≦ i ≦ N</var>)．</li>
<li>入力される値はすべて整数である．</li>
</ul>