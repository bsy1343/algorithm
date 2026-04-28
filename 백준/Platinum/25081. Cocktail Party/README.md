# [Platinum I] Cocktail Party - 25081

[문제 링크](https://www.acmicpc.net/problem/25081)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 2, 맞힌 사람: 2, 정답 비율: 33.333%

### 분류

자료 구조, 문자열, 분리 집합, 오프라인 쿼리, 접미사 배열과 LCP 배열

### 문제 설명

<p>You are given a string of length&nbsp;$n$&nbsp;representing the labels of&nbsp;$n$&nbsp;cups of cocktail. The&nbsp;$i$-th cup of cocktail has label&nbsp;$s_i$, and the labels are among the 26 lowercase English letters. Let&nbsp;$\mathrm{Str}(l,r) = s_l s_{l+1} \cdots s_r$&nbsp;be the string formed by the labels of the cocktails from the&nbsp;$l$-th cup to the&nbsp;$r$-th cup. If&nbsp;$\mathrm{Str}(p,p_0) = \mathrm{Str}(q,q_0)$&nbsp;where&nbsp;$1 \le p \le p_0 \le n$,&nbsp;$1 \le q \le q_0 \le n$,&nbsp;$p \ne q$,&nbsp;$p_0-p+1 = q_0-q+1 = r$, we say the&nbsp;$p$-th cup of cocktail and&nbsp;$q$-th cup of cocktail are&nbsp;$r$-similar. Of course, for two cups of cocktail that are&nbsp;$r$-similar ($r &gt; 1$) they are also 1-similar, 2-similar, ..., and&nbsp;$(r-1)$-similar. In particular, for any&nbsp;$1 \le p \le q \le n, p \ne q$, the&nbsp;$p$-th cup of cocktail and&nbsp;$q$-th cup of cocktail are&nbsp;$0$-similar.</p>

<p>Freda assigns the &quot;deliciousness&quot; for each cup of cocktail, and the&nbsp;$i$-th cup has deliciousness&nbsp;$a_i$. If we mix&nbsp;$p$-th cup of cocktail and&nbsp;$q$-th cup of cocktail, we may obtain cocktail with deliciousness&nbsp;$a_p a_q$. The problem asks for each&nbsp;$r = 0,\dots,n-1$, how many ways we may select two cups of cocktail that are&nbsp;$r$-similar, and compute the maximum possible deliciousness by mixing two cups of cocktail that are&nbsp;$r$-similar.</p>

### 입력

<p>The first line of the input contains an integer&nbsp;$n$&nbsp;denoting the number of cups of cocktail. The second line contains a string&nbsp;$S$&nbsp;with length&nbsp;$n$&nbsp;such that the&nbsp;$i$-th character denotes the label of the&nbsp;$i$-th cup of cocktail. The third line contains&nbsp;$n$&nbsp;integers separated by a single space such that the&nbsp;$i$-th integer denotes the&nbsp;$i$-th cup of cocktail has deliciousness&nbsp;$a_i$.</p>

### 출력

<p>The output contains&nbsp;$n$&nbsp;lines. The&nbsp;$i$-th line contains two integers separated by a single space. The first integer denotes the number of ways to choose two cups of&nbsp;$(i-1)$-similar cocktails. The second integer denotes the maximum possible deliciousness by mixing two cups of cocktails that are&nbsp;$(i-1)$-similar. Notice if there does not exist two cups of cocktail that are&nbsp;$(i-1)$-similar, both integers in that line of the output shall be 0.</p>

### 제한

<ul>
	<li>$10 &le; n &le; 300\,000$</li>
	<li>$|a_i| \le 1\,000\,000\,000$</li>
</ul>