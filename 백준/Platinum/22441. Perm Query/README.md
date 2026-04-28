# [Platinum III] Perm Query - 22441

[문제 링크](https://www.acmicpc.net/problem/22441)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 9, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

수학, 순열 사이클 분할

### 문제 설명

<p>$\{1,&thinsp; 2,&thinsp; &hellip;&thinsp;,&thinsp; N\}$の順列 $(p(1),&thinsp; p(2),&thinsp; &hellip;&thinsp;,&thinsp; p(n))$ が与えられる． $(l_i,&thinsp; r_i)$ からなるクエリが $Q$ 個与えられるので，各クエリに対して以下の擬似コードによる処理結果を出力せよ．</p>

<ol>
	<li>$ret &thinsp; := &thinsp; 0$, $(x(1),&thinsp; x(2),&thinsp; &hellip;&thinsp;,&thinsp; x(N)) &thinsp;:=&thinsp; (1,&thinsp; 2,&thinsp; &hellip;&thinsp;,&thinsp; N)$ とおく．</li>
	<li>各$i &thinsp; &isin; \{1, &thinsp; 2, &thinsp;&hellip;&thinsp;, &thinsp; N\}$ について $y(i) := p(x(i))$ とする．</li>
	<li>各$i &thinsp; &isin; \{1, &thinsp; 2, &thinsp;&hellip;&thinsp;, &thinsp; N\}$ について $x(i) &thinsp; = &thinsp;y(i)$とする．</li>
	<li>$ret &thinsp; := &thinsp;ret + x(l_i) + x(l_i+1) + &hellip;&thinsp; + x(r_i)$</li>
	<li>もし $(x(l_i),&thinsp; x(l_i+1),&thinsp; &hellip;&thinsp;,&thinsp; x(r_i)) = (l_i,&thinsp; l_i+1,&thinsp; &hellip;&thinsp;,&thinsp; r_i)$ なら $(ret$ mod $10^9+7)$ を出力して終了する．そうでないなら 処理２に戻る．</li>
</ol>

### 입력

<p>入力は以下の形式で与えられる</p>

<blockquote>
<p>$N$ $Q$</p>

<p>$p(1)$ $p(2)$ $...$ $p(N)$</p>

<p>$l_1$ $r_1$</p>

<p>$...$</p>

<p>$l_Q$ $r_Q$</p>
</blockquote>

### 출력

<p>各クエリに対する出力を1行ずつ出力せよ．</p>

### 제한

<ul>
	<li>$1 &le; N &le; 10^5$</li>
	<li>$1 &le; Q &le; 10^4$</li>
	<li>$(p(1),&thinsp; p(2),&thinsp; &hellip;&thinsp;,&thinsp; p(N))$ は $(1,&thinsp; 2,&thinsp; &hellip;&thinsp;,&thinsp; N)$ の順列になっている．</li>
	<li>各 $i$ に対して，ある $1 &le; k &le; 40$ が存在して，$p^k(i)=i$ となる．ここで，$p^k(i)$ は $p(p(p(&hellip;&thinsp;p(i)&hellip;&thinsp;)))$ で $p$ が $k$ 回現れるもの．</li>
	<li>$1 &le; l_i &thinsp; &le; &thinsp; r_i &thinsp; &le; N$</li>
</ul>