# [Platinum I] RabbitLunch - 22583

[문제 링크](https://www.acmicpc.net/problem/22583)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

최대 유량, 그리디 알고리즘, 두 포인터, 그래프 이론

### 문제 설명

<p>うさぎは昼食ににんじんとキウイを1 個ずつ食べる. うさぎはとても個性的なので, 食べるにんじんの種類もキウイの種類も同じであるような, 異なる2 匹のうさぎが存在してはならない.</p>

<p>にんじんは $M$ 種類ある. $i$ 種類目のにんじんは $m_i$ 個ある. キウイは $N$ 種類ある. $i$ 種類目のキウイは $n_i$ 個ある. 最大何匹のうさぎが昼食をとれるか求めよ.</p>

<p>$m_i$ と $n_i$ は次の漸化式を用いて生成せよ.</p>

<ul>
	<li>$m_0 = m0$</li>
	<li>$m_{i+1} = (m_i * 58 + md )$ mod $(N + 1)$</li>
	<li>$n_0 = n0$</li>
	<li>$n_{i+1} = (n_i * 58 + nd )$ mod $(M + 1)$</li>
</ul>

### 입력

<p>入力は以下の形式で与えられる:</p>

<blockquote>
<p>$M$ $N$ $m0$ $md$ $n0$ $nd$</p>
</blockquote>

### 출력

<p>昼食をとれるうさぎの匹数の最大値を表す整数を 1 行に出力せよ.</p>

### 제한

<ul>
	<li>$M$ will be between 1 and 2,500,000, inclusive.</li>
	<li>$N$ will be between 1 and 2,500,000, inclusive.</li>
	<li>$m0$ and $md$ will be between 0 and $N$, inclusive.</li>
	<li>$n0$ and $nd$ will be between 0 and $M$, inclusive.</li>
</ul>