# [Bronze II] Fermat's Last Theorem - 22825

[문제 링크](https://www.acmicpc.net/problem/22825)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 258, 정답: 141, 맞힌 사람: 107, 정답 비율: 55.440%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>In the 17th century, Fermat wrote that he proved for any integer <em>n</em> &ge; 3, there exist no positive integers&nbsp;<i>x</i>,&nbsp;<i>y</i>,&nbsp;<i>z</i>&nbsp;such that <em>x<sup>n</sup></em> + <em>y<sup>n</sup></em> = <em>z<sup>n</sup></em>. However he never disclosed the proof. Later, this claim was named Fermat&#39;s Last Theorem or Fermat&#39;s Conjecture.</p>

<p>If Fermat&#39;s Last Theorem holds in case of&nbsp;<i>n</i>, then it also holds in case of any multiple of&nbsp;<i>n</i>. Thus it suffices to prove cases where&nbsp;<i>n</i>&nbsp;is a prime number and the special case&nbsp;<i>n</i>&nbsp;= 4.</p>

<p>A proof for the case&nbsp;<i>n</i>&nbsp;= 4 was found in Fermat&#39;s own memorandum. The case&nbsp;<i>n</i>&nbsp;= 3 was proved by Euler in the 18th century. After that, many mathematicians attacked Fermat&#39;s Last Theorem. Some of them proved some part of the theorem, which was a partial success. Many others obtained nothing. It was a long history. Finally, Wiles proved Fermat&#39;s Last Theorem in 1994.</p>

<p>Fermat&#39;s Last Theorem implies that for any integers <em>n</em> &ge; 3&nbsp;and&nbsp;<i>z</i>&nbsp;&gt; 1, it always holds that</p>

<p style="text-align: center;"><em>z<sup>n</sup></em> &gt; max{<em>x<sup>n</sup></em> + <em>y<sup>n</sup></em> | <em>x</em> &gt; 0, <em>y</em>&nbsp;&gt; 0, <em>x<sup>n</sup></em> + <em>y<sup>n</sup></em> &le; <em>z<sup>n</sup></em>}.</p>

<p>Your mission is to write a program that verifies this in the case&nbsp;<i>n</i>&nbsp;= 3 for a given&nbsp;<i>z</i>. Your program should read in integer numbers greater than 1, and, corresponding to each input&nbsp;<i>z</i>, it should output the following:</p>

<p style="text-align: center;"><em>z</em><sup>3</sup> - max{<em>x</em><sup>3</sup> + <em>y</em><sup>3</sup> | <em>x</em> &gt; 0, <em>y</em>&nbsp;&gt; 0, <em>x</em><sup>3</sup> + <em>y</em><sup>3</sup> &le; <em>z</em><sup>3</sup>}.</p>

### 입력

<p>The input is a sequence of lines each containing one positive integer number followed by a line containing a zero. You may assume that all of the input integers are greater than 1 and less than 1111.</p>

### 출력

<p>The output should consist of lines each containing a single integer number. Each output integer should be</p>

<p style="text-align: center;"><em>z</em><sup>3</sup> - max{<em>x</em><sup>3</sup> + <em>y</em><sup>3</sup> | <em>x</em> &gt; 0, <em>y</em>&nbsp;&gt; 0, <em>x</em><sup>3</sup> + <em>y</em><sup>3</sup> &le; <em>z</em><sup>3</sup>}</p>

<p>for the corresponding input integer&nbsp;<i>z</i>. No other characters should appear in any output line.</p>