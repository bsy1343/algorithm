# [Gold I] Stern’s Sequence - 21310

[문제 링크](https://www.acmicpc.net/problem/21310)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 24, 맞힌 사람: 20, 정답 비율: 90.909%

### 분류

수학, 재귀

### 문제 설명

<p><em><strong>Stern&rsquo;s Triangle</strong></em> is similar to <em>Pascal&rsquo;s Triangle</em> in that some values in each row are the sums of values in the previous row. In this case the previous row values are also copied down:</p>

<pre>
                                                              1                                                               
                              1                               1                               1                              
              1               1               2               1               2               1               1              
      1       1       2       1       3       2       3       1       3       2       3       1       2       1       1      
  1   1   2   1   3   2   3   1   4   3   5   2   5   3   4   1   4   3   5   2   5   3   4   1   3   2   3   1   2   1   1  
1 1 2 1 3 2 3 1 4 3 5 2 5 3 4 1 5 4 7 3 8 5 7 2 7 5 8 3 7 4 5 1 5 4 7 3 8 5 7 2 7 5 8 3 7 4 5 1 4 3 5 2 5 3 4 1 3 2 3 1 2 1 1</pre>

<p>Row <strong>n</strong> has <strong>2<sup>n</sup> - 1</strong> elements <strong>S(n, k)</strong>. Where:</p>

<ul>
	<li><strong>S(n, k) = 0</strong> for <strong>k &le; 0</strong> or <strong>k &ge; 2<sup>n</sup></strong></li>
	<li><strong>S(1, 1) = 1</strong></li>
	<li><strong>S(n+1, 2*k) = S(n, k)</strong> for <strong>n &ge; 1</strong></li>
	<li><strong>S(n+1, 2*k+1) = S(n, k) + S(n, k+1)</strong></li>
</ul>

<p>If we align the <strong>S(n, k)</strong> values so <strong>S(n+1, k)</strong> is directly below <strong>S(n, k)</strong>, we get:</p>

<pre>
1
1 1 1
1 1 2 1 2 1 1
1 1 2 1 3 2 3 1 3 2 3 1 2 1 1
1 1 2 1 3 2 3 1 4 3 5 2 5 3 4 1 4 3 5 2 5 3 4 1 3 2 3 1 2 1 1
1 1 2 1 3 2 3 1 4 3 5 2 5 3 4 1 5 4 7 3 8 5 7 2 7 5 8 3 7 4 5 1 5 4 7 3 8 5 7 2 7 5 8 3 7 4 5 1 4 3 5 2 5 3 4 1 3 2 3 1 2 1 1
</pre>

<p>We see that for <strong>n</strong> sufficiently large, <strong>S(n+1, k) = S(n, k)</strong>.</p>

<p>The sequence of these limiting values in called <em>Stern&rsquo;s Diatomic Sequnce</em>:</p>

<p><strong>b(1), b(2), b(3), &hellip;</strong></p>

<p>It has the property that for every positve rational number, <strong>r</strong>, there is exactly one value <strong>k</strong> for which <strong>r = b(k)/b(k+1)</strong>.</p>

<p>For example: <strong>3 / 5 = b(10) / b(11)</strong></p>

<p>Write a program which takes as input a rational number <strong>p/q</strong> in lowest terms and outputs the value <strong>k</strong> for which <strong>p = b(k)</strong> and <strong>q = p(k+1)</strong>. This number can get quite large, so out put it modulo the large prime <strong>998,244,353</strong>.</p>

### 입력

<p>Input consists of a single line containing two relatively prime, space separated decimal integers, <strong>p</strong> and <strong>q</strong> (1 &le; <strong>p</strong>, <strong>q</strong> &le; 400000).</p>

### 출력

<p>The single output line consists of the integer <strong>k</strong>, for which <strong>p = b(k)</strong> and <strong>q = b(k+1)</strong> printed modulo 998,244,353.</p>