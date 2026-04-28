# [Gold II] Enumeration - 22483

[문제 링크](https://www.acmicpc.net/problem/22483)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 10, 맞힌 사람: 8, 정답 비율: 50.000%

### 분류

브루트포스 알고리즘, 포함 배제의 원리, 수학, 확률론, 재귀

### 문제 설명

<p>n個の整数a<sub>1</sub>, a<sub>2</sub>, &hellip;, a<sub>n</sub>とn個の整数p<sub>1</sub>, p<sub>2</sub>, &hellip;, p<sub>n</sub>、整数mが与えられる。k番目の整数a<sub>k</sub>をp<sub>k</sub>[%]の確率で選ぶ、という操作を各k(1 &le; k &le; n)について行い、0個以上n個以下の整数を選び出す。1以上m以下の整数の中で、選ばれた整数の少なくとも1つで割り切れるものの個数の期待値を求めよ。</p>

### 입력

<p>入力は以下の形式で与えられる。</p>

<pre>
n m
a<sub>1</sub> a<sub>2</sub> &hellip; a<sub>n</sub>
p<sub>1</sub> p<sub>2</sub> &hellip; p<sub>n</sub>
</pre>

### 출력

<p>問題の解を1行に出力せよ。出力には絶対誤差あるいは相対誤差で0.0000001(= 10<sup>-7</sup>)を超える誤差があってはならない。</p>

### 제한

<ul>
	<li>
	<p>1 &le; n &le; 20</p>
	</li>
	<li>
	<p>1 &le; m &le; 10<sup>18</sup></p>
	</li>
	<li>
	<p>1 &le; a<sub>k</sub> &le; 10<sup>18</sup> (1 &le; k &le; n)</p>
	</li>
	<li>
	<p>1 &le; p<sub>k</sub> &le; 99 (1 &le; k &le; n)</p>
	</li>
</ul>