# [Gold V] ジョイ四人組 (JOI04) - 27336

[문제 링크](https://www.acmicpc.net/problem/27336)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 88, 정답: 58, 맞힌 사람: 53, 정답 비율: 68.831%

### 분류

정렬, 이분 탐색

### 문제 설명

<p>JOI 中学校には <var>4N</var> 人の一年生が在籍しており，<var>4</var> つのクラスに分かれている．各クラスの情報は以下の通りである．</p>

<ul>
	<li><strong>1 年 A 組：</strong> <var>N</var> 人の生徒がいる．それぞれの生徒の身長は <var>A<sub>1</sub>, A<sub>2</sub>, &hellip;, A<sub>N</sub></var> である．</li>
	<li><strong>1 年 B 組：</strong> <var>N</var> 人の生徒がいる．それぞれの生徒の身長は <var>B<sub>1</sub>, B<sub>2</sub>, &hellip;, B<sub>N</sub></var> である．</li>
	<li><strong>1 年 C 組：</strong> <var>N</var> 人の生徒がいる．それぞれの生徒の身長は <var>C<sub>1</sub>, C<sub>2</sub>, &hellip;, C<sub>N</sub></var> である．</li>
	<li><strong>1 年 D 組：</strong> <var>N</var> 人の生徒がいる．それぞれの生徒の身長は <var>D<sub>1</sub>, D<sub>2</sub>, &hellip;, D<sub>N</sub></var> である．</li>
</ul>

<p>来月，JOI 中学校では体育祭が開催されることになった．体育祭には，リレー，騎馬戦，棒倒しなどの様々な種目があるが，各学年が踊るダンスは「体育祭の華」とも呼ばれる注目の種目である．</p>

<p>ここで一年生は，各クラスから代表を <var>1</var> 人ずつ選び，<var>4</var> 人でダンスをすることになった．ダンスの見栄えをできるだけ良くするため，身長の差ができるだけ小さくなるように <var>4</var> 人組を選ぶことにした．</p>

<p>一年生の身長が与えられるとき，「<var>4</var> 人の身長の最大値」と「<var>4</var> 人の身長の最小値」の差として考えられる最小の値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var>N</var>
<var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>&hellip;</var> <var>A<sub>N</sub></var>
<var>B<sub>1</sub></var> <var>B<sub>2</sub></var> <var>&hellip;</var> <var>B<sub>N</sub></var>
<var>C<sub>1</sub></var> <var>C<sub>2</sub></var> <var>&hellip;</var> <var>C<sub>N</sub></var>
<var>D<sub>1</sub></var> <var>D<sub>2</sub></var> <var>&hellip;</var> <var>D<sub>N</sub></var></pre>

### 출력

<p>「<var>4</var> 人の身長の最大値」と「<var>4</var> 人の身長の最小値」の差として考えられる最小の値を <var>1</var> 行で出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 75 000</var>．</li>
	<li><var>1 ≦ A<sub>i</sub> ≦ 10<sup>9</sup></var> (<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>1 ≦ B<sub>j</sub> ≦ 10<sup>9</sup></var> (<var>1 ≦ j ≦ N</var>)．</li>
	<li><var>1 ≦ C<sub>k</sub> ≦ 10<sup>9</sup></var> (<var>1 ≦ k ≦ N</var>)．</li>
	<li><var>1 ≦ D<sub>l</sub> ≦ 10<sup>9</sup></var> (<var>1 ≦ l ≦ N</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>